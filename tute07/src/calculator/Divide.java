public class Divide extends Composite {
    public Divide(Component a, Component b) {
        super(a, b);
    }

    @Override
    public double evaluate() {
        return a.evaluate() / b.evaluate();
    }
}
