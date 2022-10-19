package Overriding;

public class Main {

	public static void main(String[] args) {
		
		//Overridable->Üzerine yazılabilir.
		
		BaseKrediManager[] baseKrediManager=new BaseKrediManager[] {new OgrenciKrediManager(),new OgretmenKrediManager() };
		for(BaseKrediManager krediManager:baseKrediManager) {
			System.out.println(krediManager.hesapla(10000));
		}

	}

}
