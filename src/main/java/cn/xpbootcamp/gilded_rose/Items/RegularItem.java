package cn.xpbootcamp.gilded_rose.Items;

import cn.xpbootcamp.gilded_rose.Item;

public class RegularItem extends Item {
    public RegularItem(int sellIn, int quality) {
        super("Regular", sellIn, quality);
    }

    @Override
    protected void updateQualityAfterExpired() {
        if (quality > 0) {
            quality = quality - 1;
        }
    }

    @Override
    protected void updateSellIn() {
        sellIn = sellIn - 1;
    }

    @Override
    protected void updateQuality() {
        if (quality > 0) {
            quality = quality - 1;
        }
    }
}
