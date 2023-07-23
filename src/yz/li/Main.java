package yz.li;

public class Main {

    private static <T> T gen(Algebra<T> algebra) {
        // (1+2) + (3+4)
        return algebra.add(
                algebra.add( algebra.lit(1), algebra.lit(2) ),
                algebra.add( algebra.lit(3), algebra.lit(4) )
        );
    }

    private static <T> T gen2(MulAlgebra<T> algebra) {
        // 2 * 3 + 5 so that I don't need to worry about parenthesis
        return algebra.add(
                algebra.mul(algebra.lit(2), algebra.lit(3)),
                algebra.lit(5)
        );
    }

    public static void main(String[] args) {
        ExpFactory ef = new ExpFactory();
        StringFactory sf = new StringFactory();
        MulExpFactory mef = new MulExpFactory();
        System.out.println(gen(ef).eval());
        System.out.println(gen(sf).stringify());
        System.out.println(gen2(mef).eval());
    }
}
