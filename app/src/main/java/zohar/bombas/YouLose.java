package zohar.bombas;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class YouLose extends AppCompatActivity {

    TextView extremeScore;
    RelativeLayout youLoseScreen;
    //public static final String TKT="TKT";

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_you_lose);



        extremeScore=(TextView)findViewById(R.id.exScoLose);
        youLoseScreen=(RelativeLayout)findViewById(R.id.lose);

        if(Dgame.xtreme)
        {

            youLoseScreen.setBackground(ContextCompat.getDrawable(this, R.drawable.you_lose_xtreme));
            extremeScore.setText(Dgame.currLevel + "");

        }
        else
        {
           youLoseScreen.setBackground(ContextCompat.getDrawable(this, R.drawable.you_lose));

        }



    }

    public void backToSLevelScreen(View v)
    {

        Intent intent=new Intent(this, MenuScreen.class);
        startActivity(intent);
    }

    public void deNuevo(View v)
    {

        if(!Dgame.xtreme)
        {
        switch (Dgame.currLevel) {

            case 0: {
                Intent intent = new Intent(this, FirstLevel.class);
                startActivity(intent);
                overridePendingTransition(R.anim.push_left_in, R.anim.push_left_in);
                break;
            }
            case 1: {
                Intent intent = new Intent(this, SecondLevel.class);
                startActivity(intent);
                overridePendingTransition(R.anim.push_left_in, R.anim.push_left_in);
                break;
            }
            case 2: {
                Intent intent = new Intent(this, ThirdLevel.class);
                startActivity(intent);
                overridePendingTransition(R.anim.push_left_in, R.anim.push_left_in);
                break;
            }
            case 3: {
                Intent intent = new Intent(this, ForthLevel.class);
                startActivity(intent);
                overridePendingTransition(R.anim.push_left_in, R.anim.push_left_in);
                break;
            }
            case 4: {
                Intent intenta = new Intent(this, FifthLevel.class);
                startActivity(intenta);
                overridePendingTransition(R.anim.push_left_in, R.anim.push_left_in);
                break;
            }
            case 5: {
                Intent intent = new Intent(this, SixthLevel.class);
                startActivity(intent);
                overridePendingTransition(R.anim.push_left_in, R.anim.push_left_in);
                break;
            }
            case 6: {
                Intent intent = new Intent(this, SeventhLevel.class);
                startActivity(intent);
                overridePendingTransition(R.anim.push_left_in, R.anim.push_left_in);
                break;
            }
            case 7: {
                Intent intent = new Intent(this, EighthLevel.class);
                startActivity(intent);
                overridePendingTransition(R.anim.push_left_in, R.anim.push_left_in);
                break;
            }
            case 8: {
                Intent intent = new Intent(this, NinthLevel.class);
                startActivity(intent);
                overridePendingTransition(R.anim.push_left_in, R.anim.push_left_in);
                break;
            }
            case 9: {
                Intent intent = new Intent(this, TenthLevel.class);
                startActivity(intent);
                overridePendingTransition(R.anim.push_left_in, R.anim.push_left_in);
                break;
            }
            case 10: {
                Intent intent = new Intent(this, EleventhLevel.class);
                startActivity(intent);
                overridePendingTransition(R.anim.push_left_in, R.anim.push_left_in);
                break;
            }
            case 11: {
                Intent intent = new Intent(this, TwelfthLevel.class);
                startActivity(intent);
                overridePendingTransition(R.anim.push_left_in, R.anim.push_left_in);
                break;
            }
            case 12: {
                Intent intent = new Intent(this, ThirteenthLevel.class);
                startActivity(intent);
                overridePendingTransition(R.anim.push_left_in, R.anim.push_left_in);
                break;
            }
            case 13: {
                Intent intent = new Intent(this, FourteenthLevel.class);
                startActivity(intent);
                overridePendingTransition(R.anim.push_left_in, R.anim.push_left_in);
                break;
            }
            case 14: {
                Intent intent = new Intent(this, FifteenthLevel.class);
                startActivity(intent);
                overridePendingTransition(R.anim.push_left_in, R.anim.push_left_in);
                break;
            }
            case 15: {
                Intent intent = new Intent(this, SixteenthLevel.class);
                startActivity(intent);
                overridePendingTransition(R.anim.push_left_in, R.anim.push_left_in);
                break;
            }
            case 16: {
                Intent intent = new Intent(this, SeventeenthLevel.class);
                startActivity(intent);
                overridePendingTransition(R.anim.push_left_in, R.anim.push_left_in);
                break;
            }
            case 17: {
                Intent intent = new Intent(this, EighteenthLevel.class);
                startActivity(intent);
                overridePendingTransition(R.anim.push_left_in, R.anim.push_left_in);
                break;
            }
            case 18: {
                Intent intent = new Intent(this, NineteenthLevel.class);
                startActivity(intent);
                overridePendingTransition(R.anim.push_left_in, R.anim.push_left_in);
                break;
            }
            case 19: {
                Intent intent = new Intent(this, TwentiethLevel.class);
                startActivity(intent);
                overridePendingTransition(R.anim.push_left_in, R.anim.push_left_in);
                break;
            }
            case 20: {

                Intent intent = new Intent(this, TwentyFirstLevel.class);
                startActivity(intent);
                overridePendingTransition(R.anim.push_left_in, R.anim.push_left_in);
                break;
            }
            case 21: {
                Intent intent = new Intent(this, TwentySecondLevel.class);
                startActivity(intent);
                overridePendingTransition(R.anim.push_left_in, R.anim.push_left_in);
                break;
            }
            case 22: {
                Intent intent = new Intent(this, TwentyThirdLevel.class);
                startActivity(intent);
                overridePendingTransition(R.anim.push_left_in, R.anim.push_left_in);
                break;
            }
            case 23: {
                Intent intent = new Intent(this, TwentyFourthLevel.class);
                startActivity(intent);
                overridePendingTransition(R.anim.push_left_in, R.anim.push_left_in);
                break;
            }
            case 24: {
                Intent intent = new Intent(this, TwentyFifthLevel.class);
                startActivity(intent);
                overridePendingTransition(R.anim.push_left_in, R.anim.push_left_in);
                break;
            }
            case 25: {
                Intent intent = new Intent(this, TwentrySixthLevel.class);
                startActivity(intent);
                overridePendingTransition(R.anim.push_left_in, R.anim.push_left_in);
                break;
            }
            case 26: {
                Intent intent = new Intent(this, TwentySeventhLevel.class);
                startActivity(intent);
                overridePendingTransition(R.anim.push_left_in, R.anim.push_left_in);
                break;
            }
            case 27: {
                Intent intenta = new Intent(this, TwentyEighthLevel.class);
                startActivity(intenta);
                overridePendingTransition(R.anim.push_left_in, R.anim.push_left_in);
                break;
            }
            case 28: {
                Intent intent = new Intent(this, TwentyNinthLevel.class);
                startActivity(intent);
                overridePendingTransition(R.anim.push_left_in, R.anim.push_left_in);
                break;
            }
            case 29: {
                Intent intent = new Intent(this, ThirtiethLevel.class);
                startActivity(intent);
                overridePendingTransition(R.anim.push_left_in, R.anim.push_left_in);
                break;
            }
            case 30: {
                Intent intent = new Intent(this, ThirtyFirstLevel.class);
                startActivity(intent);
                overridePendingTransition(R.anim.push_left_in, R.anim.push_left_in);
                break;
            }
            case 31: {
                Intent intent = new Intent(this, ThirtySecondLevel.class);
                startActivity(intent);
                overridePendingTransition(R.anim.push_left_in, R.anim.push_left_in);
                break;
            }
            case 32: {
                Intent intent = new Intent(this, ThirtyThirdLevel.class);
                startActivity(intent);
                overridePendingTransition(R.anim.push_left_in, R.anim.push_left_in);
                break;
            }
            case 33: {
                Intent intent = new Intent(this, ThirtyFourthLevel.class);
                startActivity(intent);
                overridePendingTransition(R.anim.push_left_in, R.anim.push_left_in);
                break;
            }
            case 34: {
                Intent intent = new Intent(this, ThirtyFifthLevel.class);
                startActivity(intent);
                overridePendingTransition(R.anim.push_left_in, R.anim.push_left_in);
                break;
            }
            case 35: {
                Intent intent = new Intent(this, ThirtySixthLevel.class);
                startActivity(intent);
                overridePendingTransition(R.anim.push_left_in, R.anim.push_left_in);
                break;
            }
            case 36: {
                Intent intent = new Intent(this, ThirtySeventhLevel.class);
                startActivity(intent);
                overridePendingTransition(R.anim.push_left_in, R.anim.push_left_in);
                break;
            }
            case 37: {
                Intent intent = new Intent(this, ThirtyEighthLevel.class);
                startActivity(intent);
                overridePendingTransition(R.anim.push_left_in, R.anim.push_left_in);
                break;
            }
            case 38: {
                Intent intent = new Intent(this, ThirtyNinthLevel.class);
                startActivity(intent);
                overridePendingTransition(R.anim.push_left_in, R.anim.push_left_in);
                break;
            }
            case 39: {
                Intent intent = new Intent(this, FourtiethLevel.class);
                startActivity(intent);
                overridePendingTransition(R.anim.push_left_in, R.anim.push_left_in);
                break;
            }
            case 40: {
                Intent intent = new Intent(this, FourtyFirstLevel.class);
                startActivity(intent);
                overridePendingTransition(R.anim.push_left_in, R.anim.push_left_in);
                break;
            }
            case 41: {
                Intent intent = new Intent(this, FourtySecondLevel.class);
                startActivity(intent);
                overridePendingTransition(R.anim.push_left_in, R.anim.push_left_in);
                break;
            }
            case 42: {
                Intent intent = new Intent(this, FourtyThirdLevel.class);
                startActivity(intent);
                overridePendingTransition(R.anim.push_left_in, R.anim.push_left_in);
                break;
            }
            case 43: {

                Intent intent = new Intent(this, FourtyFourthLevel.class);
                startActivity(intent);
                overridePendingTransition(R.anim.push_left_in, R.anim.push_left_in);
                break;
            }
            case 44: {
                Intent intent = new Intent(this, FourtyFifthLevel.class);
                startActivity(intent);
                overridePendingTransition(R.anim.push_left_in, R.anim.push_left_in);
                break;
            }
            case 45: {
                Intent intent = new Intent(this, FourtySixthLevel.class);
                startActivity(intent);
                overridePendingTransition(R.anim.push_left_in, R.anim.push_left_in);
                break;
            }

        }

     }


        else

        {

            Intent intent = new Intent(this, FirstLevel.class);
            startActivity(intent);
            overridePendingTransition(R.anim.push_left_in, R.anim.push_left_in);

        }

    }

    @Override
    public void onBackPressed()
    {
        if(Dgame.xtreme)
        {
            Intent intent=new Intent(this,MenuScreen.class);
            startActivity(intent);
            overridePendingTransition(R.anim.push_left_in, R.anim.push_left_in);
        }
        else
        {
            if(Dgame.currLevel<24)
            {
                Intent intent=new Intent(this,PlayScreen.class);
                startActivity(intent);
                overridePendingTransition(R.anim.push_left_in, R.anim.push_left_in);
            }
            else
            {
                Intent intent=new Intent(this,PlayScreen2.class);
                startActivity(intent);
                overridePendingTransition(R.anim.push_left_in, R.anim.push_left_in);
            }
        }
    }

}
