public class Customer {
    String id;
    String name;
    String address;
    String phone;

    public Customer(String id, String name, String address, String phone) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.phone = phone;
    }

    public String toString() {
        return id + " - " + name + " - " + address + " - " + phone;
    }
}

