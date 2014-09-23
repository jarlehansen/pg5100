package no.nith.pg5100.many_to_many;

import javax.persistence.*;
import java.util.List;

@Entity
public class Course {
    @Id
    private int id;
    private String title;


    // joinColums, name of column for Course foreign key
    // inverseJoinColumns, name of column for Student foreign key
    @ManyToMany
    @JoinTable(name = "student_courses", joinColumns = @JoinColumn(name = "fk_course"), inverseJoinColumns = @JoinColumn(name = "fk_student"))
    private List<Student> students;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }
}
