package ru.kekes.scoretable;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

// TODO: Изменить интерфейс, в частности добавить загрузочную анимацию.
// TODO: Добавить поддержку футбола, баскетбола и хоккея
public class MainActivity extends AppCompatActivity {
    static Integer leftScore = 0;
    static Integer leftParties = 0;
    static Integer rightScore = 0;
    static Integer rightParties = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        menu.add("menu1");
        menu.add("menu2");
        menu.add("menu3");
        menu.add("menu4");
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
            Toast.makeText(this, "There is no settings yet", Toast.LENGTH_SHORT).show();
            return true;
        } else Toast.makeText(this, "This is " + item.getTitle(), Toast.LENGTH_SHORT).show();

        return super.onOptionsItemSelected(item);
    }


    public void plusOne(View view) {

        if (view == findViewById(R.id.leftPlus)) {
            TextView leftScoreView = (TextView) findViewById(R.id.leftScoreView);
            TextView leftPartiesView = (TextView) findViewById(R.id.leftParties);
            TextView rightScoreView = (TextView) findViewById(R.id.rightScoreView);
            TextView rightPartiesView = (TextView) findViewById(R.id.rightParties);
            leftScore++;

            if (leftScore >= 25 && leftScore - rightScore >= 2) {
                leftScore = 0;
                rightScore = 0;
                leftParties++;
            }
            leftScoreView.setText(leftScore.toString());
            rightScoreView.setText(rightScore.toString());
            leftPartiesView.setText(leftParties.toString());
            rightPartiesView.setText(rightParties.toString());
        } else if (view == findViewById(R.id.rightPlus)){
            TextView leftScoreView = (TextView) findViewById(R.id.leftScoreView);
            TextView leftPartiesView = (TextView) findViewById(R.id.leftParties);
            TextView rightScoreView = (TextView) findViewById(R.id.rightScoreView);
            TextView rightPartiesView = (TextView) findViewById(R.id.rightParties);
            rightScore++;

            if (rightScore >= 25 && rightScore - leftScore >=2) {
                leftScore = 0;
                rightScore = 0;
                rightParties++;
            }
            leftScoreView.setText(leftScore.toString());
            rightScoreView.setText(rightScore.toString());
            leftPartiesView.setText(leftParties.toString());
            rightPartiesView.setText(rightParties.toString());
        }
    }

    public void minusOne(View view) {
        if (view == findViewById(R.id.leftMinus)) {
            TextView leftScoreView = (TextView) findViewById(R.id.leftScoreView);
            leftScore--;
            if (leftScore < 0) leftScore = 0;
            leftScoreView.setText(leftScore.toString());
        } else if (view == findViewById(R.id.rightMinus)){
            TextView rightScoreView = (TextView) findViewById(R.id.rightScoreView);
            rightScore--;
            if (rightScore < 0) rightScore = 0;
            rightScoreView.setText(rightScore.toString());
        }
    }

    public void clean(View view) {
        TextView leftScoreView = (TextView) findViewById(R.id.leftScoreView);
        TextView rightScoreView = (TextView) findViewById(R.id.rightScoreView);
        TextView leftPartiesView = (TextView) findViewById(R.id.leftParties);
        TextView rightPartiesView = (TextView) findViewById(R.id.rightParties);

        rightScore = 0;
        leftScore = 0;
        rightParties = 0;
        leftParties = 0;

        leftScoreView.setText(leftScore.toString());
        rightScoreView.setText(rightScore.toString());
        leftPartiesView.setText(leftParties.toString());
        rightPartiesView.setText(rightParties.toString());
    }

    public void showScore(View view){
        TextView leftScoreView = (TextView) findViewById(R.id.leftScoreView);
        TextView rightScoreView = (TextView) findViewById(R.id.rightScoreView);
        TextView leftPartiesView = (TextView) findViewById(R.id.leftParties);
        TextView rightPartiesView = (TextView) findViewById(R.id.rightParties);

        leftScoreView.setText(leftScore.toString());
        rightScoreView.setText(rightScore.toString());
        leftPartiesView.setText(leftParties.toString());
        rightPartiesView.setText(rightParties.toString());
    }


}
