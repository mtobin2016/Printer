
public class Person implements Runnable
{
	private int ID;
	public static int NUM_PEOPLE;
	private String mToPrint;
	private Printer printer;
	private Message message;
	private int PrintJob;
	
	public Person(Printer printer)
	{
		NUM_PEOPLE++;
		ID=NUM_PEOPLE;
		this.printer=printer;
		PrintJob=0;
		
	}
	
	public void ToPrint()
	{
		PrintJob++;
		message = new Message("Person "+ ID + " is printing doc "+ PrintJob);
		printer.addMessage(message);
	}
	
	public void run()
	{
		while(true)
		{
			try
			{
				Thread.sleep((int)(Math.random()*1600 + 5000));
			}
			catch(InterruptedException e)
			{
				e.printStackTrace();
			}
			
			this.ToPrint();
			
		}
	}
	
	
	

	

}
	

