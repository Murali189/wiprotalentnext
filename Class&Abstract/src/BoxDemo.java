
public class BoxDemo {
	public static void main(String args[]) 
	{ 
		Box b= new Box(6,5,3);
		double vol; 
		vol=b.volume();
		System.out.print(" Volume is " + vol);  
		}
	
}
class Box {
	double width;  double height;  double depth;     
	Box(double width, double height, double depth)  {  
		this.width = width;
		this.height = height;
		this.depth = depth;
		} 
	 double volume() 
	 {  
		 return width*height*depth;     
	 
	}   
	 }  