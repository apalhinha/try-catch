
public class DivideError {
	public int uncontrolled(int a) {
		return 1/a;
	}
	
	public int justwrap(int a) {
		int res;
		try {
			res=uncontrolled(a);
		} catch (Exception e) {
			System.out.println("Got an error");
			res=0;
		}
		return res;
	}
	
	public int withlog(int a) {
		int res;
		res=0;
		try {
			res=this.uncontrolled(0);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return res;
	}
}
