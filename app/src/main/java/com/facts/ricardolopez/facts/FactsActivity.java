package com.facts.ricardolopez.facts;

import android.graphics.Color;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;

import org.w3c.dom.Text;


import java.util.Random;


public class FactsActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_facts);
    }

    public void showFact(View view) {

        //gets the factView
        final TextView factView = (TextView)findViewById(R.id.factView);

        //gets the layout
        final RelativeLayout background = (RelativeLayout)findViewById(R.id.Layout);


        //Creates a fact variable
        String fact = "";

        //Creates an array of facts
        String[] facts = {
              "A Jonah Hill solo le pagaron 60 mil dólares" +
              " por El Lobo de Wall Street por 'querer mucho ese papel'",
              "Ants stretch when they wake up",
              "Ostriches can run faster than horses",
              "H.G Wells last words were 'Go away, I'm alright'",
              "Golpear tu cabeza contra la pared quema 150 calorías cada hora",
              "Las estrellas de mar no tienen cerebro",
              "El ojo de una avestruz es más grande que su cerebro",
              "Los puercoespines flotan en el agua",
              "Muchos hamsters parpadean un solo ojo a la vez",
              "Las jirafas limpian sus oídos con su lengua de 21 pulgadas"
        };

        //Calculates the size of the array
        int length = facts.length;

        //Gets a Random Number
        Random r = new Random();
        int randomNumber = r.nextInt(length);

        //Turns the randomNumber variable into a string
        fact = facts[randomNumber];


        //BACKGROUND COLOR CODE

        //Defines an string variable for the color
        String color = "";

        //Creates an array with the different colors
        String[] colors = {
                //Android Green
                "#ff51b46d",
                //IOS Blue
                "#53bbb4",
                //PHP Purple
                "#7d669e",
                //Ruby Red
                "#e15258",
                //Wordpress purple
                "#838cc7",
                //HTML Blue
                "#39add1",
                //CSS Blue
                "#3079ab",
                //Javascript Red Wine
                "#c25975",
                //Business Orange
                "#f9845b",
                //Design Yellow
                "#e0ab18",
                //Dev Tools Grey
                "#637a91",
                //Python Pink
                "#f092b0",
                //Undefined Grey
                "#b7c0c7"
        };

        //Gets the size of the array
        int colorsLength = colors.length;

        //Gets another random number
        Random randomColorNumber = new Random();
        int randomColor = randomColorNumber.nextInt(colorsLength);

        //Gets the color code from the array
        color = colors[randomColor];

        //Changes the color of the background
        background.setBackgroundColor(Color.parseColor(color));

        //Shows the fact in the textView
        factView.setText(fact);
    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_facts, menu);
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
