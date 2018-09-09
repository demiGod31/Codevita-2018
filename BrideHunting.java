import java.util.*;

public class BrideHunting {

	public static void main(String[] args) {
		
		int max=0,c=0,row1 = 0,col1 = 0,call=-1,dis1=0,dis2=0;
		Scanner s= new Scanner(System.in);
		int row=s.nextInt();
		int col=s.nextInt();
		int ar[][]=new int[row][col];
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				ar[i][j]=s.nextInt();
			}
		}
		ar[0][0]=0;
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				if(ar[i][j]==1)
				{
					if(i==0 && j==col-1)
					{
						if(ar[i][j-1]==1)
							c++;
						if(ar[i+1][j-1]==1)
							c++;
						if(ar[i+1][j]==1)
							c++;
					}
					else if(i==row-1 && j==0)
					{
						if(ar[i-1][j]==1)
							c++;
						if(ar[i-1][j+1]==1)
							c++;
						if(ar[i][j+1]==1)
							c++;
					}
					else if(i==row-1 && j==col-1)
					{
						if(ar[i-1][j]==1)
							c++;
						if(ar[i][j-1]==1)
							c++;
						if(ar[i-1][j-1]==1)
							c++;
					}
					else if(i==0)
					{
						if(ar[i][j-1]==1)
							c++;
						if(ar[i+1][j-1]==1)
							c++;
						if(ar[i+1][j]==1)
							c++;
						if(ar[i+1][j+1]==1)
							c++;
						if(ar[i][j+1]==1)
							c++;
					}
					else if(j==0)
					{
						if(ar[i-1][j]==1)
							c++;
						if(ar[i+1][j]==1)
							c++;
						if(ar[i+1][j+1]==1)
							c++;
						if(ar[i][j+1]==1)
							c++;
						if(ar[i-1][j+1]==1)
							c++;
					}
					else if(i==row-1)
					{
						if(ar[i][j-1]==1)
							c++;
						if(ar[i-1][j-1]==1)
							c++;
						if(ar[i-1][j]==1)
							c++;
						if(ar[i-1][j+1]==1)
							c++;
						if(ar[i][j+1]==1)
							c++;
					}
					else if(j==col-1)
					{
						if(ar[i-1][j]==1)
							c++;
						if(ar[i+1][j]==1)
							c++;
						if(ar[i][j-1]==1)
							c++;
						if(ar[i+1][j-1]==1)
							c++;
						if(ar[i-1][j-1]==1)
							c++;
					}
					else
					{						
						if(ar[i][j-1]==1)
							c++;
						if(ar[i+1][j-1]==1)
							c++;
						if(ar[i+1][j]==1)
							c++;
						if(ar[i+1][j+1]==1)
							c++;
						if(ar[i][j+1]==1)
							c++;
						if(ar[i-1][j-1]==1)
							c++;
						if(ar[i-1][j]==1)
							c++;
						if(ar[i-1][j+1]==1)
							c++;						
					}
					if(max<c)
					{
						max=c;
						row1=i;
						col1=j;
						
					}
					else if(max==c)
					{
                      	if(row1>=col1)
					     dis1= row1;
                        else
                          dis1=col1;
                      	if(i>=j)
						dis2= i;
                      	else
                          dis2=j;
						//System.out.println(dis1 + " "+ dis2);
						if(dis1==dis2)
							call=c;
						if(dis1>dis2)
						{
							row1=i;
							col1=j;
						}
						
					}
					c=0;
				}
			}
		}
		if(max==call)
			System.out.print("Polygamy not allowed");
		else if(max==0)
			System.out.print("No suitable girl found");
		else
			System.out.print((row1+1)+":"+(col1+1)+":"+max);
	}
}