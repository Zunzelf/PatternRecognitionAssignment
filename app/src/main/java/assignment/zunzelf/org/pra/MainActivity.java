package assignment.zunzelf.org.pra;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import assignment.zunzelf.org.pra.view.ArialDigit;
import assignment.zunzelf.org.pra.view.DataSetManagement;
import assignment.zunzelf.org.pra.view.EnT1;
import assignment.zunzelf.org.pra.view.EnT2;
import assignment.zunzelf.org.pra.view.Fourier;
import assignment.zunzelf.org.pra.view.FaceRegion;
import assignment.zunzelf.org.pra.view.Histogram;
import assignment.zunzelf.org.pra.view.OCR;
import assignment.zunzelf.org.pra.view.SevenSegment;
import assignment.zunzelf.org.pra.view.SkeletonRecognition;
import assignment.zunzelf.org.pra.view.Thinning;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        assignmentButton();
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater findMenuItems = getMenuInflater();
        findMenuItems.inflate(R.menu.main_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    private void assignmentButton(){
        Button ass1Btn = (Button) findViewById(R.id.button);
        ass1Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, SkeletonRecognition.class));
            }
        });
        Button ass2Btn = (Button) findViewById(R.id.button2);
        ass2Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, Histogram.class));
            }
        });
        Button ass3Btn = (Button) findViewById(R.id.button4);
        ass3Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, EnT1.class));
            }
        });
        Button ass4Btn = (Button) findViewById(R.id.button3);
        ass4Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, EnT2.class));
            }
        });
        Button ass5Btn = (Button) findViewById(R.id.button6);
        ass5Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, ArialDigit.class));
            }
        });
        Button ass6Btn = (Button) findViewById(R.id.button5);
        ass6Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, SevenSegment.class));
            }
        });
        Button ass7Btn = (Button) findViewById(R.id.button7);
        ass7Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, Thinning.class));
            }
        });
        Button ass8Btn = (Button) findViewById(R.id.button8);
        ass8Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, OCR.class));
            }
        });
        Button ass9Btn = (Button) findViewById(R.id.button9);
        ass9Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, FaceRegion.class));
            }
        });
        Button ass10Btn = (Button) findViewById(R.id.button10);
        ass10Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, Fourier.class));
            }
        });
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.dt_manage:
                startActivity(new Intent(MainActivity.this, DataSetManagement.class));
                return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
