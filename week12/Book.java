package week12;

public class Book {
	private String number;
	private String title;
	private String author;
	private boolean status;

	public Book(String number, String title, String author) {
		this.number = number;
		this.title = title;
		this.author = author;
		status = false;
	}

	@Override
	public String toString() {
		return number + "\t" + title + "\t" + author + "\t" + status;
	}

	void rentBook() {
		if (status) {
			System.out.println("���� �Ұ�(������)");
		} else {
			status = true;
			System.out.println("���� �Ϸ�");
		}
	}

	public String getNumber() {
		return number;
	}

	public String getTitle() {
		return title;
	}

	public String getAuthor() {
		return author;
	}

	public boolean isStatus() {
		return status;
	}

}
