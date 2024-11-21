package Play01_VO;

public class Play01_words {
	private int id;
	private String categ;
	private String word;
	
	public Play01_words(int id, String categ, String word) {
		super();
		this.id = id;
		this.categ = categ;
		this.word = word;
	}
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getCateg() {
		return categ;
	}
	
	public void setCateg(String categ) {
		this.categ = categ;
	}
	
	public String getWord() {
		return word;
	}
	public void setWord(String word) {
		this.word = word;
	}
}