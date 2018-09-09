import java.io.*;
import java.util.*;

public class StringRotation {

	public static void main(String[] args) throws IOException {
		InputStreamReader isr = new InputStreamReader(System.in);
	    BufferedReader br= new BufferedReader(isr);
	    int dir = 0,add=0;
	    String s=br.readLine();
	    //char[] s1Array = s.toLowerCase().toCharArray();
	    //Arrays.sort(s1Array);
	    String r=s;
	    String check="",direc="";
	    int num=Integer.parseInt(br.readLine());
	    for(int i=1;i<=num;i++)
	    {
	    	String s1=br.readLine();
			String s2[]=s1.split(" ");
			dir=Integer.parseInt(s2[1]);
			direc=s2[0];
			if(direc.charAt(0)=='L')
			{
				for(int j=1;j<=dir;j++)
					r=r.substring(1,r.length())+r.substring(0,1);
				check=check+r.charAt(0);
			}
			if(direc.charAt(0)=='R')
			{
				for(int j=1;j<=dir;j++)
					r=r.substring(r.length()-1)+r.substring(0,r.length()-1);
				check=check+r.charAt(0);
			}
			
	    }
	   //System.out.println(r+ " "+ check);
	    char[] s2Array = check.toLowerCase().toCharArray();
	    Arrays.sort(s2Array);
	    //String new1 = new String(s1Array);
	    String new2 = new String(s2Array);
	    
	   // System.out.println(new1);
	   // System.out.println(new2);
	    for(int i=0;i<s.length();i++)
	    {
	    	if(i+check.length()<=s.length())
	    	{
	    	String hi=s.substring(i,i+check.length());
	    	//System.out.println(hi);
	    	char[] s1Array = hi.toLowerCase().toCharArray();
	    	Arrays.sort(s1Array);
	    	String new1 = new String(s1Array);
	    	//System.out.println(new1);
	    	if(new1.equals(new2))
	    		add=1;
	    	}	
	    }
	    
	    
	   //boolean isFound = new1.contains(new2);
	   if(add==1)
		   System.out.print("YES");
	   else
		   System.out.print("NO");
	   
	}

}
