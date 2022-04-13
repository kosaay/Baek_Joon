package ifexamole;

class Apple {
	int price = 0;
	public Apple(int price) {
		this.price = price;
	}
    public int add(int a, int b) {
        return a+b;
    }
}

public class Test010 {
	public static void main(String[] args) {
		Apple apple = new Apple(5);
		System.out.println("price: "+apple.price);
	}
}
