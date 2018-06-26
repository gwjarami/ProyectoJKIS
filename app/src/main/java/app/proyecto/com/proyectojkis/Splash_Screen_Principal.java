package app.proyecto.com.proyectojkis;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.target.GlideDrawableImageViewTarget;

public class Splash_Screen_Principal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash__screen__principal);

        Glide.with(this).load(R.drawable.loading7).into(
                new GlideDrawableImageViewTarget((ImageView)findViewById(R.id.imageView)));

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                Intent intent = new Intent(Splash_Screen_Principal.this, MainActivity.class);
                startActivity(intent);
            }
        },5000);

    }
}
