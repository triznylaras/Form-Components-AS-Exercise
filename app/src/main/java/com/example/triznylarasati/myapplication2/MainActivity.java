package com.example.triznylarasati.myapplication2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.view.menu.ActionMenuItemView;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import android.widget.EditText;
import android.widget.RadioButton;


public class MainActivity extends AppCompatActivity {

    Button login_btn, cancel_btn;
    EditText id_ins, pass_ins;
    RadioButton rad_btn1, rad_btn2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.form_component);
        login_btn = (Button) findViewById(R.id.login_btn);//get id of login button
        cancel_btn = (Button) findViewById(R.id.cancel_btn);//get id of cancel button
        Button submit_btn = (Button) findViewById(R.id.submit_btn);
        id_ins = (EditText) findViewById(R.id.id_ins);
        pass_ins = (EditText) findViewById(R.id.pass_ins);
        rad_btn1 = (RadioButton) findViewById(R.id.rad_btn1);
        rad_btn2 = (RadioButton) findViewById(R.id.rad_btn2);

        login_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (id_ins.getText().toString().isEmpty() || pass_ins.getText().toString().isEmpty()) {
                    Toast.makeText(MainActivity.this, "Please fill the data", Toast.LENGTH_SHORT).show();//display text of login button
                } else {
                    Toast.makeText(MainActivity.this, "Nama: " + id_ins.getText().toString() + " Password: " + pass_ins.getText().toString(), Toast.LENGTH_LONG).show();
                }
            }
        });
        cancel_btn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Toast.makeText(MainActivity.this, "Your login is cancelled", Toast.LENGTH_SHORT).show();
            }
        });
        submit_btn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                if (rad_btn1.isChecked()) {
                    Toast.makeText(MainActivity.this, "Thankyou", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(MainActivity.this, "Thankyou for your contribution", Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}