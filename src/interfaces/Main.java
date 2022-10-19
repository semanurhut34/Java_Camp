package interfaces;

public class Main {

	public static void main(String[] args) {
		//interfacesler, tamamlanmamış operasyonlar içerir.
		//interfacesler newlenmez ve imza taşırlar.
		//Bir class birden fazla interface'i implement edebilir.
		//İnterfacesler referans tutucu.
		//ICustomerDal customerDal=new OracleCustomerDal();
		
		CustomerManager customerManager=new CustomerManager(new OracleCustomerDal());
		
		customerManager.add();

	}

}
