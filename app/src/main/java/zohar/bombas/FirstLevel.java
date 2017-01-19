package zohar.bombas;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class FirstLevel extends AppCompatActivity{

    //int soundPlay;
    //SoundPool tiktok;

    TextView t;
    CountDownTimer reloj;
    int pressed=0;
    double score;
    long cincoMil=5000;
    long leftTime=0;
    //public static final String TKT="TKT";


    double startTime=System.currentTimeMillis();
    double endTime;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_level);
        Dgame.gamePrefs= getSharedPreferences(Dgame.GAME_PREFS, 0);//8888888888888888888888
        //tiktok=new SoundPool(1, AudioManager.STREAM_MUSIC,0);
        //soundPlay=Dgame.tiktok.load(this, R.raw.tik_tok,1);



        t=(TextView)findViewById(R.id.tv1);
        reloj=new CountDownTimer(cincoMil,1)
        {


            @Override
            public void onTick(long millisUntilFinished) {

                t.setText("TIME: " + millisUntilFinished / Dgame.MIL+"."+millisUntilFinished%1000);
                //tiktok.play(soundPlay,1,1,1,0,1);
            }

            @Override
            public void onFinish() {
                //Dgame.stopTikTok(soundPlay);
                if(pressed== Dgame.BOMBAS)
                {
                   endTime=System.currentTimeMillis();
                   score=(endTime-startTime);
                   score=5/(score/1000);
                    score= (double)(Math.round(score * 100d) / 100d);
                    Dgame.lentoScore=score;


                    loading();
                    cancel();
                    if(Dgame.xtreme)
                    {
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

    public void youLose(View v)
    {

        //tiktok.stop(soundPlay); sonido
        //Dgame.stopTikTok(soundPlay); sonido

            reloj.cancel();
            Intent intent=new Intent(this, YouLose.class);
            startActivity(intent);
            overridePendingTransition(R.anim.push_left_in, R.anim.push_left_in);



    }

    public void loseByTimer()
    {
        Intent intent=new Intent(this, YouLose.class);
        startActivity(intent);
        overridePendingTransition(R.anim.push_left_in, R.anim.push_left_in);

    }

    public void bombPressed(View v)
    {
        if(!v.getTag().equals("touched")) {
            v.setBackgroundResource(R.drawable.boom);
            if (pressed == Dgame.BOMBAS - 1) {
                pressed++;
                //tiktok.stop(soundPlay); sonido

                reloj.onFinish();

            } else {
                if (pressed == 0)//the first button was pressed
                {
                    reloj.cancel();
                    pressed++;
                    cincoMil = 5000;//cincoMil+leftTime;
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
        cincoMil=5000;//cincoMil+leftTime;
        reloj.start();
    }

    public void setScore()
    {

            if(Dgame.xtreme)
            {

                Intent intent=new Intent(this, YouLose.class);
                startActivity(intent);
                overridePendingTransition(R.anim.push_left_in, R.anim.push_left_in);
            }
        else
            {
                TextView scoreText = (TextView) findViewById(R.id.youWinScores);
                String stringScore = String.valueOf(score);
                scoreText.setText("Score: " + stringScore);
            }





    }

    public void loading()
    {

        if(!Dgame.xtreme)
        {

            setContentView(R.layout.activity_you_win);
            setScore();
            Dgame.setHighScoreLento(0);
            Dgame.scoreEdit= Dgame.gamePrefs.edit();
            if(Dgame.gamePrefs.getInt("levelPassed",0)<1) {
                Dgame.scoreEdit.putInt("levelPassed", 1);
                Dgame.scoreEdit.commit();
            }
            overridePendingTransition(R.anim.push_left_in, R.anim.push_left_in);
        }
        else {

            this.setVisible(false);
            Intent intent=new Intent(this, SecondLevel.class);
            startActivity(intent);
            Dgame.setHighScoreX(1);
            overridePendingTransition(R.anim.push_left_in, R.anim.push_left_in);
        }


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
        getMenuInflater().inflate(R.menu.menu_first_level, menu);
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
        Dgame.setHighScoreLento(0);
        super.onDestroy();
    }

    @Override
    public void onBackPressed()
    {
        reloj.cancel();
        finish();
    }
}
