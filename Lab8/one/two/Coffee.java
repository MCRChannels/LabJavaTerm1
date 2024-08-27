package two;

public class Coffee extends Product{
    
    public Coffee(double price) {
        super(price);   
    }
    
    public String toString() {
        
        return this.getClass().getSimpleName()+"   "+this.getWeight()+"\tgrum";
    }
}
