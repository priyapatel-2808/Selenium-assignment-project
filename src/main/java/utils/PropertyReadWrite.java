package utils;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class PropertyReadWrite {
	
	

	public static String readProperty(String filePath,String propertyName) throws IOException {
		File file=new File(filePath);
		BufferedReader brVal=new BufferedReader(new FileReader(file));
		String line= brVal.readLine();
		while(line!=null) {
			System.out.println(line);
			String[] lineSplit=line.split("=");
			String pName= lineSplit[0];
			String pValue = lineSplit[1];
			if(pName.equals(propertyName)) {
				return pValue;
			}
			line=brVal.readLine();			
		}
		return "";
	}
}
