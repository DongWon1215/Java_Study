import java.util.ArrayList;

public class ArrayListTect 
{
	
	//String Ÿ���� ��ü������ ���� ArrayList ��ü ����
	
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		
		list.add("null");
		list.add(new String(""));
		
		//�ϰ� ����
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
