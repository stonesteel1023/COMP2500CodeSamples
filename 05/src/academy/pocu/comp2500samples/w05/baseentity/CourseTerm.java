package academy.pocu.comp2500samples.w05.baseentity;

import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.UUID;

public class CourseTerm extends BaseEntity {
    private int term;
    private Course course;
    private ArrayList<User> students;

    public CourseTerm(UUID id,
                      OffsetDateTime createdDateTime,
                      OffsetDateTime modifiedDateTime,
                      int term) {
        super(id, createdDateTime, modifiedDateTime);
        this.term = term;
        this.students = new ArrayList<>();
    }

    public int getTerm() {
        return this.term;
    }

    public Course getCourse() {
        return this.course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public ArrayList<User> getStudents() {
        return this.students;
    }

    public void setStudents(ArrayList<User> students) {
        this.students = students;
    }

    // helper methods
    public void addStudent(User user) {
        this.students.add(user);
    }

    public int getStudentCount() {
        return this.students.size();
    }
}