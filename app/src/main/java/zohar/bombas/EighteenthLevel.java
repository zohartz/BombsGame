package zohar.bombas;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class EighteenthLevel extends AppCompatActivity{


    TextView t;
    CountDownTimer reloj;
    int pressed=0;
    double score;
    long cincoMil=2000;
    long leftTime=2000;
    //public static final String TKT="TKT";

    double startTime=System.currentTimeMillis();

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eighteenth_level);
        Dgame.gamePrefs= getSharedPreferences(Dgame.GAME_PREFS, 0);
        Dgame.currLevel=17;
        t=(TextView)findViewById(R.id.tv18);
        reloj=new CountDownTimer(cincoMil,1)
        {


            @Override
            public void onTick(long millisUntilFinished) {
                t.setText("TIME: "+millisUntilFinished/ Dgame.MIL+"."+millisUntilFinished%1000 );

            }

            @Override
            public void onFinish() {
                if(pressed== Dgame.BOMBAS)
                {
                    double endTime=System.currentTimeMillis();
                    score=(endTime-startTime);
                    score=5/(score/1000);
                    score= (double)Math.round(score * 100d) / 100d;
                    Dgame.lentoScore=score;
                    loading();
                    cancel();
                    if(Dgame.xtreme)
                    {
                        finish();//onDestroy() is called right away, without calling onPause() and onStop() before, like usually.
                    }
                }
                else
                {
                    loseByTimer();

                }
            }
        }.start();
    }

    public void loseByTimer()
    {


        Intent intent=new Intent(this, YouLose.class);
        startActivity(intent);
        overridePendingTransition(R.anim.push_left_in, R.anim.push_left_in);


    }

    public void bombPressed(View v)
    {
        if(!v.getTag().equals("touched"))
        {
            v.setBackgroundResource(R.drawable.boom);
            if (pressed == Dgame.BOMBAS - 1) {
                pressed++;
                reloj.onFinish();

            } else {
                if (pressed == 0)//the first button was pressed
                {
                    pressed++;
                    cincoMil = leftTime;
                    reloj.start();
                } else
                    add();
            }
            v.setTag("touched");
        }
    }

    public void add()
    {
        reloj.cancel();
        pressed++;
        cincoMil=leftTime;
        reloj.start();
    }

    public void loading()
    {
        if(!Dgame.xtreme)
        {
            setContentView(R.layout.activity_you_win);
            setScore();
            Dgame.setHighScoreLento(17);
            if(Dgame.gamePrefs.getInt("levelPassed",0)<18)
            {
                Dgame.scoreEdit.putInt("levelPassed", 18);
                Dgame.scoreEdit.commit();
            }
            overridePendingTransition(R.anim.push_left_in,R.anim.push_left_in);
        }
        //setContentView(R.layout.activity_you_win);
        else
        {
            this.setVisible(false);
            Intent intent=new Intent(this, NineteenthLevel.class);
            startActivity(intent);
            Dgame.setHighScoreX(18);

            overridePendingTransition(R.anim.push_left_in, R.anim.push_left_in);
        }
        //setScore();
    }

    public void setScore()
    {

            TextView scoreText=(TextView)findViewById(R.id.youWinScores);
            String stringScore=String.valueOf(score);
            scoreText.setText("Score: " + stringScore);

        }

    public void youLose(View v)
    {
        reloj.cancel();
        Intent intent=new Intent(this, YouLose.class);
        startActivity(intent);
        overridePendingTransition(R.anim.push_left_in, R.anim.push_left_in);
    }

    public void backToSLevelScreen(View v)
    {

        if(Dgame.xtreme)
        {
            Intent intent=new Intent(this, Modes.class);
            startActivity(intent);
            overridePendingTransition(R.anim.push_left_in, R.anim.push_left_in);
        }
        else {
            Intent intent = new Intent(this, PlayScreen.class);
            startActivity(intent);
            overridePendingTransition(R.anim.push_left_in, R.anim.push_left_in);
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_eighteenth_level, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item)
    {

        reloj.cancel();
        if(Dgame.xtreme)
        {
            Intent intent=new Intent(this,MenuScreen.class);
            startActivity(intent);
        }
        else
        {
            Intent intent=new Intent(this,PlayScreen.class);
            startActivity(intent);
        }

        return true;
    }


    protected void onDestroy()
    {
        Dgame.setHighScoreLento(18);
        super.onDestroy();
    }

    @Override
    public void onBackPressed()
    {
        reloj.cancel();
        finish();
    }
}
