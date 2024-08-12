
public class Cat extends Animals{

public Cat() {
}


public Cat(String isim, String cins, int yas, String renk, String evcilMi,String hayvanIrk) {
	super(isim , cins, yas, renk, evcilMi,hayvanIrk);
}




//Hayvan Ses metodunu override ettik
@Override
public void hayvanSes() {
	System.out.println("Kedi Sesi : "+"MİYAV MİYAV MİYAV!!!!");
}



}
