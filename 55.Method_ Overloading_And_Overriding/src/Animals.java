
public class Animals {

private String isim;
private String cins;
private int yas;
private String renk;
private  boolean evcilMi;
private String hayvanIrk;

public  void hayvanSes() {
	System.out.println("Hayvan hangi sesi çıkartıyorsa o sesi buraya gir");
	
}
// Constructor üzerinde method overloading yaptık
public Animals() {
}



public Animals(String isim, String cins, int yas, String renk, String evcilMi,String hayvanIrk) {
	super();
	this.isim = isim;
	this.cins = cins;
	this.yas = yas;
	this.renk = renk;
	if (evcilMi=="Evcil") {
		this.evcilMi=true;
	} else {
		this.evcilMi=false;
	}
	this.hayvanIrk=hayvanIrk;
}



public String getIsim() {
	return isim;
}

public void setIsim(String isim) {
	this.isim = isim;
}

public String getCins() {
	return cins;
}

public void setCins(String cins) {
	this.cins = cins;
}

public int getYas() {
	return yas;
}

public void setYas(int yas) {
	this.yas = yas;
}

public String getRenk() {
	return renk;
}

public void setRenk(String renk) {
	this.renk = renk;
}



public boolean isEvcilMi() {
	return evcilMi;
}



public void setEvcilMi(boolean evcilMi) {
	this.evcilMi = evcilMi;
}



public String getHayvanIrk() {
	return hayvanIrk;
}



public void setHayvanIrk(String hayvanIrk) {
	this.hayvanIrk = hayvanIrk;
}



	
}
