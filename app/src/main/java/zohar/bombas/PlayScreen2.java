package zohar.bombas;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class PlayScreen2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play_screen2);
        Dgame.gamePrefs= getSharedPreferences(Dgame.GAME_PREFS, 0);
        //Log.d("TKT", "next: " + Dgame.next);
        Dgame.currLevel=0;


        switch (Dgame.gamePrefs.getInt("levelPassed",23) )
        {

            case 23:
            {
                Button b=(Button)findViewById(R.id.level_24);
                b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape));
                //b=(Button)findViewById(R.id.level_2);
                //b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape));
                break;
            }
            case 24:
            {
                Button b=(Button)findViewById(R.id.level_24);
                b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape));
                b=(Button)findViewById(R.id.level_25);
                b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape));
                break;

            }
            case 25:
            {
                Button b=(Button)findViewById(R.id.level_24);
                b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape));
                b=(Button)findViewById(R.id.level_25);
                b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape));
                b=(Button)findViewById(R.id.level_26);
                b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape));
                break;
            }
            case 26:
            {
                Button b=(Button)findViewById(R.id.level_24);
                b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape));
                b=(Button)findViewById(R.id.level_25);
                b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape));
                b=(Button)findViewById(R.id.level_26);
                b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape));
                b=(Button)findViewById(R.id.level_27);
                b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape));
                break;
            }
            case 27:
            {
                Button b=(Button)findViewById(R.id.level_24);
                b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape));
                b=(Button)findViewById(R.id.level_25);
                b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape));
                b=(Button)findViewById(R.id.level_26);
                b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape));
                b=(Button)findViewById(R.id.level_27);
                b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape));
                b=(Button)findViewById(R.id.level_28);
                b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape_2));
                break;
            }
            case 28:
            {
                Button b=(Button)findViewById(R.id.level_24);
                b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape));
                b=(Button)findViewById(R.id.level_25);
                b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape));
                b=(Button)findViewById(R.id.level_26);
                b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape));
                b=(Button)findViewById(R.id.level_27);
                b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape));
                b=(Button)findViewById(R.id.level_28);
                b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape_2));
                b=(Button)findViewById(R.id.level_29);
                b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape_2));
                break;
            }
            case 29:
            {
                Button b=(Button)findViewById(R.id.level_24);
                b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape));
                b=(Button)findViewById(R.id.level_25);
                b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape));
                b=(Button)findViewById(R.id.level_26);
                b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape));
                b=(Button)findViewById(R.id.level_27);
                b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape));
                b=(Button)findViewById(R.id.level_28);
                b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape_2));
                b=(Button)findViewById(R.id.level_29);
                b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape_2));
                b=(Button)findViewById(R.id.level_30);
                b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape_2));
                break;
            }
            case 30:
            {
                Button b=(Button)findViewById(R.id.level_24);
                b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape));
                b=(Button)findViewById(R.id.level_25);
                b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape));
                b=(Button)findViewById(R.id.level_26);
                b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape));
                b=(Button)findViewById(R.id.level_27);
                b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape));
                b=(Button)findViewById(R.id.level_28);
                b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape_2));
                b=(Button)findViewById(R.id.level_29);
                b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape_2));
                b=(Button)findViewById(R.id.level_30);
                b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape_2));
                b=(Button)findViewById(R.id.level_31);
                b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape_2));
                break;
            }
            case 31:
            {
                Button b=(Button)findViewById(R.id.level_24);
                b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape));
                b=(Button)findViewById(R.id.level_25);
                b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape));
                b=(Button)findViewById(R.id.level_26);
                b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape));
                b=(Button)findViewById(R.id.level_27);
                b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape));
                b=(Button)findViewById(R.id.level_28);
                b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape_2));
                b=(Button)findViewById(R.id.level_29);
                b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape_2));
                b=(Button)findViewById(R.id.level_30);
                b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape_2));
                b=(Button)findViewById(R.id.level_31);
                b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape_2));
                b=(Button)findViewById(R.id.level_32);
                b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape_3));
                break;
            }
            case 32:
            {
                Button b=(Button)findViewById(R.id.level_24);
                b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape));
                b=(Button)findViewById(R.id.level_25);
                b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape));
                b=(Button)findViewById(R.id.level_26);
                b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape));
                b=(Button)findViewById(R.id.level_27);
                b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape));
                b=(Button)findViewById(R.id.level_28);
                b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape_2));
                b=(Button)findViewById(R.id.level_29);
                b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape_2));
                b=(Button)findViewById(R.id.level_30);
                b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape_2));
                b=(Button)findViewById(R.id.level_31);
                b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape_2));
                b=(Button)findViewById(R.id.level_32);
                b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape_3));
                b=(Button)findViewById(R.id.level_33);
                b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape_3));
                break;
            }
            case 33:
            {
                Button b=(Button)findViewById(R.id.level_24);
                b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape));
                b=(Button)findViewById(R.id.level_25);
                b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape));
                b=(Button)findViewById(R.id.level_26);
                b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape));
                b=(Button)findViewById(R.id.level_27);
                b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape));
                b=(Button)findViewById(R.id.level_28);
                b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape_2));
                b=(Button)findViewById(R.id.level_29);
                b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape_2));
                b=(Button)findViewById(R.id.level_30);
                b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape_2));
                b=(Button)findViewById(R.id.level_31);
                b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape_2));
                b=(Button)findViewById(R.id.level_32);
                b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape_3));
                b=(Button)findViewById(R.id.level_33);
                b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape_3));
                b=(Button)findViewById(R.id.level_34);
                b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape_3));
                break;
            }
            case 34:
            {
                Button b=(Button)findViewById(R.id.level_24);
                b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape));
                b=(Button)findViewById(R.id.level_25);
                b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape));
                b=(Button)findViewById(R.id.level_26);
                b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape));
                b=(Button)findViewById(R.id.level_27);
                b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape));
                b=(Button)findViewById(R.id.level_28);
                b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape_2));
                b=(Button)findViewById(R.id.level_29);
                b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape_2));
                b=(Button)findViewById(R.id.level_30);
                b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape_2));
                b=(Button)findViewById(R.id.level_31);
                b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape_2));
                b=(Button)findViewById(R.id.level_32);
                b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape_3));
                b=(Button)findViewById(R.id.level_33);
                b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape_3));
                b=(Button)findViewById(R.id.level_34);
                b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape_3));
                b=(Button)findViewById(R.id.level_35);
                b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape_3));
                break;
            }
            case 35:
            {
                Button b=(Button)findViewById(R.id.level_24);
                b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape));
                b=(Button)findViewById(R.id.level_25);
                b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape));
                b=(Button)findViewById(R.id.level_26);
                b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape));
                b=(Button)findViewById(R.id.level_27);
                b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape));
                b=(Button)findViewById(R.id.level_28);
                b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape_2));
                b=(Button)findViewById(R.id.level_29);
                b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape_2));
                b=(Button)findViewById(R.id.level_30);
                b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape_2));
                b=(Button)findViewById(R.id.level_31);
                b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape_2));
                b=(Button)findViewById(R.id.level_32);
                b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape_3));
                b=(Button)findViewById(R.id.level_33);
                b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape_3));
                b=(Button)findViewById(R.id.level_34);
                b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape_3));
                b=(Button)findViewById(R.id.level_35);
                b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape_3));
                b=(Button)findViewById(R.id.level_36);
                b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape_4));
                break;
            }
            case 36:
            {
                Button b=(Button)findViewById(R.id.level_24);
                b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape));
                b=(Button)findViewById(R.id.level_25);
                b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape));
                b=(Button)findViewById(R.id.level_26);
                b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape));
                b=(Button)findViewById(R.id.level_27);
                b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape));
                b=(Button)findViewById(R.id.level_28);
                b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape_2));
                b=(Button)findViewById(R.id.level_29);
                b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape_2));
                b=(Button)findViewById(R.id.level_30);
                b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape_2));
                b=(Button)findViewById(R.id.level_31);
                b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape_2));
                b=(Button)findViewById(R.id.level_32);
                b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape_3));
                b=(Button)findViewById(R.id.level_33);
                b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape_3));
                b=(Button)findViewById(R.id.level_34);
                b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape_3));
                b=(Button)findViewById(R.id.level_35);
                b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape_3));
                b=(Button)findViewById(R.id.level_36);
                b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape_4));
                b=(Button)findViewById(R.id.level_37);
                b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape_4));
                break;
            }
            case 37:
            {
                Button b=(Button)findViewById(R.id.level_24);
                b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape));
                b=(Button)findViewById(R.id.level_25);
                b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape));
                b=(Button)findViewById(R.id.level_26);
                b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape));
                b=(Button)findViewById(R.id.level_27);
                b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape));
                b=(Button)findViewById(R.id.level_28);
                b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape_2));
                b=(Button)findViewById(R.id.level_29);
                b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape_2));
                b=(Button)findViewById(R.id.level_30);
                b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape_2));
                b=(Button)findViewById(R.id.level_31);
                b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape_2));
                b=(Button)findViewById(R.id.level_32);
                b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape_3));
                b=(Button)findViewById(R.id.level_33);
                b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape_3));
                b=(Button)findViewById(R.id.level_34);
                b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape_3));
                b=(Button)findViewById(R.id.level_35);
                b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape_3));
                b=(Button)findViewById(R.id.level_36);
                b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape_4));
                b=(Button)findViewById(R.id.level_37);
                b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape_4));
                b=(Button)findViewById(R.id.level_38);
                b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape_4));
                break;
            }
            case 38:
            {
                Button b=(Button)findViewById(R.id.level_24);
                b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape));
                b=(Button)findViewById(R.id.level_25);
                b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape));
                b=(Button)findViewById(R.id.level_26);
                b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape));
                b=(Button)findViewById(R.id.level_27);
                b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape));
                b=(Button)findViewById(R.id.level_28);
                b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape_2));
                b=(Button)findViewById(R.id.level_29);
                b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape_2));
                b=(Button)findViewById(R.id.level_30);
                b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape_2));
                b=(Button)findViewById(R.id.level_31);
                b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape_2));
                b=(Button)findViewById(R.id.level_32);
                b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape_3));
                b=(Button)findViewById(R.id.level_33);
                b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape_3));
                b=(Button)findViewById(R.id.level_34);
                b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape_3));
                b=(Button)findViewById(R.id.level_35);
                b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape_3));
                b=(Button)findViewById(R.id.level_36);
                b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape_4));
                b=(Button)findViewById(R.id.level_37);
                b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape_4));
                b=(Button)findViewById(R.id.level_38);
                b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape_4));
                b=(Button)findViewById(R.id.level_39);
                b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape_4));
                break;
            }
            case 39:
            {
                Button b=(Button)findViewById(R.id.level_24);
                b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape));
                b=(Button)findViewById(R.id.level_25);
                b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape));
                b=(Button)findViewById(R.id.level_26);
                b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape));
                b=(Button)findViewById(R.id.level_27);
                b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape));
                b=(Button)findViewById(R.id.level_28);
                b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape_2));
                b=(Button)findViewById(R.id.level_29);
                b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape_2));
                b=(Button)findViewById(R.id.level_30);
                b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape_2));
                b=(Button)findViewById(R.id.level_31);
                b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape_2));
                b=(Button)findViewById(R.id.level_32);
                b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape_3));
                b=(Button)findViewById(R.id.level_33);
                b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape_3));
                b=(Button)findViewById(R.id.level_34);
                b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape_3));
                b=(Button)findViewById(R.id.level_35);
                b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape_3));
                b=(Button)findViewById(R.id.level_36);
                b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape_4));
                b=(Button)findViewById(R.id.level_37);
                b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape_4));
                b=(Button)findViewById(R.id.level_38);
                b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape_4));
                b=(Button)findViewById(R.id.level_39);
                b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape_4));
                b=(Button)findViewById(R.id.level_40);
                b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape_5));
                break;
            }
            case 40:
            {
                Button b=(Button)findViewById(R.id.level_24);
                b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape));
                b=(Button)findViewById(R.id.level_25);
                b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape));
                b=(Button)findViewById(R.id.level_26);
                b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape));
                b=(Button)findViewById(R.id.level_27);
                b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape));
                b=(Button)findViewById(R.id.level_28);
                b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape_2));
                b=(Button)findViewById(R.id.level_29);
                b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape_2));
                b=(Button)findViewById(R.id.level_30);
                b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape_2));
                b=(Button)findViewById(R.id.level_31);
                b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape_2));
                b=(Button)findViewById(R.id.level_32);
                b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape_3));
                b=(Button)findViewById(R.id.level_33);
                b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape_3));
                b=(Button)findViewById(R.id.level_34);
                b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape_3));
                b=(Button)findViewById(R.id.level_35);
                b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape_3));
                b=(Button)findViewById(R.id.level_36);
                b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape_4));
                b=(Button)findViewById(R.id.level_37);
                b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape_4));
                b=(Button)findViewById(R.id.level_38);
                b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape_4));
                b=(Button)findViewById(R.id.level_39);
                b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape_4));
                b=(Button)findViewById(R.id.level_40);
                b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape_5));
                b=(Button)findViewById(R.id.level_41);
                b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape_5));
                break;
            }
            case 41:
            {
                Button b=(Button)findViewById(R.id.level_24);
                b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape));
                b=(Button)findViewById(R.id.level_25);
                b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape));
                b=(Button)findViewById(R.id.level_26);
                b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape));
                b=(Button)findViewById(R.id.level_27);
                b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape));
                b=(Button)findViewById(R.id.level_28);
                b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape_2));
                b=(Button)findViewById(R.id.level_29);
                b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape_2));
                b=(Button)findViewById(R.id.level_30);
                b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape_2));
                b=(Button)findViewById(R.id.level_31);
                b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape_2));
                b=(Button)findViewById(R.id.level_32);
                b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape_3));
                b=(Button)findViewById(R.id.level_33);
                b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape_3));
                b=(Button)findViewById(R.id.level_34);
                b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape_3));
                b=(Button)findViewById(R.id.level_35);
                b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape_3));
                b=(Button)findViewById(R.id.level_36);
                b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape_4));
                b=(Button)findViewById(R.id.level_37);
                b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape_4));
                b=(Button)findViewById(R.id.level_38);
                b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape_4));
                b=(Button)findViewById(R.id.level_39);
                b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape_4));
                b=(Button)findViewById(R.id.level_40);
                b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape_5));
                b=(Button)findViewById(R.id.level_41);
                b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape_5));
                b=(Button)findViewById(R.id.level_42);
                b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape_5));
                break;
            }
            case 42:
            {
                Button b=(Button)findViewById(R.id.level_24);
                b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape));
                b=(Button)findViewById(R.id.level_25);
                b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape));
                b=(Button)findViewById(R.id.level_26);
                b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape));
                b=(Button)findViewById(R.id.level_27);
                b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape));
                b=(Button)findViewById(R.id.level_28);
                b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape_2));
                b=(Button)findViewById(R.id.level_29);
                b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape_2));
                b=(Button)findViewById(R.id.level_30);
                b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape_2));
                b=(Button)findViewById(R.id.level_31);
                b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape_2));
                b=(Button)findViewById(R.id.level_32);
                b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape_3));
                b=(Button)findViewById(R.id.level_33);
                b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape_3));
                b=(Button)findViewById(R.id.level_34);
                b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape_3));
                b=(Button)findViewById(R.id.level_35);
                b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape_3));
                b=(Button)findViewById(R.id.level_36);
                b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape_4));
                b=(Button)findViewById(R.id.level_37);
                b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape_4));
                b=(Button)findViewById(R.id.level_38);
                b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape_4));
                b=(Button)findViewById(R.id.level_39);
                b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape_4));
                b=(Button)findViewById(R.id.level_40);
                b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape_5));
                b=(Button)findViewById(R.id.level_41);
                b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape_5));
                b=(Button)findViewById(R.id.level_42);
                b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape_5));
                b=(Button)findViewById(R.id.level_43);
                b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape_5));
                break;
            }
            case 43:
            {
                Button b=(Button)findViewById(R.id.level_24);
                b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape));
                b=(Button)findViewById(R.id.level_25);
                b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape));
                b=(Button)findViewById(R.id.level_26);
                b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape));
                b=(Button)findViewById(R.id.level_27);
                b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape));
                b=(Button)findViewById(R.id.level_28);
                b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape_2));
                b=(Button)findViewById(R.id.level_29);
                b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape_2));
                b=(Button)findViewById(R.id.level_30);
                b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape_2));
                b=(Button)findViewById(R.id.level_31);
                b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape_2));
                b=(Button)findViewById(R.id.level_32);
                b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape_3));
                b=(Button)findViewById(R.id.level_33);
                b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape_3));
                b=(Button)findViewById(R.id.level_34);
                b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape_3));
                b=(Button)findViewById(R.id.level_35);
                b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape_3));
                b=(Button)findViewById(R.id.level_36);
                b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape_4));
                b=(Button)findViewById(R.id.level_37);
                b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape_4));
                b=(Button)findViewById(R.id.level_38);
                b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape_4));
                b=(Button)findViewById(R.id.level_39);
                b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape_4));
                b=(Button)findViewById(R.id.level_40);
                b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape_5));
                b=(Button)findViewById(R.id.level_41);
                b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape_5));
                b=(Button)findViewById(R.id.level_42);
                b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape_5));
                b=(Button)findViewById(R.id.level_43);
                b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape_5));
                b=(Button)findViewById(R.id.level_44);
                b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape_5));
                break;
            }
            case 44:
            {
                Button b=(Button)findViewById(R.id.level_24);
                b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape));
                b=(Button)findViewById(R.id.level_25);
                b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape));
                b=(Button)findViewById(R.id.level_26);
                b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape));
                b=(Button)findViewById(R.id.level_27);
                b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape));
                b=(Button)findViewById(R.id.level_28);
                b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape_2));
                b=(Button)findViewById(R.id.level_29);
                b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape_2));
                b=(Button)findViewById(R.id.level_30);
                b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape_2));
                b=(Button)findViewById(R.id.level_31);
                b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape_2));
                b=(Button)findViewById(R.id.level_32);
                b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape_3));
                b=(Button)findViewById(R.id.level_33);
                b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape_3));
                b=(Button)findViewById(R.id.level_34);
                b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape_3));
                b=(Button)findViewById(R.id.level_35);
                b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape_3));
                b=(Button)findViewById(R.id.level_36);
                b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape_4));
                b=(Button)findViewById(R.id.level_37);
                b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape_4));
                b=(Button)findViewById(R.id.level_38);
                b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape_4));
                b=(Button)findViewById(R.id.level_39);
                b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape_4));
                b=(Button)findViewById(R.id.level_40);
                b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape_5));
                b=(Button)findViewById(R.id.level_41);
                b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape_5));
                b=(Button)findViewById(R.id.level_42);
                b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape_5));
                b=(Button)findViewById(R.id.level_43);
                b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape_5));
                b=(Button)findViewById(R.id.level_44);
                b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape_5));
                b=(Button)findViewById(R.id.level_45);
                b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape_5));
                break;
            }
            case 45: {
                Button b = (Button) findViewById(R.id.level_24);
                b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape));
                b = (Button) findViewById(R.id.level_25);
                b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape));
                b = (Button) findViewById(R.id.level_26);
                b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape));
                b = (Button) findViewById(R.id.level_27);
                b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape));
                b = (Button) findViewById(R.id.level_28);
                b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape_2));
                b = (Button) findViewById(R.id.level_29);
                b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape_2));
                b = (Button) findViewById(R.id.level_30);
                b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape_2));
                b = (Button) findViewById(R.id.level_31);
                b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape_2));
                b = (Button) findViewById(R.id.level_32);
                b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape_3));
                b = (Button) findViewById(R.id.level_33);
                b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape_3));
                b = (Button) findViewById(R.id.level_34);
                b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape_3));
                b = (Button) findViewById(R.id.level_35);
                b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape_3));
                b = (Button) findViewById(R.id.level_36);
                b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape_4));
                b = (Button) findViewById(R.id.level_37);
                b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape_4));
                b = (Button) findViewById(R.id.level_38);
                b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape_4));
                b = (Button) findViewById(R.id.level_39);
                b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape_4));
                b = (Button) findViewById(R.id.level_40);
                b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape_5));
                b = (Button) findViewById(R.id.level_41);
                b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape_5));
                b = (Button) findViewById(R.id.level_42);
                b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape_5));
                b = (Button) findViewById(R.id.level_43);
                b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape_5));
                b = (Button) findViewById(R.id.level_44);
                b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape_5));
                b = (Button) findViewById(R.id.level_45);
                b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape_5));
                b = (Button) findViewById(R.id.level_46);
                b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape_5));
                break;
            }
                case 46:
                {
                        Button b=(Button)findViewById(R.id.level_24);
                        b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape));
                        b=(Button)findViewById(R.id.level_25);
                        b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape));
                        b=(Button)findViewById(R.id.level_26);
                        b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape));
                        b=(Button)findViewById(R.id.level_27);
                        b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape));
                        b=(Button)findViewById(R.id.level_28);
                        b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape_2));
                        b=(Button)findViewById(R.id.level_29);
                        b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape_2));
                        b=(Button)findViewById(R.id.level_30);
                        b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape_2));
                        b=(Button)findViewById(R.id.level_31);
                        b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape_2));
                        b=(Button)findViewById(R.id.level_32);
                        b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape_3));
                        b=(Button)findViewById(R.id.level_33);
                        b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape_3));
                        b=(Button)findViewById(R.id.level_34);
                        b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape_3));
                        b=(Button)findViewById(R.id.level_35);
                        b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape_3));
                        b=(Button)findViewById(R.id.level_36);
                        b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape_4));
                        b=(Button)findViewById(R.id.level_37);
                        b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape_4));
                        b=(Button)findViewById(R.id.level_38);
                        b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape_4));
                        b=(Button)findViewById(R.id.level_39);
                        b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape_4));
                        b=(Button)findViewById(R.id.level_40);
                        b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape_5));
                        b=(Button)findViewById(R.id.level_41);
                        b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape_5));
                        b=(Button)findViewById(R.id.level_42);
                        b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape_5));
                        b=(Button)findViewById(R.id.level_43);
                        b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape_5));
                        b=(Button)findViewById(R.id.level_44);
                        b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape_5));
                        b=(Button)findViewById(R.id.level_45);
                        b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape_5));
                        b=(Button)findViewById(R.id.level_46);
                        b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape_5));
                        break;

                }
            }
        }


        //soundPlay=Dgame.tiktok.load(this, R.raw.tik_tok,1); sonido






    public void goToLevel(View v)
    {
        //Dgame.tiktok.play(soundPlay,1,1,1,0,1); sonido
        switch(v.getId())
        {
            case R.id.level_24:
            {

                Intent intent=new Intent(this, TwentyFourthLevel.class);
                startActivity(intent);
                break;
            }
            case R.id.level_25:
            {
                if(!Dgame.xtreme && Dgame.gamePrefs.getInt("levelPassed",0)>=24){
                    Intent intent = new Intent(this, TwentyFifthLevel.class);
                    startActivity(intent);
                }
                break;
            }
            case R.id.level_26:
            {
                if(!Dgame.xtreme && Dgame.gamePrefs.getInt("levelPassed",0)>=25) {
                    Intent intent = new Intent(this, TwentrySixthLevel.class);
                    startActivity(intent);
                }
                break;
            }
            case R.id.level_27:
            {
                if(!Dgame.xtreme && Dgame.gamePrefs.getInt("levelPassed",0)>=26) {
                    Intent intent = new Intent(this, TwentySeventhLevel.class);
                    startActivity(intent);
                }
                break;
            }
            case R.id.level_28:
            {
                if(!Dgame.xtreme && Dgame.gamePrefs.getInt("levelPassed",0)>=27) {
                    Intent intenta = new Intent(this, TwentyEighthLevel.class);
                    startActivity(intenta);
                }
                break;
            }
            case R.id.level_29:
            {
                if(!Dgame.xtreme && Dgame.gamePrefs.getInt("levelPassed",0)>=28) {
                    Intent intent = new Intent(this, TwentyNinthLevel.class);
                    startActivity(intent);
                }
                break;
            }
            case R.id.level_30:
            {
                if (!Dgame.xtreme && Dgame.gamePrefs.getInt("levelPassed",0)>=29)
                {
                    Intent intent = new Intent(this, ThirtiethLevel.class);
                    startActivity(intent);
                }
                break;
            }
            case R.id.level_31:
            {
                if(!Dgame.xtreme && Dgame.gamePrefs.getInt("levelPassed",0)>=30) {
                    Intent intent = new Intent(this, ThirtyFirstLevel.class);
                    startActivity(intent);
                }
                break;
            }
            case R.id.level_32:
            {
                if(!Dgame.xtreme && Dgame.gamePrefs.getInt("levelPassed",0)>=31) {
                    Intent intent = new Intent(this, ThirtySecondLevel.class);
                    startActivity(intent);
                }
                break;
            }
            case R.id.level_33:
            {
                if(!Dgame.xtreme && Dgame.gamePrefs.getInt("levelPassed",0)>=32) {
                    Intent intent = new Intent(this, ThirtyThirdLevel.class);
                    startActivity(intent);
                }

                break;
            }
            case R.id.level_34:
            {
                if(!Dgame.xtreme && Dgame.gamePrefs.getInt("levelPassed",0)>=33) {
                    Intent intent = new Intent(this, ThirtyFourthLevel.class);
                    startActivity(intent);
                }
                break;
            }
            case R.id.level_35:
            {
                if(!Dgame.xtreme && Dgame.gamePrefs.getInt("levelPassed",0)>=34) {
                    Intent intent = new Intent(this, ThirtyFifthLevel.class);
                    startActivity(intent);
                }
                break;
            }
            case R.id.level_36:
            {
                if(!Dgame.xtreme && Dgame.gamePrefs.getInt("levelPassed",0)>=35) {
                    Intent intent = new Intent(this, ThirtySixthLevel.class);
                    startActivity(intent);
                }
                break;
            }
            case R.id.level_37:
            {
                //Button b=(Button)findViewById(R.id.level_14);
                if(!Dgame.xtreme && Dgame.gamePrefs.getInt("levelPassed",0)>=36) {
                    Intent intent = new Intent(this, ThirtySeventhLevel.class);
                    startActivity(intent);
                }
                break;
            }
            case R.id.level_38:
            {
                if(!Dgame.xtreme && Dgame.gamePrefs.getInt("levelPassed",0)>=37) {
                    Intent intent = new Intent(this, ThirtyEighthLevel.class);
                    startActivity(intent);
                }
                break;
            }
            case R.id.level_39:
            {
                if(!Dgame.xtreme && Dgame.gamePrefs.getInt("levelPassed",0)>=38) {
                    Intent intent = new Intent(this, ThirtyNinthLevel.class);
                    startActivity(intent);
                }
                break;
            }
            case R.id.level_40:
            {
                if(!Dgame.xtreme && Dgame.gamePrefs.getInt("levelPassed",0)>=39) {
                    Intent intent = new Intent(this, FourtiethLevel.class);
                    startActivity(intent);
                }
                break;
            }
            case R.id.level_41:
            {
                if(!Dgame.xtreme && Dgame.gamePrefs.getInt("levelPassed",0)>=40) {
                    Intent intent = new Intent(this, FourtyFirstLevel.class);
                    startActivity(intent);
                }
                break;
            }
            case R.id.level_42:
            {
                if(!Dgame.xtreme && Dgame.gamePrefs.getInt("levelPassed",0)>=41) {
                    Intent intent = new Intent(this, FourtySecondLevel.class);
                    startActivity(intent);
                }
                break;
            }
            case R.id.level_43:
            {
                if(!Dgame.xtreme && Dgame.gamePrefs.getInt("levelPassed",0)>=42) {
                    Intent intent = new Intent(this, FourtyThirdLevel.class);
                    startActivity(intent);
                }
                break;
            }
            case R.id.level_44:
            {
                if(!Dgame.xtreme && Dgame.gamePrefs.getInt("levelPassed",0)>=43) {
                    Intent intent = new Intent(this, FourtyFourthLevel.class);
                    startActivity(intent);
                }
                break;
            }
            case R.id.level_45:
            {
                if(!Dgame.xtreme && Dgame.gamePrefs.getInt("levelPassed",0)>=44) {
                    Intent intent = new Intent(this, FourtyFifthLevel.class);
                    startActivity(intent);
                }
                break;
            }
            case R.id.level_46:
            {
                if(!Dgame.xtreme && Dgame.gamePrefs.getInt("levelPassed",0)>=45) {
                    Intent intent = new Intent(this, FourtySixthLevel.class);
                    startActivity(intent);
                }
                break;
            }
        }
    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_play_screen2, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
       Intent intent=new Intent(this, PlayScreen.class);
        startActivity(intent);
        overridePendingTransition(R.anim.push_left_in, R.anim.push_left_in);
        return super.onOptionsItemSelected(item);
    }
}
