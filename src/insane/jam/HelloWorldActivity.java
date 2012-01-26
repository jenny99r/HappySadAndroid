package insane.jam;

import android.app.Activity;
import android.view.*;
import android.widget.ImageView;
import android.widget.TextView;
import android.os.Bundle;

public class HelloWorldActivity extends Activity implements View.OnClickListener {
	ImageView happySad;
	boolean happy = true;
			
			
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //TextView tv = new TextView(this);
        //tv.setText("Hello World");
        setContentView(R.layout.main);
        
        
        happySad = (ImageView) findViewById(R.id.happy_image);
        
        happySad.setOnClickListener(this);
        
    }


	@Override
	public void onClick(View view) {
		
		if (happy) {
		happySad.setImageResource(R.drawable.sad);
		happy = false;
		}
		else {
			happySad.setImageResource(R.drawable.happy);
			happy = true;
		}
		
	}
}