package ex03_constructer;

public class SnakMain {

	public static void main(String[] args) {
		Snak chip = new Snak();
		chip.price = 2000;
		chip.info();
		Snak fries = new Snak(3000);

	}

}
