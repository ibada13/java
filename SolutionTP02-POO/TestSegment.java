
public class TestSegment {

	public static void main(String[] args) {
		
		Segment s = new Segment(6,8);
		int long1 = s.longueur();
		
		Segment t = new Segment(12,5);
		int long2 = t.longueur();
		
		if(long1>long2)
		{
			System.out.println(s.toString());
			
		}
		else
		{
			System.out.println(t.toString());
			
		}
		
		System.out.println("Ce segment est plus long");

	}

}
