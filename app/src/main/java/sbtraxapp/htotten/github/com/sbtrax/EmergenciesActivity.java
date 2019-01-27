package sbtraxapp.htotten.github.com.sbtrax;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class EmergenciesActivity extends AppCompatActivity {
    private FloatingActionButton btn;
    private boolean clicked;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_emergencies);

        btn = (FloatingActionButton) findViewById(R.id.emergencyButton);
        final MediaPlayer mp = MediaPlayer.create(this, R.raw.alarm2);


        btn.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view){
                if(!clicked){
                    mp.start();
                    clicked = true;
                }
                else{
                    mp.stop();
                    clicked = false;
                }

            }
        });


    }
}
