import java.time.LocalDate;
import java.util.Arrays;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
Student num1 = new Student("Bomba",LocalDate.of(2005,11,21),07712121);
Student num2 = new Student("Negr",LocalDate.of(2005,11,21),07712121);
Student num3 = new Student("Bandana",LocalDate.of(2005,11,21),07712121);
Student num4 = new Student("Fireman",LocalDate.of(2005,11,21),07712121);
Student num5 = new Student("Pasiba",LocalDate.of(2005,11,21),07712121);

    Student [] students = {num1,num2,num3,num4,num5};
        System.out.printf(Arrays.toString(students));
    }

}








