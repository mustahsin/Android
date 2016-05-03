package siam.myapplication;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private CheckBox dog,cat,cow;
    private Button check,clear;
    ImageView image1,image2,image3;

    public void onClearButtonClick()
    {
        dog = (CheckBox)findViewById(R.id.checkDog);
        cat = (CheckBox)findViewById(R.id.checkCat);
        cow = (CheckBox)findViewById(R.id.checkCow);

        image1 = (ImageView) findViewById(R.id.imageView1);
        image2 = (ImageView) findViewById(R.id.imageView2);
        image3 = (ImageView) findViewById(R.id.imageView3);

        clear = (Button)findViewById(R.id.clearButton);

        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dog.setChecked(false);
                cat.setChecked(false);
                cow.setChecked(false);

                image1.setImageResource(android.R.color.transparent);
                image2.setImageResource(android.R.color.transparent);
                image3.setImageResource(android.R.color.transparent);
            }
        });




    }

    public void onCheckButtonClick()
    {
        dog = (CheckBox)findViewById(R.id.checkDog);
        cat = (CheckBox)findViewById(R.id.checkCat);
        cow = (CheckBox)findViewById(R.id.checkCow);

        check = (Button)findViewById(R.id.checkbutton);

        check.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                StringBuffer msg = new StringBuffer();
//
//                msg.append("Dog : ").append(dog.isChecked());
//                msg.append("\nCat : ").append(cat.isChecked());
//                msg.append("\nCow : ").append(cow.isChecked());

                //Toast.makeText(MainActivity.this,msg.toString(),Toast.LENGTH_LONG).show();

                image1 = (ImageView) findViewById(R.id.imageView1);
                image2 = (ImageView) findViewById(R.id.imageView2);
                image3 = (ImageView) findViewById(R.id.imageView3);

                if(cat.isChecked() && !dog.isChecked() && !cow.isChecked())
                {
                    image2.setImageResource(R.drawable.cat);
                    image1.setImageResource(android.R.color.transparent);
                    image3.setImageResource(android.R.color.transparent);

                }
                else if(dog.isChecked() && !cat.isChecked() && !cow.isChecked())
                {
                    image2.setImageResource(R.drawable.dog);
                    image1.setImageResource(android.R.color.transparent);
                    image3.setImageResource(android.R.color.transparent);

                }

                else if(cow.isChecked() && !dog.isChecked() && !cat.isChecked())
                {
                    image2.setImageResource(R.drawable.cow);
                    image1.setImageResource(android.R.color.transparent);
                    image3.setImageResource(android.R.color.transparent);

                }

                else if(!dog.isChecked() && !cat.isChecked() && !cow.isChecked())
                {
                    image1.setImageResource(android.R.color.transparent);
                    image2.setImageResource(android.R.color.transparent);
                    image3.setImageResource(android.R.color.transparent);
                }

                else if(dog.isChecked() && cat.isChecked() && !cow.isChecked())
                {
                    image1.setImageResource(R.drawable.dog);
                    image2.setImageResource(R.drawable.cat);
                    image3.setImageResource(android.R.color.transparent);
                }
                else if(dog.isChecked() && !cat.isChecked() && cow.isChecked())
                {
                    image1.setImageResource(R.drawable.dog);
                    image2.setImageResource(R.drawable.cow);
                    image3.setImageResource(android.R.color.transparent);
                }

                else if(!dog.isChecked() && cat.isChecked() && cow.isChecked())
                {
                    image1.setImageResource(R.drawable.cat);
                    image2.setImageResource(R.drawable.cow);
                    image3.setImageResource(android.R.color.transparent);
                }

                else
                {
                    image1.setImageResource(R.drawable.dog);
                    image2.setImageResource(R.drawable.cat);
                    image3.setImageResource(R.drawable.cow);
                }
            }
        });



    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        onCheckButtonClick();
        onClearButtonClick();
    }

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
