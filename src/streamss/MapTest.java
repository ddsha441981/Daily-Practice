package streamss;

import java.util.*;
import java.util.stream.Collectors;

enum Subjects{
    MATH,SCIENCE,COMPUTER,HISTORY,ENGLISH
        }

class Student{
    String name;
    int marks;
    Subjects subjects;

    //Constructor
    public Student(String name, int marks, Subjects subjects) {
        this.name = name;
        this.marks = marks;
        this.subjects = subjects;
    }

    //getter

    public String getName() {
        return name;
    }

    public int getMarks() {
        return marks;
    }

    public Subjects getSubjects() {
        return subjects;
    }
}

public class MapTest {
    public static void main(String[] args){
        List<Student> stdList = Arrays.asList(
                new Student("AAA",45, Subjects.COMPUTER),
                new Student("BBB",55, Subjects.HISTORY),
                new Student("CCC",65, Subjects.COMPUTER),
                new Student("DDD",40, Subjects.COMPUTER),
                new Student("EEE",30, Subjects.SCIENCE),
                new Student("FFF",78, Subjects.ENGLISH),
                new Student("GGG",90, Subjects.MATH)
        );
        System.out.println(
        stdList.stream().collect(Collectors.toMap(Student::getName, Student::getSubjects))
        );

        List<Student> stdList1 = Arrays.asList(
                new Student("AAA",45, Subjects.COMPUTER),
                new Student("BBB",55, Subjects.HISTORY),
                new Student("GGG",65, Subjects.COMPUTER),
                new Student("DDD",40, Subjects.COMPUTER),
                new Student("AAA",30, Subjects.SCIENCE),
                new Student("FFF",78, Subjects.ENGLISH),
                new Student("GGG",90, Subjects.MATH)
        );

        Map<String,List<Subjects>> map = new HashMap();
        stdList1.stream().forEach(st -> {
            map.computeIfAbsent(st.getName(),x -> new ArrayList<Subjects> ())
            .add(st.getSubjects());
        });
        System.out.println(map);
    }
}
