package com.example.pemesanan;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class ShoesActivity extends AppCompatActivity {


    private LinearLayout layout1, layout2, layout3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shoes);

        layout2=findViewById(R.id.g2);
        layout2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Handle the click event for the first card
                navigateToDetailActivity(
                        R.drawable.g2,
                        "SummitTech Explorer",
                        "PROMO Sepatu Pria Sepatu Sneakers Pria Wanita Sepatu joging Sepatu hitam pria Sepatu joging Sepatu Sneakers ( AV_03)",
                        "Harga Rp 750.000",
                        "bagikan"
                );
            }
        });

    }

    private void navigateToDetailActivity(int imageResId, String title, String description, String price, String share) {
        Intent intent = new Intent(this, DetailActivity.class);
        intent.putExtra("imageResId", imageResId);
        intent.putExtra("title", title);
        intent.putExtra("description", description);
        intent.putExtra("price", price);
        intent.putExtra("bagikan", share);
        startActivity(intent);
    }
}