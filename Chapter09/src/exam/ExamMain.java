package exam;
import java.util.Scanner;
public class ExamMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		LifeTimeCalculator lifeTime = new LifeTimeCalculator();
		Person person = new Person("","");
		
		
		
		
		System.out.println("��������� XXXX.XX.XX �������� �Է��ϼ���");
		System.out.println(lifeTime.Calculate(sc.nextLine()));
		
		
	}

}
