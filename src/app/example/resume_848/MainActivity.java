package app.example.resume_848;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
import android.widget.ImageView;
import android.widget.EditText;

public class MainActivity extends Activity implements OnClickListener {
	private Button btn1, btn2;
	private TextView txt1, txt2, txt3, txt4, txt5;
	private String show1, show2, show3, show4, show5, show6, show7, show8;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		ViewMatching();
	}

	private void ViewMatching() {
		btn1 = (Button) findViewById(R.id.btnedit);
		btn2 = (Button) findViewById(R.id.btnimg);
		btn1.setOnClickListener(this);
		btn2.setOnClickListener(this);
		txt1 = (TextView) findViewById(R.id.txt4);
		txt2 = (TextView) findViewById(R.id.textView6);
		txt3 = (TextView) findViewById(R.id.textView8);
		txt4 = (TextView) findViewById(R.id.textView10);
		txt5 = (TextView) findViewById(R.id.textView12);
		txt1.setText("Pimchanok");
		txt2.setText("Hongboonmee");
		txt3.setText("PANG");
		txt4.setText("03/10/1991");
		txt5.setText("pang_pang_7421@hotmail.com");
		;
		show1 = getIntent().getStringExtra("txt1");
		show2 = getIntent().getStringExtra("txt2");
		show3 = getIntent().getStringExtra("txt3");
		show4 = getIntent().getStringExtra("txt4");
		show5 = getIntent().getStringExtra("txt5");
		txt1.setText(show1);
		txt2.setText(show2);
		txt3.setText(show3);
		txt4.setText(show4);
		txt5.setText(show5);
	}

	@Override
	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.btnedit:
			Intent i = new Intent(getApplicationContext(), Edit_pang.class);
			startActivity(i);
			break;
		case R.id.btnimg:
			Intent j = new Intent(getApplicationContext(), ImageActivity.class);
			startActivity(j);
			break;
		default:
			break;
		}
	}
}