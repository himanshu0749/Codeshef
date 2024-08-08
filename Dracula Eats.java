class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    for(int i=0;i<n;i++)
	    {
	        int a=sc.nextInt();
	        int b=a-1;
	        if(b%7==0)
	         System.out.println(b/7);
	        else
	         System.out.println((b/7)+1);
	    }

	}
}
