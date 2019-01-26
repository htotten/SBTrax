package sbtraxapp.htotten.github.com.sbtrax;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageButton;
import android.view.View.OnClickListener;
import android.view.View;
import android.content.Intent;

public class MainActivity extends AppCompatActivity {


    private ImageButton trail1;
    private ImageButton trail2;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        trail1 = findViewById(R.id.trail1button);
        trail2 = findViewById(R.id.trail2button);

        trail1.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, Trail1Activity.class));
            }
        });
        trail2.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, Trail2Activity.class));
            }
        });
    }




/*
    OnClickListener captureListener = new OnClickListener() {
        @Override
        public void onClick(View v) {


        }
    };*/
}
