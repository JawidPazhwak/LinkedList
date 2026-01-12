public class Database {
    public String name;
    public static int number = 0;
    public File head;

    public Database(String name){
        this.name = name;
        number += 1;
    }

    public void add(File f){
        if(head == null){
            head = f;
            System.out.println(f.name + " added");
            return;
        }
        else{
            File current = head;
            while(current.next != null){
                current = current.next;
            }
            current.next = f;
            f.prev= current;
            System.out.println(f.name + " added");
        }
    }

    public void show(){
        if(head == null){
            System.out.println("Empty");
            return;
        }
        else{
            File current = head;
            while(current != null){
                current.details();
                current = current.next;
            }        
        }
    }

    public void search(File f){
        if(head == null){
            System.out.println("Not found");
            return;
        }
        else{
            if(head == f){
                System.out.println("Search Result: ");
                f.details();
            }
            else{
                File current = head;
                while(current != null && current != f){
                    current = current.next;
                }
                if(current == null){
                    System.out.println("Not found");
                    return;
                }
                System.out.println("Search Result: ");
                current.details();
            }
        }
    }
}
