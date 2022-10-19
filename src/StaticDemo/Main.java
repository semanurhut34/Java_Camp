package StaticDemo;

public class Main {

	public static void main(String[] args) {
		//inner class, gruplandırma amaçlı kullanılıyor.
		ProductManager productManager=new ProductManager();
		Product product=new Product();
		product.id=1;
		product.name="";
		product.price=10;
		productManager.add(product);
		
		//Inner class örneği
		DatabaseHelper.Connection.createConnection();

	}

}
