package com.zaksontech.alcproject1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void OpenAlc(View view) {
        Intent intent = new Intent(this, AboutAlcActivity.class);
        startActivity(intent);
    }

    public void OpenAboutMe(View view) {
        Intent intent = new Intent(this, AboutMeActivity.class);
        startActivity(intent);
    }
}
