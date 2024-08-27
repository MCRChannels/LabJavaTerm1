package two1;

import java.util.Iterator;

public class Lamdamain2 {
    public static void main(String[] args) {

        for (Iterator iter = ((Containers) () -> {
            String[] name = { "John", "May", "Ryan" };

            return new Iterator() {
                int index = 0;

                public boolean hasNext() {
                    if (index < name.length)
                        return true;
                    return false;
                }

                public Object next() {
                    return name[index++];
                }

            };
        }).getIterator();iter.hasNext();) {
            String name = (String) iter.next();
            System.out.println("Name : " + name);

        }
    }
}
