package sbtraxapp.htotten.github.com.sbtrax;

import android.media.MediaPlayer;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.ImageButton;
import android.view.View.OnClickListener;
import android.view.View;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    private Button trail1;
    private Button trail2;
    private Button trail3;
    private Button trail4;
    private Button trail5;
    private ImageButton wildLife;
    TextView txt;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        trail1 = findViewById(R.id.trail1button);
        trail2 = findViewById(R.id.trail2button);
        trail3 = findViewById(R.id.trail3button);
        trail4 = findViewById(R.id.trail4button);
        trail5 = findViewById(R.id.trail5button);
        wildLife = findViewById(R.id.wildlifebutton);


        //Handling clicking on images
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
        trail3.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, Trail3Activity.class));
            }
        });
        trail4.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, Trail4Activity.class));
            }
        });
        trail5.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, Trail5Activity.class));
            }
        });


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.upper_menu,menu);
        return true;
    }

    @Override
    //get passed the item that was clicked
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.trails:
                Intent intentTrail = new Intent(this, MainActivity.class);
                startActivity(intentTrail);
                return true;
            case R.id.questions:
                Intent intentQ = new Intent(this, QuestionsActivity.class);
                startActivity(intentQ);
                return true;
            case R.id.emergencies:
                Intent intentE = new Intent(this, EmergenciesActivity.class);
                startActivity(intentE);
                return true;
        }
        return false;
    }


}
