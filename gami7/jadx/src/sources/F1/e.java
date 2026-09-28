package F1;

import android.app.job.JobParameters;
import androidx.work.impl.background.systemjob.SystemJobService;
import s.AbstractC1166e;

/* loaded from: classes.dex */
public abstract class e {
    public static int a(JobParameters jobParameters) {
        int stopReason = jobParameters.getStopReason();
        String str = SystemJobService.f6953l;
        switch (stopReason) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case AbstractC1166e.f10138f /* 5 */:
            case AbstractC1166e.f10136d /* 6 */:
            case 7:
            case 8:
            case AbstractC1166e.f10135c /* 9 */:
            case AbstractC1166e.f10137e /* 10 */:
            case 11:
            case 12:
            case 13:
            case 14:
            case AbstractC1166e.f10139g /* 15 */:
                return stopReason;
            default:
                return -512;
        }
    }
}
