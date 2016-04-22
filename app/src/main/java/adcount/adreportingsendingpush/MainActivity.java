package adcount.adreportingsendingpush;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;

import com.parse.ParseObject;

public class MainActivity extends AppCompatActivity {

    EditText pushData;
    Button sendPush;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pushlayout);

        pushData=(EditText)findViewById(R.id.pushdata);
        sendPush=(Button)findViewById(R.id.sendPush);

        sendPush.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ParseObject testObject = new ParseObject("PushData");
                testObject.put("Data", pushData.getText().toString());
                testObject.put("utype","Buyer");
                testObject.saveInBackground();
            }
        });
    }
}
