
public class Product {
	String product;
	
	if(product == null)
	{
		try {
			wait();
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	String saleProduct()
	{
		return product;
	}

	public void setProduct(String product) {
		this.product = product;
	}
}
