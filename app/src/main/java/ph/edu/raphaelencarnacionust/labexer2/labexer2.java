package ph.edu.raphaelencarnacionust.labexer2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class labexer2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_labexer2);

        Button submitButton = (Button) findViewById(R.id.submitButton);
        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {




                final TextView resultTextView1 = (TextView) findViewById(R.id.resultTextView1);
                for (int i = 0; i<=19; i++){
                    if ((i % 2) == 0){
                        resultTextView1.append(i + ", ");
                    }
                }
            }
        });

    }

}

