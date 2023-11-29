package com.example.labatwo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;

import android.os.Bundle;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.Toast;

public class Activity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Создаем RelativeLayout
        RelativeLayout layout = new RelativeLayout(this);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(
                RelativeLayout.LayoutParams.MATCH_PARENT,
                RelativeLayout.LayoutParams.MATCH_PARENT
        );
        layout.setLayoutParams(layoutParams);

// Создаем первую кнопку
        Button button1 = new Button(this);
        button1.setId(View.generateViewId());
        button1.setText("Left 50%");

// Устанавливаем параметры для кнопки 1
        RelativeLayout.LayoutParams button1Params = new RelativeLayout.LayoutParams(
                0, // ширина
                0 // высота
        );
        button1Params.addRule(RelativeLayout.ALIGN_PARENT_TOP);
        button1Params.addRule(RelativeLayout.ALIGN_PARENT_LEFT);
        button1Params.addRule(RelativeLayout.ALIGN_PARENT_START);
        button1Params.addRule(RelativeLayout.ALIGN_PARENT_RIGHT, 0);
        button1Params.addRule(RelativeLayout.ALIGN_PARENT_END, 0);
        button1Params.addRule(RelativeLayout.ALIGN_PARENT_BOTTOM, 0);
        button1.setLayoutParams(button1Params);

// Создаем вторую кнопку
        Button button2 = new Button(this);
        button2.setId(View.generateViewId());
        button2.setText("Right 50%");

// Устанавливаем параметры для кнопки 2
        RelativeLayout.LayoutParams button2Params = new RelativeLayout.LayoutParams(
                0, // ширина
                0 // высота
        );
        button2Params.addRule(RelativeLayout.ALIGN_PARENT_TOP);
        button2Params.addRule(RelativeLayout.ALIGN_PARENT_RIGHT);
        button2Params.addRule(RelativeLayout.ALIGN_PARENT_END);
        button2.setLayoutParams(button2Params);

// Создаем третью кнопку
        Button button3 = new Button(this);
        button3.setId(View.generateViewId());
        button3.setText("Bottom");

// Устанавливаем параметры для кнопки 3
        RelativeLayout.LayoutParams button3Params = new RelativeLayout.LayoutParams(
                RelativeLayout.LayoutParams.MATCH_PARENT, // ширина
                0 // высота
        );
        button3Params.addRule(RelativeLayout.ALIGN_PARENT_BOTTOM);
        button3.setLayoutParams(button3Params);

// Добавляем кнопки к RelativeLayout
        layout.addView(button1);
        layout.addView(button2);
        layout.addView(button3);

// Определяем ширину и высоту кнопок относительно размеров экрана
        int screenWidth = getResources().getDisplayMetrics().widthPixels;
        int screenHeight = getResources().getDisplayMetrics().heightPixels;

        int buttonWidth = (int) (screenWidth * 0.50);
        int buttonHeight = (int) (screenHeight * 0.07);

// Устанавливаем ширину и высоту кнопок
        button1.getLayoutParams().width = buttonWidth;
        button1.getLayoutParams().height = buttonHeight;

        button2.getLayoutParams().width = buttonWidth;
        button2.getLayoutParams().height = buttonHeight;

        button3.getLayoutParams().height = buttonHeight;

// Создаем четвертую кнопку
        Button button4 = new Button(this);
        button4.setId(View.generateViewId());
        button4.setText("Center");

// Устанавливаем параметры для кнопки 4
        RelativeLayout.LayoutParams button4Params = new RelativeLayout.LayoutParams(
                (int) (screenWidth * 0.25), // ширина
                buttonHeight // высота
        );
        button4Params.addRule(RelativeLayout.CENTER_HORIZONTAL);
        button4Params.addRule(RelativeLayout.CENTER_IN_PARENT);
        button4.setLayoutParams(button4Params);

// Создаем пятую кнопку (слева от четвертой)
        Button button5Left = new Button(this);
        button5Left.setId(View.generateViewId());
        button5Left.setText("Center_left");

// Устанавливаем параметры для кнопки 5 (слева)
        RelativeLayout.LayoutParams button5LeftParams = new RelativeLayout.LayoutParams(
                (int) (screenWidth * 0.25), // ширина
                buttonHeight // высота
        );
        button5LeftParams.addRule(RelativeLayout.LEFT_OF, button4.getId());
        button5LeftParams.addRule(RelativeLayout.CENTER_VERTICAL);
        button5Left.setLayoutParams(button5LeftParams);

// Создаем шестую кнопку (справа от

        Button button6Right = new Button(this);
        button6Right.setId(View.generateViewId());
        button6Right.setText("Center_right");

// Устанавливаем параметры для кнопки 6 (справа)
        RelativeLayout.LayoutParams button6RightParams = new RelativeLayout.LayoutParams(
                (int) (screenWidth * 0.25), // ширина
                buttonHeight // высота
        );
        button6RightParams.addRule(RelativeLayout.RIGHT_OF, button4.getId());
        button6RightParams.addRule(RelativeLayout.CENTER_VERTICAL);
        button6Right.setLayoutParams(button6RightParams);

// Добавляем оставшиеся три кнопки к RelativeLayout
        layout.addView(button4);
        layout.addView(button5Left);
        layout.addView(button6Right);

// Устанавливаем RelativeLayout в качестве контента активности
        setContentView(layout);
    }
}



