package student;

public class School {
	public static void main(String[] args) {
		Student student1 = new Student();
		
		student1.java = 99;
		student1.python = 78;
		student1.cpp = 89;
		student1.csharp = 100;
		
		System.out.println(student1.getSumAllScores());
		System.out.println(student1.getAverage());
		System.out.println(student1.getCourseCredit());
		System.out.println(student1.getABCDE());
		
		
	}
}
