
public class Value implements Component {
    private double v;
    
    public Value(double v) {
        this.v = v;
    }

    @Override
    public double evaluate() {
        return v;
    }
}
