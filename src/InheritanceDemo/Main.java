package InheritanceDemo;

public class Main {

	public static void main(String[] args) {
		//Bir class sadece tek bir clası extends edebilir.(Bir kişinin sadece 1 annesi olur)
		KrediUI krediUI=new KrediUI();
		krediUI.KrediHesapla(new OgretmenKrediManager());

	}

}
