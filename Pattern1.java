
public class Pattern1 {

	public static void main(String[] args) {
		int n=10;
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {//I
				if(i==0||i==n-1||j==(n-1)/2)
				{
					System.out.print("*");
				}else {
					System.out.print(" ");
				} //Git Integration Testing
			}
			System.out.print(" ");
			for(int j=0;j<n;j++) {//N
				if(j==0||j==n-1||i==j)
				{
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.print(" ");
			for(int j=0;j<n;j++) {//E
				if(j==0||i==0||i==(n-1)/2||i==n-1) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.print(" ");
			for(int j=0;j<n;j++) {//U
				if((j==0&&i<n-1)||j==n-1&&i<n-1||i==n-1&&j>0&&j<n-1) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.print(" ");
			for(int j=0;j<n;j++) {//R
				if(j==0||i==0&&j<n-1||i==(n-1)/2&&j<(n-1)||j==(n-1)&&i>0&&i<(n-1)/2||i>(n-1)/2&&j>(n-1)/2&&i==j) {//i-j==(n-1)/2
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.print(" ");
			for(int j=0;j<n;j++) {//O
				if(j==0&&i>0&&i<n-1||j==n-1&&i>0&&i<n-1||i==0&&j>0&&j<n-1||i==n-1&&j>0&&j<n-1) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.print(" ");
			for(int j=0;j<n;j++) {//N
				if(j==0||j==n-1||i==j)
				{
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			
			System.out.println();
			
		}
		
		

	}

}
