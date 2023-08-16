package shippackage;

import java.util.Scanner;

public class BasicContainer extends Container{
	protected int contwt;
	Scanner sc1=new Scanner(System.in);
	public BasicContainer(int contwt) {
		super();
		this.contwt = contwt;
		int charge=300;
		totalcharge+=charge;
	}
	public int getTotalCharge()
	{
		return totalcharge;
	}
	

}
