package cn.xpbootcamp.gilded_rose.Items;

import cn.xpbootcamp.gilded_rose.Item;

public class RegularItem extends Item {
    public RegularItem(int sellIn, int quality) {
        super("Regular", sellIn, quality);
    }

    @Override
    protected void updateQualityAfterExpired() {
        decreaseQuality();
    }

    @Override
    protected void updateSellIn() {
        sellIn = sellIn - 1;
    }

    @Override
    protected void updateQuality() {
        decreaseQuality();
    }

}
