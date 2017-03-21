package com.example.student.vezbapredzad1.Login.Login;

/**
 * Created by rtrk on 21.3.17..
 */

public class LoginPresenter implements LoginContact.check {
    LoginContact.View view;

    public LoginPresenter(LoginContact.View view) {
        this.view = view;
    }

    @Override
    public void checkText(String username) {
        if (username.equalsIgnoreCase("Srdjan")) {
            view.proceedOnNextActivity();
        } else

        {
            view.showErrorMessage("Noperuni, wrong user!");
        }
    }
}
