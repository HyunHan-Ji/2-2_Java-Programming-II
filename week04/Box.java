package week04;

import java.util.*;
class Box{
	private int ga, se, he; //����, ����, ���� ����
	private int volume; //���� ����
	private static int cnt=0;  //������ ��ü ���� �����ϴ� ���� �ʵ�
	
	public Box() {
		this(0,0,0); //�����ε� �� ������ ȣ��, �׻� ù ���忡 �ۼ�
	}
	public Box(int ga, int se, int he){
		this.ga=ga; 	this.se=se; 	this.he=he;
		volume = ga*se*he; //���� ���
		cnt++;
		}
	
	public int getVolume(){
		return volume;
	}
	
	public String toString(){
		String str="���� : " + ga +"\t���� : " + se + "\t���� : " + he;
		str += "\t���� : " + volume+"\t������ ��ü �� : " + cnt ;
		return str;
	}
public boolean isSame(Box obj) { 
//��ü ������ ���Ͽ� ������ true �ٸ��� false ��ȯ
		if(ga==obj.ga && se==obj.se && he==obj.he)
			return true;
		else
			return false;
	}
}
