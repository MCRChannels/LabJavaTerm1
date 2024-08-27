package two;

public class Cashier{
    private double total ;
    private Card card;
    private InventoryCart ic;
    

    public void printReceipt(){
    	System.out.printf("CARD TYPE : %s\n",this.card.type());
    	System.out.printf("CARD NUMBER:xxx-xxx-5555\n");
        System.out.println("-------------------------");
        System.out.println("Pumpkin Shop");
        
        Product[] products = ic.getAll();
        boolean[] productCount = new boolean[products.length];//กำหนดค่าให้เท่า 
        double total = 0;

        for(int i=0; i < products.length; i++) {
            int count = 0;
            for(int j=i; j< products.length;j++) {
                if(products[i].getClass().getSimpleName() == products[j].getClass().getSimpleName() && !productCount[j]) {
                    count++;
                    productCount[j] = true;
                }

            }

            if(count != 0 && products[i] != null) {
                System.out.println(count + " x " + products[i] + "\t" + products[i].getPrice() * count);
                total += products[i].getPrice() * count;
            }
        }
        System.out.println("-------------------------");
        System.out.printf("CARD DISCOUNT %.1f",this.card.discount());
        System.out.print("%\n");
        total = total - (total * this.card.discount() / 100);
        System.out.printf("Total\t  %.1f",total);
        ((SavingAccount.DebitCard) card).withdraw(total);
        
    }
    
    public void doPayment(InventoryCart ic,Card card) {
    	this.ic = ic;
    	this.card = card;
    	
    }
}