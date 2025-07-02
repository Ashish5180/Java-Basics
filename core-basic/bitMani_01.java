public class bitMani_01{
    public static void main(String[] args) {
        // set bit
        int n=5;
        System.out.println("Number before setting bit: " + n);
        int pos=1; // position to set bit

        // int bitMask = 1<<pos;
        // int newNumber = n | bitMask;
        // System.out.println("Number after setting bit: " + newNumber);

        // clear bit
        int bitMask = ~(1 << pos);
        int newNumber = n & bitMask;
        System.out.println("Number after clearing bit: " + newNumber);


        // toggle bit
        int togglemask = n^(1 << pos);
        System.out.println("Number after toggling bit: " + togglemask);
    }
}