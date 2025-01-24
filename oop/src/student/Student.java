package student;

public class Student {
	int java;
	int python;
	int cpp;
	int csharp;

	public int getSumAllScores() {
		return java+python+cpp+csharp;
	}
	
	// 소수점 n자리까지
	// (int) (타겟x10^n) / 10^n
	public double getAverage() {
		int averageResult = (int) (getSumAllScores()/4.0*100);
		return averageResult/100.0;
	}
	
	public double getCourseCredit() {
		int creditResult = (int) ((getAverage()-55)/10.0*100);
		return creditResult/100.0;
	}
	
	public String getABCDE() {
		double creditResult = getCourseCredit();
		String grade;
		if(creditResult>=4.1) {
			grade = "A+";
		}
		else if(creditResult>=3.6) {
			grade = "A";
		}
		else if(creditResult>=3.1) {
			grade = "B+";
		}
		else if(creditResult>=2.6) {
			grade = "B";
		}
		else if(creditResult>=1.6) {
			grade = "C";
		}
		else if(creditResult>=0.6) {
			grade = "D";
		}
		else {
			grade = "F";
		}
		return grade;
	}
}
