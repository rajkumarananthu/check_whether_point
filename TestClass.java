import java.util.Scanner;


class Area
{
	public double cal(int x1,int y1,int x2,int y2,int x3,int y3)
	{
		double area;
		area=(1/2)*(x1*(y2-y3)+x2*(y3-y1)+x3*(y1-y2));
		return Math.abs(area);
	}
}

class TestClass 
{
    public static void main(String args[] ) throws Exception 
    {
    	int t,k=0;
    	Scanner s=new Scanner(System.in);
    	t=s.nextInt();
    	int x[][]=new int[t][4];
    	int y[][]=new int[t][4];
    	for(int i=0;i<t;i++)
    	{
    		for(int j=0;j<4;j++)
    		{
    			x[i][j]=s.nextInt();
    			y[i][j]=s.nextInt();
    		}
    	}
    	Area a=new Area();
    	double area,area1,area2,area3;
    	while(k<t)
    	{
    		area=a.cal(x[k][0],y[k][0],x[k][1],y[k][1],x[k][2],y[k][2]);
    		area1=a.cal(x[k][0],y[k][0],x[k][1],y[k][1],x[k][3],y[k][3]);
    		area2=a.cal(x[k][2],y[k][2],x[k][1],y[k][1],x[k][3],y[k][3]);
    		area3=a.cal(x[k][0],y[k][0],x[k][2],y[k][2],x[k][3],y[k][3]);
    		if(area==(area1+area2+area3))
    			System.out.println("INSIDE");
    		else
    			System.out.println("OUTSIDE");
			k=k+1;
    	}
    	
    }
}
