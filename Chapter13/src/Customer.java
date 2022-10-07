
public class Customer extends Thread {
	Product product;

	public Customer(Product product)
	{
		this.product = product;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		System.out.println("오늘 구매한 상품은 " + product.product + " 입니다");
	}
	
	
}
