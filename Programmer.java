package Oops_practical;

class Geeks {
    private String name;
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
}
public class Programmer {
    public static void main(String[] args) {
    Geeks p = new Geeks();
    p.setName("Geek"); 
    System.out.println("Name=> " + p.getName());
    }
}

