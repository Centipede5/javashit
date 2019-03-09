/*
@author Calvin Ristad
@verson 0.0.1
---Assignment---
Click on the attached link for the full description.
Read through the specifications and draw the UML Class Diagram.
Find 2 classmates who will share their "pet" ADT with you and describe them in this post. Include the name of the ADTs and the classmates.
Pay special attention to the driver snippet. There is POLYMORPHISM involved in this assignment. Be prepared to answer conceptual questions about the dynamics of the different objects.
The way you should focus on this project:
1. DO NOT VIOLATE ENCAPSULATION
2. Use INHERITANCE CONCEPTS to re-use code and functionality.

~~~Sample Output~~~
I am a bird
Tweet Tweet
I am a bird
Tweet Tweet
I am a fish
Blub Blub
I am a dog
Bark Bark
*/
public class Driver{
  public static void main(String[] args) {
    //create a petset, according to http://apcomputerscience.mrseliasclasses.org/2019/03/05/pet-shop-v1-2/ sample test
    PetSet myPetShop = new PetSet();
    Animal tweety = new Bird(45.00, "I am a bird");
    Animal duffy = new Bird(5.00, "I am a bird");
    Animal nemo = new Fish(62.00, "I am a fish"); 
    Animal bear = new Dog(1100.00, "I am a dog");
    myPetShop.add(tweety);
    myPetShop.add(duffy);
    myPetShop.add(nemo);
    myPetShop.add(bear);
    //print it out using the toString method
    System.out.println(myPetShop);
  }
}
