package exam1;

public class CalculatorMain {

	public static void main(String[] args) {
		Calculator Cal = new Calculator();
		System.out.println(Cal.getResult(10, 5));
		
		CalPlus cp = new CalPlus();
		System.out.println(cp.getResult(10, 5));
		
		CalMinus cm = new CalMinus();
		System.out.println(cm.getResult(10, 5));
	}

}
