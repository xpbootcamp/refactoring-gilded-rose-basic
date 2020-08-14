package cn.xpbootcamp.gilded_rose.Items;

import cn.xpbootcamp.gilded_rose.Item;

public class Sulfuras extends Item {
    public Sulfuras(int sellIn, int quality) {
        super("Sulfuras", sellIn, quality);
    }

    @Override
    protected void updateQualityAfterExpired() {
    }

    @Override
    protected void updateSellIn() {
    }

    @Override
    protected void updateQuality() {
    }
}
