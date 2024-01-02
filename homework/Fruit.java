package homework;

public class Fruit {
	private String pum;
	private int jan;
	private int feb;
	private int mar;
	private int tot;
	public static int sumJan;
	public static int sumFeb;
	public static int sumMar;
	
	public Fruit(String pum, int jan, int feb, int mar) {
		this.pum = pum;
		this.jan = jan;
		this.feb = feb;
		this.mar = mar;
	}
	
	public void calc() {
		tot = jan + feb + mar;
		sumJan += jan;
		sumFeb += feb;
		sumMar += mar;
	}
	
	public void display() {
		calc();
		System.out.println(pum + "\t" + jan + "\t" + feb + "\t" + mar + "\t" + tot);
	}
	
	public static void output() {
		int totalSum = sumJan + sumFeb + sumMar;
		System.out.println("합계\t" + sumJan + "\t" + sumFeb + "\t" + sumMar + "\t" + totalSum);
	}
}
