package com.example.myontouch;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;

public class touchView extends View implements OnTouchListener{

	Paint paint;
	Canvas canvas;
	int x,y;
	
	
	public touchView(Context context) {
		super(context);
		
		setOnTouchListener(this);
		// TODO Auto-generated constructor stub
	}

	public boolean onTouch(View v,MotionEvent event)
	{
		
		x=(int)event.getX();
		y=(int)event.getY();
		/*
		paint = new Paint();
	canvas.drawCircle(x,y, 50, paint);
	invalidate();*/		
	
		return true;
		
	}
	
	protected void onDraw(Canvas canvas){
		////int = new Paint();
		//canvas.drawBitmap(getDrawingCache(), 0, 0, paint);;
	
		
		paint = new Paint();
		canvas.drawCircle(x,y, 50, paint);
		invalidate();
	}

}
