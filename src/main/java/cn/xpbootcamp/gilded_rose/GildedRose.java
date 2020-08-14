package cn.xpbootcamp.gilded_rose;

class GildedRose {
    Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public void updateByDay() {
        for (Item item : items) {
            item.update();
        }
    }

}
