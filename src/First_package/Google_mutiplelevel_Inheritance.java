package First_package;

interface Gmail
{
	void send_schedule();
	void Inbox();
}

interface Youtube
{
	void watch_later();
	void play();
}

public class Google_mutiplelevel_Inheritance implements Gmail,Youtube
{

	public static void main(String[] args)
	{
		
	}

	@Override
	public void watch_later() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void play() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void send_schedule() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void Inbox() {
		// TODO Auto-generated method stub
		
	}
}
