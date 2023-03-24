import java.util.ArrayList;
import java.util.Scanner;

public class Home {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
	ArrayList s=new ArrayList();
		
		String licNum = null;
		int car=0,slot=0,level=1,slot1=3,level1=2;
		Cars par= new Cars(licNum);
		while(true)
		{
		System.out.println("1.enter vehicle");
		System.out.println("2.display entered vehicle details");
		System.out.println("3.delete all records");
		System.out.println("4.exit");
		System.out.println("5.find positon of model");
		int choice=sc.nextInt();
		switch(choice)
		{
		case 1:
			
		System.out.println("enter car licNum");
		licNum=sc.next();
		System.out.println("enter car model");
		String model = sc.next();
		System.out.println("enter driver name");
		 String dname=sc.next();
		par.setModel(model);
		par.setLicNum(licNum);
		s.add("lic number:"+licNum+"- model:"+model+" -driver name:"+dname);
		car++;
		 if(car<=3 )
		 {
			 slot++;
			 System.out.println("car parked  in slot "+ slot+" and level "+level );
		 }
		 else if(car>3 &&car<=6)
		{
		
			slot1++;
			System.out.println("car parked  in slot "+ slot1+" and level "+level1);
		}
		 else
		 {
			 System.out.println("parking space not available");
		 }
		 
		break;
		
		case 2:
			par.display(s);
			break;
		case 3:
			par.delete(s);
			System.out.println("system clear");
			break;
		case 4:
			System.out.println("exited");
			System.exit(choice);
		case 5:
			System.out.println("enter care licnum");
			String lic=sc.next();
			if(lic==licNum)
			{
				System.out.println(s.indexOf(licNum));
			}
			else
			{
				System.out.println("car dosent exist");
			}
			}
		
		}
	}
}

	

	