package ex04_api;

public class Book {
	String bookname;
	String author;
	public Book(String bookname, String author) {
		super();
		this.bookname = bookname;
		this.author = author;
	}
	
	@Override
	public String toString() {
		String book = "책 제목 : " + bookname + ", 저자 : " + author;
		return book;
	}
	

}
