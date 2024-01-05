class Icard{
private String college_name;
private String college_address;
private int ay_start;
private int ay_end;
private int id;
private String student_name;
private String course_name;
private int aadhar_no;
public void setCollege_name(String college_name)
{this.college_name=college_name;}
public void setCollege_address(String college_address)
{this.college_address=college_address;}
public void setAy_start(int ay_start)
{this.ay_start=ay_start;}
public void setAy_end(int ay_end)
{this.ay_end=ay_end;}
public void setId(int id)
{this.id=id;}
public void setStudent_name(String Student_name)
{this.student_name=student_name;}
public void setCourse_name(String course_name)
{this.course_name=course_name;}
public void setAadhar_no(int aadhar_no)
{this.aadhar_no=aadhar_no;}
public String getCollege_name()
{return college_name;}
public String getCollege_address()
{return college_address;}
public int getAy_start()
{return ay_start;}
public int getAy_end()
{return ay_end;}
public int getId()
{return id;}
public String getStudent_name()
{return student_name;}
public String getCourse_name()
{return course_name;}
public int getAadhar_no()
{return aadhar_no;}
}
class IcardDemo
{
public static void main(String args[]){
Icard ob=new Icard( );
ob.setCollege_name("MTIET");
ob.setCollege_address("palamaner");
ob.setAy_start(2023);
ob.setAy_end(2026);
ob.setId(27871);
ob.setStudent_name("B.Reddy nageswari");
ob.setCourse_name("AI&DS");
ob.setAadhar_no(12345678);
ob.getCollege_name();
ob.getCollege_address();
ob.getAy_start();
ob.getAy_end();
ob.getId();
ob.getStudent_name();
ob.getCourse_name();
ob.getAadhar_no();
System.out.println(ob.getCollege_name());
System.out.println(ob.getCollege_address());
System.out.println("A.Y"+ob.getAy_start()+"-"+ob.getAy_end());
System.out.println(ob.getStudent_name());
System.out.println(ob.getCourse_name());
System.out.println(ob.getAadhar_no());
}
}

















