/*
    @author Calvin Ristad
*/
import java.util.*;
public class PetSet{
    private ArrayList<Animal> animals = new ArrayList<Animal>();
    private double sum;
    private double maxPrice;
    public PetSet(){
        this.sum =0;
        this.maxPrice = 0;
    }
    //Add an animal to the set
    public void add(Animal pet){
        double p = pet.getPrice();
        this.sum+=p;
        if(p>this.maxPrice){
            this.maxPrice = p;
        }
        animals.add(pet);
    }
    //get the average of all the animals prices
    public double getAverage(){
        double sum = 0;
        for(int i=0;i<animals.size();i++){
            sum+=animals.get(i).getPrice();
        }
        return sum/animals.size();
    }
    //get the maximum price for an animal
    public double getMax(){
        return this.maxPrice;
    }
    //return a string with the name of the animal and their phrase on new lines
    public String toString(){
        String myString ="";
        for(int i=0;i<animals.size();i++){
            myString+=animals.get(i).whatIam()+"\n";
            myString+=animals.get(i).phrase();
            if(i<animals.size()-1)
                myString+="\n";
        }
        return myString;
    }
}