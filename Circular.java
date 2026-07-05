

public class Circular {
    public CircularNode head;
    public static void main(String[] args){
        Circular c = new Circular();

        c.add(1);
        c.add(2);
        c.add(3);

        c.addEnd(4);
        c.addBeginning(5);
        c.addAfter(5, 10);
        
        c.show(); 
        c.deleteFirst();
        c.show();
        c.deleteEnd();
        c.show();
        c.delete(1);
        c.show();
        c.deleteAfter(10);
        c.show();
    }
    public void add(Object elem){
        CircularNode current = head;
        if(head == null){
            head = new CircularNode(elem);  
            head.next = head;          
            System.out.println(elem + " added");
            return;
        }
        while(current.next != head){
            current = current.next;
        }
        CircularNode newNode = new CircularNode(elem);
        newNode.next = head;
        current.next = newNode;
        System.out.println(elem + " added");
    }
    public void show(){
        if(head == null){
            System.out.println("empty");
            return;
        }
        
        CircularNode current = head;
        do { 
            System.out.print(current.elem + ", ");
            current = current.next;
        }   while (current != head);
        System.out.println();

    }
    public void addEnd(Object elem){
        CircularNode current = head;
        if(head == null){
            add(elem);
            return;
        }
        while(current.next != head){
            current = current.next;
        }
        if(current.next == head){
            CircularNode newNode = new CircularNode(elem);
            current.next = newNode;
            newNode.next = head;
            System.out.println(newNode.elem + " added");
        }
     }
     public void addBeginning(Object elem){
         CircularNode current = head;
         if(head == null){
            add(elem);
            return;
         }
         while(current.next != head){
             current = current.next;
         }
             CircularNode newNode = new CircularNode(elem);
             newNode.next = head;
             current.next = newNode;
             head = newNode;
             System.out.println("Head: " + head.elem);
     }
     public void addAfter(Object after, Object elem){
        CircularNode newNode = new CircularNode(elem);
        if(head == null){
            add(elem);
            return;
        }
        CircularNode current = head;
        while (!current.elem.equals(after)) {
            current = current.next;            
        }
        newNode.next = current.next;
        current.next = newNode;         
     }
     public void deleteFirst(){
        CircularNode current = head;
        while(current.next != head){
            current = current.next;
        }
        current.next = head.next;
        head = head.next;
        return;
     }
     public void deleteEnd(){
        CircularNode current = head;
        if(head == null){
            return;
        }
        while(current.next.next != head){
            current = current.next;
        }
        current.next = head;
     }
     public void delete(Object after){
        CircularNode current = head;
        if(head == null){
            return;
        }
        while (!current.next.elem.equals(after)) {
            current = current.next;            
        }
        current.next = current.next.next;
     }
     public void deleteAfter(Object after){
        CircularNode current = head;
        if(head == null){
            return;
        }
        while(!current.elem.equals(after)){
            current = current.next;
        }
        current.next = current.next.next;
     }
      
}
