
public class CircularRotation {
	/*
	 * target = �7531�, blocked = {�1543�, �7434�, �7300�, �7321�, �2427� }
	 * 
	 * 
	 * �0000� -> �9000� -> �8000� -> �7000� -> �7100� -> �7200� -> �7210� -> �7310�
	 * -> �7410� -> �7510� -> �7520� -> �7530� -> �7531�
	 */
	public static void main(String[] args) {

		String target = "7531";
		String[] blocked = { "1543", "7434", "7300", "7321", "2427" };
		String initial = "0000";
		System.out.println(minRotation(initial, target, blocked));
	}

	public static int minRotation(String initial, String target, String[] blocked) {
		int counterleftToRight = 0;
		int counterRightToleft = 0;
		StringBuilder result;
		try {
			String[] str = target.split("");
			mainForLoop:
			for (int i = 0; i < target.length(); i++) {
//				initial.replace(intial.charAt(i),'9');
				if (Integer.valueOf(str[i]) > 5) {
				innerForLoop:	
					for (int j = 9; j >= 0; j--) {
						initial.replace(initial.charAt(i), (char) j);
					for(int x=0;x<blocked.length;x++) {	
						if (initial.charAt(i) == blocked[x].charAt(i)) {
							break innerForLoop; 
						}
					}counterleftToRight++;
				
					}	
				
				} else {
					innerForLoop2:
					for (int j = 0; j <= 9; j++) {
						initial.replace(initial.charAt(i), (char) j);
						for(int x=0;x<blocked.length;x++) {		
						if (initial.charAt(i) == blocked[x].charAt(i)) {
							break innerForLoop2;
						}
					}counterleftToRight++;
					}
					
				}
				
			}
//			for (int i = target.length(); i >0 ; i--) {
////				initial.replace(intial.charAt(i),'9');
//				if (Integer.valueOf(str[i]) > 5) {
//					for (int j = 9; j >= 5; j--) {
//						initial.replace(initial.charAt(i), (char) j);	
//						if (initial.charAt(i) == blocked[i].charAt(i)) {
//							break;
//						}
//					}
//				} else {
//					for (int j = 0; j <= 4; j++) {
//						initial.replace(initial.charAt(i), (char) j);
//						if (initial.charAt(i) == blocked[i].charAt(i)) {
//							break;
//						}
//					}
//				}
//				
//			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return counterleftToRight;
	}

}
