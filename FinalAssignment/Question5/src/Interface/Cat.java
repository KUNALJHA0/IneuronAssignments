package Interface;

public class Cat implements Animal {
    private String name;
    
    public Cat(String name) {
        this.name = name;
    }
    
    public void speak() {
        System.out.println(name + " says meow!");
    }
    
    public void eat() {
        System.out.println(name + " is eating.");
    }
}