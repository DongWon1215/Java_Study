
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
		System.out.println("���� ������ ��ǰ�� " + product.product + " �Դϴ�");
	}
	
	
}
