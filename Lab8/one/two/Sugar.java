package two;
public class Sugar extends Product{
    
    public Sugar(double price) {
        super(price); 
    } 
    public String toString() {
        
        return this.getClass().getSimpleName()+"   "+this.getWeight()+"\tgrum";
    }
}


