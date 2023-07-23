package yz.li;

public interface MulAlgebra<T> extends Algebra<T>{
    T mul(T lhs, T rhs);
}
