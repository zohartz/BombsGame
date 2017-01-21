package zohar.bombas;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.widget.ImageButton;

/**
 * Created by zohar .
 */
// this is where the game happens ,all levels use this class
    // here the sharesPreferance is initialized
public class Dgame {

public static final String TKT="TKT";
    public static int currLevel=0;
    public static int levelPassed=0;
    public static boolean flag=false;
    public static final int BOMBAS=5;
    public static final int MIL=1000;
    public static int xtremeScore=0;
    public static double lentoScore=0;
    public static boolean checkMinus=true;
    //public static SoundPool tiktok=new SoundPool(1, AudioManager.STREAM_MUSIC,0);
    public static double [] scoreArray=new double[46];
    public static final String GAME_PREFS = "ArithmeticFile";
    public static int [] visited=new int[35];



    protected static SharedPreferences gamePrefs;
    public static SharedPreferences.Editor scoreEdit;
    public static int next;

    public static boolean xtreme=false;
/*
    public static void stopTikTok(int id)
    {
        tiktok.stop(id);
    }
*/



    public static void setHighScoreLento(int levelNo)
    {

       scoreEdit=gamePrefs.edit();
        //scoreEdit.putInt("levelNumber",0);
        //scoreEdit.commit();
        //Log.d(TKT, "enter setHighScoreLento");
        //Log.d(TKT, "lentoScores: "+lentoScore);
        if(levelNo>=0 && levelNo!=46 && scoreArray[levelNo]<lentoScore)
        {

            scoreArray[levelNo]=lentoScore;
        }

        double after=sumOfArray();
        float temp=(float)after;
        scoreEdit.putFloat("lentoScores", temp);
        scoreEdit.commit();
        next=gamePrefs.getInt("levelNumber",0);

            if(levelNo+2>next) {
                scoreEdit.putInt("levelNumber", levelNo + 2);
                scoreEdit.commit();
            }

        next=gamePrefs.getInt("levelNumber",1);


        lentoScore=0;


    }

    public static void setHighScoreX(int levelNo)
    {
        scoreEdit=gamePrefs.edit();
        xtremeScore=gamePrefs.getInt("xtremeScore",1);
        if(levelNo>xtremeScore)
            xtremeScore=levelNo;
        scoreEdit.putInt("xtremeScores",xtremeScore);
        scoreEdit.commit();
    }

    public static double sumOfArray()
    {
        double sum=0;
        for(int i=0; i<scoreArray.length; i++)
        {
            sum+=scoreArray[i];
        }
        return sum;
    }

    //choose where to put bombs and where circles randomly
    public static void mix(int pressed, Context context) {
        initVisited();
        ImageButton temp = null;
        int left = BOMBAS - pressed;
        int[] exs = chooseX(left);
        for (int i = 0; i < 35; i++) {

            temp=switchIt(i,context);

            int mixTrans = mixTrans();
            if (contains(i, exs)) {
                while (temp.getTag() == "touched")
                {
                    int rand=(int)(Math.random()*34);
                    temp=switchIt(rand,context);
                }
                if (mixTrans == 2)
                {
                    temp.setBackgroundResource(R.drawable.bomb_2);
                }
                else if (mixTrans == 3)
                {
                    temp.setBackgroundResource(randomBlackWhiteBomb());
                }
                else
                {
                    temp.setBackgroundResource(randomBomb());
                }
                temp.setTag("bomb");
            }
            else
                if (temp.getTag().equals("bomb"))
                {
                    if (mixTrans == 2)
                    {
                        temp.setBackgroundResource(R.drawable.circle_trans);
                    }
                    else
                    if (mixTrans == 3)
                    {
                        temp.setBackgroundResource(randomBlackWhiteBall());//bw ball
                    }
                    else
                    {
                        temp.setBackgroundResource(randomBall());
                    }
                temp.setTag("ball");

            }
                else
                if (temp.getTag().equals("ball"))
                {
                    if (mixTrans == 2)
                    {
                        temp.setBackgroundResource(R.drawable.circle_trans);
                    }
                    else if (mixTrans == 3)
                    {
                        temp.setBackgroundResource(randomBlackWhiteBall());//bw ball
                    }
                    else
                    {
                        temp.setBackgroundResource(randomBall());
                    }
                temp.setTag("ball");
            }

        }


    }
    // chooses circles randomly (this function used by mix)
    public static ImageButton switchIt(int i, Context context) {
        ImageButton temp=null;
        switch (i) {
            case 0: {
                temp = (ImageButton) ((Activity) context).findViewById(R.id.b0);
                break;
            }
            case 1: {
                temp = (ImageButton) ((Activity) context).findViewById(R.id.b1);
                break;
            }
            case 2: {
                temp = (ImageButton) ((Activity) context).findViewById(R.id.b2);
                break;
            }
            case 3: {
                temp = (ImageButton) ((Activity) context).findViewById(R.id.b3);
                break;
            }
            case 4: {
                temp = (ImageButton) ((Activity) context).findViewById(R.id.b4);
                break;
            }
            case 5: {
                temp = (ImageButton) ((Activity) context).findViewById(R.id.b5);
                break;
            }
            case 6: {
                temp = (ImageButton) ((Activity) context).findViewById(R.id.b6);
                break;
            }
            case 7: {
                temp = (ImageButton) ((Activity) context).findViewById(R.id.b7);
                break;
            }
            case 8: {
                temp = (ImageButton) ((Activity) context).findViewById(R.id.b8);
                break;
            }
            case 9: {
                temp = (ImageButton) ((Activity) context).findViewById(R.id.b9);
                break;
            }
            case 10: {
                temp = (ImageButton) ((Activity) context).findViewById(R.id.b10);
                break;
            }
            case 11: {
                temp = (ImageButton) ((Activity) context).findViewById(R.id.b11);
                break;
            }
            case 12: {
                temp = (ImageButton) ((Activity) context).findViewById(R.id.b12);
                break;
            }
            case 13: {
                temp = (ImageButton) ((Activity) context).findViewById(R.id.b13);
                break;
            }
            case 14: {
                temp = (ImageButton) ((Activity) context).findViewById(R.id.b14);
                break;
            }
            case 15: {
                temp = (ImageButton) ((Activity) context).findViewById(R.id.b15);
                break;
            }
            case 16: {
                temp = (ImageButton) ((Activity) context).findViewById(R.id.b16);
                break;
            }
            case 17: {
                temp = (ImageButton) ((Activity) context).findViewById(R.id.b17);
                break;
            }
            case 18: {
                temp = (ImageButton) ((Activity) context).findViewById(R.id.b18);
                break;
            }
            case 19: {
                temp = (ImageButton) ((Activity) context).findViewById(R.id.b19);
                break;
            }
            case 20: {
                temp = (ImageButton) ((Activity) context).findViewById(R.id.b20);
                break;
            }
            case 21: {
                temp = (ImageButton) ((Activity) context).findViewById(R.id.b21);
                break;
            }
            case 22: {
                temp = (ImageButton) ((Activity) context).findViewById(R.id.b22);
                break;
            }
            case 23: {
                temp = (ImageButton) ((Activity) context).findViewById(R.id.b23);
                break;
            }
            case 24: {
                temp = (ImageButton) ((Activity) context).findViewById(R.id.b24);
                break;
            }
            case 25: {
                temp = (ImageButton) ((Activity) context).findViewById(R.id.b25);
                break;
            }
            case 26: {
                temp = (ImageButton) ((Activity) context).findViewById(R.id.b26);
                break;
            }
            case 27: {
                temp = (ImageButton) ((Activity) context).findViewById(R.id.b27);
                break;
            }
            case 28: {
                temp = (ImageButton) ((Activity) context).findViewById(R.id.b28);
                break;
            }
            case 29: {
                temp = (ImageButton) ((Activity) context).findViewById(R.id.b29);
                break;
            }
            case 30: {
                temp = (ImageButton) ((Activity) context).findViewById(R.id.b30);
                break;
            }
            case 31: {
                temp = (ImageButton) ((Activity) context).findViewById(R.id.b31);
                break;
            }
            case 32: {
                temp = (ImageButton) ((Activity) context).findViewById(R.id.b32);
                break;
            }
            case 33: {
                temp = (ImageButton) ((Activity) context).findViewById(R.id.b33);
                break;
            }
            case 34: {
                temp = (ImageButton) ((Activity) context).findViewById(R.id.b34);
                break;
            }
        }
        return temp;

    }

    public static void mixUnaBomba(Context context)
    {
        initVisited();
        ImageButton temp=null;
        int random;

        do {
            random=(int)(Math.random()*35);
            switch (random)
            {

                case 0:
                {
                    temp=(ImageButton)((Activity)context).findViewById(R.id.b0);
                    break;
                }
                case 1:
                {
                    temp=(ImageButton)((Activity)context).findViewById(R.id.b1);
                    break;
                }
                case 2:
                {
                    temp=(ImageButton)((Activity)context).findViewById(R.id.b2);
                    break;
                }
                case 3:
                {
                    temp=(ImageButton)((Activity)context).findViewById(R.id.b3);
                    break;
                }
                case 4:
                {
                    temp=(ImageButton)((Activity)context).findViewById(R.id.b4);
                    break;
                }
                case 5:
                {
                    temp=(ImageButton)((Activity)context).findViewById(R.id.b5);
                    break;
                }
                case 6:
                {
                    temp=(ImageButton)((Activity)context).findViewById(R.id.b6);
                    break;
                }
                case 7:
                {
                    temp=(ImageButton)((Activity)context).findViewById(R.id.b7);
                    break;
                }
                case 8:
                {
                    temp=(ImageButton)((Activity)context).findViewById(R.id.b8);
                    break;
                }
                case 9:
                {
                    temp=(ImageButton)((Activity)context).findViewById(R.id.b9);
                    break;
                }
                case 10:
                {
                    temp=(ImageButton)((Activity)context).findViewById(R.id.b10);
                    break;
                }
                case 11:
                {
                    temp=(ImageButton)((Activity)context).findViewById(R.id.b11);
                    break;
                }
                case 12:
                {
                    temp=(ImageButton)((Activity)context).findViewById(R.id.b12);
                    break;
                }
                case 13:
                {
                    temp=(ImageButton)((Activity)context).findViewById(R.id.b13);
                    break;
                }
                case 14:
                {
                    temp=(ImageButton)((Activity)context).findViewById(R.id.b14);
                    break;
                }
                case 15:
                {
                    temp=(ImageButton)((Activity)context).findViewById(R.id.b15);
                    break;
                }
                case 16:
                {
                    temp=(ImageButton)((Activity)context).findViewById(R.id.b16);
                    break;
                }
                case 17:
                {
                    temp=(ImageButton)((Activity)context).findViewById(R.id.b17);
                    break;
                }
                case 18:
                {
                    temp=(ImageButton)((Activity)context).findViewById(R.id.b18);
                    break;
                }
                case 19:
                {
                    temp=(ImageButton)((Activity)context).findViewById(R.id.b19);
                    break;
                }
                case 20:
                {
                    temp=(ImageButton)((Activity)context).findViewById(R.id.b20);
                    break;
                }
                case 21:
                {
                    temp=(ImageButton)((Activity)context).findViewById(R.id.b21);
                    break;
                }
                case 22:
                {
                    temp=(ImageButton)((Activity)context).findViewById(R.id.b22);
                    break;
                }
                case 23:
                {
                    temp=(ImageButton)((Activity)context).findViewById(R.id.b23);
                    break;
                }
                case 24:
                {
                    temp=(ImageButton)((Activity)context).findViewById(R.id.b24);
                    break;
                }
                case 25:
                {
                    temp=(ImageButton)((Activity)context).findViewById(R.id.b25);
                    break;
                }
                case 26:
                {
                    temp=(ImageButton)((Activity)context).findViewById(R.id.b26);
                    break;
                }
                case 27:
                {
                    temp=(ImageButton)((Activity)context).findViewById(R.id.b27);
                    break;
                }
                case 28:
                {
                    temp=(ImageButton)((Activity)context).findViewById(R.id.b28);
                    break;
                }
                case 29:
                {
                    temp=(ImageButton)((Activity)context).findViewById(R.id.b29);
                    break;
                }
                case 30:
                {
                    temp=(ImageButton)((Activity)context).findViewById(R.id.b30);
                    break;
                }
                case 31:
                {
                    temp=(ImageButton)((Activity)context).findViewById(R.id.b31);
                    break;
                }
                case 32:
                {
                    temp=(ImageButton)((Activity)context).findViewById(R.id.b32);
                    break;
                }
                case 33:
                {
                    temp=(ImageButton)((Activity)context).findViewById(R.id.b33);
                    break;
                }
                case 34:
                {
                    temp=(ImageButton)((Activity)context).findViewById(R.id.b34);
                    break;
                }
            }
        }
        while (temp.getTag() == "touched");

        temp.setBackgroundResource(R.drawable.bomb_2);
        temp.setTag("bomb");

    }

    public static void initVisited()
    {// TODO: 10/26/2015 call once from onCreate
        for(int i=0; i<visited.length; i++)
        {
            visited[i]=0;
        }
    }

    // chooses bombs randomly (this function used by mix)

    public static int randomBall()
    {
        int pelota;
        pelota=(int)(Math.random()*180);
        {
            switch (pelota)
            {
                case 0:
                {
                    pelota=R.drawable.bomb_1;
                    break;
                }
                case 1:
                {
                    pelota=R.drawable.bomb_22;
                    break;
                }
                case 2:
                {
                    pelota=R.drawable.bomb_3;
                    break;
                }
                case 3:
                {
                    pelota=R.drawable.bomb_4;
                    break;
                }
                case 4:
                {
                    pelota=R.drawable.bomb_5;
                    break;
                }
                case 5:
                {
                    pelota=R.drawable.bomb_6;
                    break;
                }
                case 6:
                {
                    pelota=R.drawable.bomb_7;
                    break;
                }
                case 7:
                {
                    pelota=R.drawable.bomb_8;
                    break;
                }
                case 8:
                {
                    pelota=R.drawable.c_1;
                    break;
                }
                case 9:
                {
                    pelota=R.drawable.c_10;
                    break;
                }
                case 10:
                {
                    pelota=R.drawable.c_11;
                    break;
                }
                case 11:
                {
                    pelota=R.drawable.c_12;
                    break;
                }
                case 12:
                {
                    pelota=R.drawable.c_13;
                    break;
                }
                case 13:
                {
                    pelota=R.drawable.c_14;
                    break;
                }
                case 14:
                {
                    pelota=R.drawable.c_15;
                    break;
                }
                case 15:
                {
                    pelota=R.drawable.c_16;
                    break;
                }
                case 16:
                {
                    pelota=R.drawable.c_2;
                    break;
                }
                case 17:
                {
                    pelota=R.drawable.c_3;
                    break;
                }
                case 18:
                {
                    pelota=R.drawable.c_4;
                    break;
                }
                case 19:
                {
                    pelota=R.drawable.c_5;
                    break;
                }
                case 20:
                {
                    pelota=R.drawable.c_6;
                    break;
                }
                case 21:
                {
                    pelota=R.drawable.c_7;
                    break;
                }
                case 22:
                {
                    pelota=R.drawable.c_8;
                    break;
                }
                case 23:
                {
                    pelota=R.drawable.c_9;
                    break;
                }
                case 24:
                {
                    pelota=R.drawable.c_s;
                    break;
                }
                case 25:
                {
                    pelota=R.drawable.c_s_10;
                    break;
                }
                case 26:
                {
                    pelota=R.drawable.c_s_11;
                    break;
                }
                case 27:
                {
                    pelota=R.drawable.c_s_12;
                    break;
                }
                case 28:
                {
                    pelota=R.drawable.c_s_14;
                    break;
                }
                case 29:
                {
                    pelota=R.drawable.c_s_15;
                    break;
                }
                case 30:
                {
                    pelota=R.drawable.c_s_16;
                    break;
                }
                case 31:
                {
                    pelota=R.drawable.c_s_17;
                    break;
                }
                case 32:
                {
                    pelota=R.drawable.c_s_18;
                    break;
                }
                case 33:
                {
                    pelota=R.drawable.c_s_19;
                    break;
                }
                case 34:
                {
                    pelota=R.drawable.c_s_2;
                    break;
                }
                case 35:
                {
                    pelota=R.drawable.c_s_20;
                    break;
                }
                case 36:
                {
                    pelota=R.drawable.c_s_21;
                    break;
                }
                case 37:
                {
                    pelota=R.drawable.c_s_22;
                    break;
                }
                case 38:
                {
                    pelota=R.drawable.c_s_23;
                    break;
                }
                case 39:
                {
                    pelota=R.drawable.c_s_24;
                    break;
                }
                case 40:
                {
                    pelota=R.drawable.c_s_3;
                    break;
                }
                case 41:
                {
                    pelota=R.drawable.c_s_4;
                    break;
                }
                case 42:
                {
                    pelota=R.drawable.c_s_5;
                    break;
                }
                case 43:
                {
                    pelota=R.drawable.c_s_6;
                    break;
                }
                case 44:
                {
                    pelota=R.drawable.c_s_7;
                    break;
                }
                case 45:
                {
                    pelota=R.drawable.c_s_8;
                    break;
                }
                case 46:
                {
                    pelota=R.drawable.c_s_9;
                    break;
                }
                case 47:
                {
                    pelota=R.drawable.circle_black;
                    break;
                }
                case 48:
                {
                    pelota=R.drawable.circle_blanco;
                    break;
                }
                case 49:
                {
                    pelota=R.drawable.circle_blue;
                    break;
                }
                case 50:
                {
                    pelota=R.drawable.circle_brown;
                    break;
                }
                case 51:
                {
                    pelota=R.drawable.circle_cyan;
                    break;
                }
                case 52:
                {
                    pelota=R.drawable.circle_gray;
                    break;
                }
                case 53:
                {
                    pelota=R.drawable.circle_gray_1;
                    break;
                }
                case 54:
                {
                    pelota=R.drawable.circle_mold;
                    break;
                }
                case 55:
                {
                    pelota=R.drawable.circle_orange;
                    break;
                }
                case 56:
                {
                    pelota=R.drawable.circle_pink;
                    break;
                }
                case 57:
                {
                    pelota=R.drawable.circle_red;
                    break;
                }
                case 58:
                {
                    pelota=R.drawable.circle_trans;
                    break;
                }
                case 59:
                {
                    pelota=R.drawable.circle_verde;
                    break;
                }
                case 60:
                {
                    pelota=R.drawable.circle_violet;
                    break;
                }
                case 61:
                {
                    pelota=R.drawable.circle_yellow;
                    break;
                }
                case 62:
                {
                    pelota=R.drawable.cl;
                    break;
                }
                case 63:
                {
                    pelota=R.drawable.cl_1;
                    break;
                }
                case 64:
                {
                    pelota=R.drawable.cl_10;
                    break;
                }
                case 65:
                {
                    pelota=R.drawable.cl_11;
                    break;
                }
                case 66:
                {
                    pelota=R.drawable.cl_12;
                    break;
                }
                case 67:
                {
                    pelota=R.drawable.cl_13;
                    break;
                }
                case 68:
                {
                    pelota=R.drawable.cl_14;
                    break;
                }
                case 69:
                {
                    pelota=R.drawable.cl_15;
                    break;
                }
                case 70:
                {
                    pelota=R.drawable.cl_16;
                    break;
                }
                case 71:
                {
                    pelota=R.drawable.cl_17;
                    break;
                }
                case 72:
                {
                    pelota=R.drawable.cl_18;
                    break;
                }
                case 73:
                {
                    pelota=R.drawable.cl_19;
                    break;
                }
                case 74:
                {
                    pelota=R.drawable.cl_2;
                    break;
                }
                case 75:
                {
                    pelota=R.drawable.cl_20;
                    break;
                }
                case 76:
                {
                    pelota=R.drawable.cl_21;
                    break;
                }
                case 77:
                {
                    pelota=R.drawable.cl_22;
                    break;
                }
                case 78:
                {
                    pelota=R.drawable.cl_23;
                    break;
                }
                case 79:
                {
                    pelota=R.drawable.cl_24;
                    break;
                }
                ///////////////////
                case 80:
                {
                    pelota=R.drawable.cl_4;
                    break;
                }
                case 81:
                {
                    pelota=R.drawable.cl_5;
                    break;
                }
                case 82:
                {
                    pelota=R.drawable.cl_6;
                    break;
                }
                case 83:
                {
                    pelota=R.drawable.cl_7;
                    break;
                }
                case 84:
                {
                    pelota=R.drawable.cl_8;
                    break;
                }
                case 85:
                {
                    pelota=R.drawable.cl_9;
                    break;
                }
                case 86:
                {
                    pelota=R.drawable.f;
                    break;
                }
                case 87:
                {
                    pelota=R.drawable.f_1;
                    break;
                }
                case 88:
                {
                    pelota=R.drawable.f_10;
                    break;
                }
                case 89:
                {
                    pelota=R.drawable.f_11;
                    break;
                }
                case 90:
                {
                    pelota=R.drawable.f_12;
                    break;
                }
                case 91:
                {
                    pelota=R.drawable.f_14;
                    break;
                }
                case 92:
                {
                    pelota=R.drawable.f_15;
                    break;
                }
                case 93:
                {
                    pelota=R.drawable.f_16;
                    break;
                }
                case 94:
                {
                    pelota=R.drawable.f_17;
                    break;
                }
                case 95:
                {
                    pelota=R.drawable.f_21;
                    break;
                }
                case 96:
                {
                    pelota=R.drawable.f_22;
                    break;
                }
                case 97:
                {
                    pelota=R.drawable.f_23;
                    break;
                }
                case 98:
                {
                    pelota=R.drawable.f_24;
                    break;
                }
                case 99:
                {
                    pelota=R.drawable.f_25;
                    break;
                }
                case 100:
                {
                    pelota=R.drawable.f_26;
                    break;
                }
                case 101:
                {
                    pelota=R.drawable.f_27;
                    break;
                }
                case 102:
                {
                    pelota=R.drawable.f_28;
                    break;
                }
                case 103:
                {
                    pelota=R.drawable.f_29;
                    break;
                }
                case 104:
                {
                    pelota=R.drawable.f_3;
                    break;
                }
                case 105:
                {
                    pelota=R.drawable.f_30;
                    break;
                }
                case 106:
                {
                    pelota=R.drawable.f_31;
                    break;
                }
                case 107:
                {
                    pelota=R.drawable.f_32;
                    break;
                }
                case 108:
                {
                    pelota=R.drawable.f_33;
                    break;
                }
                case 109:
                {
                    pelota=R.drawable.f_34;
                    break;
                }
                case 110:
                {
                    pelota=R.drawable.f_35;
                    break;
                }
                case 111:
                {
                    pelota=R.drawable.f_36;
                    break;
                }
                case 112:
                {
                    pelota=R.drawable.f_37;
                    break;
                }
                case 113:
                {
                    pelota=R.drawable.f_38;
                    break;
                }
                case 114:
                {
                    pelota=R.drawable.f_4;
                    break;
                }
                case 115:
                {
                    pelota=R.drawable.f_5;
                    break;
                }
                case 116:
                {
                    pelota=R.drawable.f_6;
                    break;
                }
                case 117:
                {
                    pelota=R.drawable.f_7;
                    break;
                }
                case 118:
                {
                    pelota=R.drawable.f_8;
                    break;
                }
                case 119:
                {
                    pelota=R.drawable.f_9;
                    break;
                }
                case 120:
                {
                    pelota=R.drawable.il;
                    break;
                }
                case 121:
                {
                    pelota=R.drawable.s;
                    break;
                }
                case 122:
                {
                    pelota=R.drawable.s_0;
                    break;
                }
                case 123:
                {
                    pelota=R.drawable.s_1;
                    break;
                }
                case 124:
                {
                    pelota=R.drawable.s_10;
                    break;
                }
                case 125:
                {
                    pelota=R.drawable.s_11;
                    break;
                }
                case 126:
                {
                    pelota=R.drawable.s_12;
                    break;
                }
                case 127:
                {
                    pelota=R.drawable.s_13;
                    break;
                }
                case 128:
                {
                    pelota=R.drawable.s_14;
                    break;
                }
                case 129:
                {
                    pelota=R.drawable.s_15;
                    break;
                }
                case 130:
                {
                    pelota=R.drawable.s_16;
                    break;
                }
                case 131:
                {
                    pelota=R.drawable.s_17;
                    break;
                }
                case 132:
                {
                    pelota=R.drawable.s_18;
                    break;
                }
                case 133:
                {
                    pelota=R.drawable.s_19;
                    break;
                }
                case 134:
                {
                    pelota=R.drawable.s_2;
                    break;
                }
                case 135:
                {
                    pelota=R.drawable.s_20;
                    break;
                }
                case 136:
                {
                    pelota=R.drawable.s_21;
                    break;
                }
                case 137:
                {
                    pelota=R.drawable.s_22;
                    break;
                }
                case 138:
                {
                    pelota=R.drawable.s_23;
                    break;
                }
                case 139:
                {
                    pelota=R.drawable.s_24;
                    break;
                }
                case 140:
                {
                    pelota=R.drawable.s_25;
                    break;
                }
                case 141:
                {
                    pelota=R.drawable.s_26;
                    break;
                }
                case 142:
                {
                    pelota=R.drawable.s_27;
                    break;
                }
                case 143:
                {
                    pelota=R.drawable.s_29;
                    break;
                }
                case 144:
                {
                    pelota=R.drawable.s_3;
                    break;
                }
                case 145:
                {
                    pelota=R.drawable.s_30;
                    break;
                }
                case 146:
                {
                    pelota=R.drawable.s_31;
                    break;
                }
                case 147:
                {
                    pelota=R.drawable.s_32;
                    break;
                }
                case 148:
                {
                    pelota=R.drawable.s_33;
                    break;
                }
                case 149:
                {
                    pelota=R.drawable.s_34;
                    break;
                }
                case 150:
                {
                    pelota=R.drawable.s_35;
                    break;
                }
                case 151:
                {
                    pelota=R.drawable.s_36;
                    break;
                }
                case 152:
                {
                    pelota=R.drawable.s_37;
                    break;
                }
                case 153:
                {
                    pelota=R.drawable.s_39;
                    break;
                }
                case 154:
                {
                    pelota=R.drawable.s_4;
                    break;
                }
                case 155:
                {
                    pelota=R.drawable.s_40;
                    break;
                }
                case 156:
                {
                    pelota=R.drawable.s_41;
                    break;
                }
                case 157:
                {
                    pelota=R.drawable.s_43;
                    break;
                }
                case 158:
                {
                    pelota=R.drawable.s_44;
                    break;
                }
                case 159:
                {
                    pelota=R.drawable.s_45;
                    break;
                }
                case 160:
                {
                    pelota=R.drawable.s_46;
                    break;
                }
                case 161:
                {
                    pelota=R.drawable.s_47;
                    break;
                }
                case 162:
                {
                    pelota=R.drawable.s_48;
                    break;
                }
                case 163:
                {
                    pelota=R.drawable.s_49;
                    break;
                }
                case 164:
                {
                    pelota=R.drawable.s_5;
                    break;
                }
                case 165:
                {
                    pelota=R.drawable.s_50;
                    break;
                }
                case 166:
                {
                    pelota=R.drawable.s_51;
                    break;
                }
                case 167:
                {
                    pelota=R.drawable.s_52;
                    break;
                }
                case 168:
                {
                    pelota=R.drawable.s_53;
                    break;
                }
                case 169:
                {
                    pelota=R.drawable.s_54;
                    break;
                }
                case 170:
                {
                    pelota=R.drawable.s_55;
                    break;
                }
                case 171:
                {
                    pelota=R.drawable.s_56;
                    break;
                }
                case 172:
                {
                    pelota=R.drawable.s_57;
                    break;
                }
                case 173:
                {
                    pelota=R.drawable.s_58;
                    break;
                }
                case 174:
                {
                    pelota=R.drawable.s_59;
                    break;
                }
                case 175:
                {
                    pelota=R.drawable.s_6;
                    break;
                }
                case 176:
                {
                    pelota=R.drawable.s_60;
                    break;
                }
                case 177:
                {
                    pelota=R.drawable.s_7;
                    break;
                }
                case 178:
                {
                    pelota=R.drawable.s_8;
                    break;
                }
                case 179:
                {
                    pelota=R.drawable.s_9;
                    break;
                }

            }
        }
        return pelota;
    }

    public static int randomBomb()
    {
        int bomba;
        bomba=(int)(Math.random()*14);
        switch (bomba)
        {
            case 0:
            {
                bomba=R.drawable.bomb;
                break;
            }
            case 1:
            {
                bomba=R.drawable.bomb_2;
                break;
            }
            case 2:
            {
                bomba=R.drawable.bomb_black_trans;
                break;
            }
            case 3:
            {
                bomba=R.drawable.bomb_blue_trans;
                break;
            }
            case 4:
            {
                bomba=R.drawable.bomb_gray_trans;
                break;
            }
            case 5:
            {
                bomba=R.drawable.bomb_red_trans;
                break;
            }
            case 6:
            {
                bomba=R.drawable.bomb_verde_trans;
                break;
            }
            case 7:
            {
                bomba=R.drawable.bomb_white_trans;
                break;
            }
            case 8:
            {
                bomba=R.drawable.bomb_yellow_trans;
                break;
            }
            case 9:
            {
                bomba=R.drawable.c_s_bomb;
                break;
            }
            case 10:
            {
                bomba=R.drawable.cl_bomb;
                break;
            }
            case 11:
            {
                bomba=R.drawable.f_bomb;
                break;
            }
            case 12:
            {
                bomba=R.drawable.s_bomb;
                break;
            }
            case 13:
            {
                bomba=R.drawable.s_bomb_1;
                break;
            }
        }
        return bomba;
    }

    public static int randomBlackWhiteBall()
    {
        int pelota;
        pelota=(int)(Math.random()*41);
        switch (pelota)
        {
            case 0:
            {
                pelota=R.drawable.bomb_1;
                break;
            }
            case 1:
            {
                pelota=R.drawable.bomb_22;
                break;
            }
            case 2:
            {
                pelota=R.drawable.bomb_3;
                break;
            }
            case 3:
            {
                pelota=R.drawable.bomb_4;
                break;
            }
            case 4:
            {
                pelota=R.drawable.bomb_5;
                break;
            }
            case 5:
            {
                pelota=R.drawable.bomb_6;
                break;
            }
            case 6:
            {
                pelota=R.drawable.bomb_7;
                break;
            }
            case 7:
            {
                pelota=R.drawable.bomb_8;
                break;
            }
            case 8:
            {
                pelota=R.drawable.c_s;
                break;
            }
            case 9:
            {
                pelota=R.drawable.c_s_10;
                break;
            }
            case 10:
            {
                pelota=R.drawable.c_s_11;
                break;
            }
            case 11:
            {
                pelota=R.drawable.c_s_12;
                break;
            }
            case 12:
            {
                pelota=R.drawable.c_s_14;
                break;
            }
            case 13:
            {
                pelota=R.drawable.c_s_15;
                break;
            }
            case 14:
            {
                pelota=R.drawable.c_s_16;
                break;
            }
            case 15:
            {
                pelota=R.drawable.circle_blanco;
                break;
            }
            case 16:
            {
                pelota=R.drawable.circle_black;
                break;
            }
            case 17:
            {
                pelota=R.drawable.circle_gray;
                break;
            }
            case 18:
            {
                pelota=R.drawable.circle_gray_1;
                break;
            }
            case 19:
            {
                pelota=R.drawable.circle_trans;
                break;
            }
            case 20:
            {
                pelota=R.drawable.cl;
                break;
            }
            case 21:
            {
                pelota=R.drawable.cl_1;
                break;
            }
            case 22:
            {
                pelota=R.drawable.cl_10;
                break;
            }
            case 23:
            {
                pelota=R.drawable.cl_11;
                break;
            }
            case 24:
            {
                pelota=R.drawable.cl_12;
                break;
            }
            case 25:
            {
                pelota=R.drawable.cl_13;
                break;
            }
            case 26:
            {
                pelota=R.drawable.cl_14;
                break;
            }
            case 27:
            {
                pelota=R.drawable.cl_15;
                break;
            }
            case 28:
            {
                pelota=R.drawable.cl_16;
                break;
            }
            case 29:
            {
                pelota=R.drawable.cl_17;
                break;
            }
            case 30:
            {
                pelota=R.drawable.cl_18;
                break;
            }
            case 31:
            {
                pelota=R.drawable.cl_19;
                break;
            }
            case 32:
            {
                pelota=R.drawable.cl_20;
                break;
            }
            case 33:
            {
                pelota=R.drawable.cl_21;
                break;
            }
            case 34:
            {
                pelota=R.drawable.cl_22;
                break;
            }
            case 35:
            {
                pelota=R.drawable.cl_23;
                break;
            }
            case 36:
            {
                pelota=R.drawable.cl_24;
                break;
            }
            case 37:
            {
                pelota=R.drawable.cl_2;
                break;
            }
            case 38:
            {
                pelota=R.drawable.cl_2;
                break;
            }
            case 39:
            {
                pelota=R.drawable.cl_4;
                break;
            }
            case 40:
            {
                pelota=R.drawable.cl_5;
                break;
            }
            case 41:
            {
                pelota=R.drawable.cl_6;
                break;
            }
        }
        return pelota;
    }

    public static int randomBlackWhiteBomb()
    {
        int bomb;
        bomb=(int)(Math.random()*6);
        switch (bomb)
        {
            case 0:
            {
                bomb=R.drawable.bomb_2;
                break;
            }
            case 1:
            {
                bomb=R.drawable.bomb_black_trans;
                break;
            }
            case 2:
            {
                bomb=R.drawable.bomb;
                break;
            }
            case 3:
            {
                bomb=R.drawable.bomb_gray_trans;
                break;
            }
            case 4:
            {
                bomb=R.drawable.c_s_bomb;
                break;
            }
            case 5:
            {
                bomb=R.drawable.cl_bomb;
                break;
            }
            case 6:
            {
                bomb=R.drawable.bomb_white_trans;
                break;
            }

        }

        return bomb;
    }

    //choosing a level from the level screen
    public static int[] chooseX(int pressed)
    {
       int []exs=new int[pressed];
       int x, count=0;
       while(count<exs.length)
        {
           x=(int)(Math.random()*35);
            if(visited[x]==0)
            {
                exs[count]=x;
                count++;
                visited[x]++;
            }
        }
        return exs;
    }

    public static boolean contains(int x, int [] exs)
    {
        for(int i=0; i<exs.length; i++)
        {
            if(x==exs[i])
                return true;
        }
        return false;
    }

    public static int mixTrans()
    {
        if(currLevel==27 || currLevel==30 || currLevel==32 || currLevel==33 || currLevel==34)
            return 2;//trans
        if(currLevel==28 || currLevel==29 || currLevel==31)
            return 3;//bw
        return 1;
    }
}
