public class CircularNode{
    public Object elem;
    public CircularNode next;
    
    public CircularNode(Object elem, int value){
        this.elem = elem;
        next = null;
    }
    public CircularNode(Object elem){
        this.elem = elem;
        this.next = null;
    }
}