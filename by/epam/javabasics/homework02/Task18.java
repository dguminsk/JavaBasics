package by.epam.javabasics.homework02;

public class Task18 {

	public static void main(String[] args) {

		double dlina = 4;
		
		double ploshad_grani = dlina * dlina;
		double ploshad_poverhnosti = ploshad_grani * 6;
		double objem = Math.pow(dlina, 3);
		
		System.out.println("������� �����: " + ploshad_grani);
		System.out.println("������� �����������: " + ploshad_poverhnosti);
		System.out.println("�����: " + objem);

	}

}
