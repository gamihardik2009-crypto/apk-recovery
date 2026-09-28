package T;

/* loaded from: classes.dex */
public final class q extends C {

    /* renamed from: c, reason: collision with root package name */
    public N.c f5722c;

    /* renamed from: d, reason: collision with root package name */
    public int f5723d;

    /* renamed from: e, reason: collision with root package name */
    public int f5724e;

    public q(N.c cVar) {
        this.f5722c = cVar;
    }

    @Override // T.C
    public final void a(C c3) {
        synchronized (s.f5726a) {
            z2.h.d(c3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord.assign$lambda$0>");
            this.f5722c = ((q) c3).f5722c;
            this.f5723d = ((q) c3).f5723d;
            this.f5724e = ((q) c3).f5724e;
        }
    }

    @Override // T.C
    public final C b() {
        return new q(this.f5722c);
    }
}
