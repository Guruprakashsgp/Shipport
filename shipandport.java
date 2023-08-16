package shippackage;

import java.util.LinkedList;

public class shipandport {
	protected String ships;
	protected int vacency;
	public shipandport(String ships, int vacency) {
		super();
		this.ships = ships;
		this.vacency = vacency;
	}
	public shipandport() {
		
	}
	public String getShips() {
		return ships;
	}
	public void setShips(String ships) {
		this.ships = ships;
	}
	public int getVacency() {
		return vacency;
	}
	public void setVacency(int vacency) {
		this.vacency = vacency;
		
	}

}
