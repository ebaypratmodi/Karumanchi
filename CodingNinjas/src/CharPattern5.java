import java.util.Scanner;

public class CharPattern5 {

	/*
	 *  E
		DE
		CDE
		BCDE
		ABCDE
	 * */
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int i =n;
		for(i=n;i>0;i--) {
//			System.out.print((char)('A'+i));
			for(int j=i-1;j<n;j++) {
				System.out.print((char)('A'+j));
			}
			System.out.println();
		}
//		while(i>=n) {
//			int j=1;
//			char ch = (char)('A'+i);
//			while(j<=n) {
//				System.out.print(ch);
//	//			ch = (char)(ch + 1);
//				j++;
//			}
//			System.out.println();
//			i--;
//		}
		
		sc.close();

		
	}

}
