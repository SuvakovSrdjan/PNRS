package com.example.student.vezbapredzad1.Login.Login;

/**
 * Created by rtrk on 21.3.17..
 */

public class LoginContact {
    public interface View {
        void proceedOnNextActivity();
        void showErrorMessage(String s);
    }

    public interface check{

        void checkText(String s);
    }
}
