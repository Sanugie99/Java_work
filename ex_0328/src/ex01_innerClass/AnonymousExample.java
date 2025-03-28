package ex01_innerClass;

import java.util.Set;

interface buttonClickListner{
	public void Click();
}
public class AnonymousExample {
	public class Button{
		private buttonClickListner Listener;
		
		public void setListener(buttonClickListner listener) {
			Listener = listener;
		}
		
		public void click() {
			if(Listener != null) {
				this.Listener.Click();
			}
		}
	}
	
	public static void main(String[] args) {
		AnonymousExample exam = new AnonymousExample();
		AnonymousExample.Button button = exam.new Button();
		
		button.setListener(new buttonClickListner() {
			@Override
			public void Click() {
				System.out.println("버튼 클릭됨");
			}//버튼 클래스의 역할을 하지만 따로 클래스 이름이 정의된건 아님.
		});
		
		button.click();
	}
}
