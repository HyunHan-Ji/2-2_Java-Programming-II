package week04;

import java.util.*;
class Box{
	private int ga, se, he; //가로, 세로, 높이 저장
	private int volume; //부피 저장
	private static int cnt=0;  //생성된 객체 수를 저장하는 정적 필드
	
	public Box() {
		this(0,0,0); //오버로딩 된 생성자 호출, 항상 첫 문장에 작성
	}
	public Box(int ga, int se, int he){
		this.ga=ga; 	this.se=se; 	this.he=he;
		volume = ga*se*he; //부피 계산
		cnt++;
		}
	
	public int getVolume(){
		return volume;
	}
	
	public String toString(){
		String str="가로 : " + ga +"\t세로 : " + se + "\t높이 : " + he;
		str += "\t부피 : " + volume+"\t생성된 객체 수 : " + cnt ;
		return str;
	}
public boolean isSame(Box obj) { 
//객체 내용을 비교하여 같으면 true 다르면 false 반환
		if(ga==obj.ga && se==obj.se && he==obj.he)
			return true;
		else
			return false;
	}
}
