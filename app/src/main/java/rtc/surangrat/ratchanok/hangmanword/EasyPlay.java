package rtc.surangrat.ratchanok.hangmanword;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class EasyPlay extends AppCompatActivity {

    private EditText editText, editText2, editText3, editText4;
    private TextView timeTextView, scoreTextView, questionTextView;
    private int scoreAnInt = 0, timeAnInt = 30, wordAnInt = 0, index = 0;
    private MyConstant myConstant;
    private String[] questionStrings, answerStrings;
    private TextView textView1, textView2, textView3, textView4;
    private TextView[] textViews;
    private EditText[] editTexts;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_easy_play);

        bindWidget();

        textViews = new TextView[]{textView1, textView2, textView3, textView4};
        editTexts = new EditText[]{editText, editText2, editText3, editText4};

        myConstant = new MyConstant();
        questionStrings = myConstant.getQuestionStrings();
        answerStrings = myConstant.getAnswerStrings();



        checkTime();

        checkWord(0);

        changeView(0);


    }   // Main Method

    private void changeView(int index) {

        questionTextView.setText(questionStrings[index]);

    }

    private void checkWord(int indexWord) {

        String[] strings = answerStrings[index].split("");

        for (int i = 0; i < strings.length; i++) {
            Log.d("1decV1", "strings(" + i + ")= " + strings[i]);
        }

        myCheck(editTexts[indexWord],textViews[indexWord]);

    }   // checkWord

    private void myCheck(final EditText editText, final TextView textView) {

        editText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                Log.d("1decV1", "onTextChanged");
                String s = editText.getText().toString();
                Log.d("1decV1", "s ==> " + s);

               textView.setText(s);
                editText.setVisibility(View.INVISIBLE);



            }   // onTextChange

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });

    }   // myCheck

    private void checkTime() {

        if (timeAnInt == 0) {
//            Intent intent = new Intent(EasyPlay.this, ShowScore.class);
//            startActivity(intent);
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
        textView1 = (TextView) findViewById(R.id.textView6);
        textView2 = (TextView) findViewById(R.id.textview7);
        textView3 = (TextView) findViewById(R.id.textview8);
        textView4 = (TextView) findViewById(R.id.textview9);
    }

}   // Main Class
