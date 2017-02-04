package misao.accessdevice;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button interNet,fb,bigb,cemra,phone;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        interNet = (Button)findViewById(R.id.interNet);
        fb = (Button)findViewById(R.id.fb);
        bigb = (Button)findViewById(R.id.bigb);
        cemra = (Button)findViewById(R.id.cemra);
        phone = (Button)findViewById(R.id.phone);

        interNet.setOnClickListener(this);
        fb.setOnClickListener(this);
        bigb.setOnClickListener(this);
        cemra.setOnClickListener(this);
        phone.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {

        Intent intent;
        switch (view.getId())
        {
            case R.id.interNet:
                intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.google.com"));
                startActivity(intent);
                break;

            case R.id.fb:
                intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.facebook.com"));
                startActivity(intent);
                break;

            case R.id.bigb:
                intent = new Intent(Intent.ACTION_VIEW, Uri.parse("tel:-0000000000"));
                startActivity(intent);
                break;

            case R.id.cemra:
                intent = new Intent("android.media.action.IMAGE_CAPTURE");
                startActivity(intent);
                break;

            case R.id.phone:
                intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:+910000000000"));
                startActivity(intent);
                break;
        }
    }
}
