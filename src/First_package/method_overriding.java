package First_package;

class Method_parent
{
	void login()
	{
		System.out.println("Login with Mobile");
	}
}

public class method_overriding extends Method_parent 
{
	void login()
	{
		System.out.println("Login with Email");
		super.login();
	}
	
	public static void main(String[] args) 
	{
		method_overriding n1 = new method_overriding();
		n1.login();
		
	}

}
