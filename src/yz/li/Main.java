package yz.li;

public class Main {

    private static <T> T gen(Algebra<T> algebra) {
        // (1+2) + (3+4)
        return algebra.add(
                algebra.add( algebra.lit(1), algebra.lit(2) ),
                algebra.add( algebra.lit(3), algebra.lit(4) )
        );
    }

    public static void main(String[] args) {
        ExpFactory ef = new ExpFactory();
        StringFactory sf = new StringFactory();
        System.out.println(gen(ef).eval());
        System.out.println(gen(sf).stringify());
    }
}
