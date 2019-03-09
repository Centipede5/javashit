public class Dog extends Animal{
    public Dog(double price, String animal){
        super(price,animal);
    }
    @Override
    public String phrase(){
        return "Bark Bark";
    }
}