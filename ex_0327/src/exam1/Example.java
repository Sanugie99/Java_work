package exam1;

class A{
    public A(){
    	System.out.println("A");
    }
    public A(int x){
    	System.out.println("A: " + x);
    }
}

class B extends A{
    public B(){
    	super(100);
    }
    public B(int x){
    	super();// 기본적으로 숨겨져있음
    	System.out.println("B: " + x);
    }
}
public class Example{
    public static void main(String[] args){
    	B b = new B(11);
    }
}


//A
//B 11