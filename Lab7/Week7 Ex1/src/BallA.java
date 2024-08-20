
public class BallA extends Ball implements RollAble {

    public BallA(String a) {
        super(a);
    }

    public void roll() {
        System.out.println(super.getTreadMark() + " rolls rather smoothly.");
    }
    
    public void inflate(double a) {

        System.out.println(super.getTreadMark() + "'s ball is inflated " + a + " cu.ft.");
    }
}
