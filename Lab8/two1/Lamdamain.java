package two1;

import java.util.Iterator;

public class Lamdamain {
    public static void main(String[] args) {

        Containers namesRepository = ()-> {
            String[] name = { "John", "May", "Ryan" };
                
                return new Iterator() {
                    int index = 0;

                    public boolean hasNext() {
                        if (index < name.length) return true;
                        return false;
                    }

                    public Object next() {
                        return name[index++];
                    }
                    
                };
        };

        
        
        for (Iterator iter = namesRepository.getIterator(); iter.hasNext();){
                String name = (String) iter.next();
                System.out.println("Name : "+name);

        }
    }
}
