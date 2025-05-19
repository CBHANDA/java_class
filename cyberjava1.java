import java.util.Scanner;
public class cyberjava1{

public static void main(String[] args){
	String name;
	String course;
	int id;
Scanner input=new Scanner (System.in);
	System.out.println("what is your name");
	name=input.nextLine();
	System.out.println("what is your course");
	course=input.nextLine();
	System.out.println("enter your id");
	id=input.nextInt();
System.out.println("my name is:"+name+"\nmy course is:"+course+"\nmy id is:"+id);
}
}