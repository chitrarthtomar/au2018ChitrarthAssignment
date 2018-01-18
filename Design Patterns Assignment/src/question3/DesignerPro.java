package question3;

public class DesignerPro 
{
	public static void main(String[] args) 
	{	
		Designer type = new MetalWalls();
		System.out.println("Metalhouse");
		type.buildHouse();
		
		
		type = new GlassWalls();
		System.out.println("\n\nGlasshouse");
		type.buildHouse();
	}

}
