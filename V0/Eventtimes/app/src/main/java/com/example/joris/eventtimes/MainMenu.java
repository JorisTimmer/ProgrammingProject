package com.example.joris.eventtimes;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;

public class MainMenu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);
    }

    public void toAllEvents(View view) {
        // Do something in response to button
        Intent intent = new Intent(this, AllEvents.class);
        startActivity(intent);
    }

    public void toPersonalRecords(View view) {
        // Do something in response to button
        Intent intent = new Intent(this, PeronalRecords.class);
        startActivity(intent);
    }
}
