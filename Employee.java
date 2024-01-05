class Employee{
int eld;
String name;
String depart;
void insertRecord(int r,String n,String d){
eld=r;
name=n;
depart=d;
}
void displayinformation(){
System.out.println(eld+" "+name+" "+depart);}
}
class TestEmployee4
{
public static void main(String args[]){
Employee e1=new Employee();
Employee e2=new Employee();
Employee e3=new Employee();
e1.insertRecord(111,"ammu","ainds");
e2.insertRecord(222,"akhi","ece");
e3.insertRecord(333,"bujji","cse");
e1.displayinformation();
e2.displayinformation();
e3.displayinformation();
}
}

