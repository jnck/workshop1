package tkj11.workshop_32_33;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    ImageView imageView1,imageView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        klikGambar();
    }

    public void klikGambar(){
        imageView1=(ImageView) findViewById(R.id.gambar1);
        imageView2=(ImageView) findViewById(R.id.gambar2);
        imageView1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent=new Intent(MainActivity.this,gambar1.class);
                startActivity(intent);
            }
        });
        imageView2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent=new Intent(MainActivity.this,gambar2.class);
                startActivity(intent);
            }
        });


    }
}
