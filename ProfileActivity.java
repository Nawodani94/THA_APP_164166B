package com.example.tha_app_164166b;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ProfileActivity extends Activity {
    TextView tvName, tvIndex, tvEmail, tvMobile, tvGPA;
    Button btnExit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        tvName = (TextView) findViewById(R.id.et_name);
        tvIndex = (TextView) findViewById(R.id.et_index);
        tvEmail = (TextView) findViewById(R.id.et_email);
        tvMobile = (TextView) findViewById(R.id.et_mobile);
        tvGPA = (TextView) findViewById(R.id.et_gpa);
        btnExit = (Button) findViewById(R.id.btn_exit);

        Intent intent = getIntent();

        tvName.setText(intent.getStringExtra("name"));
        tvIndex.setText(intent.getStringExtra("index"));
        tvEmail.setText(intent.getStringExtra("email"));
        tvMobile.setText(intent.getStringExtra("mobile"));
        tvGPA.setText(intent.getStringExtra("gpa"));

        btnExit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}
