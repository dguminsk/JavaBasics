package by.epam.javabasics.university;

public class Student {
	
	private String studentName;
	
	private int studentMark1;
	private int studentMark2;
	private int studentMark3;
	
	public Student(String name, int mark1, int mark2, int mark3) {
		
		studentName = name;
		studentMark1 = mark1;
		studentMark2 = mark2;
		studentMark3 = mark3;
		
	}
	
	
	public String getName() {
		
		return studentName;
		
	}
	
	public int[] getMarks() {
		
		int[] marks = new int[]{studentMark1, studentMark2, studentMark3};
		return marks;
		
	}
	
	public double getAverageMark() {
		
		double averageMark = ((double)studentMark1 + (double)studentMark2 + (double)studentMark3) / 3;
		return averageMark;
		
	}
	
	public boolean isGoodStudent() {
		if(studentMark1 == 5 && studentMark2 == 5 && studentMark3 == 5) {
			return true;
		} else {
			return false;
		}
	}
	
	public boolean isBadStudent() {
		if(studentMark1 == 2 || studentMark2 == 2 || studentMark3 == 2) {
			return true;
		} else {
			return false;
		}
	}

}
