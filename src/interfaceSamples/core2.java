package interfaceSamples;

public class core2 implements TestInterface{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		core2 obj = new core2();
		TestInterface obj2 = new core2();
		
		obj2.displayMessage();
		obj2.doSothing(3);
	
		
		
		
		
		obj.displayMessage();
		obj.doSomeOtherThing();
		obj.doSothing(2);
		obj.displaySomething();
		obj.welcome();
	}
	
	public void welcome() {
		System.out.println("this belongs to this class");
	}

	
	public void doSomeOtherThing() {
		// TODO Auto-generated method stub
		System.out.println("Core 2 - doSomeOtherThing");
	}

	@Override
	public void doSothing(int a) {
		// TODO Auto-generated method stub
		System.out.println("Core 2 - doSothing");
	}

	@Override
	public void displaySomething() {
		// TODO Auto-generated method stub
		System.out.println("Core 2 - displaySomething");
	}

}
