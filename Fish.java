public class Fish extends Animal{
    public Fish(double price, String animal){
        super(price,animal);
    }
    @Override
    public String phrase(){
        return "Blub Blub";
    }
}