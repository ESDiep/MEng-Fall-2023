
public class testing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1 = "hello greg.";
		String s2 = "really? this is great!";
		
		/*for (int i = 0; i < s1.length(); i++)
			System.out.println("s1 at" + i + " is " + s1.charAt(i));
		
		for (int i = 0; i < s2.length(); i++)
			System.out.println("s2 at" + i + " is " + s2.charAt(i));
		
		
		String a = ""+s2.charAt(17)+s1.charAt(8);
		System.out.println("a " + a + " " +a.length());
		
		String b = "r" + s1.charAt(1);
		System.out.println("b " + b);
		
		String c = "r" + (char)(s2.charAt(2)+4);
		System.out.println("c " + c);
		
		String d = s1.substring(8,10);
		System.out.println("d " + d);
		
		String e = s1.substring(s1.indexOf('r'),s1.indexOf('r')+1);
		System.out.println("e " + e);
		*/
		
		int[] v = {6,1,7,8,0,2};
		int target = 3;
		boolean inArray = false;
		
		
		
		for (int x : v) {
			if ( x == target) {
				inArray = true;
				break;
			}
				
			else
				inArray = false;
		}
		
		
		
		System.out.println("inArray " + inArray);
		
		System.out.println(Math.log(100));
		
		
			
	}

}
