
public class InnerClassMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OuterClass outer = new OuterClass("knull");
		
		//���� Ŭ���� ��ü ���� ���
		OuterClass.InnerClass inner = outer.new InnerClass();
		
	}

}
