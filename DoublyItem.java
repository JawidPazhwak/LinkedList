public class DoublyItem{
    public String name;
    public int price;
    public DoublyItem next;
    public DoublyItem prev;

    public DoublyItem(String name, int price){
        this.name = name;
        this.price = price;
        next = null;
        prev = null;
    }
    public void details(){
        System.out.println("Name: " + name + "\nPrice: " + price);
    }
}