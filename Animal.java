public class Animal{
    private double price;
    private String animal;
    public Animal(double price, String animal){
        this.price = price;
        this.animal = animal;
    }
    public String whatIam(){
        return this.animal;
    }
    public double getPrice(){
        return this.price;
    }
    public void setPrice(double newPrice){
        this.price = newPrice;
    }
    public String phrase(){
        return "im just an animal";
    }
}