package First_package;
abstract class amazon_auth
{
	abstract void un(); //abstract method
	abstract void un_mob(); //abstract method
	void login_button() //concrete method
	{
		System.out.println("logic");
	}
}

abstract class amazon_login extends amazon_auth
{
	abstract void un_as_email();
	abstract void un_as_mobile();
	void registration_process() //concrete class
	{
		System.out.println("logic 1");
	}
}

public class abstractclass_2 extends amazon_login
{
	
	static void loginwith_mon()
	{
		System.out.println("logic 2");
	}
	public static void main(String[] args) 
	{
		abstractclass_2 n1 =new abstractclass_2();
		n1.loginwith_mon();
		
	}
	@Override
	void un_as_email() {
		// TODO Auto-generated method stub
		
	}
	@Override
	void un_as_mobile() {
		// TODO Auto-generated method stub
		
	}
	@Override
	void un() {
		// TODO Auto-generated method stub
		
	}
	@Override
	void un_mob() {
		// TODO Auto-generated method stub
		
	}

}
