package AbstractMethod;

public class DOG extends Animal {
    public DOG(String name) {
        super(name);
    }
    
    public void speak() {
        System.out.println(name + " says woof!");
    }
}
