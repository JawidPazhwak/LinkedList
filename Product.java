import java.util.Scanner;
public class Product {
    
    ProductNode head = new ProductNode(0);
    public static void main(String[] args) {
        System.out.println("Enter your number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        Product p = new Product();
        p.add(1);
        p.add(2);
        p.add(3);
        p.add(4);
        p.add(5);
        p.add(6);
        p.show(p.head);
        p.smallest_number_product(p.head, n);
        p.sum(p.head, n);
        p.twoEndSum(p.head);
    }
    public void add(int n){
        if(head == null){
            head = new ProductNode(n);
            return;
        }
        ProductNode current = head;
        while(current.next != null){
            current = current.next;
        }
        current.next = new ProductNode(n);
    }
    public void show(ProductNode head){
        if(head == null){
            System.out.println("Empty");
            return;
        }
        ProductNode current = head;
        while(current != null){
            System.out.print(current.value + " ");
            current = current.next;
        }
        System.out.println();
    }
    public void smallest_number_product(ProductNode head, int n){
        int counter = 0;
        int product = 1;
        if(head.next == null){
            System.out.println("Empty");
            return;
        }
        ProductNode current = head.next;
        while(counter < n){
            product *= current.value;
            current = current.next;
            counter ++;
        }
        System.out.println("Product: " + product);
    }
    public void sum(ProductNode head, int n){
        int sum = 0; 
        int counter = 0;
        if(head.next == null){
            System.out.println("Empty");
            return;
        }
        ProductNode current = head.next;
        while(counter < n){
            sum += current.value;
            current = current.next;
            counter ++;
        }
        System.out.println("Sum: " + sum);
    }
    public void twoEndSum(ProductNode head){
        ProductNode head1 = head.next;
        ProductNode tail = head.next;
        int counter = 0;
        int counter2 = 0;
        int result = 0;
        int sum = 0;
        int difference = 0;
        if(head.next == null){
            System.out.println("Empty");
            return;
        }
        while(tail.next != null){
            tail = tail.next;
            counter ++;
        }
        counter2 = counter - 1;
        for(int i = 0; i < counter/2; i ++){
            sum = head1.value + tail.value;
            difference -= sum;
            sum = 0;
            if(head1.next != null){
                head1 = head1.next;
            }
            while(counter2 > 0){
                tail = tail.next;
                counter2 --;
            }
        }
        System.out.println("Two End Sum: " + result);

    }
}
