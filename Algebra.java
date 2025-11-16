// Implements algebraic operations and the square root function without using 
// the Java operations a + b, a - b, a * b, a / b, a % b, and without calling 
// Math.sqrt. All the functions in this class operate on int values and
// return int values.

public class Algebra {
	public static void main(String args[]) {
		// Tests some of the operations
		System.out.println(plus(-1, -3)); // 2 + 3
		System.out.println(minus(-2, -3));
		System.out.println(times(10, 2));
		System.out.println(pow(-2, 3));
		System.out.println(div(-15, -3));
		System.out.println(sqrt(-0));
		System.out.println(mod(10, 3));
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
		if (x2 >= 0) {
			for (int i = 0; i < x2; i++) {
				x1--;
			}
		} else if (x2 < 0) {
			for (int i = 0; i > x2; i--) {
				x1++;

			}
			return x1;

		} else {
			for (int i = 0; i > x2; i++) {
				x1++;
			}
		}
		return x1;
	}

	// Returns x1 * x2
	public static int times(int x1, int x2) {
		int sum = 0;
		int x3 = 0;
		int x4 = 0;
		if ((x1 > 1 && x2 > 1)) {
			for (int i = 0; i < x2; i++) {
				sum = plus(sum, x1);
			}
			return sum;
		} else if ((x1 < 0 && x2 < 0)) {
			x4 = minus(0, x2);
			x3 = minus(0, x1);
			sum = 0;
			for (int i = 0; i < x4; i++) {
				sum = plus(x3, sum);

			}

			return sum;

		} else if ((x2 == 0 || x1 == 0)) {
			return 0;
		} else if (x1 == 1) {
			return x2;
		} else if (x2 == 1) {
			return x1;
		} else if ((x1 < 0 && x2 > 0)) {
			for (int i = 0; i < x2; i++) {
				sum = plus(sum, x1);
			}
			return sum;
		} else if (x1 > 0 && x2 < 0) {
			for (int i = 0; i > x2; i--) {
				sum = minus(sum, x1);
			}
			return sum;
		}
		return x2;
	}

	// Returns x^n (for n >= 0)
	public static int pow(int x, int n) {
		int sum = 1;
		if (x > 1 && n > 1) {
			for (int i = 0; i < n; i++) {
				sum = times(sum, x);

			}
		} else if (x == 0) {
			return 0;
		} else if (x == 1) {
			return 1;
		} else if (x > 1 && n == 0) {
			return 1;
		} else if (x > 1 && n < 0) {
			return 0;
		} else if (x < 1 && n > 1) {
			if (mod(n, 2) != 0) {
				int x2 = minus(0, x);
				int n2 = minus(0, n);
				for (int i = 0; i < n; i++) {
					sum = times(sum, x2);
				}
				return minus(0, sum);
			} else {
				int x2 = minus(0, x);
				int n2 = minus(0, n);
				for (int i = 0; i < n; i++) {
					sum = times(sum, x2);
				}
				return sum;

			}
		}
		return sum;

	}

	// Returns the integer part of x1 / x2
	public static int div(int x1, int x2) {
		// Replace the following statement with your code
		int sum = x1;
		int count = 0;
		if (x1 > 1 && x2 > 1) {
			while (sum >= x2) {
				sum = minus(sum, x2);
				count++;
			}
		}
		if (x2 == 0 && x1 > 0) {
			return 0;
		} else if (x1 < 0 && x2 > 1) {
			while (sum < 0) {
				sum = plus(sum, x2);
				count++;
			}
			return minus(0, count);

		} else if (x1 == 0 && x2 > 0) {
			return 0;

		} else if (x2 == 1) {
			return x1;
		} else if (x1 > 1 && x2 < 0) {
			while (sum > 1) {
				sum = plus(sum, x2);
				count++;
			}
			return minus(0, count);
		} else if (x1 < 0 && x2 < 0) {
			while (sum < 0) {
				sum = minus(sum, x2);
				count++;
			}
			return count;
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
		if (x >= 0) {
			while (x >= pow(i, 2)) {
				i++;
			}
			return minus(i, 1);
		}
		return 0;
	}
}