package com.example.testlayout;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;
import android.widget.Toast;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.test_textview);
		Log.d("TIME", "当前时间:" + System.currentTimeMillis());
	}

	/**
	 * 连续两次推出键退出程序
	 */
	private long atTime = 0;

	@Override
	public boolean onKeyDown(int keyCode, KeyEvent event) {

		if (keyCode == KeyEvent.KEYCODE_BACK && event.getAction() == KeyEvent.ACTION_DOWN) {
			Log.d("TIME", "当前时间:" + System.currentTimeMillis());

			if (System.currentTimeMillis() - atTime > 2000) {
				Toast.makeText(this, "再按一次退出应用程序", Toast.LENGTH_SHORT).show();
				atTime = System.currentTimeMillis();
			} else {
				finish();
			}
			return true;
		}
		return super.onKeyDown(keyCode, event);
	}
}
