package yz.li;

public interface Algebra<T> {
    T add(T lhs, T rhs);
    T lit(int x);
}
