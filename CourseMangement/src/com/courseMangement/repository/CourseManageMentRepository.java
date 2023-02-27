package com.courseMangement.repository;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

import com.courseMangement.dto.Admin;
import com.courseMangement.dto.Course;
import com.courseMangement.dto.Insight;
import com.courseMangement.dto.PaymentInfo;
import com.courseMangement.dto.Student;
import com.courseMangement.dto.Trainer;

public class CourseManageMentRepository {

	private static CourseManageMentRepository courseManageMentRepo;
	private List<Admin> adminList= new ArrayList<>();
	private List<Course> courseList= new ArrayList<>();
	private List<Student> studentList= new ArrayList<>();
	private List<Trainer> trainerList= new ArrayList<>();
    private List<Insight> insightList=new ArrayList<>();
    
	
	public static CourseManageMentRepository getInstance() {
		if(courseManageMentRepo==null)
		{
			courseManageMentRepo=new CourseManageMentRepository();
			courseManageMentRepo.initialSetUp();
		}
		return courseManageMentRepo;
	}

	//Method To  initial SetUp
	private void initialSetUp() {
		//Admin Initial setUp
		adminList.add(new Admin("Rajesh","Rajesh"));
		//Course Initial Setup
		//studentList.add(new Student());
		courseList.add(new Course("Java","AK",studentList,6,"2023-03-01","2023-09-01","10:30","11:30",0,5000,0));
		courseList.add(new Course("DSA","AK",studentList,5,"2023-03-01","2023-08-01","12:30","01:30",0,5000,0));
		courseList.add(new Course("UI/UX","RK",studentList,4,"2023-03-01","2023-07-01","02:30","03:30",0,5000,0));
		courseList.add(new Course("C","RK",studentList,2,"2023-03-01","2023-05-01","04:30","05:30",0,5000,0));
		courseList.add(new Course("C++","RK",studentList,6,"2023-03-01","2023-09-01","05:30","06:30",0,5000,0));
		courseList.add(new Course("C#","RK",studentList,6,"2023-03-01","2023-09-01","05:30","06:30",0,5000,0));
		
		List<Course>list=new ArrayList<>();
		list.add(new Course("Java","AK",studentList,6,"2023-03-01","2023-09-01","10:30","11:30",0,5000,0));
		List<Course>list1=new ArrayList<>();
		list.add(new Course("C","RK",studentList,2,"2023-03-01","2023-05-01","04:30","05:30",0,5000,0));
		//Student Initial setUp
		studentList.add(new Student("Rolex",9999999999L,"rolex@gmail.com",courseList));
		insightList.add(new Insight("Rolex",9999999999L,"rolex@gmail"));
		//Trainer Initial SetUp
		//String trainerName, long phoneNumber, String trainerMail, List<Course> courseList
		Trainer aktrainer=new Trainer("AK",999999899L,"ak@gmail.com",list);
		Trainer rktrainer=new Trainer("RK",999999998L,"rk@gmail.com",list1);
		
	}

	public List<Course> getCourse() {
		return courseList;
		
	}

	public boolean addUser(String name, long phoneNumber, String mail) {
			if(insightList.size()==0)
				return insightList.add(new Insight(name,phoneNumber,mail));
			else {
				for(Insight info:insightList) {
					if(info.getPhoneNumber()==phoneNumber)
						return false;
				}
			}
			return insightList.add(new Insight(name,phoneNumber,mail));
	}

	public boolean enroll(Course selectedCourse,  long phoneNumber) {
		boolean value=true;
			for(Student std:studentList) {
				if(std.getPhoneNumber()==phoneNumber)
				{
					for(Course course:std.getCourseList()) {
						if(course.getCourseId().equals(selectedCourse.getCourseId()))
							return false;
					}
					value=false;
					std.getCourseList().add(selectedCourse);
					//Adding Student In Cousre Student List
					selectedCourse.getStudentList().add(std);
					selectedCourse.setAmountCollected(selectedCourse.getAmountCollected()+selectedCourse.getCourseFee());
					selectedCourse.setNumberOfStudents(selectedCourse.getNumberOfStudents()+1);
					PaymentInfo.getStudentList().add(std);
					return true;
				}
			}
		if(value) {
			for(Insight insight:insightList) {
				if(insight.getPhoneNumber()==phoneNumber) {
					 long phNumber=insight.getPhoneNumber();
					  String name=insight.getUserName();
					  String mail=insight.getMailId();
					  List<Course>list=new ArrayList<>();
					  list.add(selectedCourse);
	                 //Adding New Student In Student List
					  studentList.add(new Student(name,phoneNumber,mail,list));
					//Adding Student In Cousre Student List
					  selectedCourse.getStudentList().add(new Student(name,phoneNumber,mail,list));
					  selectedCourse.setAmountCollected(selectedCourse.getAmountCollected()+selectedCourse.getCourseFee());
					  selectedCourse.setNumberOfStudents(selectedCourse.getNumberOfStudents()+1);
					  //PaymentInfo.setStudentList(PaymentInfo.getStudentList().add(new Student(name,phoneNumber,mail,list)));
					  //getStudentList().add(new Student(name,phoneNumber,mail,list));
					  PaymentInfo.getStudentList().add(new Student(name,phoneNumber,mail,list));
					  return true;
				}
			}
			
		}
		return value;
			
	}

	public List<Course> cancel(long phoneNumber) {
		List<Student> studentList=PaymentInfo.getStudentList();
		for(Student std:studentList) {
			if(std.getPhoneNumber()==phoneNumber)
				return std.getCourseList();
		}
		return courseList;
	}

	public boolean cancelCours(Course cours, long phoneNumber) {
		List<Student> studentList=cours.getStudentList();
		for(Student student:studentList) {
			if(student.getPhoneNumber()==phoneNumber)
			{
				cours.getStudentList().remove(student);
				student.getCourseList().remove(cours);
				cours.setAmountCollected(cours.getAmountCollected()-cours.getCourseFee());
				cours.setNumberOfStudents(cours.getNumberOfStudents()-1);
				return true;
			}
		}
		return false;
	}

	//Method To Check Admin User Credentials
	public boolean checkAdmin(String username, String password) {
		if(adminList.get(0).getPassword().equals(password)&&adminList.get(0).getUserName().equals(username))
			return true;
		return false;
	}

	//Method To Adding New Course In Repository
	public boolean addCourse(String courseName, String trainerName, List<Student> studentList2, int duration,
			String startDate, String endDate, String startTime, String endTime, int numberOfStudents, int courseFee,
			int amountCollected) {
		//Iteration To Check Whether Given Couse Already Exsist At same Time and Date
		for(Course cours:courseList) {
			if(cours.getCourseName().equals(courseName)) {
				if(cours.getStartDate().equals(startDate)) {
					if(cours.getEndDate().equals(endDate)) {
						return false;
					}
				}
			}
		}
		return courseList.add(new Course(courseName,trainerName,studentList,duration,startDate,endDate,startTime,endTime,numberOfStudents,courseFee,amountCollected));
		
	}

	//Method To Removing The Course
	public boolean removeCourse(String courseName) {
		for(Course cours:courseList) {
			if(cours.getCourseName().equals(courseName))
			{
				courseList.remove(cours);
				for(Student student:cours.getStudentList()) {
					student.getCourseList().remove(cours);
				}
				return true;
			}
		}
		return false;
	}
	
}
