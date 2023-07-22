package yz.li;

public class Main {

    private static Exp testcase() {
        // (1+2) + (3+4)
        return new Add(
                new Add(new Lit(1), new Lit(2)),
                new Add(new Lit(3), new Lit(4)));
    }

    public static void main(String[] args) {
        Exp e = testcase();
        EvalVisitor evaluator = new EvalVisitor();
        System.out.println(e.accept(evaluator));
    }
}
