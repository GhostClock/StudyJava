package Recursive;

public class TestRecursive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long result = fanctorial(10);
		System.out.println("result = " + result);
	}
	
	private static long fanctorial(long x) {
		if (x < 1) {
			throw new IllegalArgumentException("x 应该大于 1");
		}
		if (x <= 1 ) {
			return 1;
		}else {
			return x * fanctorial(x - 1);
		}
	}

}
