class Circle{
int radius;
void insert(int r){
radius=r;
}
void calculateArea(){System.out.println(3.14*radius*radius);}
}
class TestCircle1{
public static void main(String args[]){
Circle c=new Circle();
c.insert(5);
c.calculateArea();
}
}