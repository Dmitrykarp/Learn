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
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);
        textView= (TextView)findViewById(R.id.textView);
        textView2= (TextView)findViewById(R.id.textView2);
        bMense=(Button)findViewById(R.id.bLft);
        bBolse=(Button) findViewById(R.id.bRght);
        bGuess=(Button) findViewById(R.id.bGss);
      //  textView.setText("Вы загадали " +50 +"?");
        column=0;
        textView2.setText(" " +column +" ");

    }
     int x=100;
     int y=0;
     int a=0; // х y - Диапазон,
    int column;
    public void setTextView(TextView textView) {
        this.textView = textView;
    }
    public void bMense(View view){
        column++;
        a=y+(x-y)/2;
        textView.setText("Вы загадали " +a +"?");
        textView2.setText(" " +column +" ");
        x=a-1;
    }
    public void bBolse(View view){
        column++;

        a=y+(x-y)/2;;
        textView.setText("Вы загадали " +a +"?");
        textView2.setText(" " +column +" ");
        y=a+1;
    }
    public void bGuess(View view){
        textView.setText("Угадал!");
    }
}
