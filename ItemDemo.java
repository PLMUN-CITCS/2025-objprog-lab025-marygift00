class Item {
    static int objectCount = 0;
    String itemName;

    public Item(String itemName) {
        this.itemName = itemName;
        objectCount++;
    }

    public static void displayObjectCount() {
        System.out.println("Total objects created: " + objectCount);
    }

    public void displayItem() {
        System.out.println("Item: " + itemName);
    }
}

public
