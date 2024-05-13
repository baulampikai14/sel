package utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Properties pro;
		public ReadConfig()
		{
			File src=new File("./Configuration/config.properties");
			try {
				FileInputStream fis=new FileInputStream(src);
				pro=new Properties();
				pro.load(fis);
			}catch(Exception e) {
				System.out.println("Exception is" + e.getMessage());
			}
			public String getLoginURL()
			{
				String url=pro.getProperty("Complete_url");
				return url;
				
			}
			public String getUserName()
			{
				String username=pro.getProperty("UserName");
				return username;
				
			}
			public String getPassword()
			{
				String password=pro.getProperty("Password");
				return password;
			}
		}

	}

}
