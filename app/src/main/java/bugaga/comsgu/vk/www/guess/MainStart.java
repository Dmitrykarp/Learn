package bugaga.comsgu.vk.www.guess;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by Support on 26.01.2015.
 */
public class MainStart extends ActionBarActivity {
    private TextView textView;
    private TextView textView2;
    private Button bMense;
    private Button bBolse;
    private Button bGuess;

    int left=1;
    int right=100;
    int a=(left+right)/2; // х y - Диапазон,

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);
        textView= (TextView)findViewById(R.id.textView);
        textView2= (TextView)findViewById(R.id.textView2);
        bMense=(Button)findViewById(R.id.bLft);
        bBolse=(Button) findViewById(R.id.bRght);
        bGuess=(Button) findViewById(R.id.bGss);
        textView.setText("Вы загадали " +a +"?");
        column=1;
        textView2.setText(" " +column +" ");

    }

    int column;
    public void setTextView(TextView textView) {
        this.textView = textView;
    }
    public void bMense(View view){
        if(left==right){textView.setText("Нет! Вы загадали " + a + "!");} else {
            column++;
            right = a - 1;
            a = (left + right) / 2;
            textView.setText("Вы загадали " + a + "?");
            textView2.setText(" " + column + " ");
        }
    }
    public void bBolse(View view){
        if(left==right){textView.setText("Нет! Вы загадали " + a + "!");} else {
            column++;
            left = a + 1;
            a = (left + right) / 2;
            textView.setText("Вы загадали " + a + "?");
            textView2.setText(" " + column + " ");
        }
    }
    public void bGuess(View view){
        textView.setText("Угадал!");
    }
}
