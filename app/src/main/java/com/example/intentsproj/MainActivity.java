package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public Button ok ;
    EditText editTextNo1 , editTextNo2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Creating the LayoutInflater instance
        LayoutInflater li = getLayoutInflater();  //Getting the View object as defined in the customtoast.xml file
        View layout = li.inflate(R.layout.customtoast, (ViewGroup) findViewById(R.id.custom_toast_layout));

        //Creating the Toast object
        Toast toast = new Toast(getApplicationContext());
        toast.setDuration(Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.CENTER_VERTICAL, 0, 0);
        toast.setView(layout);
        //setting the view of custom toast layout  toast.show();

        editTextNo1 = (EditText) findViewById(R.id.editTextNo1);
        editTextNo2 = (EditText) findViewById(R.id.editTextNo2);

        ok = (Button)findViewById(R.id.btn_ok);
        ok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String No1 = editTextNo1.getText().toString();
                String No2 = editTextNo2.getText().toString();


                Intent intent = new Intent(MainActivity.this,SecondActivity.class);
                intent.putExtra("No1",No1);
                intent.putExtra("No2",No2);

                startActivity(intent);

                Context context = getApplicationContext();
                CharSequence message = "You just clicked the OK button";
                int duration = Toast.LENGTH_SHORT;

                Toast toast = Toast.makeText(context, message, duration);
                toast.show();


            }
        });
    }
}