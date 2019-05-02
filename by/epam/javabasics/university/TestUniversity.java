package by.epam.javabasics.university;

public class TestUniversity {

	public static void main(String[] args) {
		
		
		Group group1 = new Group(1);
		Group group2 = new Group(2);
		
		Student[] students = new Student[6];
		
		students[0] = new Student("Олег", 2, 4, 3);
		students[1] = new Student("Вася", 5, 3, 4);
		students[2] = new Student("Петя", 2, 5, 2);
		students[3] = new Student("Коля", 4, 4, 3);
		students[4] = new Student("Женя", 5, 2, 5);
		students[5] = new Student("Гена", 5, 5, 5);
		
		group2.add(students[0]);
		group1.add(students[1]);
		group1.add(students[2]);
		
		group2.add(students[3]);
		group2.add(students[4]);
		group2.add(students[5]);
		
		//Средний балл группы
		System.out.println("Средний балл группы: " + group1.getGroupNumber() + " = " + group1.getAverageGroupMark());
		System.out.println("Средний балл группы: " + group2.getGroupNumber() + " = " + group2.getAverageGroupMark());
		
		//Средний балл каждого студента
		System.out.println();
		System.out.println("Средний балл студентов:");
		for(int i = 0; i < students.length; i++) {
			System.out.println(students[i].getName() + " " + students[i].getAverageMark());
		}
		
		//Число отличников
		System.out.println();
		int goodStudents = group1.countGoodStudents() + group2.countGoodStudents();
		System.out.println("Количество отличников: " + goodStudents);
				
		//Число двоешников
		System.out.println();
		int badStudents = group1.countBadStudents() + group2.countBadStudents();
		System.out.println("Количество двоешников: " + badStudents);
	}

}
