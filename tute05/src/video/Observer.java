package video;

public interface Observer {
    public abstract void update(Observable o);
    public abstract void subscribe(Observable o);
}
