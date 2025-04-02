package PetComposition.src.com.example;

public class Cat extends Animal implements Pet {
    
   
    private Nameable nameable = new NameableImpl();
    private Ambulatory ambulatory;

    public Cat() {
        this("Fluffy");
        ambulatory = new AmbulatoryImpl(4);
    }
    
    public Cat(String name) {
        nameable.setName(name);
        ambulatory = new AmbulatoryImpl(4);
    }

    @Override
    public void eat() {
        System.out.println("Cats like to eat spiders and fish.");
    }

    
    public void walk(){
        ambulatory.walk();
    }
   

    @Override
    public void play() {
        System.out.println(nameable.getName() + " likes to play with string.");
    }
    
    
    public void setName(String name){
        nameable.setName(name);
    }

    public String getName(){
        return nameable.getName();
    }
}