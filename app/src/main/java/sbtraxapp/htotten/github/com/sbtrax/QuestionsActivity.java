package sbtraxapp.htotten.github.com.sbtrax;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

public class QuestionsActivity extends AppCompatActivity {
    //public variabes for access within functions
    public TextView wild;
    public Integer wildNum;
    public Spinner wildSpinner;
    public TextView plant;
    public Integer plantNum;
    public Spinner plantSpinner;
    public TextView aid;
    public Integer aidNum;
    public Spinner aidSpinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_questions);

        wild = (TextView) findViewById(R.id.wildtext);
        plant = (TextView) findViewById(R.id.plantstext);
        aid = (TextView) findViewById(R.id.aidtext);


        //get the spinners from the xml.
        wildSpinner = findViewById(R.id.spinnerCayote);
        plantSpinner = findViewById(R.id.spinnerPlants);
        aidSpinner = findViewById(R.id.spinnerAid);
        //create a list of questions
        String[] itemsWild = new String[]{"Wildlife", "What to do if you see a cayote?", "What to do if you see a rattlesnake?"};
        String[] itemsPlants = new String[]{"Plantlife", "What to do if you encounter poison oak?", "What can you do with the yucca plant?"};
        String[] itemsAid = new String[]{"First Aid", "How to avoid a sunburn?", "What to do if you suffer a spinal cord injury?"};

        //adapter to describe how the items are displayed
        ArrayAdapter<String> adapterW = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, itemsWild);
        ArrayAdapter<String> adapterP = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, itemsPlants);
        ArrayAdapter<String> adapterA = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, itemsAid);

        //set the spinners adapter to the previously created one.
        wildSpinner.setAdapter(adapterW);
        plantSpinner.setAdapter(adapterP);
        aidSpinner.setAdapter(adapterA);

        wildSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener(){

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }

            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                wildNum = wildSpinner.getSelectedItemPosition();
                switch (wildNum){
                    case 0:
                        wild.setText("");
                        break;
                    case 1:
                        wild.setText("Make a lot of noise. If you are in a group, stick together.");
                        break;

                    case 2:
                        wild.setText("Back away slowly.");
                        break;

                }

            }
        });

        //set the answer for the plant spinner
        plantSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener(){

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }

            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                plantNum = plantSpinner.getSelectedItemPosition();
                switch (plantNum){
                    case 0:
                        plant.setText("");
                        break;
                    case 1:
                        plant.setText("Shower in cold water and apply hydrocortisone cream.");
                        break;

                    case 2:
                        plant.setText("Use the plant for string.");
                        break;

                }

            }
        });

        //set the answer for the first aid spinner
        aidSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener(){

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }

            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                aidNum = aidSpinner.getSelectedItemPosition();
                switch (aidNum){
                    case 0:
                        aid.setText("");
                        break;
                    case 1:
                        aid.setText("Wear sunscreen. Increase UV protection by 5% per 1000 ft of altitude.");
                        break;

                    case 2:
                        aid.setText("Do not move the victim. Keep the victim's spine, head and neck aligned.");
                        break;

                }

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
