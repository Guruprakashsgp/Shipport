package shippackage;

public class LiquidContainer extends Container{
	
	protected int contwt;

	public LiquidContainer(int contwt) {
		super();
		this.contwt = contwt;
		int charge=900;
		
		totalcharge+=charge;
	}
	public int getTotalCharge()
	{
		return totalcharge;
	}

}
