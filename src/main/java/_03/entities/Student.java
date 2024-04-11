package _03.entities;

import javax.persistence.*;
import java.util.Set;

@Entity(name = "_03_students")
public class Student extends Person{
    @Column(name = "average_grade", nullable = false)
  private float averageGrade;

  private int attendance;
@ManyToMany
@JoinTable(

        name = "student_courese",
        joinColumns = @JoinColumn(name= "student_id", referencedColumnName = "id"),
        inverseJoinColumns = @JoinColumn(name = "courses_id", referencedColumnName = "id")
)
  private Set<Course> courses;

    public Student() {
        super();
    }

    public Student(String firsName, String lastName, String phoneNumber, float averageGrade, int attendance) {
        super(firsName, lastName, phoneNumber);
        this.averageGrade = averageGrade;
        this.attendance = attendance;
    }

    public float getAverageGrade() {
        return averageGrade;
    }

    public void setAverageGrade(float averageGrade) {
        this.averageGrade = averageGrade;
    }

    public int getAttendance() {
        return attendance;
    }

    public void setAttendance(int attendance) {
        this.attendance = attendance;
    }
}
