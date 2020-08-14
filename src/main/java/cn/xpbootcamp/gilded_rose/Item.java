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

        if (sellIn < 0) {
            updateQualityAfterExpired();
        }
    }

    protected abstract void updateQualityAfterExpired();

    protected abstract void updateSellIn();

    protected abstract void updateQuality();

}
