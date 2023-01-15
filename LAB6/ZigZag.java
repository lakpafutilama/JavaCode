public class ZigZag {

	public static void main(String[] args) {
		String message="ASMITHANDSOME";
		char []enm=new char[message.length()];
		int a=0, b=1;
		for(int i=0; i<message.length(); i++) {
			if(i<=(message.length())/2) {
				enm[i]=message.charAt(a);
				a+=2;
			}
			else
			{
				enm[i]=message.charAt(b);
				b+=2;
			}		
		}
		for(int i=0; i<enm.length; i++)
		{
			System.out.print(enm[i]);
		}
	}
}
