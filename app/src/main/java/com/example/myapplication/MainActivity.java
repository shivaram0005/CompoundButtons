package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Switch;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {
    CheckBox chicken, pizza, burger, mutton, paneer;
    Button b1, b2;
    ToggleButton toggleButton;
    RadioGroup radioGroup;
    Switch s;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        chicken = (CheckBox) findViewById(R.id.cb1);
        pizza = (CheckBox) findViewById(R.id.cb2);
        burger = (CheckBox) findViewById(R.id.cb3);
        mutton = (CheckBox) findViewById(R.id.cb4);
        paneer = (CheckBox) findViewById(R.id.cb5);
        b1 = (Button) findViewById(R.id.b1);
        b2 = (Button) findViewById(R.id.b2);
        toggleButton = (ToggleButton) findViewById(R.id.toggle);
        radioGroup = (RadioGroup) findViewById(R.id.radiogroup);
        s=(Switch)findViewById(R.id.s);

        toggleButton.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
                if (isChecked) {
                    b2.setVisibility(View.GONE);
                    Toast.makeText(MainActivity.this, "Toggle Button is checked", Toast.LENGTH_SHORT).show();
                } else {
                    b2.setVisibility(View.VISIBLE);
                    Toast.makeText(MainActivity.this, "Toggle Button is not checked", Toast.LENGTH_SHORT).show();
                }
            }
        });
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                StringBuilder result = new StringBuilder();
                int totalamount = 0;
                result.append("\n  Selected Items");
                if (chicken.isChecked()) {
                    result.append("\n  Chicken 100 Rs");
                    totalamount += 100;

                }
                if (pizza.isChecked()) {
                    result.append("\n  Pizza 100 Rs");
                    totalamount += 100;

                }
                if (burger.isChecked()) {
                    result.append("\n  Burger 100 Rs");
                    totalamount += 100;

                }

                if (mutton.isChecked()) {
                    result.append("\n Mutton 100 Rs");
                    totalamount += 100;
                }

                result.append("\n in Total: " + totalamount + "Rs");
                Toast.makeText(MainActivity.this, result.toString(), Toast.LENGTH_LONG).show();

            }
        });
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                RadioButton radioButton = (RadioButton) findViewById(i);
                String gender = radioButton.getText().toString();
                Toast.makeText(MainActivity.this, "You selected gender is :" + gender, Toast.LENGTH_SHORT).show();
            }
        });
        paneer.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
                if (paneer.isChecked()) {
                    Toast.makeText(MainActivity.this, "Checkbox checked", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(MainActivity.this, "Checkbox unchecked", Toast.LENGTH_SHORT).show();
                }
            }
        });
s.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
    @Override
    public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
        if(isChecked)
        {
            Toast.makeText(MainActivity.this, "Checked", Toast.LENGTH_SHORT).show();
        }else{
            Toast.makeText(MainActivity.this, "unchecked", Toast.LENGTH_SHORT).show();
        }
    }
});

    }
}