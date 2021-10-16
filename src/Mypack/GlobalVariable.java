package Mypack;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;
public class GlobalVariable {
	public static void main(String[] args) throws IOException {
		Properties pro = new Properties();
		//FileInputstream - to use the read data from file
		FileInputStream fis  = new FileInputStream("C:\\Users\\hp\\eclipse-workspace\\First\\src\\Data.properties");
		pro.load(fis);
		System.out.println(pro.getProperty("browser"));
		pro.setProperty("browser", "firefox");
		System.out.println(pro.get("browser"));
		
		//FileOutputStrream - Java FileOutputStream is an output stream used for writing data to a file
		
		FileOutputStream fos  = new FileOutputStream("C:\\Users\\hp\\eclipse-workspace\\First\\src\\Data.properties");
		pro.store(fos, null);
	}

}
