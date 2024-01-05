class Index{
private String name;
private String class;
private int rollno;
private String subject;
private String college_name;
public void setName(String Name)
{this.name=name;}
public void setClass(String Class)
{this.class=class;}
public void setRollno(int Rollno)
{this.rollno=rollno;}
public void setSubject(String Subject)
{this.subject=subject;}
public void setCollege_name(String College_name)
{this.college_name=college_name;}
public String getName()
{return name;}
public String getClass()
{return class;}
public int getRollno()
{return rollno;}
public String getSubject()
{return subject;}
public String getCollege_name()
{return college_name;}
}
class Book
{
public static void main(String args[]){
Index ob=new Index( );
ob.setName("ammu");
ob.setClass("btech 2nd year");
ob.setRollno(22hr1a3011);
ob.setSubject("java");
ob.setCollege_name("MTIET");
ob.getName();
ob.getClass();
ob.getRollno();
ob.getSubject();
ob.getCollege_name();
System.out.println(ob.getName());
System.out.println(ob.getClass());
System.out.println(ob.getRollno());
System.out.println(ob.getSubject());
System.out.println(ob.getCollege_name());
}
}