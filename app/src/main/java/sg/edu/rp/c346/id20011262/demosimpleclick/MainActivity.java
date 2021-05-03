package sg.edu.rp.c346.id20011262.demosimpleclick;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ToggleButton;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {

    TextView tvDisplay;
    Button btnClick;
    EditText etInput;
    ToggleButton tbtn;
    RadioGroup rgGender;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnClick = findViewById(R.id.buttonDisplay);
        etInput = findViewById(R.id.editTextInput);
        tvDisplay = findViewById(R.id.textViewDisplay);
        tbtn = findViewById(R.id.toggleButton);
        rgGender = findViewById(R.id.radioGroupGender);

        btnClick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String userInput = etInput.getText().toString();
                tvDisplay.setText(userInput);
            }
        });

        tbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(tbtn.isChecked()){
                    etInput.setEnabled(true);
                }
                else {
                    etInput.setEnabled(false);
                }
                // Shorter way of writing the code
                /*etInput.setEnabled(tbtn.isChecked());*/
            }
        });

        btnClick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String userInput = etInput.getText().toString();
                if (rgGender.getCheckedRadioButtonId() == R.id.radioButtonGenderMale) {
                    userInput = "He says " + userInput;
                } else {
                    userInput = "She says " + userInput;
                }
                tvDisplay.setText(userInput);
            }
        });
    }
}