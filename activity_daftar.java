package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class activity_daftar extends AppCompatActivity {

    EditText et_nama, et_nohandphone, et_email, et_masukankodeagen;
    Button btn_berikutnya;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daftar);

        et_nama = (EditText)findViewById(R.id.et_nama);
        et_nohandphone = (EditText)findViewById(R.id.et_nohandphone);
        et_email = (EditText)findViewById(R.id.et_email);
        et_masukankodeagen = (EditText)findViewById(R.id.et_masukkodeagen);
        btn_berikutnya = (Button)findViewById(R.id.btn_berikutnya);

        btn_berikutnya.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,Main2Activity.class);
                startActivity(intent);

                String nama = et_nama.getText().toString();
                String nohandphone = et_nohandphone.getText().toString();
                String email = et_email.getText().toString();
                String masukkodeagen = et_masukankodeagen.getText().toString();

                if (nama.equals("Agung") || nohandphone.equals("081284441032") || email.equals("agung.pr@gmail.com") || masukkodeagen.equals("1234"));
                Toast.makeText(getApplicationContext(),"Field Requrid", Toast.LENGTH_SHORT).show();
                Toast.makeText(getApplicationContext(),"Registrasi", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
