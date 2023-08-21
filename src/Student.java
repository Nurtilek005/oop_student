import java.time.LocalDate;

public class Student {
    private String Name;
    private LocalDate date;
    private int phone_number;

    public Student() {
    }

    public Student(String name, LocalDate date, int phone_number) {
        Name = name;
        this.date = date;
        this.phone_number = phone_number;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public int getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(int phone_number) {
        this.phone_number = phone_number;
    }

    @Override
    public String toString() {
        return "Student{" +
                "Name='" + Name + '\'' +
                ", date=" + date +
                ", phone_number=" + phone_number +
                '}';
    }
}
