package cs544.sph1;

public class StudentService {
	private StudentDAO studentDAO;

	
        public StudentService(StudentDAO studentDAO){
            this.studentDAO=studentDAO;
        }
        
        public StudentService() {
		//studentdao = new StudentDAO();
	}

	public Student getStudent(long studentid) {
		return studentDAO.load(studentid);
	}
}
