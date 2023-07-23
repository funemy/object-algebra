package yz.li;

public class MulExpFactory extends ExpFactory implements MulAlgebra<Exp> {
    @Override
    public Exp mul(Exp lhs, Exp rhs) {
        return () -> lhs.eval() * rhs.eval();
    }
}
