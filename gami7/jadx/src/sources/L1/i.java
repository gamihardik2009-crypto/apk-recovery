package L1;

import androidx.work.impl.WorkDatabase;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final WorkDatabase f4652a;

    public i(WorkDatabase workDatabase, int i2) {
        switch (i2) {
            case 1:
                this.f4652a = workDatabase;
                break;
            default:
                z2.h.f(workDatabase, "workDatabase");
                this.f4652a = workDatabase;
                break;
        }
    }
}
