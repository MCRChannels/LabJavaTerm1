
public abstract class Ball {
    private String treadMark;

    public Ball(String a){
        treadMark = a;
    }

    public abstract void inflate(double a);

    public String getTreadMark() {
        return treadMark;
    }
}
