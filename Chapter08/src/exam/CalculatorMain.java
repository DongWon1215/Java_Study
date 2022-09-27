package exam;

public class CalculatorMain {
	
	public static void main(String[] args) {
		
	CalculatorImplement calImp = new CalculatorImplement();
	Calculator cal = new Calculator() {
		
		@Override
		public long substract(long n1, long n2) {
			// TODO Auto-generated method stub
			return n1 + n2;
		}
		
		@Override
		public long multiply(long n1, long n2) {
			// TODO Auto-generated method stub
			return n1 - n2;
		}
		
		@Override
		public double divide(double n1, double n2) {
			// TODO Auto-generated method stub
			return n1 * n2;
		}
		
		@Override
		public long add(long n1, long n2) {
			// TODO Auto-generated method stub
			return n1 / n2;
		}
	};
	
	}
	
}
