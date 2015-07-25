package com.sunilgavali.mytestapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView mTV;

    StringBuffer recDataString;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mTV = (TextView) findViewById(R.id.textView1);
        mTV.append("ok Now" + '\n');

        recDataString = new StringBuffer(20);

        String readMessage = "#12";
        recDataString.append(readMessage);
        mTV.append(recDataString.toString() + '\n');
        int endOfLineIndex = recDataString.indexOf("*");
        if(endOfLineIndex < 0 ) {
            mTV.append("= -1 " + '\n');
        }else{
            mTV.append(Integer.toString(endOfLineIndex) + '\n');
        }

        readMessage = "345";
        recDataString.append(readMessage);
        mTV.append(recDataString.toString() + '\n');
        endOfLineIndex = recDataString.indexOf("*");
        if(endOfLineIndex < 0 ) {
            mTV.append("= -1 " + '\n');
        }else{
            mTV.append(Integer.toString(endOfLineIndex) + '\n');
        }


        readMessage = "678";
        recDataString.append(readMessage);
        mTV.append(recDataString.toString() + '\n');
        endOfLineIndex = recDataString.indexOf("*");
        if(endOfLineIndex < 0 ) {
            mTV.append("= -1 " + '\n');
        }else{
            mTV.append(Integer.toString(endOfLineIndex) + '\n');
        }

        readMessage = "9*ABCDF";
        recDataString.append(readMessage);
        mTV.append(recDataString.toString() + '\n');
        endOfLineIndex = recDataString.indexOf("*");
        if(endOfLineIndex < 0 ) {
            mTV.append("= -1 " + '\n');
        }else{
            mTV.append(Integer.toString(endOfLineIndex) + '\n');
            mTV.append(recDataString.substring(0, endOfLineIndex) + '\n');
            recDataString.delete(0, recDataString.length());
            mTV.append(recDataString.toString() + '\n');
        }


    }

    /*
    I am adding these changes to undersatnd how it reflects on VCS i.e. git hub
    Second Commit : Tag V001 added.
    Third Commit : Tag V0.0.2 added.

     */
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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
