package app.example.resume_848;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Edit_pang extends Activity implements OnClickListener {
	private Button btnsubmit;
	private EditText edt1, edt2, edt3, edt4, edt5;
	private String txt1, txt2, txt3, txt4, txt5;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		setContentView(R.layout.edit_848);
		super.onCreate(savedInstanceState);
		ViewMatching();
	}

	private void ViewMatching() {
		btnsubmit = (Button) findViewById(R.id.button1);
		btnsubmit.setOnClickListener(this);
		edt1 = (EditText) findViewById(R.id.edt1);
		edt2 = (EditText) findViewById(R.id.edt2);
		edt3 = (EditText) findViewById(R.id.edt3);
		edt4 = (EditText) findViewById(R.id.edt4);
		edt5 = (EditText) findViewById(R.id.edt5);
	}

	@Override
	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.button1:
			txt1 = (edt1.getText().toString());
			txt2 = (edt2.getText().toString());
			txt3 = (edt3.getText().toString());
			txt4 = (edt4.getText().toString());
			txt5 = (edt5.getText().toString());
			Intent R = new Intent(getApplicationContext(), MainActivity.class);
			R.putExtra("txt1", txt1);
			R.putExtra("txt2", txt2);
			R.putExtra("txt3", txt3);
			R.putExtra("txt4", txt4);
			R.putExtra("txt5", txt5);
			startActivity(R);
			break;
		default:
			break;
		}
	}
}