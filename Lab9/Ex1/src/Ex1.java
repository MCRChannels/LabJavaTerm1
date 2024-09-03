public class Ex1 {
    public static void main(String[] args){
        int num[] = {1,2,3,4};

        try {
            System.out.println(num[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
        }

        for(int i = 0 ; i < num.length ; i++){
             System.out.println(num[i]);
        }

    }
}
