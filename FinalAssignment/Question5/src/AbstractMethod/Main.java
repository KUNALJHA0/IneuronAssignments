package AbstractMethod;

public class Main {

	public static void main(String[] args) {
        DOG d = new DOG("Fido");
        Cat c = new Cat("Whiskers");
        
        d.eat();
        d.speak();
        
        c.eat();
        c.speak();
    }
}
