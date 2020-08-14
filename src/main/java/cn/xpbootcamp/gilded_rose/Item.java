package cn.xpbootcamp.gilded_rose;

public abstract class Item {

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

        if (isExpired()) {
            updateQualityAfterExpired();
        }
    }

    private boolean isExpired() {
        return sellIn < 0;
    }

    protected abstract void updateQualityAfterExpired();

    protected abstract void updateSellIn();

    protected abstract void updateQuality();

    protected void decreaseQuality() {
        if (quality > 0) {
            quality = quality - 1;
        }
    }

    protected void increaseQuality() {
        if (quality < 50) {
            quality = quality + 1;
        }
    }
}
