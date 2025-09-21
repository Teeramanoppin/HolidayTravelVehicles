public class Option {
    String code;
    String description;
    double price;
  public Option(String code, String description, double price) {
        this.code = code;
        this.description = description;
        this.price = price;
    }
    public void showOption() {
        System.out.println(code + " - " + description + " ($" + price + ")");
    }
}

