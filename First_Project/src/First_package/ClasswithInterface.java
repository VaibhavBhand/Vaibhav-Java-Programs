package First_package;

interface Interface1
{
	void login();
	void logout();
}

interface Interface2 extends Interface1
{
	void search();
	void payment();
}

public class ClasswithInterface implements Interface2
{
	void order_page()
	{
		
	}
	
	static void address_page()
	{
		
	}
 public static void main(String[] args) 
{
	
}

@Override
public void login() {
	// TODO Auto-generated method stub
	
}

@Override
public void logout() {
	// TODO Auto-generated method stub
	
}

@Override
public void search() {
	// TODO Auto-generated method stub
	
}

@Override
public void payment() {
	// TODO Auto-generated method stub
	
}
}
