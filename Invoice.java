import java.util.List;

public class Invoice {
    String id;
    String date;
    double total;

    Customer customer;
    Salesperson salesperson;
    Vehicle vehicle;
    List<Option> options;

    public Invoice(String id, String date, double total,
                   Customer customer, Salesperson salesperson,
                   Vehicle vehicle, List<Option> options) {
        this.id = id;
        this.date = date;
        this.total = total;
        this.customer = customer;
        this.salesperson = salesperson;
        this.vehicle = vehicle;
        this.options = options;
    }

    public String toString() {
        return id + " | " + date + " | " + total +
               " | " + customer.name +
               " | " + salesperson.name +
               " | " + vehicle.model;
    }
}

