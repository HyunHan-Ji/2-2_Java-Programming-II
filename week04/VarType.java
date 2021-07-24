package week04;

public class VarType {
	public static int sum(int... arr) {
		int rtsum=0;
		
		for(int i=0 ; i<arr.length ; i++) 
			rtsum += arr[i];

		return rtsum;
	}
	
	public static double sum(double... arr) {
		double rtsum=0;
		
		for(int i=0 ; i<arr.length ; i++) 
			rtsum += arr[i];

		return rtsum;
	}
}
