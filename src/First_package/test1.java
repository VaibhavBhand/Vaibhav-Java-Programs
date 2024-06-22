package First_package;

public class test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] num = {3,7,2,9,2};
		int sum=0;
		for (int i=0;i<num.length;i++)
		{
			if(num[i]%2==0)
			{
				sum=sum+num[i];
			}
		}
		System.out.println(sum);
	}

}
