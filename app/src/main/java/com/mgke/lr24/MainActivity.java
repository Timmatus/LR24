package com.mgke.lr24;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ListView menuList = findViewById(R.id.menu_list);
        String[] menuItems = {"Напитки", "Еда", "Кофейни"};

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,
                android.R.layout.simple_list_item_1, menuItems);
        menuList.setAdapter(adapter);

        menuList.setOnItemClickListener((parent, view, position, id) -> {
            Intent intent;
            switch (position) {
                case 0: // Напитки
                    intent = new Intent(MainActivity.this, DrinkCategoryActivity.class);
                    startActivity(intent);
                    break;
                case 1: // Еда
                    intent = new Intent(MainActivity.this, FoodCategoryActivity.class);
                    startActivity(intent);
                    break;
                case 2: // Кофейни
                    intent = new Intent(MainActivity.this, CoffeeShopCategoryActivity.class);
                    startActivity(intent);
                    break;
            }
        });
    }
}