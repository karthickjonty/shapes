package com.example.shapes;
  
 +
 +
  import android.app.Activity;
  import android.content.Context;
 +import android.content.Intent;
  import android.graphics.Canvas;
  import android.graphics.Color;
  import android.graphics.Paint;
 @@ -11,6 +14,7 @@
  import android.view.View;
  import android.widget.Button;
  import android.widget.EditText;
 +import android.widget.Toast;
  
  
  public class MainActivity extends Activity {
 @@ -21,6 +25,32 @@
      protected void onCreate(Bundle savedInstanceState) {
          super.onCreate(savedInstanceState);
          setContentView(R.layout.activity_main);
 +        
 +        b1=(Button)findViewById(R.id.button1);
 +        b2=(Button)findViewById(R.id.button2);
 +        b3=(Button)findViewById(R.id.button3);
 +        e1=(EditText)findViewById(R.id.editText1);
 +        e2=(EditText)findViewById(R.id.editText2);
 +        e3=(EditText)findViewById(R.id.editText3);
 +        e4=(EditText)findViewById(R.id.editText4);
 +        
 +        b1.setOnClickListener(new View.OnClickListener() {
 +    		
 +			@Override
 +			public void onClick(View arg0) {
 +				// TODO Auto-generated method stub
 +				
 +				//String data=textInput.getText().toString();
 +				
 +				Toast msg=Toast.makeText(getApplicationContext(),"Please wait...", Toast.LENGTH_LONG);
 +				msg.show();
 +				
 +				Intent i=new Intent(MainActivity.this,SecondActivity.class);
 +				//i.putExtra("Username", data);
 +				startActivity(i); 
 +			}
 +			
 +		});
      }