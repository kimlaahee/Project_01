package projectVO_image;

public class VOClass_image {
	private int num;
	private String word;
	
	public VOClass_image() {}
	
	public VOClass_image(int num, String word) { 
		super();
		this.num=num;
		this.word=word;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getWord() {
		return word;
	}

	public void setWord(String word) {
		this.word = word;
	}
}
