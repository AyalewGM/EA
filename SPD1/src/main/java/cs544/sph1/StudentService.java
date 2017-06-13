package cs544.sph1;

public class StudentService {
	private StudentDao studentDAO;

	
        public StudentService(StudentDao studentDAO){
            this.studentDAO=studentDAO;
        }
        
        public StudentService() {
		//studentdao = new StudentDAO();
	}

	public Student getStudent(long studentid) {
		return studentDAO.findOne(studentid);
	}
}
