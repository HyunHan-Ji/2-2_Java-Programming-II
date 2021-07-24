package week04;

public class Sugang {
	private int maxcount, count, seat;  //수강최대인원, 현재 수강신청한 인원, 잔여좌석
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