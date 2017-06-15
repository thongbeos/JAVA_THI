package com.example.thongbeo.baucua_btt_1211;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.Random;


public class MainActivity extends AppCompatActivity {

    Button btnPlay;
    ImageView imgAnh1, imgAnh2, imgAnh3;
    ArrayList<Integer> mang;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnPlay = (Button)findViewById(R.id.buttonPlay);
        imgAnh1 = (ImageView)findViewById(R.id.imageView1);
        imgAnh2 = (ImageView)findViewById(R.id.imageView2);
        imgAnh3 = (ImageView)findViewById(R.id.imageView3);

        mang = new ArrayList<Integer>();
        mang.add(R.drawable.bau);
        mang.add(R.drawable.cua);
        mang.add(R.drawable.tom);
        mang.add(R.drawable.ca);
        mang.add(R.drawable.huou);
        mang.add(R.drawable.tom);

        btnPlay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Random r = new Random();

                int n = r.nextInt(mang.size());
                imgAnh1.setImageResource(mang.get(n));

                int m = r.nextInt(mang.size());
                imgAnh2.setImageResource(mang.get(m));

                int l = r.nextInt(mang.size());
                imgAnh3.setImageResource(mang.get(l));
            }
        });
    }
}
