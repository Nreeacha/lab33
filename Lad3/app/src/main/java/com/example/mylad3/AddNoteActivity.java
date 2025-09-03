package com.example.mylad3;

import android.annotation.SuppressLint;
import android.content.Intent;
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

import java.util.Arrays;
import java.util.Date;

public class AddNoteActivity extends AppCompatActivity {

    Button submitButton,back;
    EditText title,textContent,Name;
    TextView display;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_add_note);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        submitButton = findViewById(R.id.button4);
        title = findViewById(R.id.editTextText);
        textContent = findViewById(R.id.editTextText2);
        Name = findViewById(R.id.editTextText4);
        display = findViewById(R.id.textView4);

        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
             // get data from user (EditText)
                String stringOfTitle = title.getText().toString();
                String stringOfContens = textContent.getText().toString();
                String userName = Name.getText().toString();

                Date currentDate = new Date();
                User user = new User(userName);

                //cerate data in TextNote class
                CheckListNote note1 = new CheckListNote();
                note1.setTitle(stringOfTitle);
                note1.setTitle(String.valueOf(Arrays.asList(stringOfTitle.split(","))));
                note1.createdDate = currentDate;
                note1.setOwner(user);

                //show dete
                display.setText(note1.display());
            }

        });
        back = findViewById(R.id.button10);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                System.out.println("back");
                Intent mainActivity = new Intent(getApplicationContext(),MainActivity.class);
                startActivity(mainActivity);

            }
        });
    }
}