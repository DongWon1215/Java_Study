package exam;

import java.time.LocalDate;

public class LifeTimeCalculator {
		int Calculate(String birthDay)
		{
			int year = Integer.parseInt(birthDay.split(".")[0]);
			int month = Integer.parseInt(birthDay.split(".")[1]);
			int day = Integer.parseInt(birthDay.split(".")[2]);
			
			LocalDate lifetime = LocalDate.now();
			LocalDate birthtime = LocalDate.of(year,month,day);
			
			year = lifetime.getYear() - birthtime.getYear();
			day = lifetime.getDayOfYear() - birthtime.getDayOfYear();
			
			return year * 365 + day;
		}
}
