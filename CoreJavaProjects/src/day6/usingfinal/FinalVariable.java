package day6.usingfinal;

public class FinalVariable {
    final int x = 100;

    // Declare a static blank final variable.
    final static int Y;

    // Declare & initialize static final variable.
    final static int Z = 10;

    // instance method
    void showValues() {
        // x = 30;  ❌ Not allowed
        // Y = 200; ❌ Not allowed
        System.out.println("Instance method: x = " + x + ", Y = " + Y + ", Z = " + Z);
    }

    @Override
    public String toString() {
        return "FinalVariable [x=" + x + ", Y=" + Y + ", Z=" + Z + "]";
    }

    // Declare a static block to initialize the final static variable.
    static {
        Y = 20; // ✅ Allowed (first and only initialization)
        // Z = 100; ❌ Not allowed, already initialized
        System.out.println("Value of Y: " + Y);
        System.out.println("Value of Z: " + Z);
    }

    // main method to test
    public static void main(String[] args) {
        FinalVariable fv = new FinalVariable();
        fv.showValues();
        System.out.println(fv);
    }
}
