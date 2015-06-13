package local.orenchi.appsdk_syllabus;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class CourseDetail extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_course_detail);
		
		// メニュー画面MainActivityからのデータ受け取り
		Intent intent = getIntent();
		String dateStr = intent.getStringExtra("date");
		String titleStr = intent.getStringExtra("title");
		String teacherStr = intent.getStringExtra("teacher");
		String detailStr = intent.getStringExtra("detail");
		
		// レイアウトへの表示
		TextView dateText = (TextView)findViewById(R.id.dateText);
		dateText.setText(dateStr);
		TextView titleText = (TextView)findViewById(R.id.titleText);
		titleText.setText(titleStr);
		TextView teacherText = (TextView)findViewById(R.id.teacherText);
		teacherText.setText(teacherStr);
		TextView detailText = (TextView)findViewById(R.id.detailText);
		detailText.setText(detailStr);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.course_detail, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
