package ifexamole;

class Apple {
	int price = 0;
	public int add(int a, int b) {
		return a+b;
	}
}

public class Test010 {
	public static void main(String[] args) {
		Apple apple = new Apple();
		apple.price = 10;
		System.out.println(apple.add(4, 5));
		System.out.println("price: "+apple.price);
	}
}
