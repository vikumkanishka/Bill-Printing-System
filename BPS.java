import java.util.Scanner;
class BPS{
	public static void main(String args[]){
		System.out.println("********************************************************************************");
		System.out.println("");
		System.out.println("__          __  _                           _          _ __  __            _");
		System.out.println("\\ \\        / / | |                         | |        (_)  \\/  |          | |");
		System.out.println(" \\ \\  /\\  / /__| | ___ ___  _ __ ___  ___  | |_ ___    _| \\  / | __ _ _ __| |_");
		System.out.println("  \\ \\/  \\/ / _ \\ |/ __/ _ \\| '_' _  \\/ _ \\ | __/ _ \\  | | |\\/| |/ _' | '__| __|");
		System.out.println("   \\  /\\  /  __/ | (_| (_) | | | || |  __/ | || (_) | | | |  | | (_| | |  | |_");
		System.out.println("    \\/  \\/ \\___|_|\\___\\___/|_| |_||_|\\___|  \\__\\___/  |_|_|  |_|\\__,_|_|   \\__|");
		System.out.println("");
		System.out.println("================================================================================");
		System.out.println("");

		Scanner input=new Scanner(System.in);
		System.out.print("Enter Your Phone Number:");
		int ph=input.nextInt();
		System.out.println("");

		System.out.print("Enter Your Name:");
		String name=input.next();
		System.out.println("");

		System.out.println("");
		System.out.println("**********************************************************************************");
		System.out.println("");		

		System.out.print("Basmathi Qty(kg) - ");
		int bas=input.nextInt();
		System.out.println("");

		System.out.print("Dhal(Kg) - ");
		int dh=input.nextInt();
		System.out.println("");

		System.out.print("Suger Qty(Kg) - ");
		int sug=input.nextInt();
		System.out.println("");

		System.out.print("higland Qty - ");
		int hig=input.nextInt();
		System.out.println("");

		System.out.print("Yougurt Qty - ");
		int youg=input.nextInt();
		System.out.println("");

		System.out.print("Flour Qty - ");
		int flr=input.nextInt();
		System.out.println("");

		System.out.print("Soap Qty - ");
		int sop=input.nextInt();
		System.out.println("");

		int a,b,c,d,e,f,g;
		double tot,dis,pri;
		a=250*bas;
		b=180*dh;
		c=150*sug;
		d=1200*hig;
		e=50*youg;
		f=120*flr;
		g=160*sop;
		tot=a+b+c+d+e+f+g;
		dis=tot*0.1;
		pri=tot-dis;


		System.out.println("+---------------------------------------------------------------------------------------+");
		System.out.println("|		       _   __  __          _____ _______				|");
		System.out.println("|		      (_) |  \\/  |   /\\   |  __ \\__   __|				|");
		System.out.println("|		       _  | \\  / |  /  \\  | |__) | | |					|");
		System.out.println("|		      | | | |\\/| | / /\\ \\ | _   /  | |					|");
		System.out.println("|		      | | | |  | |/ ____ \\| | \\ \\  | |					|");
		System.out.println("|		      |_| |_|  |_/_/    \\_\\_|  \\_\\ |_|					|");
		System.out.println("|		            225,Galle Road,Panadura.					|");
		System.out.println("|											|");
		System.out.println("+---------------------------------------------------------------------------------------+");
		System.out.println("|		        	#Tel  :	"+ph+"						|");
		System.out.println("|			        #Name : "+name+"						|");
		System.out.println("+---------------+---------------+-------------------------+-----------------------------+");
		System.out.println("|		|      Qty	|        Unit price  	  |            price		|");
		System.out.println("+---------------+---------------+-------------------------+-----------------------------+");
		System.out.println("|#basmathi	|   	"+bas+    "	|    "+"	  250.0"+"           |            "+bas*250+"		|");
		System.out.println("|		|		|		  	  |	            		|");
		System.out.println("|#dhal		|	"+dh+     "	|    "+"	  180.0"+"           |	       "+            dh*180+"		|");
		System.out.println("|		|		|		  	  |	            		|");
		System.out.println("|#suger		|  	"+sug+    "	|    "+"	  150.0"+"           |	       "+           sug*150+"		|");
		System.out.println("|		|		|		  	  |	            		|");
		System.out.println("|#highland	|  	"+hig+    "	|    "+"	  1200.0"+"       	  |	       "+           hig*1200+"		|");
		System.out.println("|		|		|		  	  |	            		|");
		System.out.println("|#yoghurt	|  	"+youg+"	|    "+"	  50.0"+"            |	       "+youg*50+          "		|");
		System.out.println("|		|		|		  	  |	            		|");
		System.out.println("|#Flour		|  	"+flr+    "	|    "+"	  120.0"+"           |	       "+flr*120+           "		|");
		System.out.println("|		|		|		  	  |	            		|");
		System.out.println("|#Soap		|  	"+sop+    "	|    "+"	  160.0"+"           |	       "+sop*160+           "		|");
		System.out.println("|		|		|		  	  |	            		|");
		System.out.println("+---------------+---------------+-------------------------+-----------------------------+");
		System.out.println("|                               |   Total                 | 	      "+   tot   +"            |");
		System.out.println("|                               +-------------------------+-----------------------------+");
		System.out.println("|                               |   Discount(10%)         |           "+   dis  +"             |");
		System.out.println("|                               +-------------------------+-----------------------------+");
		System.out.println("|                               |   Price                 |           "+  pri   +"            |");
		System.out.println("+---------------+---------------+-------------------------+-----------------------------+");

		System.out.println("");
		System.out.print("Enter Customer given Amount : ");
		int money=input.nextInt();
		System.out.println("");

		int balance=money-(int)pri;

		System.out.println("+-------------------------+-----------------------------+");
		System.out.println("|   Net Amount            |           "+  pri  +"            |");
		System.out.println("+-------------------------+-----------------------------+");
		System.out.println("|   cash	          |           "+   money  +"		|");
		System.out.println("+-------------------------+-----------------------------+");
		System.out.println("|   Change                |           "+  balance   +"		|");
		System.out.println("+-------------------------+-----------------------------+");
		System.out.println("");

		int ft=balance/5000;
		int re=balance%5000;

		int tt=re/2000;
		re=re%2000;

		int t=re/1000;
		re=re%1000;

		int fh=re/500;
		re=re%500;

		int hun=re/100;
		re=re%100;

		int fif=re/50;
		re=re%50;

		int twe=re/20;
		re=re%20;

		int ten=re/10;
		re=re%10;

		int fiv=re/5;
		re=re%5;

		int two=re/2;
		re=re%2;		

		System.out.println("+---------------------------------------+");
		System.out.println("|        value        |        No       |");
		System.out.println("+---------------------------------------+");
		System.out.println("+---------------------------------------+");
		System.out.println("|        Rs5000       |       "+  ft  +"       	|");
		System.out.println("+---------------------------------------+");
		System.out.println("+---------------------------------------+");
		System.out.println("|        Rs2000       |       "+  tt  +"       	|");
		System.out.println("+---------------------------------------+");
		System.out.println("+---------------------------------------+");
		System.out.println("|        Rs1000       |       "+  t  +"       	|");
		System.out.println("+---------------------------------------+");
		System.out.println("+---------------------------------------+");
		System.out.println("|        Rs500        |       "+  fh  +"       	|");
		System.out.println("+---------------------------------------+");
		System.out.println("+---------------------------------------+");
		System.out.println("|        Rs100        |       "+  hun  +"     	|");
		System.out.println("+---------------------------------------+");
		System.out.println("+---------------------------------------+");
		System.out.println("|        Rs50         |       "+  fif  +"       	|");
		System.out.println("+---------------------------------------+");
		System.out.println("+---------------------------------------+");
		System.out.println("|        Rs20         |       "+  twe  +"     	|");
		System.out.println("+---------------------------------------+");
		System.out.println("+---------------------------------------+");
		System.out.println("|        Rs10         |       "+  ten  +"     	|");
		System.out.println("+---------------------------------------+");
		System.out.println("+---------------------------------------+");
		System.out.println("|        Rs5          |       "+  fiv  +"     	|");
		System.out.println("+---------------------------------------+");
		System.out.println("+---------------------------------------+");
		System.out.println("|        Rs2          |       "+  two  +"     	|");
		System.out.println("+---------------------------------------+");
		System.out.println("+---------------------------------------+");
		System.out.println("|        Rs1          |       "+  re  +"      	|");
		System.out.println("+---------------------------------------+");

		System.out.println("=========================================");
		System.out.println("      THANK YOU FOR SHOPPING WITH US          ");
		System.out.println("=========================================");
	}
}
