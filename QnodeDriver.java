public class QnodeDriver {
    public Qnode dummyHead = new Qnode(0);
    public static void main(String[] args) {
        QnodeDriver d = new QnodeDriver();
        d.add(30);
        d.add(50);
        d.add(10);
        d.add(25);
        d.add(31);
        d.add(40);
        int start = 2;
        int end = 4;
        
        System.out.println("Before deletion: ");
        d.show();
        System.out.println("After deletion: ");
        // d.delete_sequential(d.dummyHead, start, end);
        d.delete_sequential_v2(d.dummyHead, start, end);
        d.show();


    }
    public void show(){
        if(dummyHead == null){
            System.out.println("Empty");
            return;
        }
        Qnode current = dummyHead.next;
        while(current != null){
            System.out.print(current.value + " ");
            current = current.next;
        }
        System.out.println();
    }
    public void add(int a){
        if(dummyHead.next == null){
            dummyHead.next = new Qnode(a);
            return;
        }
        Qnode current = dummyHead.next;
        while(current.next != null){
            current = current.next;
        }
        current.next = new Qnode(a);
    }
    public void delete_sequential(Qnode head, int start, int end){
        int counter = 0;
        if(head == null){
            System.out.println("empty");
            return;
        }
        Qnode current = head.next;
        while(current != null){
            counter += 1;
            current = current.next;
        }
        Qnode[] arr = new Qnode[counter];
        Qnode temp = head.next;
        for(int i = 0; i < counter; i ++){
            arr[i] = temp;
            temp = temp.next;
        }                    
        for(int j = start; j <= end && j < counter; j ++){
                    arr[j] = null;
            }
            Qnode tail = dummyHead;
        for(int a = 0; a < counter; a ++){
            if(arr[a] != null){
                tail.next = arr[a];
                tail = tail.next;
            }       
        }
    }
    public void delete_sequential_v2(Qnode head, int start, int end){
        Qnode current = head;
        Qnode before = head;
        Qnode after = head;

        for(int i = 0; i < start; i ++){
            current = current.next;
        }
        before = current;
        after = before.next;
        for(int i = 0; i < end-start+1  ; i ++){
            after = after.next;
        }
        before.next = after;
    }
    
}
