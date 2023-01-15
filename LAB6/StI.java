 

public class StI {
	public static void main(String[] args) {
		String m="LAKPA";
		String c="";
		int s;
		for(int i=0; i<m.length(); i++) {
			s=m.charAt(i);
			c+=s;
		}
		int im=Integer.parseInt(c);
		System.out.println(im);
	}
}
