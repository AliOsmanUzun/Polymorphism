
public class Dog extends Animals {
	
private int x;

public int getX() {
	return x;
}



// Hayvan Ses metodunu override ettik
@Override
public void hayvanSes() {
	System.out.println("Köpek Sesi : "+"HAV HAV HAV HAV !!!!");
}




public void setX(int x) {
	this.x = x;
}




public Dog() {
}
   



public Dog(String isim, String cins, int yas, String renk, String evcilMi,String hayvanIrk) {
	setIsim(isim);
	setCins(cins);
	setYas(yas);
	setRenk(renk);
	if (evcilMi=="Evcil") {
		setEvcilMi(true);
	} else {
		setEvcilMi(false);
	}
	
	setHayvanIrk(hayvanIrk);
}







}
