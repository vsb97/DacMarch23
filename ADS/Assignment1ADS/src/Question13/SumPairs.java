package Question13;

public class SumPairs {

	private static void pairs(int n) {
		int i, j;
		if(n>0) {
			i=1;j=n-1;
			while(i<=j) {
				if(i+j == n)
					System.out.println("("+i+", "+j+")");
				i++;j--;
			}
		}
		else {
			i=-1;j=n+1;
			while(i>=j) {
				if(i+j == n)
					System.out.println("("+i+", "+j+")");
				i--;j++;
			}
		}
	}
	public static void main(String[] args) {
		SumPairs.pairs(-5);
	}

}
