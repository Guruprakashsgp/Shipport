package shippackage;
import java.security.AlgorithmConstraints;
import java.util.*;
import java.util.zip.ZipEntry;

import javax.print.attribute.standard.Destination;

public class Main 
{

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("------------------------------------------------------'Welcome'--------------------------------------------------------------------");
		System.out.println("Want to enter as??\n1) Customer\n2) Admin\n3) End");
		System.out.println();
		String userchoiceString=sc.next();
		System.out.println();
		LinkedList<String> contlist=new LinkedList<String>();
		LinkedList<Integer> contweights=new LinkedList<Integer>();
		ArrayList<String> adminal=new ArrayList<String>();
		int contwt=0;
		String conttype="";
		String name="";
		String startport="";
		String endport="";
		int contnum=0;
		int totalweight=0;
		String admintype=""; 
		String aname="";
		String adminadd;
		String adminnew;
		int adid=0;
		boolean quit = false;
		boolean check = true;
		while(!quit)
		{
			switch (userchoiceString){
			case "Customer":
			{
				
				System.out.println("-----------------------Enter your unique name------------------------------------------------------------------------------------------");
				name=sc.next();
				System.out.println();
				System.out.println("-----------------------Choose the starting port name from the given ports-------------------------------------------------------");
				System.out.println();
				System.out.println("1) Chennai\n2) Kochi\n3) Mumbai\n4) Dubai");
				startport=sc.next();
				System.out.println();
				System.out.println("-----------------------Choose the destination port name from the given ports----------------------------------------------------");
				System.out.println();
				System.out.println("1) Chennai\n2) Kochi\n3) Mumbai\n4) Dubai");
				endport=sc.next();
				System.out.println();
				System.out.println("-----------------------Enter Y or y if you want to load (or) Enter N or n to not load--------------------------------------------");
				String loading=sc.next();
				System.out.println();
				if(loading.charAt(0) =='Y' || loading.charAt(0)=='y')
				{
					System.out.println("-------------------Enter number of containers to load-----------------------------------------------------------------------");
					contnum=sc.nextInt();
					System.out.println();
					
					for(int i=1;i<=contnum;i++)
					{
					System.out.println("-------------------Choose and Enter the container "+ i +" type from belo mentioned types------------------------------------");
					System.out.println("1) Basic\n2) Heavy\n3) Refrigerated\n4) Liquid ");
					conttype=sc.next();
					contlist.add(conttype);
					System.out.println();
					System.out.println("-------------------Enter the weight of the container based on below conditions----------------------------------------------");
					System.out.println();
					System.out.println("-------------------If Basic Enter weight below 300--------------------------------------------------------------------------");
					System.out.println("-------------------If Heavy Enter weight from 300 t0 600--------------------------------------------------------------------");
					System.out.println("-------------------If Refrigerated Enter weight from 600 to 900-------------------------------------------------------------");
					System.out.println("-------------------If Basic Enter weight from 900 to 1200-------------------------------------------------------------------");
					contwt=sc.nextInt();
					contweights.add(contwt);
					System.out.println();
					}
					System.out.println();
					System.out.println();
					System.out.println("-------------------Here is your Invoice ( ^ ^ )-----------------------------------------------------------------------");
					System.out.println();
					Customer customer=new Customer(name,startport,endport,contnum,contwt,contlist);
					System.out.println("Name:                       "+customer.getName());
					System.out.println("Starting Port:              "+customer.getStartport());
					System.out.println("Ending Port:                "+customer.getEndport());
					System.out.println("Number of Containers:       "+customer.getContnum());
					System.out.println("Container Weight:           "+contweights);
					System.out.println("Type of Containers selected:"+customer.getConttypes());
					for(int i=0;i<contlist.size();i++)
					{	switch (contlist.get(i)) 
						{
						case "Basic": {
							BasicContainer bContainer=new BasicContainer(contweights.get(i));
							bContainer.getTotalCharge();
							break;
						}
						case "Heavy":
						{
							HeavyContainer hContainer=new HeavyContainer(contweights.get(i));
							hContainer.getTotalCharge();
							break;
						}
						case "Refrigerated":
						{
							RefridgeratedContainer rContainer=new RefridgeratedContainer(contweights.get(i));
							rContainer.getTotalCharge();
							break;
						}
						case "Liquid":
						{
							LiquidContainer lContainer=new LiquidContainer(contweights.get(i));
							lContainer.getTotalCharge();
							break;
						}
						
						default:
							throw new IllegalArgumentException("Unexpected value: " + contwt);
						}
				    }
					for(int i=0;i<contweights.size();i++)
					{
						totalweight=totalweight+contweights.get(i);
					}
					System.out.println("Total weight of containers: "+totalweight);
					System.out.println();
					System.out.println();
					System.out.println("---------------------Thank you visit again---------------------------------------------------------------------------------------");
					System.out.println();
					System.out.println();
				}
				else {
					System.out.println("---------------------Thanks for choosing N---------------------------------------------------------------------------------------");
					System.out.println();
					System.out.println("---------------------Since there is no loading and unloading there is no charges ( ^ ^ )-----------------------------------------");
				}
//					System.out.println("---------------------Thank you visit again---------------------------------------------------------------------------------------");
					System.out.println("///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////");
					System.out.println();
					System.out.println("Press 1 to return to main menu");
					int counter = sc.nextInt();
					if(counter==1) {
						System.out.println("Want to enter as??\n1) Customer\n2) Admin\n3) End");
						userchoiceString = sc.next();
					}
					System.out.println();
					System.out.println();
					
			}
			case "Admin":
			{
				while(check)
				{	
					System.out.println("Does a Admin already Exist?[y/n]");
					admintype=sc.next();
					if(admintype.charAt(0)=='y') {
						System.out.println("Enter the admin Name: ");
						aname= sc.next();
						adminal.add("Guru");
						adminal.add("Prakash");
						System.out.println();
						boolean al=true;
						while(al==true)
						{
							if(adminal.contains(aname))
							{
								System.out.println("--------------------------------------Welcome "+aname+"----------------------------------------------------------------");
								System.out.println("---------------------------Here is the log of available imports and exports-----------------------------------");
								System.out.println();
								System.out.println("Number 1");
					////////////////////////////////////////////////////////////////////////////////////////////////////////////			
								Customer customer=new Customer(name, startport, endport, contnum, contwt, contlist);
								System.out.println("Name:                       "+customer.getName());
								System.out.println("Starting Port:              "+customer.getStartport());
								System.out.println("Ending Port:                "+customer.getEndport());
								System.out.println("Number of Containers:       "+customer.getContnum());
								System.out.println("Container Weight:           "+contweights);
								System.out.println("Type of Containers selected:"+customer.getConttypes());
								System.out.println("///////////////////////////////////////////////////////////////////////////////");
					////////////////////////////////////////////////////////////////////////////////////////////////////////////
								System.out.println("Number 2");
								System.out.println("Name:                        Prakash");
								System.out.println("Starting Port:               Mumbai");
								System.out.println("Ending Port:                 Dubai");
								System.out.println("Number of Containers:        3");
								System.out.println("Container Weight:            [250, 450, 750]");
								System.out.println("Type of Containers selected: [Basic, Heavy, Refrigerated]");
								System.out.println("///////////////////////////////////////////////////////////////////////////////");
								System.out.println();
								LinkedList<String> ship=new LinkedList<String>();
								LinkedList<Integer> vacency=new LinkedList<Integer>(); 
								ship.add("Ship1"); vacency.add(2000);
								ship.add("Ship2");vacency.add(1000);
								ship.add("Ship3");vacency.add(3000);
								ship.add("Ship4"); vacency.add(1500);
								ship.add("Ship5"); vacency.add(2500);
								
								LinkedList<shipandport> shipvacency=new LinkedList<shipandport>();
								for(int i=0;i<ship.size();i++)
								{
									shipandport sandy=new shipandport(ship.get(i), vacency.get(i));
									shipvacency.add(sandy);
								}
								
								Admin spAdmin=new Admin(shipvacency, totalweight);
								spAdmin.display();
								
								LinkedList<String> port=new LinkedList<String>();
								LinkedList<Integer> portvacency=new LinkedList<Integer>();
								port.add("Chennai"); portvacency.add(2500);
								port.add("Kochi"); portvacency.add(3000);
								port.add("Mumbai"); portvacency.add(3500);
								port.add("Dubai"); portvacency.add(4000);
								LinkedList<shipandport> vacavail=new LinkedList<shipandport>();
								for(int i=0;i<port.size();i++)
								{
									shipandport vacainport=new shipandport(port.get(i), portvacency.get(i));
									vacavail.add(vacainport);
								}
								
								Admin psAdmin=new Admin(endport, vacavail);
								psAdmin.displayport(totalweight);
								
								Admin loadedship=new Admin();
								shipandport s111=new shipandport();
							
								System.out.println();
								System.out.println("-----------------------------The load is succesfully loaded and unloaded in the correct destination----------------------");
								System.out.println();
								System.out.println("-----------------------------------------Well Done "+aname+"-------------------------------------------------------------");
								System.out.println();
								System.out.println("---------------------------------------------Export log------------------------------------------------------------------");
								System.out.println("Name of the Customer :                 "+ name);
								System.out.println("Starting port        :                 "+startport);
								System.out.println("Destination          :                 "+endport);
								System.out.println("Ship loaded          :                 "+(loadedship.getShip()));
								System.out.println("Initial Capacity     :                 "+loadedship.getShipInitialCapacity());
								System.out.println("Capacity after loaded:                "+loadedship.loadedshipcapa());
								System.out.println("Initial port capacity:                "+loadedship.initialportcapa());
								System.out.println("Remaining capacity in the port after unloading the ship: "+loadedship.remainingportcapa());
								System.out.println("///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////");
								System.out.println();
								System.out.println("Press 1 to return to main menu");
								int counter = sc.nextInt();
								if(counter==1) {
									System.out.println("Want to enter as??\n1) Customer\n2) Admin\n3) End");
									userchoiceString = sc.next();
								}
								al=false;
								check=false;
							}
							else {
								System.out.println("Invalid Admin Name");
								System.out.println("Please enter valid name");
							}
							
						}
					}
					else 
					{
						System.out.println("Want to add new admin?[y/n]");
						adminadd=sc.next();
						if(adminadd.charAt(0)=='y')
						{
							System.out.println("Enter the new admin name");
							adminnew=sc.next();
							System.out.println();
							System.out.println("Enter the admin id");
							adid=sc.nextInt();
							adminal.add(adminnew);
							System.out.println();
							System.out.println("Admin registered successfully ....( ^ ^ )....");
							System.out.println();
							System.out.println("Press 1 to return to main menu");
							int counter = sc.nextInt();
							if(counter==1) {
								System.out.println("Want to enter as??\n1) Customer\n2) Admin\n3) End");
								userchoiceString = sc.next();
							}
							System.out.println();
							
							
							
							
						}
						else {
							System.out.println("Then go away dude..");
							check=false;
							System.out.println("Press 1 to return to main menu");
							int counter = sc.nextInt();
							if(counter==1) {
								System.out.println("Want to enter as??\n1) Customer\n2) Admin\n3) End");
								userchoiceString = sc.next();
							}
								
						}
					}
				}
			}
			case "End" :
			{
				quit=false;
				break;
			}
			default:
				throw new IllegalArgumentException("Unexpected value: " + userchoiceString);
			}
		}
		
////////////////////////////////////////////////////////////////////////////////////////////////////////
		
		
			
		

	}

}
