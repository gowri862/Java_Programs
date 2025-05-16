package Programs;
import java.util.ArrayList;
import java.util.Scanner;
public class Arraylist {
	public static void main(String[] args) {
		ArrayList <Object> Details=new  ArrayList<>();

		Scanner sc=new Scanner(System.in);
		//adding values
		String name=sc.nextLine();
		Details.add(name);
		Details.add(20000);
		Details.add("Developer");
		System.out.println("Given Arraylist:"+Details);
		//size of arraylist
		System.out.println("Size of Arraylist:"+Details.size());
		//remove
		System.out.println("Remove element"+Details.remove(1));
		//getting an element
		System.out.println("getting element:"+Details.get(1));
	}

}

