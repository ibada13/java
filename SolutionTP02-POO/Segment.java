
public class Segment {
	
	
	int x;
	
	int y;
	
	public Segment(int extX,int extY){
		
		x = extX;
		y = extY;
	}

	public int longueur()
	{
		if(x>y){
			return x-y;
		}
		else{
			return y-x;
		}		

	}
	
	
	public String toString()
	{
	    String message = "Segment [< "+x+" >,< "+y+" >]";
		return message;
	}
}
