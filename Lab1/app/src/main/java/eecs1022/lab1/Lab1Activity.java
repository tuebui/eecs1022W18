package eecs1022.lab1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class Lab1Activity extends AppCompatActivity {
    private Button compute;
    private EditText name;
    private EditText enterheight;
    private EditText enterweight;
    private Spinner weight;
    private Spinner height;
    private TextView result;
    private TextView status;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lab1);
        name = (EditText)findViewById(R.id.name);
        enterheight = (EditText)findViewById(R.id.enterheight);
        enterweight = (EditText)findViewById(R.id.enterweight);
        weight = (Spinner)findViewById(R.id.weight);
        height = (Spinner)findViewById(R.id.height);
        result = (TextView)findViewById(R.id.result);
        status = (TextView)findViewById(R.id.status);
        compute = (Button)findViewById(R.id.compute);
        compute.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //TODO
                Double enterheight1 = Double.parseDouble(enterheight.getText().toString());
                Double enterweight1 = Double.parseDouble(enterweight.getText().toString());
                String weightunits = weight.getSelectedItem().toString();
                String heightunits = height.getSelectedItem().toString();
                if(heightunits.equals("inches")){
                    enterheight1 = enterheight1 * 2.54;
                }
                if(weightunits.equals("pounds")){
                    enterweight1 = enterweight1 * 0.45359237;
                }
                Double computeBMI = enterweight1/enterheight1 * enterheight1;
                String result1 = name + "'s BMI is: " + computeBMI;
                result.setText(result1);
                if(computeBMI < 18.5){
                    status.setText("you're underweight");
                } if(18.5<=computeBMI && computeBMI<25.0){
                    status.setText("you're normal");
                } if(25.0<=computeBMI && computeBMI<30.0){
                    status.setText("you're overweight");
                } else status.setText("you're obese");
            }
        });
    }
}
