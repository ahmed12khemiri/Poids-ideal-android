package com.example.poids;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button bCalculer;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.bCalculer= (Button) this.findViewById(R.id.boutonCalculer);

        this.bCalculer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                EditText text = (EditText)findViewById(R.id.taille);
                String value = text.getText().toString();


                Context context = getApplicationContext();

                Double taille = Double.parseDouble(value);

                Double poid = ((3*taille) - 250)/4;



                int duration = Toast.LENGTH_SHORT;
                Toast toast = Toast.makeText(context,"Votre poids idéal est [ " + poid.toString()+ " ] kg", duration);
                toast.setGravity(Gravity.TOP, 0, 0);

                toast.show();

            }
        });

    }


}