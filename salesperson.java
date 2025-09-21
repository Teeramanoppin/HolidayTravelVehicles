public class Salesperson {
    String id;
    String name;
    String hireDate;


    public Salesperson(String id, String name, String hireDate) {
        this.id = id;
        this.name = name;
        this.hireDate = hireDate;
    }

 
    public void showInfo() {
        System.out.println("Salesperson: " + name + " (ID: " + id + ", Hire Date: " + hireDate + ")");
    }
}


