package ch14.collection.list;

public class BoardDTO {
	//field
	private String subject ; // subject field
	private String content ; // content field
	private String writer ; // writer field
	
	// constructor -> no basic constructor
	public BoardDTO() { // basic constructor
		//if using setter
		
	}
	public BoardDTO(String subject, String content, String writer) {
		super();
		this.subject = subject;
		this.content = content;
		this.writer = writer;
	}

	public String getSubject() {
		return subject;
	}

	//method (get, set)
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

	@Override
	public String toString() { //override해서 tostring 보이게 하기
		return "BoardDTO [subject=" + subject + ", content=" + content + ", writer=" + writer + ", getSubject()="
				+ getSubject() + ", getContent()=" + getContent() + ", getWriter()=" + getWriter() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
}
