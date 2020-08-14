package cn.xpbootcamp.gilded_rose;

public class Item {

    public String name;

    public int sellIn;

    public int quality;

    public Item(String name, int sellIn, int quality) {
        this.name = name;
        this.sellIn = sellIn;
        this.quality = quality;
    }

    @Override
    public String toString() {
        return this.name + ", " + this.sellIn + ", " + this.quality;
    }

    public void update() {
        updateQuality();
        updateSellIn();

        if (sellIn < 0) {
            updateQualityAfterExpired();
        }
    }

    private void updateQualityAfterExpired() {
        if (isAgedBrie()) {
            if (quality < 50) {
                quality = quality + 1;
            }
            return;
        }
        if (isBackstagePass()) {
            quality = 0;
            return;
        }
        if (isSulfuras()) {
            return;
        }
        if (quality > 0) {
            quality = quality - 1;
        }
    }

    private void updateSellIn() {
        if (isSulfuras()) {
            return;
        }
        sellIn = sellIn - 1;
    }

    private void updateQuality() {
        if (isAgedBrie()) {
            if (quality < 50) {
                quality = quality + 1;
            }
            return;
        }
        if (isBackstagePass()) {
            if (quality < 50) {
                quality = quality + 1;
            }
            if (sellIn < 11) {
                if (quality < 50) {
                    quality = quality + 1;
                }
            }

            if (sellIn < 6) {
                if (quality < 50) {
                    quality = quality + 1;
                }
            }
            return;
        }
        if (isSulfuras()) {
            return;
        }
        if (quality > 0) {
            quality = quality - 1;
        }
    }

    private boolean isSulfuras() {
        return name.equals("Sulfuras, Hand of Ragnaros");
    }

    private boolean isBackstagePass() {
        return name.equals("Backstage passes to a TAFKAL80ETC concert");
    }

    private boolean isAgedBrie() {
        return name.equals("Aged Brie");
    }
}
