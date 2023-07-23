package yz.li;

public class ExpFactory implements Algebra<Exp> {
    @Override
    public Exp add(Exp lhs, Exp rhs) {
        return () -> lhs.eval() + rhs.eval();
    }


    @Override
    public Exp lit(int x) {
        return () -> x;
    }
}
