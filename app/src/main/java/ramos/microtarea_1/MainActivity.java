package ramos.microtarea_1;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    String[] marca_vehiculo = {"Audi", "BMW", "Chevrolet", "Dacia", "Great Wall", "Kia", "Mazda", "Peugeot"};

    private static Button btn_rating;
    private static RatingBar rtg_bar;
    private static TextView txt_rating;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        onButtonClickListener();

        ArrayAdapter<String> adapter = new ArrayAdapter<String>
                (this, android.R.layout.select_dialog_item, marca_vehiculo);

        AutoCompleteTextView actv = (AutoCompleteTextView) findViewById(R.id.autoCompleteTextView);
        actv.setThreshold(1);
        actv.setAdapter(adapter);

    }

    public void onButtonClickListener(){

        rtg_bar = (RatingBar) findViewById(R.id.ratingBar);
        btn_rating = (Button) findViewById(R.id.button);
        txt_rating = (TextView) findViewById(R.id.textView2);

        btn_rating.setOnClickListener(
                new View.OnClickListener(){
                    @Override
                    public void onClick(View v){

                        txt_rating.setText(String.valueOf(rtg_bar.getRating()));

                    }

                }
        );

    }
}
