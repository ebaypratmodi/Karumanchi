
public class Circular {

	public static void main(String[] args) {

		String target = "7531";

		String[] blocked = { "1543", "7434", "7300", "7321", "2427" };
		String sample ="0000";
	}
	
	public static int min_Rotation(String sample) {
		int rotationCounter;
		int x;
		for (int i = 0; i < sample.length(); i++) {
//			for (int j = i + 1; j <= blocked.length; j++) {
				if(sample.charAt(i)=='0'){
				//	x = sample.charAt(i);
					 x='9';
				}else if(sample.charAt(i)=='9'){
			//		int x = sample.charAt(i);
					x='0';
				}
				
				if(sample.charAt(i)=='9') {
					for(int z=9;z>=0;z--) {
						sample.charAt(z) ==
					}
				}
				
			}
//		}


	}
}
