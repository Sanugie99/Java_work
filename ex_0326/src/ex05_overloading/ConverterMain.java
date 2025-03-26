package ex05_overloading;
import java.util.*;
public class ConverterMain {

	public static void main(String[] args) {
		Converter c = new Converter();
		
		c.convert(300.0);
		c.convert(1.0,"m");

	}

}
