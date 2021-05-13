package com.jsstech.fragmentex;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
Button frag1,frag2,frag3,frag4,frag5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        frag1=findViewById(R.id.fragment1);
        frag2=findViewById(R.id.fragment2);
        frag3=findViewById(R.id.fragment3);
        frag4=findViewById(R.id.fragment4);
        frag5=findViewById(R.id.fragment5);


        frag1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Fragment1 frag_ment=new Fragment1();
                FragmentManager fragmentManager=getSupportFragmentManager();
                fragmentManager.beginTransaction().replace(R.id.linearlayout,frag_ment,frag_ment.getTag()).commit();

            }
        });

        frag2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Fragment2 fragment2=new Fragment2();
                FragmentManager fragmentManager=getSupportFragmentManager();
                fragmentManager.beginTransaction().replace(R.id.linearlayout,fragment2,fragment2.getTag()).commit();


            }
        });

        frag3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Fragment3 fragment3=new Fragment3();
                FragmentManager fragmentManager=getSupportFragmentManager();
                fragmentManager.beginTransaction().replace(R.id.linearlayout,fragment3,fragment3.getTag()).commit();


            }
        });

        frag4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Fragment4 fragment4=new Fragment4();
                FragmentManager fragmentManager=getSupportFragmentManager();
                fragmentManager.beginTransaction().replace(R.id.linearlayout,fragment4,fragment4.getTag()).commit();


            }
        });

        frag5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Fragment5 fragment5=new Fragment5();
                FragmentManager fragmentManager=getSupportFragmentManager();
                fragmentManager.beginTransaction().replace(R.id.linearlayout,fragment5,fragment5.getTag()).commit();


            }
        });

    }
}