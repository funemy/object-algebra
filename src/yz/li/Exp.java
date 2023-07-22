package yz.li;

public interface Exp {
    <T> T accept(Visitor<T> visitor);
}
