package PolymorphismDemo;

public class Main {

	public static void main(String[] args) {
		//Poliforminizm-> Çok biçimlilik. 
		//Methotların baş harfi küçüktür.
		BaseLogger[] loggers=new BaseLogger[]{ new DatabaseLogger(), new FileLogger(),new EmailLogger() };
		for(BaseLogger logger:loggers) {
			logger.log("Log mesajı");
		}
		
		CustomerManager customerManager=new CustomerManager(new FileLogger());
		customerManager.add();
		

	}

}
