import java.math.BigDecimal;


public class BigDecimalTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BigDecimal bd1 = new BigDecimal("3.5");
		BigDecimal bd2 = new BigDecimal("4.8");
		
		System.out.println(bd1.add(bd2));
		System.out.println(bd1.subtract(bd2));
		System.out.println(bd1.multiply(bd2));
		System.out.println(bd1.divide(bd2));
		System.out.println(3.5 + 4.8);
		
	}

}
