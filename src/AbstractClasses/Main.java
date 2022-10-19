package AbstractClasses;

public class Main {

	public static void main(String[] args) {
		//Benim bir operasyonum var ve onun içini base de belirlemek istemiyorum ama bunu kim inheritance ediyorsa 
		//bunu kullanmak zorunda ve kendi kodunu yazmak zorunda. 
		//Abstract sınıflar newlenemez.
		WomanGameCalculator womanGameCalculator=new WomanGameCalculator();
		womanGameCalculator.hesapla();
		
		GameCalculator calculator=new WomanGameCalculator();
		calculator.gameOver();

	}

}
