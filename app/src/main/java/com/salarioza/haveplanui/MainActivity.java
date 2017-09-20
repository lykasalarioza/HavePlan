package com.salarioza.haveplanui;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void GoToNotes (View view) {
        Intent intent = new Intent(this, Notes.class);
        startActivity(intent);
    }
    public void GoToCal (View view) {
        Intent intent = new Intent(this, Calendar.class);
        startActivity(intent);
    }
    public void GoToTodo (View view){
        Intent intent = new Intent(this, Todo.class);
        startActivity(intent);
    }

}
