package zohar.bombas;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class PlayScreen extends AppCompatActivity {

    //int soundPlay; sonido

    //protected static SharedPreferences initPref;
    //public static SharedPreferences.Editor initEdit;

    //public static final String TKT="TKT";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play_screen);
        Dgame.gamePrefs= getSharedPreferences(Dgame.GAME_PREFS, 0);
        Dgame.currLevel=0;



            if(Dgame.gamePrefs.getInt("levelPassed",0)>23)
            {
                Button b=(Button)findViewById(R.id.level_2);
                b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape));
                b=(Button)findViewById(R.id.level_3);
                b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape));
                b=(Button)findViewById(R.id.level_4);
                b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape));
                b=(Button)findViewById(R.id.level_5);
                b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape_2));
                b=(Button)findViewById(R.id.level_6);
                b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape_2));
                b=(Button)findViewById(R.id.level_7);
                b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape_2));
                b=(Button)findViewById(R.id.level_8);
                b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape_2));
                b=(Button)findViewById(R.id.level_9);
                b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape_3));
                b=(Button)findViewById(R.id.level_10);
                b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape_3));
                b=(Button)findViewById(R.id.level_11);
                b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape_3));
                b=(Button)findViewById(R.id.level_12);
                b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape_3));
                b=(Button)findViewById(R.id.level_13);
                b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape_4));
                b=(Button)findViewById(R.id.level_14);
                b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape_4));
                b=(Button)findViewById(R.id.level_15);
                b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape_4));
                b=(Button)findViewById(R.id.level_16);
                b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape_4));
                b=(Button)findViewById(R.id.level_17);
                b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape_5));
                b=(Button)findViewById(R.id.level_18);
                b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape_5));
                b=(Button)findViewById(R.id.level_19);
                b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape_5));
                b=(Button)findViewById(R.id.level_20);
                b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape_5));
                b=(Button)findViewById(R.id.level_21);
                b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape_5));
                b=(Button)findViewById(R.id.level_22);
                b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape_5));
                b=(Button)findViewById(R.id.level_23);
                b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape_5));
                b=(Button)findViewById(R.id.arrowNext);
                b.setBackground(ContextCompat.getDrawable(this, R.drawable.arrow));
            }
        else
            switch (Dgame.gamePrefs.getInt("levelPassed",0) )
            {

                case 1:
                {
                    Button b=(Button)findViewById(R.id.level_1);
                    b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape));
                    b=(Button)findViewById(R.id.level_2);
                    b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape));
                    break;
                }
                case 2:
                {
                    Button b=(Button)findViewById(R.id.level_2);
                    b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape));
                    b=(Button)findViewById(R.id.level_3);
                    b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape));
                    break;

                }
                case 3:
                {
                    Button b=(Button)findViewById(R.id.level_2);
                    b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape));
                    b=(Button)findViewById(R.id.level_3);
                    b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape));
                    b=(Button)findViewById(R.id.level_4);
                    b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape));
                    break;
                }
                case 4:
                {
                    Button b=(Button)findViewById(R.id.level_2);
                    b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape));
                    b=(Button)findViewById(R.id.level_3);
                    b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape));
                    b=(Button)findViewById(R.id.level_4);
                    b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape));
                    b=(Button)findViewById(R.id.level_5);
                    b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape_2));
                    break;
                }
                case 5:
                {
                    Button b=(Button)findViewById(R.id.level_2);
                    b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape));
                    b=(Button)findViewById(R.id.level_3);
                    b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape));
                    b=(Button)findViewById(R.id.level_4);
                    b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape));
                    b=(Button)findViewById(R.id.level_5);
                    b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape_2));
                    b=(Button)findViewById(R.id.level_6);
                    b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape_2));
                    break;
                }
                case 6:
                {
                    Button b=(Button)findViewById(R.id.level_2);
                    b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape));
                    b=(Button)findViewById(R.id.level_3);
                    b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape));
                    b=(Button)findViewById(R.id.level_4);
                    b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape));
                    b=(Button)findViewById(R.id.level_5);
                    b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape_2));
                    b=(Button)findViewById(R.id.level_6);
                    b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape_2));
                    b=(Button)findViewById(R.id.level_7);
                    b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape_2));
                    break;
                }
                case 7:
                {
                    Button b=(Button)findViewById(R.id.level_2);
                    b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape));
                    b=(Button)findViewById(R.id.level_3);
                    b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape));
                    b=(Button)findViewById(R.id.level_4);
                    b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape));
                    b=(Button)findViewById(R.id.level_5);
                    b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape_2));
                    b=(Button)findViewById(R.id.level_6);
                    b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape_2));
                    b=(Button)findViewById(R.id.level_7);
                    b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape_2));
                    b=(Button)findViewById(R.id.level_8);
                    b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape_2));
                    break;
                }
                case 8:
                {
                    Button b=(Button)findViewById(R.id.level_2);
                    b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape));
                    b=(Button)findViewById(R.id.level_3);
                    b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape));
                    b=(Button)findViewById(R.id.level_4);
                    b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape));
                    b=(Button)findViewById(R.id.level_5);
                    b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape_2));
                    b=(Button)findViewById(R.id.level_6);
                    b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape_2));
                    b=(Button)findViewById(R.id.level_7);
                    b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape_2));
                    b=(Button)findViewById(R.id.level_8);
                    b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape_2));
                    b=(Button)findViewById(R.id.level_9);
                    b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape_3));
                    break;
                }
                case 9:
                {
                    Button b=(Button)findViewById(R.id.level_2);
                    b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape));
                    b=(Button)findViewById(R.id.level_3);
                    b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape));
                    b=(Button)findViewById(R.id.level_4);
                    b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape));
                    b=(Button)findViewById(R.id.level_5);
                    b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape_2));
                    b=(Button)findViewById(R.id.level_6);
                    b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape_2));
                    b=(Button)findViewById(R.id.level_7);
                    b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape_2));
                    b=(Button)findViewById(R.id.level_8);
                    b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape_2));
                    b=(Button)findViewById(R.id.level_9);
                    b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape_3));
                    b=(Button)findViewById(R.id.level_10);
                    b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape_3));
                    break;
                }
                case 10:
                {
                    Button b=(Button)findViewById(R.id.level_2);
                    b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape));
                    b=(Button)findViewById(R.id.level_3);
                    b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape));
                    b=(Button)findViewById(R.id.level_4);
                    b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape));
                    b=(Button)findViewById(R.id.level_5);
                    b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape_2));
                    b=(Button)findViewById(R.id.level_6);
                    b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape_2));
                    b=(Button)findViewById(R.id.level_7);
                    b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape_2));
                    b=(Button)findViewById(R.id.level_8);
                    b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape_2));
                    b=(Button)findViewById(R.id.level_9);
                    b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape_3));
                    b=(Button)findViewById(R.id.level_10);
                    b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape_3));
                    b=(Button)findViewById(R.id.level_11);
                    b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape_3));
                    break;
                }
                case 11:
                {
                    Button b=(Button)findViewById(R.id.level_2);
                    b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape));
                    b=(Button)findViewById(R.id.level_3);
                    b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape));
                    b=(Button)findViewById(R.id.level_4);
                    b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape));
                    b=(Button)findViewById(R.id.level_5);
                    b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape_2));
                    b=(Button)findViewById(R.id.level_6);
                    b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape_2));
                    b=(Button)findViewById(R.id.level_7);
                    b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape_2));
                    b=(Button)findViewById(R.id.level_8);
                    b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape_2));
                    b=(Button)findViewById(R.id.level_9);
                    b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape_3));
                    b=(Button)findViewById(R.id.level_10);
                    b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape_3));
                    b=(Button)findViewById(R.id.level_11);
                    b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape_3));
                    b=(Button)findViewById(R.id.level_12);
                    b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape_3));
                    break;
                }
                case 12:
                {
                    Button b=(Button)findViewById(R.id.level_2);
                    b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape));
                    b=(Button)findViewById(R.id.level_3);
                    b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape));
                    b=(Button)findViewById(R.id.level_4);
                    b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape));
                    b=(Button)findViewById(R.id.level_5);
                    b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape_2));
                    b=(Button)findViewById(R.id.level_6);
                    b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape_2));
                    b=(Button)findViewById(R.id.level_7);
                    b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape_2));
                    b=(Button)findViewById(R.id.level_8);
                    b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape_2));
                    b=(Button)findViewById(R.id.level_9);
                    b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape_3));
                    b=(Button)findViewById(R.id.level_10);
                    b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape_3));
                    b=(Button)findViewById(R.id.level_11);
                    b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape_3));
                    b=(Button)findViewById(R.id.level_12);
                    b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape_3));
                    b=(Button)findViewById(R.id.level_13);
                    b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape_4));
                    break;
                }
                case 13:
                {
                    Button b=(Button)findViewById(R.id.level_2);
                    b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape));
                    b=(Button)findViewById(R.id.level_3);
                    b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape));
                    b=(Button)findViewById(R.id.level_4);
                    b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape));
                    b=(Button)findViewById(R.id.level_5);
                    b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape_2));
                    b=(Button)findViewById(R.id.level_6);
                    b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape_2));
                    b=(Button)findViewById(R.id.level_7);
                    b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape_2));
                    b=(Button)findViewById(R.id.level_8);
                    b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape_2));
                    b=(Button)findViewById(R.id.level_9);
                    b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape_3));
                    b=(Button)findViewById(R.id.level_10);
                    b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape_3));
                    b=(Button)findViewById(R.id.level_11);
                    b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape_3));
                    b=(Button)findViewById(R.id.level_12);
                    b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape_3));
                    b=(Button)findViewById(R.id.level_13);
                    b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape_4));
                    b=(Button)findViewById(R.id.level_14);
                    b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape_4));
                    break;
                }
                case 14:
                {
                    Button b=(Button)findViewById(R.id.level_2);
                    b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape));
                    b=(Button)findViewById(R.id.level_3);
                    b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape));
                    b=(Button)findViewById(R.id.level_4);
                    b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape));
                    b=(Button)findViewById(R.id.level_5);
                    b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape_2));
                    b=(Button)findViewById(R.id.level_6);
                    b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape_2));
                    b=(Button)findViewById(R.id.level_7);
                    b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape_2));
                    b=(Button)findViewById(R.id.level_8);
                    b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape_2));
                    b=(Button)findViewById(R.id.level_9);
                    b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape_3));
                    b=(Button)findViewById(R.id.level_10);
                    b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape_3));
                    b=(Button)findViewById(R.id.level_11);
                    b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape_3));
                    b=(Button)findViewById(R.id.level_12);
                    b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape_3));
                    b=(Button)findViewById(R.id.level_13);
                    b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape_4));
                    b=(Button)findViewById(R.id.level_14);
                    b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape_4));
                    b=(Button)findViewById(R.id.level_15);
                    b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape_4));
                    break;
                }
                case 15:
                {
                    Button b=(Button)findViewById(R.id.level_2);
                    b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape));
                    b=(Button)findViewById(R.id.level_3);
                    b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape));
                    b=(Button)findViewById(R.id.level_4);
                    b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape));
                    b=(Button)findViewById(R.id.level_5);
                    b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape_2));
                    b=(Button)findViewById(R.id.level_6);
                    b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape_2));
                    b=(Button)findViewById(R.id.level_7);
                    b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape_2));
                    b=(Button)findViewById(R.id.level_8);
                    b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape_2));
                    b=(Button)findViewById(R.id.level_9);
                    b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape_3));
                    b=(Button)findViewById(R.id.level_10);
                    b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape_3));
                    b=(Button)findViewById(R.id.level_11);
                    b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape_3));
                    b=(Button)findViewById(R.id.level_12);
                    b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape_3));
                    b=(Button)findViewById(R.id.level_13);
                    b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape_4));
                    b=(Button)findViewById(R.id.level_14);
                    b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape_4));
                    b=(Button)findViewById(R.id.level_15);
                    b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape_4));
                    b=(Button)findViewById(R.id.level_16);
                    b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape_4));
                    break;
                }
                case 16:
                {
                    Button b=(Button)findViewById(R.id.level_2);
                    b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape));
                    b=(Button)findViewById(R.id.level_3);
                    b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape));
                    b=(Button)findViewById(R.id.level_4);
                    b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape));
                    b=(Button)findViewById(R.id.level_5);
                    b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape_2));
                    b=(Button)findViewById(R.id.level_6);
                    b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape_2));
                    b=(Button)findViewById(R.id.level_7);
                    b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape_2));
                    b=(Button)findViewById(R.id.level_8);
                    b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape_2));
                    b=(Button)findViewById(R.id.level_9);
                    b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape_3));
                    b=(Button)findViewById(R.id.level_10);
                    b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape_3));
                    b=(Button)findViewById(R.id.level_11);
                    b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape_3));
                    b=(Button)findViewById(R.id.level_12);
                    b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape_3));
                    b=(Button)findViewById(R.id.level_13);
                    b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape_4));
                    b=(Button)findViewById(R.id.level_14);
                    b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape_4));
                    b=(Button)findViewById(R.id.level_15);
                    b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape_4));
                    b=(Button)findViewById(R.id.level_16);
                    b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape_4));
                    b=(Button)findViewById(R.id.level_17);
                    b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape_5));
                    break;
                }
                case 17:
                {
                    Button b=(Button)findViewById(R.id.level_2);
                    b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape));
                    b=(Button)findViewById(R.id.level_3);
                    b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape));
                    b=(Button)findViewById(R.id.level_4);
                    b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape));
                    b=(Button)findViewById(R.id.level_5);
                    b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape_2));
                    b=(Button)findViewById(R.id.level_6);
                    b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape_2));
                    b=(Button)findViewById(R.id.level_7);
                    b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape_2));
                    b=(Button)findViewById(R.id.level_8);
                    b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape_2));
                    b=(Button)findViewById(R.id.level_9);
                    b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape_3));
                    b=(Button)findViewById(R.id.level_10);
                    b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape_3));
                    b=(Button)findViewById(R.id.level_11);
                    b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape_3));
                    b=(Button)findViewById(R.id.level_12);
                    b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape_3));
                    b=(Button)findViewById(R.id.level_13);
                    b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape_4));
                    b=(Button)findViewById(R.id.level_14);
                    b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape_4));
                    b=(Button)findViewById(R.id.level_15);
                    b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape_4));
                    b=(Button)findViewById(R.id.level_16);
                    b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape_4));
                    b=(Button)findViewById(R.id.level_17);
                    b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape_5));
                    b=(Button)findViewById(R.id.level_18);
                    b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape_5));
                    break;
                }
                case 18:
                {
                    Button b=(Button)findViewById(R.id.level_2);
                    b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape));
                    b=(Button)findViewById(R.id.level_3);
                    b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape));
                    b=(Button)findViewById(R.id.level_4);
                    b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape));
                    b=(Button)findViewById(R.id.level_5);
                    b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape_2));
                    b=(Button)findViewById(R.id.level_6);
                    b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape_2));
                    b=(Button)findViewById(R.id.level_7);
                    b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape_2));
                    b=(Button)findViewById(R.id.level_8);
                    b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape_2));
                    b=(Button)findViewById(R.id.level_9);
                    b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape_3));
                    b=(Button)findViewById(R.id.level_10);
                    b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape_3));
                    b=(Button)findViewById(R.id.level_11);
                    b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape_3));
                    b=(Button)findViewById(R.id.level_12);
                    b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape_3));
                    b=(Button)findViewById(R.id.level_13);
                    b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape_4));
                    b=(Button)findViewById(R.id.level_14);
                    b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape_4));
                    b=(Button)findViewById(R.id.level_15);
                    b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape_4));
                    b=(Button)findViewById(R.id.level_16);
                    b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape_4));
                    b=(Button)findViewById(R.id.level_17);
                    b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape_5));
                    b=(Button)findViewById(R.id.level_18);
                    b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape_5));
                    b=(Button)findViewById(R.id.level_19);
                    b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape_5));
                    break;
                }
                case 19:
                {
                    Button b=(Button)findViewById(R.id.level_2);
                    b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape));
                    b=(Button)findViewById(R.id.level_3);
                    b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape));
                    b=(Button)findViewById(R.id.level_4);
                    b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape));
                    b=(Button)findViewById(R.id.level_5);
                    b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape_2));
                    b=(Button)findViewById(R.id.level_6);
                    b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape_2));
                    b=(Button)findViewById(R.id.level_7);
                    b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape_2));
                    b=(Button)findViewById(R.id.level_8);
                    b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape_2));
                    b=(Button)findViewById(R.id.level_9);
                    b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape_3));
                    b=(Button)findViewById(R.id.level_10);
                    b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape_3));
                    b=(Button)findViewById(R.id.level_11);
                    b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape_3));
                    b=(Button)findViewById(R.id.level_12);
                    b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape_3));
                    b=(Button)findViewById(R.id.level_13);
                    b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape_4));
                    b=(Button)findViewById(R.id.level_14);
                    b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape_4));
                    b=(Button)findViewById(R.id.level_15);
                    b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape_4));
                    b=(Button)findViewById(R.id.level_16);
                    b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape_4));
                    b=(Button)findViewById(R.id.level_17);
                    b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape_5));
                    b=(Button)findViewById(R.id.level_18);
                    b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape_5));
                    b=(Button)findViewById(R.id.level_19);
                    b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape_5));
                    b=(Button)findViewById(R.id.level_20);
                    b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape_5));
                    break;
                }
                case 20:
                {
                    Button b=(Button)findViewById(R.id.level_2);
                    b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape));
                    b=(Button)findViewById(R.id.level_3);
                    b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape));
                    b=(Button)findViewById(R.id.level_4);
                    b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape));
                    b=(Button)findViewById(R.id.level_5);
                    b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape_2));
                    b=(Button)findViewById(R.id.level_6);
                    b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape_2));
                    b=(Button)findViewById(R.id.level_7);
                    b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape_2));
                    b=(Button)findViewById(R.id.level_8);
                    b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape_2));
                    b=(Button)findViewById(R.id.level_9);
                    b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape_3));
                    b=(Button)findViewById(R.id.level_10);
                    b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape_3));
                    b=(Button)findViewById(R.id.level_11);
                    b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape_3));
                    b=(Button)findViewById(R.id.level_12);
                    b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape_3));
                    b=(Button)findViewById(R.id.level_13);
                    b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape_4));
                    b=(Button)findViewById(R.id.level_14);
                    b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape_4));
                    b=(Button)findViewById(R.id.level_15);
                    b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape_4));
                    b=(Button)findViewById(R.id.level_16);
                    b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape_4));
                    b=(Button)findViewById(R.id.level_17);
                    b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape_5));
                    b=(Button)findViewById(R.id.level_18);
                    b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape_5));
                    b=(Button)findViewById(R.id.level_19);
                    b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape_5));
                    b=(Button)findViewById(R.id.level_20);
                    b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape_5));
                    b=(Button)findViewById(R.id.level_21);
                    b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape_5));
                    break;
                }
                case 21:
                {
                    Button b=(Button)findViewById(R.id.level_2);
                    b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape));
                    b=(Button)findViewById(R.id.level_3);
                    b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape));
                    b=(Button)findViewById(R.id.level_4);
                    b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape));
                    b=(Button)findViewById(R.id.level_5);
                    b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape_2));
                    b=(Button)findViewById(R.id.level_6);
                    b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape_2));
                    b=(Button)findViewById(R.id.level_7);
                    b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape_2));
                    b=(Button)findViewById(R.id.level_8);
                    b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape_2));
                    b=(Button)findViewById(R.id.level_9);
                    b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape_3));
                    b=(Button)findViewById(R.id.level_10);
                    b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape_3));
                    b=(Button)findViewById(R.id.level_11);
                    b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape_3));
                    b=(Button)findViewById(R.id.level_12);
                    b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape_3));
                    b=(Button)findViewById(R.id.level_13);
                    b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape_4));
                    b=(Button)findViewById(R.id.level_14);
                    b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape_4));
                    b=(Button)findViewById(R.id.level_15);
                    b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape_4));
                    b=(Button)findViewById(R.id.level_16);
                    b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape_4));
                    b=(Button)findViewById(R.id.level_17);
                    b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape_5));
                    b=(Button)findViewById(R.id.level_18);
                    b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape_5));
                    b=(Button)findViewById(R.id.level_19);
                    b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape_5));
                    b=(Button)findViewById(R.id.level_20);
                    b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape_5));
                    b=(Button)findViewById(R.id.level_21);
                    b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape_5));
                    b=(Button)findViewById(R.id.level_22);
                    b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape_5));
                    break;
                }
                case 22:
                {
                    Button b=(Button)findViewById(R.id.level_2);
                    b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape));
                    b=(Button)findViewById(R.id.level_3);
                    b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape));
                    b=(Button)findViewById(R.id.level_4);
                    b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape));
                    b=(Button)findViewById(R.id.level_5);
                    b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape_2));
                    b=(Button)findViewById(R.id.level_6);
                    b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape_2));
                    b=(Button)findViewById(R.id.level_7);
                    b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape_2));
                    b=(Button)findViewById(R.id.level_8);
                    b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape_2));
                    b=(Button)findViewById(R.id.level_9);
                    b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape_3));
                    b=(Button)findViewById(R.id.level_10);
                    b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape_3));
                    b=(Button)findViewById(R.id.level_11);
                    b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape_3));
                    b=(Button)findViewById(R.id.level_12);
                    b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape_3));
                    b=(Button)findViewById(R.id.level_13);
                    b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape_4));
                    b=(Button)findViewById(R.id.level_14);
                    b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape_4));
                    b=(Button)findViewById(R.id.level_15);
                    b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape_4));
                    b=(Button)findViewById(R.id.level_16);
                    b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape_4));
                    b=(Button)findViewById(R.id.level_17);
                    b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape_5));
                    b=(Button)findViewById(R.id.level_18);
                    b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape_5));
                    b=(Button)findViewById(R.id.level_19);
                    b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape_5));
                    b=(Button)findViewById(R.id.level_20);
                    b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape_5));
                    b=(Button)findViewById(R.id.level_21);
                    b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape_5));
                    b=(Button)findViewById(R.id.level_22);
                    b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape_5));
                    b=(Button)findViewById(R.id.level_23);
                    b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape_5));
                    break;
                }
                case 23:
                {
                    Button b=(Button)findViewById(R.id.level_2);
                    b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape));
                    b=(Button)findViewById(R.id.level_3);
                    b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape));
                    b=(Button)findViewById(R.id.level_4);
                    b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape));
                    b=(Button)findViewById(R.id.level_5);
                    b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape_2));
                    b=(Button)findViewById(R.id.level_6);
                    b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape_2));
                    b=(Button)findViewById(R.id.level_7);
                    b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape_2));
                    b=(Button)findViewById(R.id.level_8);
                    b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape_2));
                    b=(Button)findViewById(R.id.level_9);
                    b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape_3));
                    b=(Button)findViewById(R.id.level_10);
                    b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape_3));
                    b=(Button)findViewById(R.id.level_11);
                    b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape_3));
                    b=(Button)findViewById(R.id.level_12);
                    b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape_3));
                    b=(Button)findViewById(R.id.level_13);
                    b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape_4));
                    b=(Button)findViewById(R.id.level_14);
                    b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape_4));
                    b=(Button)findViewById(R.id.level_15);
                    b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape_4));
                    b=(Button)findViewById(R.id.level_16);
                    b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape_4));
                    b=(Button)findViewById(R.id.level_17);
                    b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape_5));
                    b=(Button)findViewById(R.id.level_18);
                    b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape_5));
                    b=(Button)findViewById(R.id.level_19);
                    b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape_5));
                    b=(Button)findViewById(R.id.level_20);
                    b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape_5));
                    b=(Button)findViewById(R.id.level_21);
                    b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape_5));
                    b=(Button)findViewById(R.id.level_22);
                    b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape_5));
                    b=(Button)findViewById(R.id.level_23);
                    b.setBackground(ContextCompat.getDrawable(this, R.drawable.shape_5));
                    b=(Button)findViewById(R.id.arrowNext);
                    b.setBackground(ContextCompat.getDrawable(this, R.drawable.arrow));
                    break;
                }


            }


        //soundPlay=Dgame.tiktok.load(this, R.raw.tik_tok,1); sonido

    }



    public void goToLevel(View v)
    {
        //Dgame.tiktok.play(soundPlay,1,1,1,0,1); sonido
        switch(v.getId())
        {
            case R.id.level_1:
            {

                Intent intent=new Intent(this, FirstLevel.class);
                startActivity(intent);
                break;
            }
            case R.id.level_2:
            {
                if(!Dgame.xtreme && Dgame.gamePrefs.getInt("levelPassed",0)>=1){
                    Intent intent = new Intent(this, SecondLevel.class);
                    startActivity(intent);
                                    }
                break;
            }
            case R.id.level_3:
            {
                if(!Dgame.xtreme && Dgame.gamePrefs.getInt("levelPassed",0)>=2) {
                    Intent intent = new Intent(this, ThirdLevel.class);
                    startActivity(intent);
                }
                break;
            }
            case R.id.level_4:
            {
                if(!Dgame.xtreme && Dgame.gamePrefs.getInt("levelPassed",0)>=3) {
                    Intent intent = new Intent(this, ForthLevel.class);
                    startActivity(intent);
                }
                break;
            }
            case R.id.level_5:
            {
                if(!Dgame.xtreme && Dgame.gamePrefs.getInt("levelPassed",0)>=4) {
                    Intent intenta = new Intent(this, FifthLevel.class);
                    startActivity(intenta);
                }
                break;
            }
            case R.id.level_6:
            {
                if(!Dgame.xtreme && Dgame.gamePrefs.getInt("levelPassed",0)>=5) {
                    Intent intent = new Intent(this, SixthLevel.class);
                    startActivity(intent);
                }
                break;
            }
            case R.id.level_7:
            {
                if (!Dgame.xtreme && Dgame.gamePrefs.getInt("levelPassed",0)>=6)
                {
                    Intent intent = new Intent(this, SeventhLevel.class);
                startActivity(intent);
                 }
                break;
            }
            case R.id.level_8:
            {
                if(!Dgame.xtreme && Dgame.gamePrefs.getInt("levelPassed",0)>=7) {
                    Intent intent = new Intent(this, EighthLevel.class);
                    startActivity(intent);
                }
                break;
            }
            case R.id.level_9:
            {
                if(!Dgame.xtreme && Dgame.gamePrefs.getInt("levelPassed",0)>=8) {
                    Intent intent = new Intent(this, NinthLevel.class);
                    startActivity(intent);
                }
                break;
            }
            case R.id.level_10:
            {
                if(!Dgame.xtreme && Dgame.gamePrefs.getInt("levelPassed",0)>=9) {
                    Intent intent = new Intent(this, TenthLevel.class);
                    startActivity(intent);
                }

                break;
            }
            case R.id.level_11:
            {
                if(!Dgame.xtreme && Dgame.gamePrefs.getInt("levelPassed",0)>=10) {
                    Intent intent = new Intent(this, EleventhLevel.class);
                    startActivity(intent);
                }
                break;
            }
            case R.id.level_12:
            {
                if(!Dgame.xtreme && Dgame.gamePrefs.getInt("levelPassed",0)>=11) {
                    Intent intent = new Intent(this, TwelfthLevel.class);
                    startActivity(intent);
                }
                break;
            }
            case R.id.level_13:
            {
                if(!Dgame.xtreme && Dgame.gamePrefs.getInt("levelPassed",0)>=12) {
                    Intent intent = new Intent(this, ThirteenthLevel.class);
                    startActivity(intent);
                }
                break;
            }
            case R.id.level_14:
            {
                Button b=(Button)findViewById(R.id.level_14);
                if(!Dgame.xtreme && Dgame.gamePrefs.getInt("levelPassed",0)>=13) {
                    Intent intent = new Intent(this, FourteenthLevel.class);
                    startActivity(intent);
                }
                break;
            }
            case R.id.level_15:
            {
                if(!Dgame.xtreme && Dgame.gamePrefs.getInt("levelPassed",0)>=14) {
                    Intent intent = new Intent(this, FifteenthLevel.class);
                    startActivity(intent);
                }
                break;
            }
            case R.id.level_16:
            {
                if(!Dgame.xtreme && Dgame.gamePrefs.getInt("levelPassed",0)>=15) {
                    Intent intent = new Intent(this, SixteenthLevel.class);
                    startActivity(intent);
                }
                break;
            }
            case R.id.level_17:
            {
                if(!Dgame.xtreme && Dgame.gamePrefs.getInt("levelPassed",0)>=16) {
                    Intent intent = new Intent(this, SeventeenthLevel.class);
                    startActivity(intent);
                }
                break;
            }
            case R.id.level_18:
            {
                if(!Dgame.xtreme && Dgame.gamePrefs.getInt("levelPassed",0)>=17) {
                    Intent intent = new Intent(this, EighteenthLevel.class);
                    startActivity(intent);
                }
                break;
            }
            case R.id.level_19:
            {
                if(!Dgame.xtreme && Dgame.gamePrefs.getInt("levelPassed",0)>=18) {
                    Intent intent = new Intent(this, NineteenthLevel.class);
                    startActivity(intent);
                }
                break;
            }
            case R.id.level_20:
            {
                if(!Dgame.xtreme && Dgame.gamePrefs.getInt("levelPassed",0)>=19) {
                    Intent intent = new Intent(this, TwentiethLevel.class);
                    startActivity(intent);
                }
                break;
            }
            case R.id.level_21:
            {
                if(!Dgame.xtreme && Dgame.gamePrefs.getInt("levelPassed",0)>=20) {
                    Intent intent = new Intent(this, TwentyFirstLevel.class);
                    startActivity(intent);
                }
                break;
            }
            case R.id.level_22:
            {
                if(!Dgame.xtreme && Dgame.gamePrefs.getInt("levelPassed",0)>=21) {
                    Intent intent = new Intent(this, TwentySecondLevel.class);
                    startActivity(intent);
                }
                break;
            }
            case R.id.level_23:
            {
                if(!Dgame.xtreme && Dgame.gamePrefs.getInt("levelPassed",0)>=22) {
                    Intent intent = new Intent(this, TwentyThirdLevel.class);
                    startActivity(intent);
                }
                break;
            }
            case R.id.arrowNext:
            {
                if(!Dgame.xtreme && Dgame.gamePrefs.getInt("levelPassed",0)>=23)
                {
                    Intent intent=new Intent(this,PlayScreen2.class);
                    startActivity(intent);
                    overridePendingTransition(R.anim.push_left_in, R.anim.push_left_in);
                }
            }
        }
    }






















    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_play_screen, menu);
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
}
