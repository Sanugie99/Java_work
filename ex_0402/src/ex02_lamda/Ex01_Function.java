package ex02_lamda;

public class Ex01_Function {

	public static void main(String[] args) {
		Iadd Add = (x,y) -> x+y;
		int res = result(Add); //Add = (x,y) -> x+y;
		System.out.println("res : " + res);
	}
	
	public static int result(Iadd lamda) { //lamda = Add = (x,y) -> x+y;
		return lamda.add(1, 2);
		//(x,y) -> x+y;.add(Iadd 함수형 인터페이스에 있는 add)(int x=1, int y=2);
		//(1,2) -> 1+2;
		//return 3;
		//result = 3
		//최종적으로 result(Add) = 3 = res
	}

}
