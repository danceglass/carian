package com.cookandroid.carian;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ToggleButton;

public class checklist extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.checklist);

        Button button=findViewById(R.id.makechecklist2);
        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent=new Intent(checklist.this,checklist2.class);  // 버튼 클릭시 레이아웃 전환 명령어 (intent 명령어 활용)
                startActivity(intent);
            }
        });



        final ToggleButton tb10 =
                (ToggleButton) this.findViewById(R.id.toggleButton10);

        tb10.setOnClickListener(new View.OnClickListener() {


            public void onClick(View v) {                           //if문을 활용한 버튼 온오프 기능
                if (tb10.isChecked()) {
                    tb10.setBackgroundDrawable(
                            getResources().
                                    getDrawable(R.drawable.bgon)   //토글 버튼이 on일때 보이는 이미지
                    );
                } else {
                    tb10.setBackgroundDrawable(
                            getResources().
                                    getDrawable(R.drawable.bgoff)   //토글 버튼이 off일때 보이는 이미지
                    );
                } // end if
            } // end onClick()
        });


        final ToggleButton tb2 =
                (ToggleButton) this.findViewById(R.id.toggleButton2);

        tb2.setOnClickListener(new View.OnClickListener() {


            public void onClick(View v) {
                if (tb2.isChecked()) {
                    tb2.setBackgroundDrawable(
                            getResources().
                                    getDrawable(R.drawable.bton)
                    );
                } else {
                    tb2.setBackgroundDrawable(
                            getResources().
                                    getDrawable(R.drawable.btoff)
                    );
                } // end if
            } // end onClick()
        });



    }




    }