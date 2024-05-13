package testcases;

import utilities.ReadConfig;

public class LoginTestCases {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReadConfig readconfig=new ReadConfig();
		public String baseurl=readconfig.getApplicationURL();
		public String username=readconfig.getUserName();
		public String password=readconfig.getPassword();
		setLoginButton.click();
		CustUserName.Sendkeys(username);
		CustPassword.Sendkeys(password);

	}

}
