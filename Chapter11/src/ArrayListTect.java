import java.util.ArrayList;

public class ArrayListTect 
{
	
	//String 타입의 객체저장을 위한 ArrayList 객체 생성
	
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		
		list.add("null");
		list.add(new String(""));
		
		//일괄 참조
//		for (int i = 0; i < list.size(); i++) 
		{
			for (int i = 0; i < list.size(); i++) 
			{
			}
			
			for(String name : list)
			{
				System.out.println(name);;
			}
		}
	}
}
