package AbstractMethod;

public abstract class Animal {

		// TODO Auto-generated constructor stub
		 protected String name;
		    
		   public Animal(String name) {
		        this.name = name;
		    }
		    
		    public void eat() {
		        System.out.println(name + " is eating.");
		    }
		    
		    public abstract void speak();
	}


