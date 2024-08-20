public class main {

    static void TestBall(Ball b, double a) {
        System.out.println(b.getTreadMark() + " is a trademark of " + b.getClass().getSimpleName());
        b.inflate(a);
        ((RollAble) b).roll();
    }

    public static void main(String[] args) throws Exception {
        Ball b1 = new BallA("Zentia");
        Ball b2 = new BallB("Zapphire");
        Ball b3 = new BallC("Zenith");

        TestBall(b1, 1.0);
        TestBall(b2, 1.1);
        TestBall(b3, 1.2);
    }
}
