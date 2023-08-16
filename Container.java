package shippackage;

public abstract class Container {
	int max_weight;
	int max_cont;
	int totalcharge;
	
	public void display()
	{
		System.out.println(totalcharge);
	}

	public int getTotalcharge() {
		return totalcharge;
	}

	public void setTotalcharge(int totalcharge) {
		this.totalcharge = totalcharge;
	}
	
	
	
}



