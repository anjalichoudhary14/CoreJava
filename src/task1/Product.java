package task1;

class Product {
    long id;
    double price;



    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Product(long id, double price) {
        this.id = id;
        this.price = price;
    }

    void increaseBalanceBy(double amount) {
        this.price = price + amount;
    }

    @Override
    public String toString() {
        return "Prthisoduct{" +
                "id=" + id +
                ", price=" + price +
                '}';
    }
}