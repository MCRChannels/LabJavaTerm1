
public class BallB extends BallA {

    public BallB(String a) {
        super(a);
    }
    
    public void roll() {
        
        System.out.println(super.getTreadMark()+" rolls smoothly.");
    }

    public void inflate(double a) {

        System.out.println(super.getTreadMark()+"'s ball is inflated "+a+" cu.ft.");
    }
}
