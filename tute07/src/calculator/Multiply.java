public class Multiply extends Composite {
    public Multiply(Component a, Component b) {
        super(a, b);
    }

    @Override
    public double evaluate() {
        return a.evaluate() * b.evaluate();
    }

    public static void main(String[] args) {
        double val = new Add(new Value(5), new Value(5)).evaluate();
        System.out.println(val);

        double val2= new Add(new Multiply(new Value(5), new Value(5)), new Value(5)).evaluate();
        System.out.println(val2);
    }
}
