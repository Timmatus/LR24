package com.mgke.lr24;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.mgke.lr24.model.CoffeeShop;

public class CoffeeShopActivity extends AppCompatActivity {

    public static final String EXTRA_COFFEESHOPID = "coffeeShopId";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coffee_shop);

        int coffeeShopId = (Integer) getIntent().getExtras().get(EXTRA_COFFEESHOPID);
        CoffeeShop coffeeShop = CoffeeShop.coffeeShops[coffeeShopId];

        TextView name = findViewById(R.id.name);
        name.setText(coffeeShop.getName());

        TextView description = findViewById(R.id.description);
        description.setText(coffeeShop.getDescription());

        ImageView photo = findViewById(R.id.photo);
        photo.setImageResource(coffeeShop.getImageResourceId());
        photo.setContentDescription(coffeeShop.getName());
    }
}