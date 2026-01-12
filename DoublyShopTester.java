public class DoublyShopTester{
    public static void main(String[] args){
        DoublyShop d1 = new DoublyShop("Shop 1");
        DoublyItem i1 = new DoublyItem("Pen", 10);
        DoublyItem i2 = new DoublyItem("notebook", 20);
        DoublyItem i3 = new DoublyItem("book", 30);
        
        d1.add(i1);
        d1.add(i2);
        d1.add(i3);

        d1.show();
        d1.remove(i1);
        d1.show();

        d1.search(i1);        
        d1.search(i2);
        d1.search(i3);
    }
}