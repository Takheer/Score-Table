package ru.kekes.scoretable;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

    /*
    TODO: Изменить интерфейс, в частности добавить загрузочную анимацию.
    Фон добавлен, но это, бля, убого. Всерьёз задумываюсь об откате
    TODO: Добавить поддержку футбола, баскетбола и хоккея
    TODO: Учесть правила игры в партиях
    */
public class MainActivity extends AppCompatActivity {
    static Integer leftScore = 0;
    static Integer leftParties = 0;
    static Integer rightScore = 0;
    static Integer rightParties = 0;
    static Integer countOfMaxParties = 2;
    static String teamLeft = "Команда 1";
    static String teamRight = "Команда 2";

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
        if (id == R.id.boobs_in_menu) {
            Intent intent = new Intent(this, SettingsActivity.class);
            startActivity(intent);
            return true;
        }

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
                leftParties++;
                Toast.makeText(this, "Команда " + teamLeft + " выиграла партию со счётом " + leftScore + " : " + rightScore, Toast.LENGTH_LONG).show();
                leftScore = 0;
                rightScore = 0;

                if (leftParties == countOfMaxParties) {
                    Toast.makeText(this, "Команда " + teamLeft + " выиграла со счётом " + leftParties + " : " + rightParties, Toast.LENGTH_LONG).show();
                }
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
                rightParties++;
                Toast.makeText(this, "Команда " + teamRight + " выиграла партию со счётом " + rightScore + " : " + leftScore, Toast.LENGTH_LONG).show();
                leftScore = 0;
                rightScore = 0;

                if (rightParties == countOfMaxParties - 1) {
                    Toast.makeText(this, "Команда " + teamRight + " выиграла со счётом " + rightParties + " : " + leftParties, Toast.LENGTH_LONG).show();
                }
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
