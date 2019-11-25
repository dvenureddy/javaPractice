package basics.conceptOfDay;

import java.io.File;

public class user {

	public static void main(String[] args) {
		String fileName = "SampleExcel";
		// 
		String home = System.getProperty("user.home");
		File file = new File(home+"/Downloads/" + fileName + ".txt");
		System.out.println("Path is : " + home);
	}

}
