package Overriding;

public class BaseKrediManager {
	public double hesapla(double tutar) {
		return tutar*1.18;
	}
	
//	public final double hesapla(double tutar) { //final kelimesi sayesinde override edilmiyor sadece bu şekilde kullanılır.s
//		return tutar*1.18;
//	}

}
