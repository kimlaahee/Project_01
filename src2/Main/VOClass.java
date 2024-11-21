package Main;

public class VOClass{

	private String name;
	private int Wscore;
	private int Lscore;
	
	public VOClass() {}
	
	public VOClass(String name, int Wscore, int Lscore) { 
		super();
		this.name=name;
		this.Wscore=Wscore;
		this.Lscore=Lscore;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getWscore() {
		return Wscore;
	}

	public void setWscore(int Wscore) {
		this.Wscore = Wscore;
	}
	public int getLscore() {
		return Lscore;
	}

	public void setLscore(int Lscore) {
		this.Lscore = Lscore;
	}


}
