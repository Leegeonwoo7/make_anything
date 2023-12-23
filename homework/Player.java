package homework;

public class Player {
	private int money;
	
	public Player() {}
	public Player(int money) {
		this.money = money;
	}
	
	public int getMoney() {
		return this.money;
	}
	
	public void setMoney(int money) {
		this.money = money;
	}
	
	public void updateMoney(int amount) {
		money += amount;
	}
}
