package kr.ac.hansung.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.ac.hansung.dao.StudentDAO;
import kr.ac.hansung.model.Student;

@Service
public class StudentService {

	private StudentDAO studentDao;

	@Autowired
	public void setOfferDao(StudentDAO studentDao) {
		this.studentDao = studentDao;
	}
//----------------------------------------------------
//1.�б⺰ �̼� ���� ��ȸ
	public List<Student> getCurrent() {
		return studentDao.getStudents();
	}

	// �б⺰ �̼� ���� ��ȸ���� �󼼺��� ������ ������ list...
	public List<Student> getCurrent2(int year, int semester) {
		List<Student> student=studentDao.getStudents2(year, semester);
		return student;
	}

//-----------------------------------------------------
//2.�̼� ���к� ������������.
	public List<Student> getCount3() {
		int sum = 0;
		List<Student> student3 = studentDao.getCounts3();
		for (Student tt : student3) {
			sum += tt.getCredit();
		}
		Student creditsum = new Student();
		creditsum.setClassify("���հ�");
		creditsum.setCredit(sum);

		student3.add(creditsum);
		return student3;
	}
	
//-----------------------------------------------------
	//3. 2017�⵵ 1�б� ���� ��û�ϴ� ��� insert
	public void insert(Student student) {
		studentDao.insert(student);
	}
	
//-----------------------------------------------------
	//4. ���� ��û ��ȸ �޴�.
	public List<Student> getregisterstudent() {
		return studentDao.getregisterstudent();
	}

}
