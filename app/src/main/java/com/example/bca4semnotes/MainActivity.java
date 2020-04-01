package com.example.bca4semnotes;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import com.example.bca4semnotes.Fragments.computer_architecture;
import com.example.bca4semnotes.Fragments.conam_fragment;
import com.example.bca4semnotes.Fragments.graphics_fragment;
import com.example.bca4semnotes.Fragments.os_fragment;
import com.example.bca4semnotes.Fragments.vbnet_fragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    BottomNavigationView BNV;
    int flag=0,flag2=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BNV=findViewById(R.id.Bottom_navigation);
        loadFragment(new vbnet_fragment());
        BNV.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                int id = item.getItemId();

                if (id==R.id.item1){
                    //vb.net
                    loadFragment(new vbnet_fragment());

                } else if (id==R.id.item2){
                    //conum
                    loadFragment(new conam_fragment());

                } else if (id==R.id.item3){
                    //os
                    loadFragment(new os_fragment()  );

                } else if (id==R.id.item4){
                    //graphics
                    loadFragment(new graphics_fragment());

                } else if (id==R.id.item5){
                    //coa
                    loadFragment(new computer_architecture());
                }
                return true;
            }
        });

    }

    private void loadFragment(Fragment fragment) {

        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        if(flag==0) {
            flag++;
            ft.add(R.id.fragment, fragment);
        }


        else
            ft.replace(R.id.fragment,fragment);

        ft.commit();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.upermenu,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
switch (item.getItemId()){
    case R.id.about:
        Intent i = new Intent(MainActivity.this,Main2Activity_abt.class);
        startActivity(i);

        break;}
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onBackPressed() {
        if (flag2==0){
            Toast.makeText(this, "Press again to Exit.", Toast.LENGTH_SHORT).show();
            flag2=1;


            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {
                    flag2=0;
                }
            },1000);
        } else {
            super.onBackPressed();
        }
    }


}
