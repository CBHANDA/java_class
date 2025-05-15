class details{
public static void main(String args[]){
	string names;
	int empno;
	string address;
	scaner input=new scanner(System.in);
System.out.println("enter your names");
	names=input.nextline();

System.out.println("enter your empno");
	empno=input.nextint();

System.out.println("enter your address");
	address=input.next();
System.out.println("the name are\t:\t"+names+"The employee number is\t:\t"+empno+"The address is\t:\t"+address)
}
}