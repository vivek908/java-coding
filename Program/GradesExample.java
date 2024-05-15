
import java.util.*;

class Person{
    String name;
    String grade;
    
    public Person(String name, String grade) {
        this.name=name;
        this.grade=grade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Person [name=" + name + ", grade=" + grade + "]";
    }
}
public class GradesExample {
    public static void main(String[] args) {
        List<Person> student=new ArrayList<>();
        student.add(new Person("Aima", "A"));
        student.add(new Person("Arjun", "A+"));
        student.add(new Person("Iram", "B+"));
        student.add(new Person("Zia", "C"));
        student.add(new Person("Reah", "B"));
        student.add(new Person("Karan", "A"));
        student.add(new Person("Mithum", "B"));
        student.add(new Person("Ankur", "B+"));

        // List<Person> sortedPepleDescendingorder=student.stream()
        // .sorted(Comparator.comparing(Person::getName).reversed())
        // .collect(Collectors.toList());
        student.sort(Comparator.comparing(Person::getName));

        student.forEach(System.out::println);
        

    }
}
