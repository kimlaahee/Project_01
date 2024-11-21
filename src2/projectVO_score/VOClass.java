package projectVO_score;

public class VOClass {
	private int correct;
	private int incorrect;
	
    public VOClass() {}
	
	public VOClass(int correct, int incorrect) { 
		super();
		this.correct=correct;
		this.incorrect=incorrect;
	}
	
	public int getCorrect() {
		return correct;
	}
	public void setCorrect(int correct) {
		this.correct = correct;
	}
	public int getIncorrect() {
		return incorrect;
	}
	public void setIncorrect(int incorrect) {
		this.incorrect = incorrect;
	}
}
