import java.util.ArrayList;

public class WrapperClassTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			ArrayList<Integer> list = new ArrayList<Integer>();
			
			list.add(null);
			list.add(100);
			list.add(200);
			list.add(400);
			list.add(800);
			list.add(1600);
			
			printAll(list);
			
	}

	static <E> void printAll(ArrayList<E> list)
	{
		for(E obj : list)
		{
			System.out.println(obj);
		}
	}
}
