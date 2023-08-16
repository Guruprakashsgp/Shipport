package shippackage;

public class RefridgeratedContainer  extends Container{
	protected int contwt;

	public RefridgeratedContainer(int contwt) {
		super();
		this.contwt = contwt;
		
		int charge=1200;
		totalcharge+=charge;
	}
	public int getTotalCharge()
	{
		return totalcharge;
	}
	
}
