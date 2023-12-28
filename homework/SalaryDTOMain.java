package homework;

public class SalaryDTOMain {

	public static void main(String[] args) {
		SalaryDTO[] salArr = new SalaryDTO[3];
		
		for(int i=0; i<salArr.length; i++) {
			salArr[i] = new SalaryDTO();
		}
		
		salArr[0].setData("Kim", "이사", 4700000, 600000);
		salArr[1].setData("Lee", "차장", 2500000, 550000);
		salArr[2].setData("Park", "과장", 2100000, 250000);
		
		System.out.println("이름\t직급\t기본급\t\t수당\t합계\t\t세율\t월급");
		for(SalaryDTO data : salArr) {
			data.calc();
			data.printInfo();
		}
		
	}

}
