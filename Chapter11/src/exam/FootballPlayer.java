package exam;

public class FootballPlayer 
{

	private int number;
	private int age;
	private String name; 
	private String team;
	
	public FootballPlayer (int number, int age, String name, String team)
	{
		this.number = number;
		this.age = age;
		this.name = name;
		this.team =team;
	}

	public int getNumber() {
		return number;
	}

	public int getAge() {
		return age;
	}

	public String getName() {
		return name;
	}

	public String getTeam() {
		return team;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "이름 : " + name + " 나이 : " + age +" 팀명 : " + team + " 등번호 : " + number;
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return (this.age + this.number) % 10;
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		
		if(obj == null || !(obj instanceof FootballPlayer))
			return false;
		
		FootballPlayer temp = (FootballPlayer)obj;
		
		if(this.number != temp.getNumber() ||
				this.age != temp.getAge() ||
				!this.name.equals(temp.getName()))
			return false;
		
		return true;
	}
	
	
}
