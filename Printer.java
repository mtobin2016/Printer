import java.util.ArrayList;

public class Printer implements Runnable
{
	private ArrayList<Message> messages;

	public Printer()
	{
		messages= new ArrayList<Message>();
	}

	public void addMessage(Message m)
	{
		messages.add(m);
	}

	public int getMessageCount()
	{
		return messages.size();
	}

	public boolean hasMessages()
	{
		return messages.size()>0;
	}

	public void print()
	{
		System.out.println((messages.get(0)).getMessage());
		messages.remove(0);

	}

	public void run()
	{
		while(true)
		{

			if(this.hasMessages())
			{
				this.print();
			}

			try
			{
				Thread.sleep((int)(Math.random()*3000));
			}
			catch(InterruptedException e)
			{
				e.printStackTrace();
			}


		}
	}






}
