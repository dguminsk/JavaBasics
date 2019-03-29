package by.epam.javabasics.homework02;

public class Task34 {

	public static void main(String[] args) {
		
		double bytes = 10000000;
		
		double kbytes = bytes / 1024;
		double mbytes = kbytes / 1024;
		double gbytes = mbytes / 1024;
		double tbytes = gbytes / 1024;
		
		System.out.println(bytes + " bytes is equal to:");
		System.out.println(kbytes + " kylobytes");
		System.out.println(mbytes + " megabytes");
		System.out.println(gbytes + " gigabytes");
		System.out.println(tbytes + " terrabytes");
		

	}

}
