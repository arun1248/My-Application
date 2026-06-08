package com.nilan.tech.myapplication;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_screen);

        EditText email = findViewById(R.id.editTextTextEmailAddress);
        EditText password = findViewById(R.id.editTextNumberPassword);
        TextView title = findViewById(R.id.titleText);
        Button submit = findViewById(R.id.button);
        TextView forgotPassword = findViewById(R.id.forgetPasswordTxtView);
        TextView carsTxt = findViewById(R.id.carsText);

        List<String> cars = new ArrayList<>();
        cars.add("ford");
        cars.add("tesla");

        Editable emailStr = email.getText();
        var value = email.getHint().charAt(2);
        System.out.println("test: "+value);
        String emailHintStr = email.getHint().toString();
        String passwordStr = password.getText().toString();
        String titleStr = title.getText().toString();

        System.out.println("emailHintStr: "+ emailHintStr);
        System.out.println("emailStr: "+ emailStr);
        System.out.println("passwordStr: "+ passwordStr);
        System.out.println("titleStr: "+ titleStr);

        email.addTextChangedListener(new TextWatcher() {
            @Override
            public void afterTextChanged(Editable editable) {
                System.out.println("MainActivity.afterTextChanged");
                System.out.println("editable = " + editable);
                if (editable.length() < 6) {
                    email.setError("must be greater 5 letters");
                    submit.setEnabled(false);
                } else {
                    submit.setEnabled(true); // jetpack compose
                }
            }

            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
                System.out.println("MainActivity.beforeTextChanged");
                System.out.println("s = " + s + ", start = " + start + ", count = " + count + ", after = " + after);
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                System.out.println("MainActivity.onTextChanged");
                System.out.println("s = " + s + ", start = " + start + ", before = " + before + ", count = " + count);
            }
        });

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                System.out.println("MainActivity.onClick");
                String emailStr = email.getText().toString();
                String passwordStr = password.getText().toString();

                System.out.println(emailStr);
                System.out.println(passwordStr);
            }
        });

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                System.out.println("submit.onClick");
                String emailStr = email.getText().toString();
                String passwordStr = password.getText().toString();

                System.out.println(emailStr);
                System.out.println(passwordStr);

                carsTxt.setText(cars.toString());

            }
        });

        forgotPassword.setOnClickListener(view -> {
            System.out.println("forgotPassword.onClick");
        });


    }
}