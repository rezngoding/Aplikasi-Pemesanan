package com.example.pemesanan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        ImageView detailImage = findViewById(R.id.detailImg);
        TextView detailTitle = findViewById(R.id.detailTitle);
        TextView detailDescription = findViewById(R.id.detailDeskripsi);
        TextView detailPrice = findViewById(R.id.detailHarga);
        Button btnShare = findViewById(R.id.buttonbagikan);

        // Dapatkan data dari Intent
        int imageResId = getIntent().getIntExtra("imageResId", 0);
        String title = getIntent().getStringExtra("title");
        String description = getIntent().getStringExtra("description");
        detailDescription.setText(description);
        String price = getIntent().getStringExtra("Harga");
        String share = getIntent().getStringExtra("bagikan");
        btnShare.setText(share);
        // Atur data ke tampilan
        detailImage.setImageResource(imageResId);
        detailTitle.setText(title);
        detailDescription.setText(description);
        detailPrice.setText(price);
        // Ketika tombol "Bagikan" diklik
        btnShare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Buat pesan yang akan dibagikan
                String shareMessage = "Check out this product: " + title + "\nDescription: " + description + "\nPrice: " + price;

                // Buat Intent untuk membagikan pesan
                Intent shareIntent = new Intent(Intent.ACTION_SEND);
                shareIntent.setType("text/plain");
                shareIntent.putExtra(Intent.EXTRA_SUBJECT, "Product Details");
                shareIntent.putExtra(Intent.EXTRA_TEXT, shareMessage);

                // Memulai aktivitas untuk memilih aplikasi yang akan digunakan untuk berbagi
                startActivity(Intent.createChooser(shareIntent, "Share via"));
            }
        });
    }
}