public class SinglyShopTester {
    public static void main(String[] args){
        Item i1 = new Item("apple", 10);
        Item i2 = new Item("banana", 15);
        Item i3 = new Item("pen", 5);

        SinglyShop s = new SinglyShop();
        s.add(i1);
        s.add(i2);
        s.add(i3);

        s.show();
        s.search(i3);
        s.search(i1);
        s.delete(i3);
        s.show();
    }
}
