package com.example.mylad3;

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

public class AddCheckListActivity extends AppCompatActivity {
    Button submiButton;
    EditText title,itemlist,nameUser;
    TextView display;
    Button back;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_add_check_list);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        submiButton=findViewById(R.id.button6);
        title=findViewById(R.id.editTextText7);
        itemlist = findViewById(R.id.editTextText6);
        nameUser = findViewById(R.id.editTextText8);
        display = findViewById(R.id.textView3);
        back = findViewById(R.id.button9);
        submiButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String stringOfTitle = title.getText().toString();
                String stringOfitemList = itemlist.getText().toString();
                String userName = nameUser.getText().toString();
                Date currentDate = new Date();
                User user = new User(userName);

                //create data in TextNote class
                CheckListNote note1 = new CheckListNote();
                note1.setTitle(stringOfTitle);
                note1.setTitle(String.valueOf(Arrays.asList(stringOfitemList.split(","))));
                note1.createdDate = currentDate;
                note1.setOwner(user);

                //show data
                display.setText(note1.display());

            }
        });
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