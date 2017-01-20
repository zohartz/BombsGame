package zohar.bombas;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.RelativeLayout;
//delete
//import com.google.android.gms.ads.AdListener;
//import com.google.android.gms.ads.AdRequest;
//import com.google.android.gms.ads.InterstitialAd;

//the initial screen that seen when opening the app
public class MenuScreen extends AppCompatActivity {
    //delete
   // InterstitialAd mInterstitialAd;
   // private GameView gameView;
  //  CountDownTimer gmt;
    private ImageView bombimg;
    private Animation anime;

    private RelativeLayout allLayout;
    MediaPlayer mdPlayer;


    Dgame temp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mdPlayer=MediaPlayer.create(MenuScreen.this,R.raw.tik_tok);
        mdPlayer.setLooping(true);
        mdPlayer.start();

        setContentView(R.layout.activity_menu_screen);
        Dgame.currLevel = 0;

        bombimg=(ImageView)findViewById(R.id.bonbing_1);
        anime = AnimationUtils.loadAnimation(this,R.anim.view_animation);


    }

    public void onWindowFocusChanged(boolean hasfocus){
        super.onWindowFocusChanged(hasfocus);{
            if(hasfocus){
                bombimg.startAnimation(anime);
            }
        }
    }

    //for stoping sound
    protected void onPause(){
        super.onPause();
        mdPlayer.release();
        finish();
    }
	/*
		////// this block is responsible for ads appearing in the screen
		////// to make ads work, uncomment this block and the linking line in the gradle file	
		
		mInterstitialAd = new InterstitialAd(this);
        ca-app-pub-3940256099942544/1033173712-test
	
        mInterstitialAd.setAdListener(new AdListener() {
            @Override
            public void onAdClosed() {
                requestNewInterstitial();
                begin();
            }
        });

        requestNewInterstitial();



    }

    private void requestNewInterstitial() {
        AdRequest adRequest = new AdRequest.Builder()
                .build();

        mInterstitialAd.loadAd(adRequest);
    }

	*/

   /* @Override
    protected void onResume() {
        super.onResume();
        gameView.resume();
    }

    @Override
    protected void onPause() {
        super.onPause();
        gameView.pause();
    }
	*/
    public void begin()
    {
        Intent intent = new Intent(this, Modes.class);
        startActivity(intent);
    }

    public void goToModeScreen(View v)
    {

     //   if (mInterstitialAd.isLoaded()) {
        //    mInterstitialAd.show();
      //  }
      //  else {

           begin();
      //  }
    }



    public void goToHighScores(View v)
    {
        Intent intent=new Intent(this, HighScores.class);
        startActivity(intent);
    }

    public void goToHelp(MenuItem item)
    {
        Intent intent =new Intent(this, Help.class);
        startActivity(intent);
    }
    public void goToInfo(MenuItem item)
    {
        Intent intent=new Intent(this,Info.class);
        startActivity(intent);
    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_menu_screen, menu);
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
