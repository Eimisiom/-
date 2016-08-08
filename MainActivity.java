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
		Log.d("TIME", "��ǰʱ��:" + System.currentTimeMillis());
	}

	/**
	 * ���������Ƴ����˳�����
	 */
	private long atTime = 0;

	@Override
	public boolean onKeyDown(int keyCode, KeyEvent event) {

		if (keyCode == KeyEvent.KEYCODE_BACK && event.getAction() == KeyEvent.ACTION_DOWN) {
			Log.d("TIME", "��ǰʱ��:" + System.currentTimeMillis());

			if (System.currentTimeMillis() - atTime > 2000) {
				Toast.makeText(this, "�ٰ�һ���˳�Ӧ�ó���", Toast.LENGTH_SHORT).show();
				atTime = System.currentTimeMillis();
			} else {
				finish();
			}
			return true;
		}
		return super.onKeyDown(keyCode, event);
	}
}
