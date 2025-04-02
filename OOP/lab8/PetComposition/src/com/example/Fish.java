package PetComposition.src.com.example;

public class Fish extends Animal implements Pet {


    

    @Override
    public void eat() {
        System.out.println("Fish eat pond scum.");
    }


    @Override
    public void play() {
        System.out.println("Just keep swimming.");
    }

    

    private Nameable nameable = new NameableImpl();
    public void setName(String name){
        nameable.setName(name);
    }

    public String getName(){
        return nameable.getName();
    }
}