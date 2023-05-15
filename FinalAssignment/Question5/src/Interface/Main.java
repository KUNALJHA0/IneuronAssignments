package Interface;

public class Main {

	public static void main(String[] args) {
        Dog d = new Dog("Fido");
        Cat c = new Cat("Whiskers");
        
        d.eat();
        d.speak();
        
        c.eat();
        c.speak();
    }

}
