package SRP;

public class Product{
    private String name;
    private Double price;
    private String description;

    public Product(String name, Double price, String description){
        this.name=name;
        this.price=price;
        this.description=description;
    }

    public void setName(String name){
        this.name=name;
    }

    public void setPrice(Double price){
        this.price=price;
    }

    public void setDescription(String description){
        this.description=description;
    }

    public String getName(){
        return this.name;
    }
    public String getDescription(){
        return this.description;
    }

    public Double getPrice(){
        return this.price;
    }
}