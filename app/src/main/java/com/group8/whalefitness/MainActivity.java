package com.group8.whalefitness;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;
import android.widget.TextView;
import android.view.View;
import android.widget.Button;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_choose_age); //
        Intent intent = new Intent(MainActivity.this, ChooseAgeActivity.class); //
        startActivity(intent); //
//        Button btnNextPage = findViewById(R.id.btn_start);

//        btnNextPage.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                // Tạo intent để chuyển trang
//                Intent intent = new Intent(MainActivity.this, introduction_branch.class);
//                startActivity(intent);
//                overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);
//            }
//        });
    }
}
