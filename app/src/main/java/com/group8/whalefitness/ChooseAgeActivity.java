package com.group8.whalefitness;

import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import com.shawnlin.numberpicker.NumberPicker;
import androidx.appcompat.app.AppCompatActivity;

import java.lang.reflect.Field;

public class ChooseAgeActivity extends AppCompatActivity {

    private com.shawnlin.numberpicker.NumberPicker npAge;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_age);

        npAge = findViewById(R.id.age_NumberPicker);
        npAge.setMinValue(10);
        npAge.setMaxValue(100);
        npAge.setValue(36);
    }
    private void customizeNumberPicker(NumberPicker picker) {
        for (int i = 0; i < picker.getChildCount(); i++) {
            View child = picker.getChildAt(i);
            if (child instanceof EditText) {
                EditText editText = (EditText) child;
                editText.setTextColor(Color.parseColor("#FFFFFF")); // Màu chữ trắng
                editText.setTextSize(28);                           // Kích thước chữ
                editText.setTypeface(Typeface.MONOSPACE, Typeface.BOLD); // Kiểu chữ đậm
            }
        }

        // Đổi màu line highlight (mặc định là xám)
        try {
            Field selectionDivider = picker.getClass().getDeclaredField("mSelectionDivider");
            selectionDivider.setAccessible(true);
            selectionDivider.set(picker, new ColorDrawable(Color.RED)); // Màu đỏ
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Đổi màu nền NumberPicker
        picker.setBackgroundColor(Color.parseColor("#101010"));
    }

}

