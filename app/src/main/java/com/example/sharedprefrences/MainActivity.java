package com.example.sharedprefrences;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    EditText eT;
    TextView tVNum;
    int counter = 0;
    int count;
    String text;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        eT = (EditText) findViewById(R.id.eT);
        tVNum = (TextView) findViewById(R.id.tVNum);

        SharedPreferences settings = getSharedPreferences("SkibidiFile",MODE_PRIVATE);
        SharedPreferences.Editor editor = settings.edit();

        text = settings.getString("text","");
        eT.setText(text);
        count = settings.getInt("count",-1);
        tVNum.setText(String.valueOf(count));


    }

    public void goCount(View view) {
        counter++;
        tVNum.setText(String.valueOf(counter));
    }

    public void goReset(View view) {
        counter = 0;
        tVNum.setText(String.valueOf(counter));
    }

    public void goExit(View view) {
        SharedPreferences settings=getSharedPreferences("skibidiFile",MODE_PRIVATE);
        SharedPreferences.Editor editor=settings.edit();
        editor.putString("text",eT.getText().toString());
        editor.putInt("count",counter);
        editor.commit();
        finish();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@Nullable MenuItem item) {
        int id = item.getItemId();

        if(id == R.id.menuCred) {
            Intent si = new Intent(this, activity_credits.class);
            startActivity(si);
        }
        return true;
    }
}