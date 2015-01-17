
public class Canvas {
	
	private Rectangle[] rectangles;
	private int numRectangles;

	
	public Canvas(int size)
	{
		rectangles= new Rectangle[size];
		
		numRectangles =0;
	}
	
	
	
	
	public void add(Rectangle aRectangle)
	{
		if(numRectangles!=rectangles.length)
		{
			rectangles[numRectangles]=aRectangle;
			numRectangles++;
		}
		else
		{
			System.out.println("The canvas is full. Unable to add a new rectangle");
		}
			
		
	}
	
	
	
	
	public int getNumRectangles()
	{
		return numRectangles;
	}
	
	
	
	
	public void printAll()
	{
		for(int i=0; i<rectangles.length;i++)
		{
			rectangles[i].print();
		}
	}
	
	
	
	public int countRectanglesForColour(String Colour)
	{
		int howMany=0;
		for(int i=0; i<rectangles.length;i++)
		{
			if(rectangles[i].getColour()==Colour)
			{
				howMany++;
			}
		}
		return howMany;
		
	}
	
	
	public int totalPerimeter()
	{
		int totalPerimeter=0;
		
		for(int i=0; i<rectangles.length;i++)
		{
			totalPerimeter= totalPerimeter+rectangles[i].getPerimeter();
		}
		return totalPerimeter;
	}
	
	
	
	
	public static boolean intersect2(Rectangle r1, Rectangle r2)
	{
		boolean intersects = false;
		
		if(r1.getX1()==r2.getX1()||r1.getX1()==r2.getX2()||r1.getX1()==r2.getY1()||r1.getX2()==r2.getY2())
		{
			intersects= true;
		}
		else if(r1.getX2()==r2.getX1()||r1.getX2()==r2.getX2()||r1.getX2()==r2.getY1()||r1.getX2()==r2.getY2())
		{
			intersects=true;
		}
		else if(r1.getY1()==r2.getX1()||r1.getY1()==r2.getX2()||r1.getY1()==r2.getY1()||r1.getY1()==r2.getY2())
		{
			intersects=true;
		}
		else if(r1.getY2()==r2.getX1()||r1.getY2()==r2.getX2()||r1.getY2()==r2.getY1()||r1.getY2()==r2.getY2())
		{
			intersects=true;
		}
			else
		{
			intersects=false;
		}
		
		return intersects;
	
	
	}
	
	
	
	
	public boolean intersectAll()
	{
		boolean all=false, test;
		boolean[] intersects=new boolean [rectangles.length];
		
		for(int i=0; i<rectangles.length-1; i++)
		{
			test=intersect2(rectangles[i], rectangles[i+1]);
			
			if(test==true)
			{
				intersects[i]=true;
			}
			else
			{
				intersects[i]=false;
			}
		}
		
		for(int i=0; i>intersects.length; i++)
		{
			if(intersects[i]==true)
			{
				all =true;
			}
			else
			{
				return false;
			}
		}
		return all;
	}
	
	
	public Rectangle minEnclosingRectangle()
	{
		//make array of all x1's, and X2's
		int [] x1 = new int [numRectangles];
		int [] x2 = new int [numRectangles];
		
		for(int i=0; i< numRectangles; i++)
		{
			x1[i]= rectangles[i].getX1();
		}
		
		for(int i=0; i<numRectangles; i++)
		{
			x2[i]=rectangles[i].getX2();
			
		}
		
		int minX1= min(x1);
		int maxX2= max(x2);
		
		//make array of all y's
		int [] y1 = new int [numRectangles];
		int [] y2 = new int [numRectangles];
		
		for(int i=0; i< numRectangles; i++)
		{
			y1[i]= rectangles[i].getY1();
		}
		
		for(int i=0; i<numRectangles; i++)
		{
			y2[i]=rectangles[i].getY2();
			
		}
		
		int minY1= min(y1);
		int maxY2= max(y2);
		
		
		
		Rectangle r=new Rectangle(minX1,minY1,maxX2, maxY2, "purple");
		
		return r;
	
	}
	
	
	
	
	private static int max(int[]a)
	{
	
		//set a[0] as max
		int max=a[0];
		
		for(int i=0; i<a.length; i++)
		{
			
			if(max<a[i])
			{
				max=a[i];
			}
		}
		return max;
	}
	
	
	
	
	private static int min(int[]a)
	{
		
		//set a[0] as max
		int min=a[0];
		
		for(int i=0; i<a.length; i++)
		{
			
			
			if(min>a[i])
			{
				min=a[i];
			}
		}
		return min;
	}
	
}
