package marketplace.jpr.com.senddataintent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
    private TextView name,address;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        //name=findViewById(R.id.name_TV);
        //address=findViewById(R.id.address_TV);



        Intent intent = getIntent();
        String message = intent.getStringExtra("Extra_message");
        String msg=intent.getStringExtra("Extra_message1");
        TextView textView=findViewById(R.id.name_TV);
        TextView textView1=findViewById(R.id.address_TV);

        textView.setText(message);
        textView1.setText(msg);




    }
}
