package com.example.screenrotationusingviewmodelapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.screenrotationusingviewmodelapp.viewmodel.MainViewModel;

public class MainActivity extends AppCompatActivity {

    private Button numberIncrementBTN;
    private TextView numberTV;
    private MainViewModel mainViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        numberTV = findViewById(R.id.numberTV);
        numberIncrementBTN = findViewById(R.id.numberIncrementBTN);

        // Initialize the ViewModel
        mainViewModel = new ViewModelProvider(this).get(MainViewModel.class);


        // Display the current number value
        int numberVM = mainViewModel.getNumber();
        numberTV.setText(String.valueOf(numberVM));


        // Increment the number and update the UI
        numberIncrementBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                mainViewModel.incrementNumber();
                numberTV.setText(String.valueOf(mainViewModel.getNumber()));
            }
        });
    }
}