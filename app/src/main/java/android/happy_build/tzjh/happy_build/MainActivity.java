package android.happy_build.tzjh.happy_build;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import org.litepal.tablemanager.Connector;

import java.sql.Connection;

public class MainActivity extends AppCompatActivity {

    private Button cdb;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        cdb=(Button)findViewById(R.id.cdb);

        cdb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Connector.getDatabase();
            }
        });


    }


    public void delete(String id){}



}
