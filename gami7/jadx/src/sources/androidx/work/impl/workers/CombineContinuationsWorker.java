package androidx.work.impl.workers;

import B1.p;
import android.content.Context;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import z2.h;

/* loaded from: classes.dex */
public final class CombineContinuationsWorker extends Worker {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CombineContinuationsWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        h.f(context, "context");
        h.f(workerParameters, "workerParams");
    }

    @Override // androidx.work.Worker
    public final p f() {
        return new p(this.f302i.f6938b);
    }
}
