package com.example.labatwo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;

public class Activity4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_4);

        // Создаем линейный макет
        LinearLayout linearLayout = new LinearLayout(this);
        linearLayout.setLayoutParams(new LinearLayout.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.MATCH_PARENT
        ));
        linearLayout.setBackgroundColor(getResources().getColor(android.R.color.white));
        linearLayout.setGravity(Gravity.CENTER);

// Создаем кнопку
        Button button = new Button(this);
        button.setLayoutParams(new ViewGroup.LayoutParams(
                ViewGroup.LayoutParams.WRAP_CONTENT,
                ViewGroup.LayoutParams.WRAP_CONTENT
        ));
        button.setText("Нажми меня");

// Установка цвета обводки, толщины обводки и радиуса скругления
        button.setBackgroundResource(R.drawable.custom_button);

// Обработчик нажатия на кнопку
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
// Изменение цвета при нажатии
                button.setBackgroundColor(getResources().getColor(android.R.color.holo_green_light));
            }
        });

// Добавляем кнопку в линейный макет
        linearLayout.addView(button);

// Устанавливаем линейный макет как содержимое активности
        setContentView(linearLayout);
    }
}
