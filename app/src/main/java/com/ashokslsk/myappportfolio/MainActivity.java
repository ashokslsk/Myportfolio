package com.ashokslsk.myappportfolio;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends ActionBarActivity implements View.OnClickListener{

    //Toolbar object
    private Toolbar mToolbar;

    //Button objects
    private Button mSpotifyStreamer,
            mScoresApp, mLibraryApp ,
            mBuilditBigger , mXyzReader,
            mCapstone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Set a toolbar to replace the action bar.
        mToolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(mToolbar);
        getSupportActionBar().setDisplayShowTitleEnabled(false);

        //Tieing the xml buttons to the java Button Object with listners
        ComponentsInit();
    }

    private void ComponentsInit() {
        mSpotifyStreamer = (Button) findViewById(R.id.spotify);
        mScoresApp = (Button) findViewById(R.id.scoreapp);
        mLibraryApp = (Button) findViewById(R.id.libraryapp);
        mBuilditBigger = (Button) findViewById(R.id.builditbigger);
        mXyzReader = (Button) findViewById(R.id.xyzreader);
        mCapstone = (Button) findViewById(R.id.capstone);

        mSpotifyStreamer.setOnClickListener(this);
        mScoresApp.setOnClickListener(this);
        mLibraryApp.setOnClickListener(this);
        mBuilditBigger.setOnClickListener(this);
        mXyzReader.setOnClickListener(this);
        mCapstone.setOnClickListener(this);
    }



    @Override
    public void onClick(View v) {

        switch(v.getId()) {
            case R.id.spotify:
                //Prints the desired message
                Toast.makeText(getApplicationContext(), R.string.ToastMessageSpotify, Toast.LENGTH_LONG).show();
                break;

            case R.id.scoreapp:
                //Prints the desired message
                Toast.makeText(getApplicationContext(), R.string.ToastMessageScoreApp, Toast.LENGTH_LONG).show();
                break;

            case R.id.libraryapp:
                //Prints the desired message
                Toast.makeText(getApplicationContext(), R.string.ToastMessageLibraryApp, Toast.LENGTH_LONG).show();
                break;

            case R.id.builditbigger:
                //Prints the desired message
                Toast.makeText(getApplicationContext(), R.string.ToastMessageBuilditbigger, Toast.LENGTH_LONG).show();
                break;

            case R.id.xyzreader:
                //Prints the desired message
                Toast.makeText(getApplicationContext(), R.string.ToastMessageXYZreader, Toast.LENGTH_LONG).show();
                break;

            case R.id.capstone:
                //Prints the desired message
                Toast.makeText(getApplicationContext(), R.string.ToastMessageCapstone, Toast.LENGTH_LONG).show();
                break;

            //End of switch statement
        }
        //End of Onclick listner
    }


    //Creating Menu
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.activity_main_menu, menu);
        return true;
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.

        int id = item.getItemId();
        return super.onOptionsItemSelected(item);
    }




}
