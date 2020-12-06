package com.cookandroid.carian;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ToggleButton;

public class checklist extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.checklist);

        final ToggleButton tb3 =
                (ToggleButton) this.findViewById(R.id.toggleButton2);

        tb3.setOnClickListener(new View.OnClickListener() {

            @Override

            public void onClick(View v) {
                if(tb3.isChecked()){
                    tb3.setBackgroundDrawable(
                            getResources().
                                    getDrawable(R.drawable.bgon)
                    );
                }else{
                    tb3.setBackgroundDrawable(
                            getResources().
                                    getDrawable(R.drawable.bgoff)
                    );
                } // end if
            } // end onClick()
        });


        final ToggleButton tb2 =
                (ToggleButton) this.findViewById(R.id.toggleButton2);

        tb2.setOnClickListener(new View.OnClickListener() {

            @Override

            public void onClick(View v) {
                if(tb2.isChecked()){
                    tb2.setBackgroundDrawable(
                            getResources().
                                    getDrawable(R.drawable.bton)
                    );
                }else{
                    tb2.setBackgroundDrawable(
                            getResources().
                                    getDrawable(R.drawable.btoff)
                    );
                } // end if
            } // end onClick()
        });

    }
}