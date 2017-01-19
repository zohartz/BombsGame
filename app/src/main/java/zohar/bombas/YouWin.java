package zohar.bombas;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class YouWin extends AppCompatActivity{

    RelativeLayout pantalla;
    TextView sco;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_you_win);
        pantalla=(RelativeLayout)findViewById(R.id.ganador);
        sco=(TextView)findViewById(R.id.youWinScores);

        if(Dgame.xtreme)
        {
            pantalla.setBackground(ContextCompat.getDrawable(this, R.drawable.you_win));
            sco.setText("23");

        }

    }


    public void backToSLevelScreen(View v)
    {

        if(Dgame.xtreme)
        {
            finish();
            Intent intent=new Intent(this, MenuScreen.class);
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
