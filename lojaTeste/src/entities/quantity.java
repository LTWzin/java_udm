package entities;

class quantity {
    private Integer code;
    private String name;
    private Double price;
    public Integer quantity;

    public void Lolja(int code, String name, double price, int quantity) {
        this.code = code;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        
    }

    public void Lolja(int code, double price, int quantity) {
        this.code = code;
        this.price = price;
        this.quantity = quantity;
    }

    public void Lolja() {

    }

    public Integer getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Double sum() {
        return getPrice() * getQuantity();
    }

}

@Override
public String toString() {
    return String.format("Code: %d\nPrice: %f\nQuantity: %d\nTotal: %f", getCode(), getPrice(), getQuantity(), sum());
}
