package com.example.sharedprefrences;

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
    Button btnCount, btnReset, btnExit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText eT = (EditText) findViewById(R.id.eT);
        TextView tVNum = (TextView) findViewById(R.id.tVNum);
        Button btnCount = (Button) findViewById(R.id.btnCount);
        Button btnReset = (Button) findViewById(R.id.btnReset);
        Button btnExit = (Button) findViewById(R.id.btnExit);
    }

    public void goCount(View view) {
    }

    public void goReset(View view) {
    }

    public void goExit(View view) {
    }
}