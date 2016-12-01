package kr.ac.hansung.model;

public class Student {
	// id , �����⵵, �б�, �����ڵ� , �������, ����, ����.

	private int id;
	private int year; // �⵵
	private int semester; // �б�
	private String subjectCode; // �����ڵ�
	private String subjectName; // �����
	private String classify; // �̼� ���к� ����
	private int credit; // ����

	public Student() {

	}

	public Student(int year, int semester, String subjectCode, String subjectName, String classify, int credit) {
		super();
		this.year = year;
		this.semester = semester;
		this.subjectCode = subjectCode;
		this.subjectName = subjectName;
		this.classify = classify;
		this.credit = credit;
	}

	public Student(int id, int year, int semester, String subjectCode, String subjectName, String classify,
			int credit) {
		super();
		this.id = id;
		this.year = year;
		this.semester = semester;
		this.subjectCode = subjectCode;
		this.subjectName = subjectName;
		this.classify = classify;
		this.credit = credit;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getSemester() {
		return semester;
	}

	public void setSemester(int semester) {
		this.semester = semester;
	}

	public String getSubjectCode() {
		return subjectCode;
	}

	public void setSubjectCode(String subjectCode) {
		this.subjectCode = subjectCode;
	}

	public String getSubjectName() {
		return subjectName;
	}

	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}

	public String getClassify() {
		return classify;
	}

	public void setClassify(String classify) {
		this.classify = classify;
	}

	public int getCredit() {
		return credit;
	}

	public void setCredit(int credit) {
		this.credit = credit;
	}

}
