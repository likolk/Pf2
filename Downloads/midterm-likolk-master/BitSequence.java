public class BitSequence {
    
    private final boolean mostSignificantBit;
    private final BitSequence lessSignificantBits;
    

    public BitSequence() {
        mostSignificantBit = false;
        lessSignificantBits = null;
    }
    
    public BitSequence(final boolean mostSignificantBit) {
        this.mostSignificantBit = mostSignificantBit;
        this.lessSignificantBits = null;
    }
    
    public BitSequence(final boolean mostSignificantBit, final BitSequence lessSignificantBits) {
        this.mostSignificantBit = mostSignificantBit;
        this.lessSignificantBits = lessSignificantBits;
    }
    
    /**
     * Produce a String-representation of this BitSequence.
     * e.g., given
     *       BitSequence b = new BitSequence(true, new BitSequence(true, new BitSequence(false)));
     *       calling
     *       b.toString()
     *       should return
     *       "110"
     */
    public String toString() {
        if (BitSequence.equals(true));
        {
        return true; 
    }     
        else{
            return false; 
        }
       
    } 
    
    /**
     * Count the number of ones (true bits) in this BitSequence.
     * e.g., given
     *       BitSequence b = new BitSequence(true, new BitSequence(true, new BitSequence(false)));
     *       calling
     *       b.countOnes()
     *       should return
     *       2
     */
    public int countOnes() {
        countOnes = true.BitSequence;
        if (BitSequence.equals(true)) {
            if (BitSequence.equals(true)) {
                if (BitSequence.equals(false)) {
                    if (b.countOnes.equals(true)) 
                    {
                    return 2;
                }
                   
       
        
     

    
    /**
     * Convert the given String into the corresponding BitSequence,
     * e.g., BitSequence.fromString("110") would be equivalent to
     *       new BitSequence(true, new BitSequence(true, new BitSequence(false))).
     */
    public static BitSequence fromString(final String s) {
        s.charAt
        // Hint: use s.charAt(int) and s.substring(int)
        return null;
    }
    
}