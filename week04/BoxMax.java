package week04;

class BoxMax{
	//매개변수로 받은 객체의 필드 volume을 비교하여 큰 volume값을 갖는 객체를 반환 
		public static Box isMax(Box[] dim){
			Box max=dim[0];
			for(int i=1; i<dim.length;i++) {
				if(max.getVolume() < dim[i].getVolume())
					max=dim[i];
			}
			return max;
			}
	}
