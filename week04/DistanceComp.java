package week04;

public class DistanceComp {
	public static Distance longdistance(Distance[] arr) {
		int Dist = arr[0].getDist();
		int index = 0;
		
		for(int i = 1; i<arr.length ; i++) {
			if(arr[i].getDist() > Dist) {
				Dist = arr[i].getDist();
				index = i;
			}
		}
		return arr[index];
	}
	
	public static Distance shortdistance(Distance[] arr) {
		int Dist = arr[0].getDist();
		int index = 0;
		
		for(int i = 1; i<arr.length ; i++) {
			if(arr[i].getDist() < Dist) {
				Dist = arr[i].getDist();
				index = i;
			}
		}
		return arr[index];
	}
}
