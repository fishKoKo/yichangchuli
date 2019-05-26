package test1;

public class CatchClass {
	public static int parselnt(String n1) throws Exception {
		if (n1 == null) {
			throw new Exception("输入不能为空");
		}
		int n2 = 0;
		n2 = Integer.valueOf(n1);
		return n2;
	}

	public static void main(String[] args) {

		try {
			int n = CatchClass.parselnt(null);
			System.out.println(n);
		} catch (Exception e) {
			System.out.println(e.toString());
		}

		try {
			int n = CatchClass.parselnt("gkd");
			System.out.println(n);
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		
		try {
			int n = CatchClass.parselnt("100");
			System.out.println(n);
		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}
}