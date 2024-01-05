import java .io.*;
import java.util.*;
class Test{
static public void main(String args[])
{
Scanner sc=new Scanner(System.in);
int inpVar=sc.nextInt();
System.out.println(Test.printDay(inpVar));
}
public static String printDay(int dayno){
String day;
switch(dayno){
case 0:{day="JANUARY";break;}
case 1:{day="FEBRUARY";break;}
case 2:{day="MARCH";break;}                      
case 3:{day="APRIL";break;}
case 4:{day="JUNE";break;}
case 5:{day="JULY";break;}
case 6:{day="AUGUST";break;}

default: day="INVALID";
}
return day;
}
}