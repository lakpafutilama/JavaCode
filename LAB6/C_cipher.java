public class C_cipher {

	public String encryptionMethod(String m, int k) {
		int[] ct = new int[m.length()];
		int x;
		String c = "";
		for (int i = 0; i < m.length(); i++) {
			ct[i] = m.charAt(i) - 'A' + k;
			if (ct[i] > (26 - k)) {
				ct[i] -= 26;
			}
			x = ct[i] + 'A';
			c += (char) x;
		}
		return c;
	}
	
	public String decryptionMethod(String c, int k)
	{
		int[] ct = new int[c.length()];
		int x;
		String p = "";
		for (int i = 0; i < c.length(); i++) {
			ct[i] = c.charAt(i) - 'A' - k;
			if (ct[i] < 0) {
				ct[i] += 26;
			}
			x = ct[i] + 'A';
			p += (char) x;
		}
		return p;
	}

	public static void main(String[] args) {
		C_cipher d = new C_cipher();
		String message = "CRYPTOCURRENCY";
		String ms = message.toUpperCase();
		int key = 3;
		String c = d.encryptionMethod(ms, key);
		System.out.println("The ciphertext is " + c);
		System.out.println("The original plaintext is " + d.decryptionMethod(c, key));
	}
}
