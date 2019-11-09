package factLoop;

public class CalcFactorial {
	
public static int factorial (int n) {
	int prod = 1;
	for (int i=n; i>=1; i--) {
		prod = prod * i;
	}
	return prod;
}
}
