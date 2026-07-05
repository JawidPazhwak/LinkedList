public class DummyHead {

    public Node dummyHead = new Node(null);

    public static void main(String[] args) {

        DummyHead d = new DummyHead();

        // List:
        // 1 -> 1 -> 2 -> 3 -> 3 -> 3 -> 4 -> 5 -> 5 -> 6 -> 6 -> 7

        d.add(1);
        d.add(1);
        d.add(2);
        d.add(3);
        d.add(3);
        d.add(3);
        d.add(4);
        d.add(5);
        d.add(5);
        d.add(6);
        d.add(6);
        d.add(7);

        System.out.println("Before removing duplicates:");
        d.show();

        d.removeDuplicates();

        System.out.println("\nAfter removing duplicates:");
        d.show();
    }

    public void add(Object elem) {
        Node current = dummyHead;

        while (current.next != null) {
            current = current.next;
        }

        current.next = new Node(elem);
    }

    public void show() {
        Node current = dummyHead.next;

        while (current != null) {
            System.out.print(current.elem + " ");
            current = current.next;
        }

        System.out.println();
    }

    // ===========================
    // IMPLEMENT THIS METHOD ONLY
    // ===========================
    public void removeDuplicates() {

        // Your code here
        Node current = dummyHead.next;
        while(current.next != null){
            if(current.elem.equals(current.next.elem)){
                current.next= current.next.next;                            
            }
            current = current.next;
        }

    }
}