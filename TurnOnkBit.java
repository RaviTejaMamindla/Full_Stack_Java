class TurnOnkBit
{
    // Function to turn on k'th bit in `n`
    public static int turnOnKthBit(int n, int k) {
        return n | (1 << (k - 1));
    }
 
    public static void main(String[] args)
    {
        int n = 20;
        int k = 4;
 
        System.out.println(n + " in binary is " + Integer.toBinaryString(n));
        System.out.println("Turning k'th bit on…");
        n = turnOnKthBit(n, k);
        System.out.println(n + " in binary is " + Integer.toBinaryString(n));
    }
}
