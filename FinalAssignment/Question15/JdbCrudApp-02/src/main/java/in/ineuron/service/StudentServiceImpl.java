package in.ineuron.service;

import in.ineuron.daofactory.StudentDaoFactory;
import in.ineuron.dto.Student;
import in.ineuron.dao.IStudentDao;

//service layer logic
public class StudentServiceImpl implements IStudentService {

	private IStudentDao stdDao;

	

	@Override
	public Student searchStudent(Integer sid) {
		stdDao = StudentDaoFactory.getStudentDao();
		return stdDao.searchStudent(sid);
	}

	

}
