package shippackage;

import java.util.LinkedList;


public class Customer extends User{
	  String name;
	  String startport;
	  String endport;
	  int contnum;
	  int contwt;
	  LinkedList<String> conttypes=new LinkedList<String>();
	
	public Customer(String name, String startport, String endport, int contnum, int contwt,
			LinkedList<String> conttypes) {
		super();
		this.name = name;
		this.startport = startport;
		this.endport = endport;
		this.contnum = contnum;
		this.contwt = contwt;
		this.conttypes = conttypes;
	}
	
	public void listset(int n,String change)
	{
		conttypes.set(n, change);
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getStartport() {
		return startport;
	}
	public void setStartport(String startport) {
		this.startport = startport;
	}
	public String getEndport() {
		return endport;
	}
	public void setEndport(String endport) {
		this.endport = endport;
	}
	public LinkedList<String> getConttypes() {
		return conttypes;
	}
	public void setConttypes(LinkedList<String> conttypes) {
		this.conttypes = conttypes;
	}
	public int getContnum() {
		return contnum;
	}
	public void setContnum(int contnum) {
		this.contnum = contnum;
	}
	public int getContwt() {
		return contwt;
	}
	public void setContwt(int contwt) {
		this.contwt = contwt;
	}
	  
	  
	  
	  
	  
	  
	  
	
}
