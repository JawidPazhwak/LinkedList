public class DoublyShop{
    public DoublyItem head;
    public String name;

    public DoublyShop(String name){
        this.name = name;
        System.out.println("Shop created");
    }
    
    public void add(DoublyItem i){
        if(head == null){
            head = i;
            System.out.println(i.name + " added");
            return;            
        }

        DoublyItem temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = i;
        i.prev = temp; 
        System.out.println(i.name + " added");

    }
    public void remove(DoublyItem i){
        if(head == null){
            System.out.println("empty");
        }
        else{
            DoublyItem temp = head;
            while(temp != null && temp != i){
                temp = temp.next;
            }
            if(temp == null){
                System.out.println("Empty");
                return;
            }
            // if node is head
            if(temp == head){
                head = temp.next;
                head.prev = null;
            }
            // if node is middle or last
            if(temp.prev != null){
                temp.prev.next = temp.next;
            }
            if(temp.next != null){
                temp.next.prev = temp.prev;
            }
        }

        System.out.println(i.name + " removed");
    }

    public void show(){
        if(head == null){
            head.next.details();
        }
        else if(head != null){
            DoublyItem current = head;
            while(current != null){
                System.out.println("Name: " + current.name + "\nPrice: " + current.price);
                current = current.next;
            }
        }
        else{
            System.out.println("Empty");
        }
    }
    public void search(DoublyItem i){
        if(head == null){
            System.out.println("Empty");
            return;
        }
        else{
            DoublyItem current = head;
            while(current != null && current != i){
                current = current.next;
            }
            if(current == null){
                System.out.println("Empty");
                return;
            }
            else{
                System.out.println("Search Result: " + "\nName: " + current.name + "\nPrice: " + current.price);
            }
        }
    }
}