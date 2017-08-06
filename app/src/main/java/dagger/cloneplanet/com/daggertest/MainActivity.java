package dagger.cloneplanet.com.daggertest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView txt_helllo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txt_helllo=(TextView)findViewById(R.id.txt_helllo);
        txt_helllo.setText("bhaisare");
        txt_helllo.setText("branch2");

    }
}
