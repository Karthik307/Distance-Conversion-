/*This is a java program for distance conversion  from one unit to another unit using switch case */
import java.lang.*;
import java.util.*;
class Conv{
public static void main(String arg[]){
System.out.println("\t ==========================================");
System.out.println("\t \t Conversion of Distance ");
System.out.println("\t ==========================================");
System.out.println("Select a option:");
System.out.println("------------------------");
System.out.println("1.miles to km \n2.km to miles \n3.km to meters \n4.meters to km \n5.miles to meters \n6.meters to miles \n7.exit");
System.out.println("------------------------");
System.out.print("Enter your Option:");
Scanner a1=new Scanner(System.in);
int op=a1.nextInt();                                    //op is for options selection
switch(op) {
case 1:System.out.println("Enter number of mile:");
       Scanner a2=new Scanner(System.in);
       double m1=a2.nextDouble();                       //m1=miles and km=kilometers
       double km=m1*1.60934;
       System.out.println(m1 +" mile to kilometer is "+km +" KM");
       break;
case 2:System.out.println("Enter number of kilometer:");
       Scanner a3=new Scanner(System.in);
       double m2=a3.nextDouble();
       double mi=m2*0.621371;                          //m2=km and mi=miles
       System.out.println(m2 +" km to mile is "+mi +" mile");
       break;
case 3: System.out.println("Enter number of Kilometer:");
       Scanner a4=new Scanner(System.in);
       double m3=a4.nextDouble();                    //m3=km and me=meters
       double me=m3*1000;
       System.out.println(m3 +" kilometer to meter is "+me +" meter");
       break;
case 4: System.out.println("Enter number of Meter:");
       Scanner a5=new Scanner(System.in);
       double m4=a5.nextDouble();
       double km1=m4/1000;                           //m4=meters and km1=km
       System.out.println(m4 +" meter to kilometer is "+km1 +" Km");
       break;
case 5: System.out.println("Enter number of Mile:");
       Scanner a6=new Scanner(System.in);
       double mi1=a6.nextDouble();
       double m5=mi1*1609.34;                      //m5=meters and mi1=miles
       System.out.println(mi1 +" mile to meter is "+m5 +" meter");
       break;
case 6: System.out.println("Enter number of meter:");
       Scanner a7=new Scanner(System.in);
       double m6=a7.nextDouble();
       double me1=m6/1609.34;             //me1=miles and m6=meter
       System.out.println(m6 +" meter to mile is "+me1 +" mile");
       break;
case 7:System.exit(0);

default:System.out.println("\n !!!!Enter a valid option!!!!");
break;
}
}
}

