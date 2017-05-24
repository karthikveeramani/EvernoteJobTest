package hello.com.helloevernote;

import android.app.Activity;
import android.os.Bundle;

import com.evernote.android.job.JobManager;

public class MainActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        JobManager.create(this);
    }

    @Override
    protected void onResume() {
        super.onResume();
        MyJob.schedule(15);
    }
}
