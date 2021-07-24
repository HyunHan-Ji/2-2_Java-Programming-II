package week02;

public class Dim {
	private int in[];
	private double dou[];
	
	void init(int size,char type) {
		if(type == 'i') {
			in = new int[size];
			System.out.println(">> ������ �迭�� ������ �ʱ�ȭ �մϴ�");
			for(int i=0;i<in.length;i++) {
				in[i]=(int)(Math.random()*49)+1;
			}
		}
		
		else if(type == 'd') {
			dou = new double[size];
			System.out.println(">> �Ǽ��� �迭�� ������ �ʱ�ȭ �մϴ�");
			for(int i=0;i<dou.length;i++) {
				dou[i]=Math.random();
			}
		}
	}
	
	int isearch(int digit) {
		if(digit<0 && digit>=in.length) {
			return -1;
		}
		return in[digit];
	}
	
	double dsearch(int digit) {
		if(digit<0 && digit>=dou.length) {
			return -1.0;
		}
		return dou[digit];
	}
	
	void aprint(char type) { //�迭 ��� �޼ҵ�
		if(type == 'i') {
			for(int i=0;i<in.length;i++) {
				System.out.printf("%d  ",in[i]);
			}
			System.out.println();
		}else if(type == 'd') {
			for(int i=0;i<dou.length;i++) {
				System.out.printf("%.2f  ",dou[i]);
			}
			System.out.println();
		}
		
	}
	
}
