package com.example.linseb325.bloomfilter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        HashConverter hc = new HashConverter();

        boolean[] test1 = hc.convertTo18BitArray("elephant");
        boolean[] test2 = hc.convertTo18BitArray("rhinoceros");
        boolean[] test3 = hc.convertTo18BitArray("flamingo");
        boolean[] test4 = hc.convertTo18BitArray("ostrich");

        this.displayBooleanArray(test1);
        this.displayBooleanArray(test2);
        this.displayBooleanArray(test3);
        this.displayBooleanArray(test4);

    }

    public void displayBooleanArray(boolean[] arrayToDisplay)
    {
        String toDisplay = "";
        for (boolean boolVal : arrayToDisplay)
        {
            if(boolVal)
            {
                toDisplay += "1";
            }
            else toDisplay += "0";
        }
        System.out.println(toDisplay);
    }

}
