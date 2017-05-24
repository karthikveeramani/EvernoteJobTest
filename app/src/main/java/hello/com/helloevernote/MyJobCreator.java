package hello.com.helloevernote;

import com.evernote.android.job.Job;
import com.evernote.android.job.JobCreator;

public class MyJobCreator implements JobCreator {
    @Override
    public Job create(String tag) {
        switch (tag) {
            case MyJob.TAG:
                return new MyJob();
            default:
                return null;
        }
    }
}
