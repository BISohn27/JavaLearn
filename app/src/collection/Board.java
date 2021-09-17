package collection;

public class Board {
	String subject;
	String content;
	String writer;
	String date;
	
	public Board(String subject, String content, String writer,String date) {
		this.subject = subject;
		this.content = content;
		this.writer = writer;
		this.date = date;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
}
