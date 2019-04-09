import java.io.IOException;

public class TryCatchApp {

	public static void main(String[] args) throws IOException {
		int ch, calc;
		System.out.println("1: Uncontrolled");
		System.out.println("2: Catch not that smart");
		
		ch = System.in.read();
		DivideError d = new DivideError();
		switch (ch) {
		case '1':
			calc=d.uncontrolled(0);
			break;
		case '2':
			calc=d.justwrap(0);
			break;
		}
		System.out.println("Main is done");
	}

}
