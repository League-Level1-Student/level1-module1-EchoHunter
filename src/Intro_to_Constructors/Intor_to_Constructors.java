package Intro_to_Constructors;

public class Intor_to_Constructors {
	
	
	static Runner p = new Intor_to_Constructors.Runner();
	
	public static void main(String[] args) {
		p.sayHi();
	}
	public static class Platypus {
	    private String name;
	    void sayHi(){
	        System.out.println("The platypus " + name + " is smarter than your average platypus.");
	    }
	    
	}
	public static class Runner{
	public static void main(String[] args) {
		Platypus p = new Platypus();
	    p.sayHi();
	}

	public void sayHi() {
		// TODO Auto-generated method stub
		System.out.println("The platypus " + name + " is smarter than your average platypus.");
	}
		
	}
}


