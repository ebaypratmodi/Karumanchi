import java.util.Scanner;

public class CharPattern4 {

	/*
	 *  A
		BC
		CDE
		DEFG
	 * */
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int i =1;
		
		while(i<=n) {
			int j=1;
			char ch = (char)('A'+i-1);
			while(j<=i) {
				System.out.print(ch);
				ch = (char)(ch + 1);
				j++;
			}
			System.out.println();
			i++;
		}
		
		sc.close();

	}

}
