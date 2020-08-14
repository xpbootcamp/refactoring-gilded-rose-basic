package cn.xpbootcamp.gilded_rose.Items;

import cn.xpbootcamp.gilded_rose.Item;

public class AgedBrie extends Item {
    public AgedBrie(int sellIn, int quality) {
        super("Aged Brie", sellIn, quality);
    }

    @Override
    protected void updateQualityAfterExpired() {
        increaseQuality();
    }

    @Override
    protected void updateSellIn() {
        sellIn = sellIn - 1;
    }

    @Override
    protected void updateQuality() {
        increaseQuality();
    }
}
