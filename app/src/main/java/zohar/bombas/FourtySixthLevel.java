package zohar.bombas;

import android.content.Intent;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class FourtySixthLevel extends AppCompatActivity {

    TextView t;
    CountDownTimer reloj;
    double score;
    int pressed=0;
    long cincoMil=3000;
    long leftTime=3000;
    double startTime=System.currentTimeMillis();
    RelativeLayout screen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourty_sixth_level);
        screen=(RelativeLayout)findViewById(R.id.ojo);
        Dgame.gamePrefs= getSharedPreferences(Dgame.GAME_PREFS, 0);
        Dgame.currLevel=45;
        t=(TextView)findViewById(R.id.tv46);
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
                        winItAll();
                        finish();
                    }
                }
                else
                {
                    loseByTimer();

                }
            }
        }.start();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_fourty_sixth_level, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        reloj.cancel();
        if(Dgame.xtreme)
        {
            Intent intent=new Intent(this,MenuScreen.class);
            startActivity(intent);
        }
        else
        {
            Intent intent=new Intent(this,PlayScreen2.class);
            startActivity(intent);
        }

        return true;
    }

    public void loseByTimer()
    {


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
            Intent intent = new Intent(this, PlayScreen2.class);
            startActivity(intent);
            overridePendingTransition(R.anim.push_left_in, R.anim.push_left_in);
        }
    }

    protected void onDestroy()
    {
        Dgame.setHighScoreLento(46);
        super.onDestroy();
    }

    @Override
    public void onBackPressed()
    {
        reloj.cancel();
        finish();
    }


    public void clickIt(View v)
    {
        if(v.getTag().equals("ball")){
            youLose();
        }
        else
        {
            changeBack();
            if (v.getTag().equals("bomb"))
            {
                v.setBackgroundResource(R.drawable.boom);
                if (pressed == Dgame.BOMBAS - 1) {
                    pressed++;
                    reloj.onFinish();

                }
                else
                {
                    if (pressed == 0)
                    {
                        pressed++;
                        cincoMil = leftTime;
                        reloj.start();
                    }
                    else
                        add();
                    v.setTag("touched");
                    Dgame.mixUnaBomba(this);
                }
            }
        }
    }


    public void changeBack()
    {
        switch (pressed)
        {
            case 0:
            {
                screen.setBackgroundResource(R.drawable.eyes_2);
                break;
            }
            case 1:
            {
                screen.setBackgroundResource(R.drawable.eyes_3);
                break;
            }
            case 2:
            {
                screen.setBackgroundResource(R.drawable.eyes_4);
                break;
            }
            case 3:
            {
                screen.setBackgroundResource(R.drawable.eyes_5);
                break;
            }
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
            Dgame.setHighScoreLento(45);
            if(Dgame.gamePrefs.getInt("levelPassed",0)<46)
            {
                Dgame.scoreEdit.putInt("levelPassed", 46);
                Dgame.scoreEdit.commit();
            }
            overridePendingTransition(R.anim.push_left_in,R.anim.push_left_in);
        }
        else
        {
            this.setVisible(false);
            Intent intent=new Intent(this, YouWin.class);
            startActivity(intent);
            Dgame.setHighScoreX(46);
            overridePendingTransition(R.anim.push_left_in, R.anim.push_left_in);
        }
    }
    public void setScore()
    {

        TextView scoreText=(TextView)findViewById(R.id.youWinScores);
        String stringScore=String.valueOf(score);
        scoreText.setText("Score: " + stringScore);

    }

    public void youLose()
    {
        reloj.cancel();
        Intent intent=new Intent(this, YouLose.class);
        startActivity(intent);
        overridePendingTransition(R.anim.push_left_in, R.anim.push_left_in);
    }

    public void winItAll()
    {

        Intent intent=new Intent(this, YouWin.class);
        startActivity(intent);
        overridePendingTransition(R.anim.push_left_in, R.anim.push_left_in);
    }
}
