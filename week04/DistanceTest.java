package week04;

import java.util.*;

public class DistanceTest {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		Distance[] dist;   //객체 배열 선언
		Distance longdist=null, shortdist=null;
		System.out.print(">> 생성하고자 하는 객체의 수를 입력하세요 : ");
		int cnt=in.nextInt();
		dist =new Distance[cnt];  //객체 배열 생성
		for(int i=0; i<cnt;i++){
			System.out.print(">> 이름과 통학거리를 입력하세요 : ");
			dist[i]=new Distance(in.next(), in.nextInt());  //객체 배열 초기화
		}
		
		longdist = DistanceComp.longdistance(dist);
		shortdist = DistanceComp.shortdistance(dist);
		System.out.println("통학거리가 가장 긴 학생 : " + longdist);
		System.out.println("통학거리가 가장 짧은 학생 : " + shortdist);
		System.out.println("통학거리가 가장 긴 학생과 짧은 학생의 차이는 : " + (longdist.getDist() - shortdist.getDist()) + "입니다.");
	}
}
