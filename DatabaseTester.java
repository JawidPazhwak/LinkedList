public class DatabaseTester {
    public static void main(String[] args){
        Database d1 = new Database("Database 1");
        File f1 = new File("Pen", 10, "C drive");
        File f2 = new File("Notebook", 20, "D drive");
        File f3 = new File("Book", 30, "E drive");

        d1.add(f1);
        d1.add(f2);
        d1.add(f3);

        d1.show();
        
        d1.search(f1);
        d1.search(f2);
        d1.search(f3);
    }
}