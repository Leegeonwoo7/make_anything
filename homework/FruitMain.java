package homework;

public class FruitMain {
	public static void main(String[] args) {
		Fruit[] fruits = new Fruit[3];
		
		Fruit apple = new Fruit("사과", 100, 80, 75);
		Fruit grape = new Fruit("포도", 30, 25, 10);
		Fruit strawberry = new Fruit("딸기", 25, 30, 90);
		
		fruits[0] = apple;
		fruits[1] = grape;
		fruits[2] = strawberry;
		
		System.out.println("------------------------------------");
		System.out.println("PUM\tJAN\tFEB\tMAR\tTOT");
		System.out.println("------------------------------------");
		for(int i=0; i<fruits.length; i++) {
			fruits[i].display();
		}
		Fruit.output();

	}
}
