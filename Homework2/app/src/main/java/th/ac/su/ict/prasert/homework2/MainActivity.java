package th.ac.su.ict.prasert.homework2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.graphics.Color;

public class MainActivity extends AppCompatActivity {

    private TextView boxColor ;
    private TextView textColor ;
    private Button btn1;
    private Button btn2;
    private Button btn3;
    private Button btn4;
    private Button btn5;
    private Button btn6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        boxColor = findViewById(R.id.boxColor);

        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        btn5 = findViewById(R.id.btn5);
        btn6 = findViewById(R.id.btn6);


        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                boxColor.setText("235-255-221");

                boxColor.setBackgroundColor(Color.rgb(235,225,221));
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                boxColor.setText("235-203-202");

                boxColor.setBackgroundColor(Color.rgb(235,203,202));
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                boxColor.setText("117-131-156");

                boxColor.setBackgroundColor(Color.rgb(117,131,156));
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                boxColor.setText("153-169-191");

                boxColor.setBackgroundColor(Color.rgb(153,169,191));

            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                boxColor.setText("195-204-216");

                boxColor.setBackgroundColor(Color.rgb(195,204,216));

            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                boxColor.setText("221-226-229");

                boxColor.setBackgroundColor(Color.rgb(221,226,229));

            }
        });




    }


}
