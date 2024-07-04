package ch14.collection.properties;

import java.io.FileReader;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.Properties;

public class JDBCExam {

	public static void main(String[] args) throws Exception {
		// properties is converting java code k, v type into text document 
		
		Properties properties = new Properties();
		String path = JDBCExam.class.getResource("jdbc.properties").getPath();
		// file location info into path variables
		System.out.println(path);
		path = URLDecoder.decode(path, "utf-8");
		// it can be korean -> utf- 8 file
		properties.load(new FileReader(path));
		//summon by properties
		
		String driver = properties.getProperty("driver");
		System.out.println("oracle driver : " + driver);
		

	}

}
