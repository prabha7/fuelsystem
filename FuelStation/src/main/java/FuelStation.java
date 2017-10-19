import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;


public class FuelStation {
    static String fuelcal="";
    static int ans=0;
    static String fuelname="";
    static String fueltotal="";
        static List<String> fuellist = new ArrayList<String>();
    static Scanner input = new Scanner( System.in );
    public static  void add()
    {
System.out.println("Add A Fuel  Item name and total liter......");
        
        fuelname=input.next().toString();
        fueltotal=input.next().toString();
        fuellist.add(fuelname);
        fuellist.add(fueltotal);
       
     
    }
    public static void show()
    {
        for(int i=0;i<fuellist.size();i++) {
         
        	fuelname=fuellist.get(0);
        	fueltotal=fuellist.get(1);
               
                   
        }
        System.out.println("Name=   "+fuelname+"   Total liter = "+fueltotal+" liter");
        
    }
    public static void sell()
    {
    	 System.out.println("\n How many liter ????");
        for(int i=0;i<fuellist.size();i++) {
             
        	fuelname=fuellist.get(0);
               fueltotal=fuellist.get(1);
               
           
        }
        fuellist.remove(fuelname);
        fuellist.remove(fueltotal);
    
        
        fuelcal=input.next().toString();
        ans=Integer.parseInt(fueltotal)-Integer.parseInt(fuelcal);
        fueltotal=Integer.toString(ans);
        
        fuellist.add(fuelname);
        fuellist.add(fueltotal);
        
    }
    public static void buy()
    {
    	  System.out.println("\n How many liter ????");
        for(int i=0;i<fuellist.size();i++) {
             
        	fuelname=fuellist.get(0);
               fueltotal=fuellist.get(1);
               
           
        }
        fuellist.remove(fuelname);
        fuellist.remove(fueltotal);
    
        
        fuelcal=input.next().toString();
        ans=Integer.parseInt(fueltotal)+Integer.parseInt(fuelcal);
        fueltotal=Integer.toString(ans);
        
        fuellist.add(fuelname);
        fuellist.add(fueltotal);
        
    }
    
    public static void main(String[] args) {
        
        System.out.println("Fuel Station System");
        System.out.println("----------------\n");
            
        char selection;
           Scanner input = new Scanner( System.in );
           do
               {
                   //display menu
                   System.out.println("\n--------------");
                   System.out.println("Main Menu\n");
                   System.out.println("1. Add Item ");
                   System.out.println("2. Show Stock");
                   System.out.println("3. incressing stock ");
                   System.out.println("4. sell(sell fuel to people)");

                   //selection results
                   selection = input.next().charAt(0);

                   switch(selection){
                   case '1':
                   add();
                       break;
                   case '2':
                       show();
                       break;
                   case '3':
                       buy();
                       break;
                   case '4':
                      sell();
                      break;
                   default:
                       System.out.println(" !!!!!!!!!!!!  Invalid input   !!!!!!!!!!!!!!!!!!!!!");
               }//end Switch   

        }while( selection != 4);//end do

        }//end main


        
        
    
       

}