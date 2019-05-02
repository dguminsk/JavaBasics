package by.epam.javabasics.university;

import java.util.ArrayList;
import java.util.List;

public class Group {
	
	private List<Student> group = new ArrayList<Student>();
	private int groupNumber;
	
	public Group(int num) {
		groupNumber = num;
	}
	
	public void add(Student student) {
		group.add(student);
		
	}
	
	public int getGroupNumber() {
		return groupNumber;
	}
	
	public int countBadStudents() {
		
		int counter = 0;
		
		for(int i = 0; i < group.size(); i++){
			
			Student student = group.get(i);
			if(student.isBadStudent()) {
				counter += 1;
			}
		}
		return counter;
	}
	
	public int countGoodStudents() {
		
		int counter = 0;
		
		for(int i = 0; i < group.size(); i++){
			
			Student student = group.get(i);
			if(student.isGoodStudent()) {
				counter += 1;
			}
		}
		return counter;
	}
	
	
	
	public double getAverageGroupMark() {
		
		double mark = 0;
		for(int i = 0; i < group.size(); i++){
			Student student = group.get(i);
			mark += student.getAverageMark();
		}
		
		mark = mark / group.size();
		
		return mark;

	}
	
}
