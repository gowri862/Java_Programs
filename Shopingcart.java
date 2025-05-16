package Programs;

class Shoppingitems {
	void additems(String item_name, int price) {
			System.out.println("item name is:"+item_name+" "+"price is:"+price);
	}

	void additems(String item_name, int price, int item_quantity) {
		int totalprice=price*item_quantity;
		System.out.println("item name is:"+item_name+" "+"quantity:"+item_quantity+" "+"total price"+totalprice);

	}

	void additems(String item_name, int price, int item_quantity,int discount) {

	}
}

public class Shopingcart {

	public static void main(String[] args) {
		Shoppingitems ref=new Shoppingitems();
		ref.additems("Laptop", 50000);
		ref.additems("keyboard", 1000, 3);
	}

}
//method overloading - same method name but different in their argument