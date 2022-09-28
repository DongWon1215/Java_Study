import java.util.Calendar;

public class DateTest {
	public static void main(String[] args) {
		
		Calendar cal = Calendar.getInstance();
		
		System.out.println();
		
		Calendar cal2 = Calendar .getInstance();
		Calendar cal3 = Calendar .getInstance();
		
		cal2.set(2002, -7, 1, 0, 0, 1);
		cal3.set(2007, 6, 4);
		
		System.out.println(cal2.getTime());
		System.out.println(cal3.getTime());
		
		System.out.println(cal.before(cal3));
		System.out.println(cal.after(cal3));
	}
}
