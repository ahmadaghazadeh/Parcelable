package aghazadeh.ahmad.parcelable;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

 public class MainActivity extends AppCompatActivity {

    EditText mName;
    EditText mSurname;
    EditText mAge;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mName= (EditText) findViewById(R.id.mName);
        mSurname= (EditText) findViewById(R.id.mSurname);
        mAge= (EditText) findViewById(R.id.mAge);
        Button btn= (Button) findViewById(R.id.Login);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Person person = new Person(
                        mName.getText().toString(),
                        mSurname.getText().toString(),
                        Integer.valueOf(mAge.getText().toString())
                );
                Intent openDetailIntent = new Intent(MainActivity.this, TwoActivity.class);
                openDetailIntent.putExtra("PERSON", person);
                startActivity(openDetailIntent);
            }
        });
    }
}
