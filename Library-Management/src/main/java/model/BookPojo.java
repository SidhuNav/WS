package model;

public class BookPojo {
	private int book_id;
	private String book_name;
	private  String book_description;
	private String author_name;
	private String publisher_name;
	private String image_url;
	
	public BookPojo(){
		
	}

	public BookPojo(int book_id, String book_name, String book_description, String author_name, String publisher_name,
			String image_url) {
		super();
		this.book_id = book_id;
		this.book_name = book_name;
		this.book_description = book_description;
		this.author_name = author_name;
		this.publisher_name = publisher_name;
		this.image_url = image_url;
	}

	public int getBook_id() {
		return book_id;
	}

	public void setBook_id(int book_id) {
		this.book_id = book_id;
	}

	public String getBook_name() {
		return book_name;
	}

	public void setBook_name(String book_name) {
		this.book_name = book_name;
	}

	public String getBook_description() {
		return book_description;
	}

	public void setBook_description(String book_description) {
		this.book_description = book_description;
	}

	public String getAuthor_name() {
		return author_name;
	}

	public void setAuthor_name(String author_name) {
		this.author_name = author_name;
	}

	public String getPublisher_name() {
		return publisher_name;
	}

	public void setPublisher_name(String publisher_name) {
		this.publisher_name = publisher_name;
	}

	public String getImage_url() {
		return image_url;
	}

	public void setImage_url(String image_url) {
		this.image_url = image_url;
	}

	@Override
	public String toString() {
		return "BookPojo [book_id=" + book_id + ", book_name=" + book_name + ", book_description=" + book_description
				+ ", author_name=" + author_name + ", publisher_name=" + publisher_name + ", image_url=" + image_url
				+ "]";
	}
}
