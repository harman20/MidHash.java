public class MidHash {
	 
    static int hashCode(int x) {
         
        int k = 10;
        int w = Integer.SIZE;
         
        return (x * x >> (w - k));
    }
     
    public static void main(String[] args)
    {
        int hash_val;
         
        hash_val = hashCode(121);
        System.out.println("hash value = " +hash_val);
    }
     
}