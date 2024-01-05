class Square{
int length;
void insert(int l){
length=l;
}
void calculateArea()
{
System.out.println(length*length);
}
class TestSquare1
{
Square s=new Square();
s.insert(5);
s.calculateArea();
}
}