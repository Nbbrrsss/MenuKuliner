package com.example.menukuliner;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;


public class Deskription extends AppCompatActivity {

    ImageView FotoMakanan;
    TextView txtNamaMakanan, txtDeskripsiMakanan, txtAlamatMakanan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_deskription);

        FotoMakanan = findViewById(R.id.FotoMakanan);
        txtNamaMakanan = findViewById(R.id.txtNamaMakanan);
        txtDeskripsiMakanan = findViewById(R.id.txtDeskripsiMakanan);
        txtAlamatMakanan = findViewById(R.id.txtAlamatMakanan);

        getIncomingExtra();

    }

    private void getIncomingExtra(){
        if (getIntent().hasExtra("foto") && getIntent().hasExtra("nama") && getIntent().hasExtra("deskripsi") && getIntent().hasExtra("alamat")){

            int imgFoto = getIntent().getIntExtra("foto", 1);
            String txtNama = getIntent().getStringExtra("nama");
            String txtDeskripsi = getIntent().getStringExtra("deskripsi");
            String txtAlamat = getIntent().getStringExtra("alamat");

            setDataActivity(imgFoto, txtNama, txtDeskripsi, txtAlamat);
        }
    }

    private void setDataActivity(int imgFoto, String txtNama, String txtDeskripsi, String txtAlamat){

        FotoMakanan.setImageResource(imgFoto);

        txtNamaMakanan.setText(txtNama);
        txtDeskripsiMakanan.setText(txtDeskripsi);
        txtAlamatMakanan.setText(txtAlamat);
    }
}
