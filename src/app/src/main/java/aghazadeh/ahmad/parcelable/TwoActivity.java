package aghazadeh.ahmad.parcelable;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;


public class TwoActivity extends AppCompatActivity {

    TextView mName;
    TextView mSurname;
    TextView mAge;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        mName= (TextView) findViewById(R.id.mName);
        mSurname= (TextView) findViewById(R.id.mSurname);
        mAge= (TextView) findViewById(R.id.mAge);
        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        loadDataFromIntent();

    }
    private void loadDataFromIntent() {
        if (getIntent().getExtras() != null) {
            Person person =  getIntent().getParcelableExtra("PERSON");
            if (person != null) {
                mName.setText(person.getName());
                mSurname.setText(person.getSurname());
                mAge.setText(String.valueOf(person.getAge()).toString());
            }
        }
    }
}
