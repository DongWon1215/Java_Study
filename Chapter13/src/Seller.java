
public class Seller extends Thread
{
	Product product;

	public Seller(Product product) {
		super();
		this.product = product;
	}

	@Override
	public void run() {
		super.run();
		product.setProduct("");
	}
	
	
}
