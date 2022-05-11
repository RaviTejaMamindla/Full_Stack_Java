class Solution
{
    //Function to swap odd and even bits.
    public static int swapBits(int n) 
    {
	    // Your code
	    int mask1=0x55555555; //01010101
    	int mask2=0xAAAAAAAA; //10101010
    	int odd=(mask1 & n);
    	int even=(mask2 & n);
    	
    	odd<<=1; even>>=1;
    	
    	return (odd|even) ;
	}
    
}