package T;

/* loaded from: classes.dex */
public final class t extends C {

    /* renamed from: c, reason: collision with root package name */
    public M.e f5728c;

    /* renamed from: d, reason: collision with root package name */
    public int f5729d;

    public t(M.e eVar) {
        this.f5728c = eVar;
    }

    @Override // T.C
    public final void a(C c3) {
        z2.h.d(c3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord, V of androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord>");
        t tVar = (t) c3;
        synchronized (s.f5727b) {
            this.f5728c = tVar.f5728c;
            this.f5729d = tVar.f5729d;
        }
    }

    @Override // T.C
    public final C b() {
        return new t(this.f5728c);
    }
}
