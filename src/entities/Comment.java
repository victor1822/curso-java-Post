package entities;

public class Comment {

	private String text;

	public Comment(String text) {
		this.text = text;
	}

	public void editText(String text) {
		this.text = text;
	}

	public String toString() {
		return text;
	}

}
