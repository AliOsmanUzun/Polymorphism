
public class MainClass {
	public static void main(String[] args) {
		
		// Polymorphism çok biçimlilik ilkesidir. 
		//Bir üst sınıfın referansının kendinden türetilen alt (sub) classların nesnelerini tutabilmesidir.
		// Kısaca sub classlardan türetilen nesneleri , miras aldıkları sınıf tipli değişkenlerin tutması.
		
		Animals myDog = new Dog("Karabaş","Köpek" ,4,"Beyaz ve Siyah","Evcil", "Sibirya Kurdu");
		// Dog sınıfımın miras aldığı Animals sınıfını alt classımdan türettiğim nesneyi
		// myDog referans değişkeni ismi ile tutmasını sağladım . Biz buna çok biçimlilik diyoruz.
		
		// Aynı işlemi Cat sınıfı içinde yapabiliriz çünkü Animals sınıfını miras alıyor.
		
		Animals myCat = new Cat("Tarçın","Kedi" , 3, "Turuncu","Evcil Değil","Sarman");
		
		System.out.println("*************KÖPEK BİLGİLERİ*************\n");
		hayvanBilgileriniGoster(myDog);
		myDog.hayvanSes();
		System.out.println("\n");
		System.out.println("******************KEDİ BİLGİLERİ******************\n");
		hayvanBilgileriniGoster(myCat);
		myCat.hayvanSes();
	
	// myDog.getX(); Üst sınıf tipli referans değişkenim ile Dog sınıfındaki metoda erişemiyor.
	// Çünlü önemli bir detay var polymorphism uyguladığım nesneme 
	// Yani referans değişkeninin tipi super classı olduğunda 
	// Alt class'dan türetttiğim nesnemin private değişkenlerinin getter ve setter metotlarına ulaşamıyorum.
	// Polymorphism burada sadece üst sınıf referansı ile alt sınıf nesneleri üzerinde çalışmanı sağlar,
	// ama üst sınıfta olmayan (veya alt sınıfa özgü olan) şeylere erişimini kısıtlar.

		
	
	// Metot overloading yaptığım metodlarımı kullanıyorum.
	toplama(24,10);
	toplama(23, 15, 20);
		
		
	}
	
	// Polymorphism özelliğini metotlara parametre alırken de kullanabilirim
	// Bu bana her nesne için tekrar tekrar kod yazmamamı sağlar.
	
	// Nedeni ise super class tipli bir parametre tanımladığım zaman 
	// Alt class'ların hangisinden bir nesne girilirse girilsin o nesnenin sınıfı tipiyle davranır.
	// Bu işlemi Interface yapılarında ve Abstract sınıflardada yapabilirim kalıtım olduğu için.
	
	public static void hayvanBilgileriniGoster(Animals animal) {
		System.out.println("Hayvanın İsmi : " + animal.getIsim());
		System.out.println("Hayvanın Cinsi : " + animal.getCins());
		System.out.println("Hayvanın Yaşı : " + animal.getYas());
		System.out.println("Hayvanın Rengi" + animal.getRenk());
		System.out.println("Hayvan Evcil Mi : " + animal.isEvcilMi());
		System.out.println("Hayvanın Irkı : " + animal.getHayvanIrk());
	}
	
	// Metot overloading 
	// Aynı isme sahip 2 farklı işlevi yerine getiren metotlar
	// Parametre sayıları veya parametre tipleri farklı olmak zorunda.
	public static void toplama(int x , int y, int z) {
		System.out.println("Toplam : " + (x+y+z));
	}
	
	public static void toplama (int x ,int y) {
		System.out.println("Toplam : " + (x+y));
	}
	}
	
	

