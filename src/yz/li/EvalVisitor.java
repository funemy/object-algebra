package yz.li;

public class EvalVisitor implements Visitor<Integer> {
    @Override
    public Integer visit(Add e) {
        return e.lhs.accept(this) + e.rhs.accept(this);
    }

    @Override
    public Integer visit(Lit e) {
        return e.val;
    }
}
