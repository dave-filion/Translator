package goodbye;

import hello.Hello;

public class Goodbye extends Hello{

	public void sayHi() {
		System.out.println("Bye!");
	}

	public void sayBye(String name) {
		System.out.println(name);
	}
	
	public void sayBye(){
		System.out.println("BYE");
	}
	
	public void forTest(){
		int q = 5;
		for (int i = 0; i < 10; i++) {
			q += 1;
		}
	}
	
	public void whileTest(){
		int i = 0;
		while (i < 10) {
			i++;
		}
	}
	
	public String returnString(){
		return "Hi";
	}
	
	public void chainTest(){
		returnString().startsWith("H");
	}
}
