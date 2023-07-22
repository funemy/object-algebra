package yz.li;

public class EvalVisitor implements Visitor<Integer> {
    @Override
    public Integer visit(Exp e) {
        Integer res;
        if (e instanceof Add exp) {
            res = visit(exp);
        } else if (e instanceof Lit exp) {
            res = visit(exp);
        } else {
            throw new RuntimeException("Invalid term");
        }
        return res;
    }

    @Override
    public Integer visit(Add e) {
        return visit(e.lhs) + visit(e.rhs);
    }

    @Override
    public Integer visit(Lit e) {
        return e.val;
    }
}
