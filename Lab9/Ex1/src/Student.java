public class Student extends Exception {
    String name, grade;

    public Student(String name, String grade) {
        this.name = name;
        this.grade = grade;
    }

    public void show() {
        try {
            validate(name, grade);

            double sum = 0, credit = 0;
            for (int i = 0; i < grade.length(); i++) {
                credit += 3;

                // Technique from Teacher
                // int x = ('F' - grade.charAt(i)) > 0 ? ('F' - grade.charAt(i)) - 1 : 0;
                // sum = sum + (3*x);

                switch (grade.charAt(i)) {
                    case 'A':
                        sum = sum + (4 * 3);
                        break;
                    case 'B':
                        sum = sum + (3 * 3);
                        break;
                    case 'C':
                        sum = sum + (2 * 3);
                        break;
                    case 'D':
                        sum = sum + (1 * 3);
                        break;
                    case 'F':
                        sum = sum + (0 * 3);
                        break;
                    default:
                        break;
                }
            }
            System.out.println(name + " registered " +grade.length()+ " and got GPA : " + sum / credit);
        } catch (IncompleteException | SpaceException | GradeException | DigitException e) {
            System.out.println(e.getClass().getSimpleName() +": "+ e.getMessage());
        } 
    }

    public void validate(String a, String b)
            throws IncompleteException, SpaceException, GradeException, DigitException {
        for (char s : grade.toCharArray()) {
            if (s == 'I') {
                throw new IncompleteException("(grade I is incomplete) cannot display.");
            } else if (!(s == 'A' || s == 'B' || s == 'C' || s == 'D' || s == 'F')) {
                throw new GradeException("(grade must be A B C D E F) cannot display.");
            }
        }

        for (char s : name.toCharArray()) {
            if (s == ' ') {
                throw new SpaceException("(space is not allowed in name) cannot display.");
            } else if (s == '0' || s == '1' || s == '2' || s == '3' || s == '4' || s == '5' || s == '6' || s == '7'
                    || s == '8' || s == '9') {
                throw new DigitException("(digit is not allowed in name) cannot display.");
            }
        }

    }

}