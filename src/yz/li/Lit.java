package yz.li;

public class Lit implements Exp{
    public int val;

    public Lit(int v) {
        val = v;
    }

    @Override
    public <T> T accept(Visitor<T> visitor) {
        return visitor.visit(this);
    }
}
