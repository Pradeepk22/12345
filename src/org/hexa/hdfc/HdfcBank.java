package org.hexa.hdfc;

import com.hexa.kotak.KotakBank;

public class HdfcBank {
private void loan() {
	
System.out.println("loan");
}
private void interest() {
	
System.out.println("Interest");
}

public static void main(String[] args) {
	HdfcBank e=new HdfcBank();
	e.interest();
	e.loan();
	IciciBank d=new IciciBank();
	d.deposits();
	d.savings();
	CityBank f=new CityBank();
	f.currentAccount();
	f.savingAccount();
	KotakBank h=new KotakBank();
	h.velacherryBranch();
	h.omrBranch();
}

}

