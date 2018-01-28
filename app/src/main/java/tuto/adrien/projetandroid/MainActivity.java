package tuto.adrien.projetandroid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import tuto.adrien.projetandroid.BC.bc;
import tuto.adrien.projetandroid.Cata.Cata;
import tuto.adrien.projetandroid.Legion.Legion;
import tuto.adrien.projetandroid.Mop.Mop;
import tuto.adrien.projetandroid.Vanilla.Vanilla;
import tuto.adrien.projetandroid.Wod.Wod;
import tuto.adrien.projetandroid.Woltk.Wotlk;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        final ImageButton vanillabutton = findViewById(R.id.vanillabutton);
        vanillabutton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Vanilla.class);
                startActivity(intent);
            }
        });

        final ImageButton bcbutton = findViewById(R.id.bcbutton);
        bcbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent2 = new Intent(MainActivity.this, bc.class);
                startActivity(intent2);
            }
        });

        final ImageButton wotlkbutton = findViewById(R.id.wotlkbutton);
        wotlkbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent3 = new Intent(MainActivity.this, Wotlk.class);
                startActivity(intent3);
            }
        });

        final ImageButton catabutton = findViewById(R.id.catabutton);
        catabutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent4 = new Intent(MainActivity.this, Cata.class);
                startActivity(intent4);
            }
        });

        final ImageButton mopbutton = findViewById(R.id.mopbutton);
        mopbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent5 = new Intent(MainActivity.this, Mop.class);
                startActivity(intent5);
            }
        });

        final ImageButton wodbutton = findViewById(R.id.wodbutton);
        wodbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent6 = new Intent(MainActivity.this, Wod.class);
                startActivity(intent6);
            }
        });

        final ImageButton legionbutton = findViewById(R.id.legionbutton);
        legionbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent7 = new Intent(MainActivity.this, Legion.class);
                startActivity(intent7);
            }
        });

    }
}
