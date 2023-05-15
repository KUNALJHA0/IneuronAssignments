package Interface;

public class Dog implements Animal {
    private String name;
    
    public Dog(String name) {
        this.name = name;
    }
    
    public void speak() {
        System.out.println(name + " says woof!");
    }
    
    public void eat() {
        System.out.println(name + " is eating.");
    }
}
