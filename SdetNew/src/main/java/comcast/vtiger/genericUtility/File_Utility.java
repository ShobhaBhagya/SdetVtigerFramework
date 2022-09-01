package comcast.vtiger.genericUtility;

import java.io.FileInputStream;
import java.util.Properties;

public class File_Utility {
	
	/**
	 * This method is used to fetch the data from property file
	 * @param Key
	 * @return
	 * @throws Throwable
	 * @author Bhargavi
	 */
	
	public String getPropertyKeyValue(String Key) throws Throwable
	{
		FileInputStream fis = new FileInputStream("./data/Commondata.properties");
		Properties pobj= new Properties();
		pobj.load(fis);
		String value=pobj.getProperty(Key);
    return value;

}
}
