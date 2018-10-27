package com.example.android.healthyquiz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.content.Intent;
import android.net.Uri;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;
import java.text.NumberFormat;


public class MainActivity extends AppCompatActivity {
    int Score = 0;

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );
    }

    public void onRadioButtonClicked(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch (view.getId()) {
            case R.id.rb_one:
                if (checked)
                    Score = Score + 0;
                break;
            case R.id.rb_two:
                if (checked)
                    Score = Score + 1;

                break;
            case R.id.rb_three:
                if (checked)
                    Score = Score + 0;

                break;
        }
    }

    public void submitOrder(View view) {

        CheckBox potatoesCheckBox = (CheckBox) findViewById( R.id.potatoes );
        boolean hasPotatoes = potatoesCheckBox.isChecked();
        if (hasPotatoes)

        {
            Score = Score + 1;
        }

        CheckBox pastaCheckBox = (CheckBox) findViewById( R.id.pasta );
        boolean hasPasta = pastaCheckBox.isChecked();

        if (hasPasta)

        {
            Score = Score + 1;
        }

        CheckBox applesCheckBox = (CheckBox) findViewById( R.id.apples );
        boolean hasApples = applesCheckBox.isChecked();

        if (hasApples)

        {
            Score = Score + 1;
        }

        CheckBox bakedBeansCheckBox = (CheckBox) findViewById( R.id.baked_beans );

        boolean hasBakedBeans = bakedBeansCheckBox.isChecked();

        if (hasBakedBeans)

        {
            Score = Score + 1;
        }

        CheckBox salmonCheckBox = (CheckBox) findViewById( R.id.salmon );

        boolean hasSalmon = salmonCheckBox.isChecked();

        if (hasSalmon)

        {
            Score = Score + 1;
        }

        CheckBox sardinesCheckBox = (CheckBox) findViewById( R.id.sardines );

        boolean hasSardines = sardinesCheckBox.isChecked();

        if (hasSardines)

        {
            Score = Score + 1;
        }

        CheckBox haddockCreamCheckBox = (CheckBox) findViewById( R.id.haddock );

        boolean hasHaddock = haddockCreamCheckBox.isChecked();

        if (hasHaddock)

        {
            Score = Score + 0;

        }

        EditText nameField = (EditText) findViewById( R.id.fruit_field );
        String name = nameField.getText().toString();

        if (name == "apple" || name == "apples" || name == "Apple" || name == "Apples")

        {
            Score = Score + 1;
        }


        if (Score >= 4) {
            Toast.makeText( this, "Yaaay! you succeed!", Toast.LENGTH_SHORT ).show();}
        else
        {
            Toast.makeText( this, "Try again!", Toast.LENGTH_SHORT ).show();}


        }
    }















