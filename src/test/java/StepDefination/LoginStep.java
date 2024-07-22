package StepDefination;

import java.util.List;

import BaseLayer.BaseClass;
import PageLayer.LoginPage;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStep extends BaseClass {
	public static LoginPage loginpage;

	@When("User is on login Page")
	public void user_is_on_login_page() {
		BaseClass.initialization();
	}

	@Then("Enter UserName and Password")
	public void enter_user_name_and_password(DataTable dataTable) {

		List<List<String>> list = dataTable.asLists();
		String Username = list.get(0).get(0);
		String Password = list.get(0).get(1);
		loginpage = new LoginPage();
		loginpage.loginFunctionality(Username, Password);

	}

	@Then("click on login button")
	public void click_on_login_button() {
		loginpage.clickFunctionality();

	}

}
