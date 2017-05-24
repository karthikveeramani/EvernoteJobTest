package hello.com.helloevernote;

import android.support.annotation.NonNull;
import android.util.Log;

import com.evernote.android.job.Job;
import com.evernote.android.job.JobRequest;

import java.util.concurrent.TimeUnit;

public class MyJob extends Job {
    public static final String TAG = "IndexingJob";

    @Override
    @NonNull
    protected Job.Result onRunJob(Params params) {
        // run your job here
        Log.i(TAG, "onRunJob called");
        return Job.Result.SUCCESS;
    }

    public static void schedule(int intervalInMins) {
        new JobRequest.Builder(MyJob.TAG)
                .setPeriodic(TimeUnit.MINUTES.toMillis(intervalInMins), TimeUnit.MINUTES.toMillis(5))
                .setPersisted(true)
                .build()
                .schedule();
    }
}
