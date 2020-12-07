package com.cookandroid.carian;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);

        // 액티비티 전환
        Button button1 = (Button)findViewById(R.id.login);
        button1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "로그인되었습니다", Toast.LENGTH_LONG).show();  // 화면 전환시 메시지 창 띄움 (toast 명령어 활용)

                // 액티비티 전환 코드
                Intent intent = new Intent(getApplicationContext(), home.class);
                startActivity(intent);
            }
        });



    }
}