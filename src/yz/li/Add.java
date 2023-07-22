package yz.li;

public class Add implements Exp{
    public Exp lhs;
    public Exp rhs;

    public Add(Exp lhs, Exp rhs) {
        this.lhs = lhs;
        this.rhs = rhs;
    }

    @Override
    public <T> T accept(Visitor<T> visitor) {
        return visitor.visit(this);
    }
}
