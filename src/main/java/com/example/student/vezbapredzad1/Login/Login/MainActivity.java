package com.example.student.vezbapredzad1.Login.Login;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.student.vezbapredzad1.R;
import com.example.student.vezbapredzad1.Login.calculator.CalculatorActivity;



public class MainActivity extends AppCompatActivity implements LoginContact.View {

    LoginPresenter presenter;
    Button btn;
    EditText username;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    private  void  initViews(){
        btn = (Button) findViewById(R.id.btn);
        username = (EditText) findViewById(R.id.uname);
    }

    private void initializeListeners(){

        btn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {

                if (username.getText() != null) {
                    presenter.checkText(username.getText().toString());
                }
            }
        });
    }

    @Override
    public void proceedOnNextActivity(){
        Intent intent = new Intent(MainActivity.this, CalculatorActivity.class);
        startActivity(intent);
        finish();
    }

    @Override
    public void showErrorMessage(String s){
        Toast.makeText(this,s,Toast.LENGTH_LONG).show();
    }

}
