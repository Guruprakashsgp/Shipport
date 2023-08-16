package shippackage;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class Admin extends User
{
	LinkedList<shipandport>ll=new LinkedList<shipandport>();
	LinkedList<shipandport>ll2=new LinkedList<shipandport>();
	ArrayList<Integer> aList=new ArrayList<Integer>();
	protected int totalweight;
	Scanner sc1=new Scanner(System.in);
	int temp=0;
	int value;
	protected String destination;
	static String ship;
	static int shipcapainitial;
	static int loadedshipcapa;
	static int n1;
	static int remainingportcapacity;
	
	public Admin() {
		super();
	}

	public Admin(LinkedList<shipandport> ll, int totalweight)
	{
		super();
		this.ll = ll;
		this.totalweight = totalweight;
	}

	void display()
	{
		System.out.println("The available Ships are listed below");
		System.out.println();
		for(int i=0;i<ll.size();i++)
		  {
			System.out.println(ll.get(i).getShips() +" "+ ll.get(i).getVacency());
			System.out.println();
		  }
	
			System.out.println("Please enter 1 to alot ship (or) enter 0 to exit");
				 value=sc1.nextInt();
				if(value==1)
					{
						loadupload();
						System.out.println();
						System.out.println("Loaded Successfully");
						System.out.println();
					
					}
				else 
				{
					System.out.println("No ship is alloted");
					System.out.println();
					System.out.println("Please enter 1 to alot ship (or) enter 0 to exit");
					value=sc1.nextInt();
					System.out.println();
				}
			}
			

	void loadupload()
	{
		for(int i=0;i<ll.size();i++)
		{
			if(ll.get(i).getVacency()>totalweight && (ll.get(i).getVacency())-totalweight<500)
				{
				
				ship=ll.get(i).getShips();	
				//System.out.println(ship);
				shipcapainitial=ll.get(i).getVacency();
				//System.out.println(shipcapainitial);
				aList.add(shipcapainitial);
				ll.get(i).setVacency((ll.get(i).getVacency()-totalweight));
				System.out.println("The alloted ship is "+ll.get(i).getShips());
				System.out.println();
				System.out.println("The occupancy of the ship is reduced to "+ll.get(i).getVacency()+" due to loading");
				loadedshipcapa=ll.get(i).getVacency();
				aList.add(loadedshipcapa);
				System.out.println();
				}
		}
	}
	public String getShip()
	{
		//System.out.println(ship);
		return ship;
	}
	public int getShipInitialCapacity()
	{
		//System.out.println(shipcapainitial);
		return shipcapainitial;
		
	}
	public int loadedshipcapa()
	{
		//System.out.println(loadedshipcapa);
		return loadedshipcapa;
	}

	
	public Admin(String destination,LinkedList<shipandport> ll2)
	{
		this.ll2=ll2;
		this.destination=destination;
	}
	
	void portunload(int tw)
	{	this.totalweight=tw;
		for(int i=0;i<ll2.size();i++)
		{
			if(((ll2.get(i)).getShips()).equals(destination))
			{
				n1=ll2.get(i).getVacency();
				aList.add(n1);
				//System.out.println("n1:"+n1+" "+"tw: "+totalweight);
				ll2.get(i).setVacency((n1-totalweight));
				System.out.println();
				System.out.println("Unloaded Succesfully");
				System.out.println();
				System.out.println("The port capacity is reduced from "+ n1 +" to "+ ll2.get(i).getVacency() +" due to loading");
				remainingportcapacity=ll2.get(i).getVacency();	
				aList.add(remainingportcapacity);
				System.out.println();
			}
		}
	
	}
	public int initialportcapa()
	{
		//System.out.println(n1);
		return n1;
	}
	public int remainingportcapa()
	{
	//	System.out.println(remainingportcapacity);
		return remainingportcapacity;
	}
	
	void displayport(int tw)
	{
		System.out.println();
		System.out.println("The available capacity of the ports are listed below");
		for(int i=0;i<ll2.size();i++)
		{
			System.out.println(ll2.get(i).getShips() +" "+ ll2.get(i).getVacency());
			
		}
			System.out.println("Enter 1 to unload (or) 0 to not unload");
			value=sc1.nextInt();
			if(value==1)
			{
				portunload(tw);
			}
			else {
				System.out.println("No container is unloaded the ship is still loaded");
				System.out.println();
				System.out.println("Enter 1 to unload (or) 0 to not unload");
				value=sc1.nextInt();
			}
		
		
	}
	
}

			
			
			
			
			

