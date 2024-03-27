public abstract class Composite implements Component {
    protected Component a;
    protected Component b;
    
    public Composite(Component a, Component b) {
        this.a = a;
        this.b = b;
    }
}
