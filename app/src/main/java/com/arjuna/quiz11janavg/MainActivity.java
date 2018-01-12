package com.arjuna.quiz11janavg;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText etMtk, etBhasa, etIng, etKejuruan;
    Button btnHasil;
    TextView txtHasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //memanggil id widget
        etIng = (EditText)findViewById(R.id.etIng);
        etBhasa = (EditText)findViewById(R.id.etBhasa);
        etKejuruan = (EditText)findViewById(R.id.etKejuruan);
        etMtk = (EditText)findViewById(R.id.etMtk);
        btnHasil = (Button) findViewById(R.id.btnHasil);
        txtHasil = (TextView) findViewById(R.id.txtHasil);

        btnHasil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nIng = etIng.getText().toString();
                String nIndo = etBhasa.getText().toString();
                String nKomp = etKejuruan.getText().toString();
                String nMtk = etMtk.getText().toString();
                //mengecek apa edit text kosong
                //mengecek apa edit text kosong
                //kondisi panjang nya kosong
                if(nIng.isEmpty()){
                    //memberikan warning berupa eror
                    etIng.setError("Nilai Inggris Tidak Boleh Kosong");
                }else if (nIndo.isEmpty()){
                    //Kondisi ketika lebarnya kosong
                    etBhasa.setError("Nilai Indo Tidak Boleh Kosong");
                }else if (nKomp.isEmpty()){
                    etKejuruan.setError("Nilai Komp Tidak Boleh Kosong ");
                }else if (nMtk.isEmpty()){
                    etMtk.setError("Nilai Matematika tidak Boleh Kosong");

                }else {

                    //mengubah nilai dari String ke Interger
                    int aMTK = Integer.parseInt(nMtk);
                    int aIng = Integer.parseInt(nIng);
                    int aKomp = Integer.parseInt(nKomp);
                    int aIndo = Integer.parseInt(nIndo);

                    //kondisi ketika panjang dan lebar nya tidak kosong
                    int hasilRatarata = ((aMTK + aIndo + aIng + aKomp) / 4);

                    if (hasilRatarata > 0 && hasilRatarata <= 40) {
                        txtHasil.setText("Nilai Anda D");
                    }else if (hasilRatarata >= 41 && hasilRatarata <= 80){
                        txtHasil.setText("Nilai Anda C");
                    }else if (hasilRatarata >= 66 && hasilRatarata <= 80){
                        txtHasil.setText("Nilai Anda B");
                    }else if (hasilRatarata >= 81  && hasilRatarata <= 100){
                        txtHasil.setText("Nilai Anda A");
                    }else {
                        txtHasil.setText("OverLoad");
                    }


                }
            }
        });


    }
}
