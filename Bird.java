public class Bird extends Animal{
    public Bird(double price, String animal){
        super(price,animal);
    }
    @Override
    public String phrase(){
        return "Tweet Tweet";
    }
}