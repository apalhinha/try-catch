
public class DivideError {
	public int uncontrolled(int a) {
		return 1/a;
	}
	
	public int justwrap(int a) {
		int res;
		try {
			res=uncontrolled(a);
		} finally {
			System.out.println("Got an error");
			res=0;
		}
		return res;
	}
}
