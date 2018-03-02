package com.example.a21651702.nachojimenezef;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;



public class LoginActivity extends AppCompatActivity {

    TextView tvTitulo;
    Button btnSingIn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        getSupportActionBar().hide();

        tvTitulo = (TextView) findViewById(R.id.tvTitulo);
        btnSingIn = (Button) findViewById(R.id.btnSignIn);

        Typeface myFont = Typeface.createFromAsset(getAssets(), "Nettizen_TRIAL.ttf");
        tvTitulo.setTypeface(myFont);

        btnSingIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(LoginActivity.this, MainActivity.class);
                startActivity(i);

            }
        });


    }
}
