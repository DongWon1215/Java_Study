
public class Student {
	private String name;
	private int koreanScore;
	private int englishScore;
	private int mathScore;
	
	public Student()
	{
		
	}
	
	public Student(String name, int koreaScore, int englishScore, int mathScore)
	{
		this.name = name;
		this.koreanScore = koreaScore;
		this.englishScore = englishScore;
		this.mathScore = mathScore;
	}
	//=========================================
	
	public String getName() {
		return name;
	}
	public int getKoreanScore() {
		return koreanScore;
	}
	public int getEnglishScore() {
		return englishScore;
	}
	public int getMathScore() {
		return mathScore;
	}
	
	//=========================================
	
	public void setName(String name) {
		this.name = name;
	}
	public void setKoreanScore(int koreanScore) {
		this.koreanScore = koreanScore;
	}
	public void setEnglishScore(int englishScore) {
		this.englishScore = englishScore;
	}
	public void setMathScore(int mathScore) {
		this.mathScore = mathScore;
	}
	
	public int totalScore()
	{
		return koreanScore + englishScore + mathScore;	
	}
	
	public float Average()
	{
		return (float)koreanScore + englishScore + mathScore / 3.f;	
	}
	
	@Override
	public String toString()
	{
		return this.name + "\t" + this.koreanScore + "\t" + this.englishScore + "\t" + this.mathScore + "\t"
	+ (this.koreanScore + this.englishScore + this.mathScore)+ "\t" + (float)(koreanScore + englishScore + mathScore) / 3;
	}
	
}
