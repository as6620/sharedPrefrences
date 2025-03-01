package com.example.sharedprefrences;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    EditText eT;
    TextView tVNum;
    int counter = 0;
    SharedPreferences settings;
    SharedPreferences.Editor editor;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText eT = (EditText) findViewById(R.id.eT);
        TextView tVNum = (TextView) findViewById(R.id.tVNum);

        settings = getSharedPreferences("PREFS_NAME",MODE_PRIVATE);
        settings.edit();


    }

    public void goCount(View view) {
        counter++;
        tVNum.setText(""+counter);
    }

    public void goReset(View view) {
        counter = 0;
        tVNum.setText(""+counter);
    }

    public void goExit(View view) {
        editor.putString("text",eT.getText().toString());
        editor.putInt("count",counter);
        editor.commit();
        finish();
    }
}