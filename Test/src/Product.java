import java.util.Scanner;

public class Product {
     String id,name;
     double price;
     int quanlity;

    public Product() {
    }

    public Product(String id, String name, double price, int quanlity) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.quanlity = quanlity;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuanlity() {
        return quanlity;
    }

    public void setQuanlity(int quanlity) {
        this.quanlity = quanlity;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", quanlity=" + quanlity +
                '}';
    }
}
