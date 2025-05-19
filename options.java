import java.util.Scanner;
public class options{
	String name;
	int empno;
Scanner sc=new Scanner(System.in);
	void input(){
	System.out.println("enter emp name");
	name=sc.nextLine();
	System.out.println("enter empo no");
	empno=sc.nextInt();
}
void display()
{
System.out.println("the emp name is"+name+"emp no. is"+empno);
}
	public static void main(String args[]){
		options dd=new options();
		dd.input();
		dd.display();
	
}
}
