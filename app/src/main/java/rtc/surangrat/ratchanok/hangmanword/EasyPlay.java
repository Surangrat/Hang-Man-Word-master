package rtc.surangrat.ratchanok.hangmanword;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.widget.EditText;
import android.widget.TextView;

public class EasyPlay extends AppCompatActivity {

    private EditText editText, editText2, editText3, editText4;
    private TextView timeTextView, scoreTextView, questionTextView;
    private int scoreAnInt = 0, timeAnInt = 30, wordAnInt = 0, index = 0;
    private MyConstant myConstant;
    private String[] questionStrings, answerStrings;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_easy_play);

        myConstant = new MyConstant();
        questionStrings = myConstant.getQuestionStrings();
        answerStrings = myConstant.getAnswerStrings();

        bindWidget();

        checkTime();

        checkWord(0);

        changeView(0);


    }   // Main Method

    private void changeView(int index) {

        questionTextView.setText(questionStrings[index]);

    }

    private void checkWord(int indexWord) {

        String[] strings = answerStrings[index].split("");

        for (int i=0;i<strings.length;i++) {
            Log.d("1decV1", "strings(" + i + ")= " + strings[i]);
        }

        switch (indexWord) {
            case 0:
                myCheck(editText);
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
        }   // switch

    }   // checkWord

    private void myCheck(final EditText editText) {

        editText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                Log.d("1decV1", "onTextChanged");
                String s = editText.getText().toString();
                Log.d("1decV1", "s ==> " + s);

            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });

    }   // myCheck

    private void checkTime() {

        if (timeAnInt == 0) {
            Intent intent = new Intent(EasyPlay.this, ShowScore.class);
            startActivity(intent);
        }   // if

        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                timeAnInt -= 1;
                timeTextView.setText(Integer.toString(timeAnInt) + " Sec");
                checkTime();
            }
        }, 1000);

    }   // checkTime

    private void bindWidget() {
        editText = (EditText) findViewById(R.id.editText);
        editText2 = (EditText) findViewById(R.id.editText2);
        editText3 = (EditText) findViewById(R.id.editText3);
        editText4 = (EditText) findViewById(R.id.editText4);
        timeTextView = (TextView) findViewById(R.id.textView4);
        scoreTextView = (TextView) findViewById(R.id.textView5);
        questionTextView = (TextView) findViewById(R.id.textView3);
    }

}   // Main Class
