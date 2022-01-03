package staircase;

public class solution {
	
	public static void descendingStaircase(int n) {
		for(int i=0; i<n; i++) {
			for(int j=n-i; j<=n; j++) {
				System.out.print("#");
			}
			System.out.println(" ");
		}
	}

	public static void main(String[] args) {
		int n = 3;
//		System.out.println();
//		descendingStaircase(m);
		
		for(int i=n; i>=0; i--) {
//			System.out.print("#");
			for(int j=n-i; j<n; j++) {
				System.out.print(" ");
				for(int j1=0; j1<j; j1++) {
					System.out.print("$");
				}
			}
			System.out.println("#");
			//System.out.println("#");
		}
	}

}
