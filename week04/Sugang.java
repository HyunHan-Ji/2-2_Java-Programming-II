package week04;

public class Sugang {
	private int maxcount, count, seat;  //�����ִ��ο�, ���� ������û�� �ο�, �ܿ��¼�
	private String title;
	
	public Sugang(int maxcount,String title) {
		this.maxcount = maxcount;
		this.title = title;
		this.seat = maxcount;
	}
	public int getMaxcount() {
		return maxcount;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public int getSeat() {
		return seat;
	}
	public void setSeat(int seat) {
		this.seat = seat;
	}
	public String getTitle() {
		return title;
	}	
}