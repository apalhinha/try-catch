import java.io.IOException;

public class TryCatchApp {

	public static void main(String[] args) throws IOException {
		int ch, calc;
		System.out.println("1: Devide by zero");
		System.out.println("2: Open inexistent file");
		
		ch = System.in.read();
		switch (ch) {
		case '1':
			DivideError d = new DivideError();
			calc=d.uncontrolled(0);
			break;
		case '2':
			System.out.println("2 not implemented");
			break;
		}
		System.out.println("Main is done");
	}

}
