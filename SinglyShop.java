public class SinglyShop{
    public Item first;

    public void add(Item i){
        if(first == null){
            first = i;
            first.next = null;
            System.out.println(i.name + " added");
        }
        Item current = first;
        while(current.next != null){
            current = current.next;
        }
        current.next = i;
        i.next = null;
        System.out.println(i.name + " added");
    }
    public void show(){
        if(first.next == null){
            System.out.println("Name: " + first.name + "\nPrice:" + first.price);
        }
        else{
            Item current = first;
            while(current != null){
                current.details();
                current = current.next;
            }
        }
    }
    public void search(Item m){
        if(first.equals(m)){
            System.out.println(m.name + " found in the first node");
        }
        else{
            Item current = first;
            while(current != null){
                if(current.equals(m)){
                    System.out.println(m.name + " found");
                    break;
                }
                current = current.next;
            }
        }
    }
    public void delete(Item i){
        Item current = first;
        Item prev = null;
        if(current.equals(i)){
            first = current.next;
            System.out.println(i.name + " removed");
        }
        else{
            prev = first;
            current = first.next;
            while(current != null && !current.equals(i)){
                prev = current;
                current = current.next;
            }
            if(current == null){
                System.out.println(i.name + " not found");
            }
            else{
                prev.next = current.next;
                System.out.println(i.name + " removed");
            }

        }
    }
}