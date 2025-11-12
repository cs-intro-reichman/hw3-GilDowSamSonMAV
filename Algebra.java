// Implements algebraic operations and the square root function without using 
// the Java operations a + b, a - b, a * b, a / b, a % b, and without calling 
// Math.sqrt. All the functions in this class operate on int values and
// return int values.

public class Algebra {
	public static void main(String args[]) {
		// Tests some of the operations
		System.out.println(plus(-1, -3)); // 2 + 3
		System.out.println(minus(5, 3));
		System.out.println(times(10, 2));
		System.out.println(pow(5, 3));
		System.out.println(div(10, 2));
		System.out.println(sqrt(159));
	}

	// Returns x1 + x2
	public static int plus(int x1, int x2) {

		if (x2 >= 0) {
			for (int i = 0; i < x2; i++) {
				x1++;
			}

		} else {
			for (int i = 0; i > x2; i--) {
				x1--;
			}
		}
		return x1;

	}

	// Returns x1 - x2
	public static int minus(int x1, int x2) {
		if (x2 >= 0){
		for (int i = 0; i < x2; i++) {
			x1--;
		}
		}else{
			for (int i = 0; i < x2; i++) {
			x1++;
		}

		}
		return x1;
	}

	// Returns x1 * x2
	public static int times(int x1, int x2) {
		int sum = 0;
		if(x1 < 0 && x2 < 0 ){
		for (int i = 0; i < x1; i++) {
			for (int j = 0; j < x2; j++) {
				sum++;
			}

		}
		}else if((x2 == 0 || x2 == 0)){
			return 0;
		}else{ 


		}
		return sum;

	}

	// Returns x^n (for n >= 0)
	public static int pow(int x, int n) {
		int sum = 1;
		for (int i = 0; i < n; i++) {
			sum = times(sum, x);

		}
		return sum;
	}

	// Returns the integer part of x1 / x2
	public static int div(int x1, int x2) {
		// Replace the following statement with your code
		int sum = x1;
		int count = 0;
		while (sum >= x2) {
			sum = minus(sum, x2);
			count++;
		}

		return count;
	}

	// Returns x1 % x2
	public static int mod(int x1, int x2) {
		return minus(x1, times(x2, div(x1, x2)));
	}

	// Returns the integer part of sqrt(x)
	public static int sqrt(int x) {
		int i = 0;
		while (x > pow(i, 2)) {
			i++;
		}
		return minus(i, 1);

	}
}