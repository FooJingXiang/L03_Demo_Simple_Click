package sg.edu.rp.c346.id20011262.demosimpleclick;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ToggleButton;
import android.widget.RadioGroup;

public class MainActivity2 extends AppCompatActivity {

    TextView tvDisplay;
    Button btnClick;
    EditText etInput;
    ToggleButton tbtnSVS;
    ToggleButton tbtnGST;
    RadioGroup rgPayment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        etInput = findViewById(R.id.editTextAmt);
        btnClick = findViewById(R.id.buttonSplit);
        btnClick = findViewById(R.id.buttonReset);
        tbtnSVS = findViewById(R.id.toggleButtonSVS);
        tbtnGST = findViewById(R.id.toggleButtonGST);

        tbtnSVS.setOnClickListener(new View.OnClickListener() {
            @Override

        });
        public void (click) {
            if(amount.getText().)
        }


    }
}