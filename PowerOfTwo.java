class PowerOfTwo{
    
    // Function to check if given number n is a power of two.
    public static boolean isPowerofTwo(long n){
        
        // Your code here
        int c=0;
        while(n>0)
        {
            n=n&(n-1);
            c++;
        }
        if(c==1)
        {
            return true;
        }
        else
         {
             return false;
         }
    }
    