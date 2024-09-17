package polymorphism;

public class override_main {

	public static void main(String[] args)
	{
		Person p = new shyam();
		p.showdetails();
		
		ram r = new ram();
		r.doWork(p);

	}

}
