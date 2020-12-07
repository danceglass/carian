package com.cookandroid.carian;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ToggleButton;

public class checklist2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.checklist2);

        Button button=findViewById(R.id.homebutton);
        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent=new Intent(checklist2.this,home.class);  // 버튼 클릭시 레이아웃 전환 명령어 (intent 명령어 활용)
                startActivity(intent);
            }
        });

        final ToggleButton check1 =
                (ToggleButton) this.findViewById(R.id.check1);

        check1.setOnClickListener(new View.OnClickListener() {


            public void onClick(View v) {
                if (check1.isChecked()) {
                    check1.setBackgroundDrawable(
                            getResources().
                                    getDrawable(R.drawable.on)
                    );
                } else {
                    check1.setBackgroundDrawable(
                            getResources().
                                    getDrawable(R.drawable.off)
                    );
                } // end if
            } // end onClick()
        });

        final ToggleButton check2 =
                (ToggleButton) this.findViewById(R.id.check2);

        check2.setOnClickListener(new View.OnClickListener() {


            public void onClick(View v) {
                if (check2.isChecked()) {
                    check2.setBackgroundDrawable(
                            getResources().
                                    getDrawable(R.drawable.on)
                    );
                } else {
                    check2.setBackgroundDrawable(
                            getResources().
                                    getDrawable(R.drawable.off)
                    );
                } // end if
            } // end onClick()
        });

        final ToggleButton check3 =
                (ToggleButton) this.findViewById(R.id.check3);

        check3.setOnClickListener(new View.OnClickListener() {


            public void onClick(View v) {
                if (check3.isChecked()) {
                    check3.setBackgroundDrawable(
                            getResources().
                                    getDrawable(R.drawable.on)
                    );
                } else {
                    check3.setBackgroundDrawable(
                            getResources().
                                    getDrawable(R.drawable.off)
                    );
                } // end if
            } // end onClick()
        });

        final ToggleButton check15 =
                (ToggleButton) this.findViewById(R.id.check15);

        check15.setOnClickListener(new View.OnClickListener() {


            public void onClick(View v) {
                if (check15.isChecked()) {
                    check15.setBackgroundDrawable(
                            getResources().
                                    getDrawable(R.drawable.on)
                    );
                } else {
                    check15.setBackgroundDrawable(
                            getResources().
                                    getDrawable(R.drawable.off)
                    );
                } // end if
            } // end onClick()
        });

        final ToggleButton check4 =
                (ToggleButton) this.findViewById(R.id.check4);

        check4.setOnClickListener(new View.OnClickListener() {


            public void onClick(View v) {
                if (check4.isChecked()) {
                    check4.setBackgroundDrawable(
                            getResources().
                                    getDrawable(R.drawable.on)
                    );
                } else {
                    check4.setBackgroundDrawable(
                            getResources().
                                    getDrawable(R.drawable.off)
                    );
                } // end if
            } // end onClick()
        });

        final ToggleButton check =
                (ToggleButton) this.findViewById(R.id.check);

        check.setOnClickListener(new View.OnClickListener() {


            public void onClick(View v) {
                if (check.isChecked()) {
                    check.setBackgroundDrawable(
                            getResources().
                                    getDrawable(R.drawable.on)
                    );
                } else {
                    check.setBackgroundDrawable(
                            getResources().
                                    getDrawable(R.drawable.off)
                    );
                } // end if
            } // end onClick()
        });

        final ToggleButton check14 =
                (ToggleButton) this.findViewById(R.id.check14);

        check14.setOnClickListener(new View.OnClickListener() {


            public void onClick(View v) {
                if (check14.isChecked()) {
                    check14.setBackgroundDrawable(
                            getResources().
                                    getDrawable(R.drawable.on)
                    );
                } else {
                    check14.setBackgroundDrawable(
                            getResources().
                                    getDrawable(R.drawable.off)
                    );
                } // end if
            } // end onClick()
        });

        final ToggleButton check7 =
                (ToggleButton) this.findViewById(R.id.check7);

        check7.setOnClickListener(new View.OnClickListener() {


            public void onClick(View v) {
                if (check7.isChecked()) {
                    check7.setBackgroundDrawable(
                            getResources().
                                    getDrawable(R.drawable.on)
                    );
                } else {
                    check7.setBackgroundDrawable(
                            getResources().
                                    getDrawable(R.drawable.off)
                    );
                } // end if
            } // end onClick()
        });

        final ToggleButton check8 =
                (ToggleButton) this.findViewById(R.id.check8);

        check8.setOnClickListener(new View.OnClickListener() {


            public void onClick(View v) {
                if (check8.isChecked()) {
                    check8.setBackgroundDrawable(
                            getResources().
                                    getDrawable(R.drawable.on)
                    );
                } else {
                    check8.setBackgroundDrawable(
                            getResources().
                                    getDrawable(R.drawable.off)
                    );
                } // end if
            } // end onClick()
        });

        final ToggleButton check9 =
                (ToggleButton) this.findViewById(R.id.check9);

        check9.setOnClickListener(new View.OnClickListener() {


            public void onClick(View v) {
                if (check9.isChecked()) {
                    check9.setBackgroundDrawable(
                            getResources().
                                    getDrawable(R.drawable.on)
                    );
                } else {
                    check9.setBackgroundDrawable(
                            getResources().
                                    getDrawable(R.drawable.off)
                    );
                } // end if
            } // end onClick()
        });

        final ToggleButton check10 =
                (ToggleButton) this.findViewById(R.id.check10);

        check10.setOnClickListener(new View.OnClickListener() {


            public void onClick(View v) {
                if (check10.isChecked()) {
                    check10.setBackgroundDrawable(
                            getResources().
                                    getDrawable(R.drawable.on)
                    );
                } else {
                    check10.setBackgroundDrawable(
                            getResources().
                                    getDrawable(R.drawable.off)
                    );
                } // end if
            } // end onClick()
        });

        final ToggleButton check11 =
                (ToggleButton) this.findViewById(R.id.check11);

        check11.setOnClickListener(new View.OnClickListener() {


            public void onClick(View v) {
                if (check11.isChecked()) {
                    check11.setBackgroundDrawable(
                            getResources().
                                    getDrawable(R.drawable.on)
                    );
                } else {
                    check11.setBackgroundDrawable(
                            getResources().
                                    getDrawable(R.drawable.off)
                    );
                } // end if
            } // end onClick()
        });

        final ToggleButton check13 =
                (ToggleButton) this.findViewById(R.id.check13);

        check13.setOnClickListener(new View.OnClickListener() {


            public void onClick(View v) {
                if (check13.isChecked()) {
                    check13.setBackgroundDrawable(
                            getResources().
                                    getDrawable(R.drawable.on)
                    );
                } else {
                    check13.setBackgroundDrawable(
                            getResources().
                                    getDrawable(R.drawable.off)
                    );
                } // end if
            } // end onClick()
        });


    }
}