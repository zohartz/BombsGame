package zohar.bombas;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

// LENTO means you take the slow and normal version of the game
// Extreme means you choose the fast version of the game (I still need to fix some problem over there)
// once the player choose mode i'll get to play screen.java

public class Modes extends AppCompatActivity{


    public static int xtreme=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_modes);

    }


    public void goToLento(View v)
    {
        Dgame.flag= Dgame.xtreme;
        Dgame.xtreme=false;
        Intent intent=new Intent(this, PlayScreen.class);
        startActivity(intent);
    }

    public void goToXtreme(View v)
    {
        Dgame.xtreme=true;
        Intent intent=new Intent(this, FirstLevel.class);
        startActivity(intent);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_modes, menu);
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
