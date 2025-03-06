public class PracticeProblem {

	public static void main(String args[]) {}

	public static boolean validIndex(int[] intArr, int num) {
		boolean within = false;

		try {
			if ((num<intArr.length)) {
				within = true;
			}
		}

		catch (ArrayIndexOutOfBoundsException e) {
			within = false;
		}

		return within;
	}

	public static int divide(int one, int two) {

		int quo = 0;

		try {
			quo = one/two;	
		}

		catch (ArithmeticException e) {
			quo = 0;
		}

		return quo;

	}

	public static int safeConvertStringtoInt(String word) {

		int con = 0;

		try {
			con = Integer.valueOf(word);
		}

		catch (NumberFormatException e) {
			con = 0;
		}

		return con;

	}

}
