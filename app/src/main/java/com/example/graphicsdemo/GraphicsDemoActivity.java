package com.example.graphicsdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.Bundle;
import android.widget.ImageView;

public class GraphicsDemoActivity extends Activity {
ImageView ourView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        draw();
        setContentView(ourView);
    }

    private void draw() {
        Bitmap blankBitmap;
        blankBitmap = Bitmap.createBitmap(600,600,Bitmap.Config.ARGB_8888);

        Canvas canvas;
        canvas = new Canvas(blankBitmap);
        ourView = new ImageView(this);
        ourView.setImageBitmap(blankBitmap);

        Paint paint;
        paint = new Paint();
        canvas.drawColor(Color.argb(255,255,255,255));

        paint.setColor(Color.argb(255,26,128,222));
        Bitmap bitmapBob;
        bitmapBob = BitmapFactory.decodeResource(this.getResources(), R.drawable.bob);

        canvas.drawBitmap(bitmapBob, 500, 50, paint);
        canvas.drawLine(50,50,250,250,paint);
        canvas.drawText("Percobaan Game", 50, 50, paint);
        canvas.drawPoint(40,50,paint);
        canvas.drawCircle(350,250,100,paint);
        paint.setColor(Color.argb(255,  249, 129, 0));
        canvas.drawRect(50,450,500,550,paint);
       // canvas.drawRect(300,110,60,250,paint);
       // canvas.drawRect(650,250,770,550,paint);
        canvas.drawCircle(450,150,50,paint);
    }
}