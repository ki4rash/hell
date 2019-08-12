package com.lucifer.hell;

import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button btnOpenDrawer = findViewById(R.id.showdrawer);
        final DrawerLayout drawer = findViewById(R.id.drawer);
        TextView txtView = findViewById(R.id.txtitem);


        androidx.recyclerview.widget.RecyclerView recycler = findViewById(R.id.Recyclerview);
        RecyclerView adapter = new Recycl();
        recycler.setAdapter(adapter);
        recycler.setLayoutManager(new LinearLayoutManager(MainActivity.this, androidx.recyclerview.widget.RecyclerView.VERTICAL,false));



//        txtView.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//
//                finish();
//            }
//        });


        btnOpenDrawer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                drawer.openDrawer(GravityCompat.START);
            }
        });

    }
}
    }
}
