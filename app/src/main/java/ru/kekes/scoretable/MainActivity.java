package ru.kekes.scoretable;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }


    public void plusOne(View view) {
        TextView scoreView;
        Integer score;
        if (view == findViewById(R.id.leftPlus)){
            scoreView = (TextView) findViewById(R.id.leftScore);
        } else {
            scoreView = (TextView) findViewById(R.id.rightScore);
        }
        score = Integer.parseInt(scoreView.getText().toString());
        score++;
        scoreView.setText(score.toString());
    }

    public void minusOne(View view) {
        TextView scoreView;
        Integer score;

        if (view == findViewById(R.id.leftMinus)){
            scoreView = (TextView) findViewById(R.id.leftScore);
        } else {
            scoreView = (TextView) findViewById(R.id.rightScore);
        }

        score = Integer.parseInt(scoreView.getText().toString());
        score--;

        if (score < 0) score = 0;

        scoreView.setText(score.toString());
    }

    public void clean(View view) {

        TextView leftScore = (TextView) findViewById(R.id.leftScore);
        TextView rightScore = (TextView) findViewById(R.id.rightScore);

        leftScore.setText(new Integer(0).toString());
        rightScore.setText(new Integer(0).toString());
        //
    }


}
