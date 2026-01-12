public class Item {
    public String name;
    public int price;
    public Item next;

    public Item(String n, int p){
        name = n;
        price = p;
        System.out.println(n + " created");
    }
    public void details(){
        System.out.println("Details:\nName: " + name + "\nPrice: " + price);
    }
    
}
