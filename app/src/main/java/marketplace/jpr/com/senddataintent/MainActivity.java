package marketplace.jpr.com.senddataintent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private EditText name,address;
    private Button submit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

            public void sendMessage(View view)
            {
                name=findViewById(R.id.name_ET);
                address=findViewById(R.id.address_ET);


                    ////
                String message=name.getText().toString();
                String message1=address.getText().toString();

                       Intent intent=new Intent(MainActivity.this,Main2Activity.class);

                       ////
              intent.putExtra("Extra_message",message);
              intent.putExtra("Extra_message1",message1);

                startActivity(intent);




            }




}
