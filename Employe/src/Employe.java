
public class Employe {

		// TODO Auto-generated constructor stub
private		String nameEmpFirst;
	private	String nameEmpLast;
	private	double salEmp;
public Employe() {
				// TODO Auto-generated constructor stub
		nameEmpFirst=null;
		nameEmpLast=null;
		salEmp=0;
			
			}
			public void setNameF(String a)
			{nameEmpFirst=a;
			}
			String getNamef()
			{return(nameEmpFirst);
			}
		public void setNameL(String a)
		{nameEmpLast=a;

		}
		public String getNameL()
		{
		return(nameEmpLast);

		}
		public void setSal(double a)
		{if(a>=0)
			salEmp=a;
		else
			System.out.println("\nnot valid entry");
		

		}
		public double getSal()
		{return(salEmp);
		}
		public double modSal()
		{salEmp=salEmp+(0.1*salEmp);
		return(salEmp);
		}
}


