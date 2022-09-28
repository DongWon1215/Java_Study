package exam;
import java.util.Scanner;
public class ExamMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		LifeTimeCalculator lifeTime = new LifeTimeCalculator();
		Person person = new Person("","");
		
		
		
		
		System.out.println("생년월일을 XXXX.XX.XX 형식으로 입력하세요");
		System.out.println(lifeTime.Calculate(sc.nextLine()));
		
		
	}

}
