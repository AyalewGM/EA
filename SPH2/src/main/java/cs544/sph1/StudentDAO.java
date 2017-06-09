package cs544.sph1;

import java.util.ArrayList;
import java.util.Collection;
import javax.transaction.Transactional;
import org.springframework.transaction.annotation.Propagation;

public class StudentDAO {

	private Collection<Student> studentlist = new ArrayList<Student>();

	public StudentDAO() {
		Student student = new Student(11334, "Frank", "Brown");
		Course course1 = new Course(1101, "Java", "A");
		Course course2 = new Course(1102, "Math", "B-");
		student.addCourse(course1);
		student.addCourse(course2);
		studentlist.add(student);

	}
@Transactional(propagation=Propagation.MANDATORY)
	public Student load(long studentid) {
		for (Student student : studentlist) {
			if (student.getStudentid() == studentid) {
				return student;
			}
		}
		return null;
	}
}
