package AbstractMethod;

public class Cat extends Animal {
    public Cat(String name) {
        super(name);
    }
    
    public void speak() {
        System.out.println(name + " says meow!");
    }
}
