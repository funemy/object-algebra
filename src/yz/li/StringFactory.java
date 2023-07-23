package yz.li;

public class StringFactory implements Algebra<IString> {
    @Override
    public IString add(IString lhs, IString rhs) {
        return () -> lhs.stringify() + "+" + rhs.stringify();
    }

    @Override
    public IString lit(int x) {
        return () -> Integer.toString(x);
    }
}
