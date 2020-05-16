package com.rachit2525.snapchatclone;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ChooseLoginRegistrationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_login_registration);

        Button mlogin=findViewById(R.id.login);
        Button mregistration=findViewById(R.id.registration);

        mlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =  new Intent(getApplication(),LoginActivity.class);
                startActivity(intent);
                return;
            }
        });
        mregistration.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =  new Intent(getApplication(),RegistrationActivity.class);
                startActivity(intent);
                return;
            }
        });
    }
}
