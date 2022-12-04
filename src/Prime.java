
public class Prime {
	public boolean isPrime(int number) {
		boolean prime = true;
		
		for (int k = 2; k <= number-1; k++) {
			if (number%k == 0) {
				prime = false;
				break;
			}
		}
		
		return prime;
	}
}
