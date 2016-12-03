package rtc.surangrat.ratchanok.hangmanword;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class PlayActivity extends AppCompatActivity {

    //Explicit
    private ImageView imageView;

    private EditText editText, editText2, editText3,
            editText4, editText5, editText6;
    private TextView textView;

    private String[] questionStrings, answerString;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play);

        //Bind Widget
        imageView = (ImageView) findViewById(R.id.imageView2);

        editText = (EditText) findViewById(R.id.editText);
        editText2 = (EditText) findViewById(R.id.editText1);
        editText3 = (EditText) findViewById(R.id.editText2);
        editText4 = (EditText) findViewById(R.id.editText3);
        editText5 = (EditText) findViewById(R.id.editText4);
        editText6 = (EditText) findViewById(R.id.editText5);
        textView = (TextView) findViewById(R.id.textView3);

        //Setup





        //Exit Controller
        editTextController1();








        setupTextView(0);


    } // Mani Method

    private void editTextController1() {

        editText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                Log.d("26novV1", "beforTextChanged");
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                Log.d("26novV1", "TextChanged");
            }

            @Override
            public void afterTextChanged(Editable editable) {
                Log.d("26novV1", "afterTextChanged");
            }
        });


    }

    private void setupTextView(int index) {

        textView.setText(answerString[index]);


    }

} //Main Class
