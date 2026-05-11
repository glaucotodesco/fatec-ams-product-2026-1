package fatec.com.product.models;

public class SpecialProduct extends Product {

    private String model;
    private String brand;

    public SpecialProduct() {
       
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
    
    
}
