package com.hrms.lib;
import org.openqa.selenium.WebDriver;

public class Global {
	public    WebDriver driver;
	//----------Test Data & Objects related to whole application
	//=======Test Data
	// DT Var VV --
	public String url = "http://183.82.103.245/nareshit/login.php";
	public String un = "nareshit";
	public String pw = "nareshit";
	public String efn = "selenium";
	public String eln = "suresh";
	//=======Objects/elements
	public String txt_loginname = "txtUserName";
	public String txt_password = "txtPassword";
	public String btn_login = "Submit";
	public String link_logout = "Logout";
	public String frm_empinfo = "rightMenu";
	public String btn_add = "//input[@value='Add']";
	public String txt_efn = "txtEmpFirstName";
	public String txt_eln = "txtEmpLastName";
	public String btn_save = "btnEdit";
	}

