public class Car {
    private String model;
    private String color;
    private  String brand;
    private int year;
    private int quantity;
    private double price;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Car(String model, String color, String brand, int year, int quantity, double price) {
        this.model = model;
        this.color = color;
        this.brand = brand;
        this.year = year;
        this.quantity = quantity;
        this.price = price;

    }

    public void delivery(){this.quantity++;}
    public void sell(){this.quantity--;}

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", brand='" + brand + '\'' +
                ", year=" + year +
                ", quantity=" + quantity +
                ", price=" + price +
                '}';
    }
}

