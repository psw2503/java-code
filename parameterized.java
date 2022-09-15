public class parameterized{
String studentName;
int studentAge;
int studentRoll No;
//constructor
parameterized(String name,int age,int roll no){
studentName = name;
studentAge = age;
studentRoll NO = roll no;
}
void display(){
System.out.println(studentName+""+studentAge+""+studentRoll No);
}
public static void main(String args[])
{
parameterized myObj = new parameterized("Akshada");
parameterized myObj = new parameterized("Swara", 10 );
parameterized myObj = new parameterized("Girija", 7 , 5);
myObj.display();
}
}

