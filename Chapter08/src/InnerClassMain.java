
public class InnerClassMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OuterClass outer = new OuterClass("knull");
		
		OuterClass.InnerClass inner = outer.new InnerClass();
		
	}

}
