package week04;

class BoxMax{
	//�Ű������� ���� ��ü�� �ʵ� volume�� ���Ͽ� ū volume���� ���� ��ü�� ��ȯ 
		public static Box isMax(Box[] dim){
			Box max=dim[0];
			for(int i=1; i<dim.length;i++) {
				if(max.getVolume() < dim[i].getVolume())
					max=dim[i];
			}
			return max;
			}
	}
