public class Vehicle {
    String serial;
    String name;
    String model;
    String manufacturer;
    int year;
    double cost;

   
    public Vehicle(String serial, String name, String model, String manufacturer, int year, double cost) {
        this.serial = serial;
        this.name = name;
        this.model = model;
        this.manufacturer = manufacturer;
        this.year = year;
        this.cost = cost;
    }

  
    public void showInfo() {
        System.out.println(year + " " + manufacturer + " " + name + " " + model +
                           " [Serial: " + serial + ", Cost: $" + cost + "]");
    }
}

