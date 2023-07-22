package yz.li;

public interface Visitor<T> {
    T visit(Add e);
    T visit(Lit e);
}
