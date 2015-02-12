import java.util.*;
public class PC10{
static Scanner scan=new Scanner(System.in);
static ArrayList<String> res=new ArrayList<String>();
static String check="";
public static void main(String[] args) 
{
	String input=scan.next();
	String rever="";
		for(int i=0;i<input.length();i++)
	{
		if(input.charAt(i)=='C')
		{
			rever=rever+"G";
		}
		if(input.charAt(i)=='G')
		{
			rever=rever+"C";
		}
		if(input.charAt(i)=='A')
		{
			rever=rever+"T";
		}
		if(input.charAt(i)=='T')
		{
			rever=rever+"A";
		}
	}
	//System.out.println(rever);
	String aft="";
	for(int i=rever.length()-1;i>=0;i--)
	{
		aft=aft+rever.charAt(i);
	}
	int cou=0,c1=0,c2=0;
for(int a=input.length();a>1;a--)
{
	cou++;
for(int b=0;b<aft.length();b++)
{
if(a+b<=input.length())
{
	cou--;
	check=aft.substring(b,a+b);
}	

if(input.contains(check))
{
	c1++;
if(!res.contains(check))
{
c2++;
res.add(check);

}
}
}
           if(!res.isEmpty())
               break;
}
prints(res);   
}
public static void prints(ArrayList pri)
{
if(!pri.isEmpty())
{

       Collections.sort(pri);
       for(int i=0;i<pri.size();i++)
           System.out.println(pri.get(i));

}
else
{
	System.out.println("No reverse palindromic substrings available");
    return;
}
}
}

