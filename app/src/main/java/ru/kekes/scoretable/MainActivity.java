package ru.kekes.scoretable;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    static int leftScore = 0;
    static int rightScore = 0;

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

        if (view == findViewById(R.id.leftPlus)) {
            ImageView leftScoreTensView = (ImageView) findViewById(R.id.leftTens);
            ImageView leftScoreOnesView = (ImageView) findViewById(R.id.leftOnes);
            leftScore++;
            int leftScoreTens = leftScore / 10;
            int leftScoreOnes = leftScore % 10;

            switch (leftScoreOnes) {
                case 0: {leftScoreOnesView.setImageResource(R.drawable.ic_num_0); break;}
                case 1: {leftScoreOnesView.setImageResource(R.drawable.ic_num_1); break;}
                case 2: {leftScoreOnesView.setImageResource(R.drawable.ic_num_2); break;}
                case 3: {leftScoreOnesView.setImageResource(R.drawable.ic_num_3); break;}
                case 4: {leftScoreOnesView.setImageResource(R.drawable.ic_num_4); break;}
                case 5: {leftScoreOnesView.setImageResource(R.drawable.ic_num_5); break;}
                case 6: {leftScoreOnesView.setImageResource(R.drawable.ic_num_6); break;}
                case 7: {leftScoreOnesView.setImageResource(R.drawable.ic_num_7); break;}
                case 8: {leftScoreOnesView.setImageResource(R.drawable.ic_num_8); break;}
                case 9: {leftScoreOnesView.setImageResource(R.drawable.ic_num_9); break;}
            }

            switch (leftScoreTens) {
                case 0: {leftScoreTensView.setImageResource(R.drawable.ic_num_0); break;}
                case 1: {leftScoreTensView.setImageResource(R.drawable.ic_num_1); break;}
                case 2: {leftScoreTensView.setImageResource(R.drawable.ic_num_2); break;}
                case 3: {leftScoreTensView.setImageResource(R.drawable.ic_num_3); break;}
                case 4: {leftScoreTensView.setImageResource(R.drawable.ic_num_4); break;}
                case 5: {leftScoreTensView.setImageResource(R.drawable.ic_num_5); break;}
                case 6: {leftScoreTensView.setImageResource(R.drawable.ic_num_6); break;}
                case 7: {leftScoreTensView.setImageResource(R.drawable.ic_num_7); break;}
                case 8: {leftScoreTensView.setImageResource(R.drawable.ic_num_8); break;}
                case 9: {leftScoreTensView.setImageResource(R.drawable.ic_num_9); break;}
            }
        } else if (view == findViewById(R.id.rightPlus)){
            ImageView rightScoreTensView = (ImageView) findViewById(R.id.rightTens);
            ImageView rightScoreOnesView = (ImageView) findViewById(R.id.rightOnes);
            rightScore++;
            int rightScoreTens = rightScore / 10;
            int rightScoreOnes = rightScore % 10;

            switch (rightScoreOnes) {
                case 0: {rightScoreOnesView.setImageResource(R.drawable.ic_num_0); break;}
                case 1: {rightScoreOnesView.setImageResource(R.drawable.ic_num_1); break;}
                case 2: {rightScoreOnesView.setImageResource(R.drawable.ic_num_2); break;}
                case 3: {rightScoreOnesView.setImageResource(R.drawable.ic_num_3); break;}
                case 4: {rightScoreOnesView.setImageResource(R.drawable.ic_num_4); break;}
                case 5: {rightScoreOnesView.setImageResource(R.drawable.ic_num_5); break;}
                case 6: {rightScoreOnesView.setImageResource(R.drawable.ic_num_6); break;}
                case 7: {rightScoreOnesView.setImageResource(R.drawable.ic_num_7); break;}
                case 8: {rightScoreOnesView.setImageResource(R.drawable.ic_num_8); break;}
                case 9: {rightScoreOnesView.setImageResource(R.drawable.ic_num_9); break;}
            }

            switch (rightScoreTens) {
                case 0: {rightScoreTensView.setImageResource(R.drawable.ic_num_0); break;}
                case 1: {rightScoreTensView.setImageResource(R.drawable.ic_num_1); break;}
                case 2: {rightScoreTensView.setImageResource(R.drawable.ic_num_2); break;}
                case 3: {rightScoreTensView.setImageResource(R.drawable.ic_num_3); break;}
                case 4: {rightScoreTensView.setImageResource(R.drawable.ic_num_4); break;}
                case 5: {rightScoreTensView.setImageResource(R.drawable.ic_num_5); break;}
                case 6: {rightScoreTensView.setImageResource(R.drawable.ic_num_6); break;}
                case 7: {rightScoreTensView.setImageResource(R.drawable.ic_num_7); break;}
                case 8: {rightScoreTensView.setImageResource(R.drawable.ic_num_8); break;}
                case 9: {rightScoreTensView.setImageResource(R.drawable.ic_num_9); break;}
            }
        }
    }

    public void minusOne(View view) {
        if (view == findViewById(R.id.leftMinus)) {
            ImageView leftScoreTensView = (ImageView) findViewById(R.id.leftTens);
            ImageView leftScoreOnesView = (ImageView) findViewById(R.id.leftOnes);
            leftScore--;
            if (leftScore < 0) leftScore = 0;
            int leftScoreTens = leftScore / 10;
            int leftScoreOnes = leftScore % 10;

            switch (leftScoreOnes) {
                case 1: {leftScoreOnesView.setImageResource(R.drawable.ic_num_1); break;}
                case 2: {leftScoreOnesView.setImageResource(R.drawable.ic_num_2); break;}
                case 3: {leftScoreOnesView.setImageResource(R.drawable.ic_num_3); break;}
                case 4: {leftScoreOnesView.setImageResource(R.drawable.ic_num_4); break;}
                case 5: {leftScoreOnesView.setImageResource(R.drawable.ic_num_5); break;}
                case 6: {leftScoreOnesView.setImageResource(R.drawable.ic_num_6); break;}
                case 7: {leftScoreOnesView.setImageResource(R.drawable.ic_num_7); break;}
                case 8: {leftScoreOnesView.setImageResource(R.drawable.ic_num_8); break;}
                case 9: {leftScoreOnesView.setImageResource(R.drawable.ic_num_9); break;}
                default: {leftScoreOnesView.setImageResource(R.drawable.ic_num_0); break;}
            }

            switch (leftScoreTens) {
                case 1: {leftScoreTensView.setImageResource(R.drawable.ic_num_1); break;}
                case 2: {leftScoreTensView.setImageResource(R.drawable.ic_num_2); break;}
                case 3: {leftScoreTensView.setImageResource(R.drawable.ic_num_3); break;}
                case 4: {leftScoreTensView.setImageResource(R.drawable.ic_num_4); break;}
                case 5: {leftScoreTensView.setImageResource(R.drawable.ic_num_5); break;}
                case 6: {leftScoreTensView.setImageResource(R.drawable.ic_num_6); break;}
                case 7: {leftScoreTensView.setImageResource(R.drawable.ic_num_7); break;}
                case 8: {leftScoreTensView.setImageResource(R.drawable.ic_num_8); break;}
                case 9: {leftScoreTensView.setImageResource(R.drawable.ic_num_9); break;}
                default: {leftScoreTensView.setImageResource(R.drawable.ic_num_0); break;}
            }
        } else if (view == findViewById(R.id.rightMinus)){
            ImageView rightScoreTensView = (ImageView) findViewById(R.id.rightTens);
            ImageView rightScoreOnesView = (ImageView) findViewById(R.id.rightOnes);
            rightScore--;
            if (rightScore < 0) rightScore = 0;
            int rightScoreTens = rightScore / 10;
            int rightScoreOnes = rightScore % 10;

            switch (rightScoreOnes) {
                case 1: {rightScoreOnesView.setImageResource(R.drawable.ic_num_1); break;}
                case 2: {rightScoreOnesView.setImageResource(R.drawable.ic_num_2); break;}
                case 3: {rightScoreOnesView.setImageResource(R.drawable.ic_num_3); break;}
                case 4: {rightScoreOnesView.setImageResource(R.drawable.ic_num_4); break;}
                case 5: {rightScoreOnesView.setImageResource(R.drawable.ic_num_5); break;}
                case 6: {rightScoreOnesView.setImageResource(R.drawable.ic_num_6); break;}
                case 7: {rightScoreOnesView.setImageResource(R.drawable.ic_num_7); break;}
                case 8: {rightScoreOnesView.setImageResource(R.drawable.ic_num_8); break;}
                case 9: {rightScoreOnesView.setImageResource(R.drawable.ic_num_9); break;}
                default: {rightScoreOnesView.setImageResource(R.drawable.ic_num_0); break;}
            }

            switch (rightScoreTens) {
                case 1: {rightScoreTensView.setImageResource(R.drawable.ic_num_1); break;}
                case 2: {rightScoreTensView.setImageResource(R.drawable.ic_num_2); break;}
                case 3: {rightScoreTensView.setImageResource(R.drawable.ic_num_3); break;}
                case 4: {rightScoreTensView.setImageResource(R.drawable.ic_num_4); break;}
                case 5: {rightScoreTensView.setImageResource(R.drawable.ic_num_5); break;}
                case 6: {rightScoreTensView.setImageResource(R.drawable.ic_num_6); break;}
                case 7: {rightScoreTensView.setImageResource(R.drawable.ic_num_7); break;}
                case 8: {rightScoreTensView.setImageResource(R.drawable.ic_num_8); break;}
                case 9: {rightScoreTensView.setImageResource(R.drawable.ic_num_9); break;}
                default: {rightScoreTensView.setImageResource(R.drawable.ic_num_0); break;}
            }
        }
    }

    public void clean(View view) {

        rightScore = 0;
        leftScore = 0;

        ImageView leftOnes = (ImageView) findViewById(R.id.leftOnes);
        ImageView rightOnes = (ImageView) findViewById(R.id.rightOnes);
        ImageView leftTens = (ImageView) findViewById(R.id.leftTens);
        ImageView rightTens = (ImageView) findViewById(R.id.rightTens);

        leftOnes.setImageResource(R.drawable.ic_num_0);
        leftTens.setImageResource(R.drawable.ic_num_0);
        rightOnes.setImageResource(R.drawable.ic_num_0);
        rightTens.setImageResource(R.drawable.ic_num_0);

    }


}
