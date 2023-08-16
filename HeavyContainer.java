package shippackage;

import java.util.Scanner;

public class HeavyContainer extends Container {
	protected int contwt;

	public HeavyContainer(int contwt) {
		super();
		this.contwt = contwt;
		int charge=600;
		totalcharge+=charge;
	}
	public int getTotalCharge()
	{
		return totalcharge;
	}
	
}
