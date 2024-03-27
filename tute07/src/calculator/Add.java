public class Add extends Composite {
    public Add(Component a, Component b) {
        super(a, b);
    }

    @Override
    public double evaluate() {
        return a.evaluate() + b.evaluate();
    }
}
