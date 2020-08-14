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

    protected void updateQualityAfterExpired() {
        if (isSulfuras()) {
            return;
        }
        if (quality > 0) {
            quality = quality - 1;
        }
    }

    protected void updateSellIn() {
        if (isSulfuras()) {
            return;
        }
        sellIn = sellIn - 1;
    }

    protected void updateQuality() {
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

}
