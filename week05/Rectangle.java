package week05;

public class Rectangle extends ShapeDraw{
	@Override
	public void draw(int x, char ch) {
		for(int i= 0 ; i<x;i++) {
			System.out.printf("%c%c%c%c%c%c%c\n",ch,ch,ch,ch,ch,ch,ch);
		}
	}
}
