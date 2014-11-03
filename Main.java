
public class Main 
{
	
		private Printer LibraryCopier;
		private Person[] student;

		public Main()
		{
			System.out.println("main starting");
			LibraryCopier = new Printer();
			new Thread(LibraryCopier).start();
			
			student = new Person[3];
			for(int i = 0; i < 3; i++)
			{
				student[i] = new Person(LibraryCopier);
				new Thread(student[i]).start();	
			}
			
			System.out.println("main ending");
		}


		public static void main(String[] args)
		{
			new Main();
		}
	}
