public class BallC extends BallA {
    
    public BallC(String a){
        super(a);
    }

    public void roll() {

        System.out.println(super.getTreadMark()+" rolls very smoothly.");
    }

    public void inflate(double a) {
            
        System.out.println(super.getTreadMark()+"'s ball is inflated "+a+" cu.ft.");
    }
}
