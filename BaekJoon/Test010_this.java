package ifexamole;

class Apple {
	int price = 0;
	public Apple() {
		this.price = 1;
	}
    public Apple(int price) {
        this.price = price;
    }
    public Apple(int price, int mult) {
        this.price = price*mult;
    }
}

public class Test010 {
	public static void main(String[] args) {
		Apple apple = new Apple();
        Apple apple2 = new Apple(10);
        Apple apple3 = new Apple(10, 2);

		System.out.println("apple price: "+apple.price);
        System.out.println("apple2 price: "+apple2.price);
        System.out.println("apple3 price: "+apple3.price);
	}
}
