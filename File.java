public class File {
    public static int number = 0;
    public String name;
    public int size;
    public String location;
    public File next;
    public File prev;

    public File(String name, int size, String location){
        this.name = name;
        this.size = size;
        this.location = location;
        number += 1;
        System.out.println("File created");
    }
    public void details(){
        System.out.println("Details: " + "\nName: " + name + "\nSize: " + size + "\nLocation: " + location);
    }
}
