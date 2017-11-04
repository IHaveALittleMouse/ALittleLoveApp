package com.andgloria.charles.alittleloveapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class ShowImage extends AppCompatActivity {

    private ImageView iv;
    private TextView tv;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_image);

        Intent i = getIntent();
        String name = i.getStringExtra("name");

        iv = (ImageView) findViewById(R.id.imageView);
        iv.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                ShowImage.this.finish();
            }
        });
        tv = (TextView) findViewById(R.id.textView2);

        if (name.equals("Charles")) {
            iv.setImageDrawable(getResources().getDrawable(R.drawable.charles));
            tv.setText("Here is your lovly boy friend");
        } else if (name.equals("Gloria")) {
            iv.setImageDrawable(getResources().getDrawable(R.drawable.gloria));
            tv.setText("Here is your lovly photo taken by your boy friend");
        } else if (name.equals("DongDong")) {
            iv.setImageDrawable(getResources().getDrawable(R.drawable.dongdong));
            tv.setText("Here is DongDong's lovly photo taken by your boy friend");
        } else {
            iv.setImageDrawable(getResources().getDrawable(R.drawable.someone));
        }
    }
}
