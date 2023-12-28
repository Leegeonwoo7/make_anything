package homework;

import java.text.DecimalFormat;

public class SalaryDTO {
	private String name;
	private String job;
	private int basic;
	private int extra;
	private int total;
	private double rate;
	private int salary;
	
	public void setData(String name, String job, int basic, int extra) {
		this.name = name;
		this.job = job;
		this.basic = basic;
		this.extra = extra;
	}
	
	public void calc() {
		total = basic + extra;
		if(total >= 5000000) {
			rate = 0.03;
		}else if(total >= 3000000) {
			rate = 0.02;
		}else {
			rate = 0.01;
		}
		salary = total - (int)(total * rate);
	}
	
	public void printInfo() {
		DecimalFormat df = new DecimalFormat();
		
		System.out.println("이름\t직급\t기본급\t수당\t합계\t세율\t월급");
		System.out.println(name + "\t" + 
							job + "\t" + 
							df.format(basic) + "\t" + 
							df.format(extra) + "\t" + 
							df.format(total) + "\t" + 
							String.format("%.2f", rate) + "\t" + 
							df.format(salary));
	}
}
