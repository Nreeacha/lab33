package com.example.mylad3;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class DisplayNoteButtonActivity2 extends AppCompatActivity {
    ProgressBar progressBar, back;
    Button displayNoteButton;
    TextView display;
   EditText NoDataTXT;
    @SuppressLint({"MissingInflatedId", "WrongViewCast"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_display_note_button2);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        progressBar = findViewById(R.id.progressBar2);
        progressBar.setVisibility(View.GONE);
        displayNoteButton = findViewById(R.id.button8);
      display = findViewById(R.id.textView5);
       NoDataTXT = findViewById(R.id.editTextText3);
        displayNoteButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                //1.Show progress bar
                progressBar.setVisibility(View.VISIBLE);
                //2.create thread
                new Thread(() -> {
                    //2.1 delay/sleep 2 seconds
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    //2.2 load data from databse
                    //2.3 back to main thread
                    runOnUiThread(() -> {
                        //2.4 remove progress
                        progressBar.setVisibility(View.GONE);
                        //2.5 go to Add Note Activity

                        display.setText("ไม่พบข้อมูล");
                    });


                }).start();

            }
        });

    }
}
