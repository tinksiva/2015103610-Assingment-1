import java.util.Scanner;
public class EmployeTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Employe e,f;
		e = new Employe();
		f = new Employe();
		String a,b,x,y;
		double c,z;
		Scanner input=new Scanner(System.in);
		System.out.println("\nfor object 1");
		System.out.println("eneter first name");
		a=input.next();
		e.setNameF(a);
		System.out.println("enter last name");
		b=input.next();
		e.setNameL(b);
		System.out.println("enter balance");
		c=input.nextDouble();
		e.setSal(c);
		System.out.println("for object 2");
		System.out.println("eneter first name");
		x=input.next();
		f.setNameF(x);
		System.out.println("enter last name");
		y=input.next();
		f.setNameL(y);
		System.out.println("enter balance");
		z=input.nextDouble();
		f.setSal(z);
		System.out.println("\nobject 1");
		System.out.printf("\nthe name of the employee is %s %s \nsalary is %f\nsalary after incrementation is %f",e.getNamef(),e.getNameL(),e.getSal(),e.modSal());
		System.out.println("\nfor object 2");
		System.out.printf("\nthe name of the employee is %s %s \nsalary is %f\nsalary after incrementation is %f",f.getNamef(),f.getNameL(),f.getSal(),f.modSal());
		
		}}
