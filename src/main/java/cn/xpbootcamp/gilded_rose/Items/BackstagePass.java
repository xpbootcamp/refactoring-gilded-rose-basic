package cn.xpbootcamp.gilded_rose.Items;

import cn.xpbootcamp.gilded_rose.Item;

public class BackstagePass extends Item {
    public BackstagePass(int sellIn, int quality) {
        super("Backstage Pass", sellIn, quality);
    }

    @Override
    protected void updateQualityAfterExpired() {
        quality = 0;
    }

    @Override
    protected void updateSellIn() {
        sellIn = sellIn - 1;
    }

    @Override
    protected void updateQuality() {
        increaseQuality();
        if (sellIn < 11) {
            increaseQuality();
        }

        if (sellIn < 6) {
            increaseQuality();
        }
    }

}
