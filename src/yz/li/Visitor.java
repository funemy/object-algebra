package yz.li;

public interface Visitor<T> {
    T visit(Exp e);
    T visit(Add e);
    T visit(Lit e);
}
