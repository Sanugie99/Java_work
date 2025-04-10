package ex05_Enum;

public class OperationMain {

	public static void main(String[] args) {
		Operation[] op = Operation.values();
		
		for(Operation oper : op) {
			System.out.printf("두 수의 %s = %d\n",oper.name(),oper.apply(10, 5));

		}

	}

}
