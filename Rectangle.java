
public class Rectangle {
	
	private int x1;
	private int x2;
	private int y1;
	private int y2;
	private String colour;
	
	public Rectangle(int x1, int y1, int x2, int y2, String colour)
	{
		this.x1=x1;
		this.y1=y1;
		this.x2=x2;
		this.y2=y2;
		this.colour=colour;
	}
	
	public String getColour()
	{
		return colour;
	}
	
	public void setColour(String newColour)
	{
		this.colour=newColour;
	}
	
	public int getX1()
	{
		return x1;
	}
	public int getX2()
	{
		return x2;
	}
	public int getY1()
	{
		return y1;
	}
	public int getY2()
	{
		return y2;
	}
	
	
	
	public void move(int x1, int y1)
	{
		int lengthx=Math.abs(this.getX1()-this.getX2());
		int lengthy=Math.abs(this.getY1()-this.getY2());
		
		this.x1= x1;
		this.y1= y1;
		
		this.x2=lengthx + x1;
		this.y2=lengthy + y1;
		
	}
	
	
	
	public void print()
	{
		System.out.println("The coordinates are: ("+x1+","+y1+") ("+x2+","+y2+") \n The colour is: "+colour);
	}
	
	
	
	public int getArea()
	{
		return Math.abs(x1-x2)*Math.abs(y1-y2);
	}
	
	
	
	public int getPerimeter()
	{
		return (2*Math.abs(x1-x2))+(2*Math.abs(y1-y2));
	}
	
	
	
	public boolean contains(int x, int y)
	{
		boolean contain;
		if(x1<=x && x<=x2 && y1<=y && y<=y2 )
		{
			contain=true;
		}
		else
		{
			contain=false;
		}
		
		return contain;
	}
	

}
