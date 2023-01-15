public class oneTimePad
{
    public static void main(String[] args)
    {
        String message="hello";
        String key="XMCKL";
        String m=message.toUpperCase();
        int []cipher=new int[key.length()];
        String ciphertext="";
        int x;
        for(int i=0; i<key.length(); i++)
        {
            cipher[i]=m.charAt(i)+key.charAt(i)-2*'A';
            if(cipher[i]>26){
                cipher[i]=cipher[i]-26;
            }
            x=cipher[i]+'A';
            ciphertext+=(char)x;
        }
        System.out.println("The ciphertext is "+ciphertext);
        //decryption
        String plaintext="";
        int y;
        for(int i=0; i<key.length(); i++)
        {
            cipher[i]=ciphertext.charAt(i)-key.charAt(i);
            if(cipher[i]<0){
                cipher[i]=cipher[i]+26;
            }
            y=cipher[i]+'A';
            plaintext+=(char)y;
        }
        System.out.println("The decrypted plaintext is "+plaintext);
    }
}
