public class Subtract extends Composite {
    public Subtract(Component a, Component b) {
        super(a, b);
    }

    @Override
    public double evaluate() {
        return a.evaluate() - b.evaluate();
    }
}
