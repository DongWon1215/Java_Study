import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalDateTest {
	
	//jdk 1.8 : LocalDate(날짜), LocalDateTime(날짜,시간), LocalTime(시간)
	// 현재 날짜를 가져옴
	//	
	public static void main(String[] args) {
		LocalDate ld = LocalDate.now();
		System.out.println(ld);
		System.out.println(ld.getYear());
		System.out.println(ld.getMonth());
		System.out.println(ld.getMonthValue());
		System.out.println(ld.getDayOfWeek());
		System.out.println(ld.getDayOfMonth());
		System.out.println(ld.getDayOfYear());
		
		
		LocalTime now = LocalTime.now();
		System.out.println(now);
		System.out.println(now.getHour());
		System.out.println(now.getMinute());
		System.out.println(now.getSecond());
		System.out.println(now.getNano());
		
		LocalDateTime now2 = LocalDateTime.now();
		System.out.println(now2);
		System.out.println(now2.getHour());
		System.out.println(now2.getMinute());
		System.out.println(now2.getSecond());
		System.out.println(now2.getNano());
	}
	

}
