package sbtraxapp.htotten.github.com.sbtrax;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

public class Trail2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trail2);
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
