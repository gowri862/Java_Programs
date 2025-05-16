package Programs;

abstract class Vechicle {
	abstract void Startsusing();
}
class Bike extends Vechicle {
	void Startsusing() {
		System.out.println("Bike Starts With Kick!.");
	}
}

public class Vechicles {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vechicle ref=new  Bike ();
		ref.Startsusing();
	}

}
