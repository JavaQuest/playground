package studyJava.sangwook.dataStructure.collection.queue.priorityqueue;

import java.util.Comparator;

public class Student {
    int mathScore;
    int engScore;

    public Student(int mathScore, int engScore) {
        this.mathScore = mathScore;
        this.engScore = engScore;
    }

    @Override
    public String toString() {
        return "Student{" +
                "mathScore=" + mathScore +
                ", engScore=" + engScore +
                '}';
    }
}

class StudentComparator implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        //o1과 o2의 수학점수가 같은 경우
        if (o1.mathScore == o2.mathScore) {
            //영어점수로 비교
            return o1.engScore - o2.engScore;
        } else {
            return o1.mathScore - o2.mathScore;
        }
    }
}
