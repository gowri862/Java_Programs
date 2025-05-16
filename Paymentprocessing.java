package Programs;

class Topayvia{
	void pay(int amount) {
		System.out.println("In hand amount:"+amount);
	}
}
class CreaditUpi extends Topayvia{
	void pay(int amount) {
		System.out.println("Upipayment"+amount);
	}
}
class Gpay extends Topayvia{
	void  pay(int amount) {
		System.out.println("Gpay"+amount);
	}
}
public class Paymentprocessing {

	public static void main(String[] args) {
	Topayvia p=new Topayvia();
	p.pay(500);
	
	Topayvia ref;
	ref  = new CreaditUpi();
	ref.pay(2000);
	 
	ref =new Gpay();
	ref.pay(3000);
		

	}

}
//method-overridding :
