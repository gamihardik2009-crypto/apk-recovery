package J;

/* loaded from: classes.dex */
public final class K0 extends T.C {

    /* renamed from: c, reason: collision with root package name */
    public Object f4044c;

    public K0(Object obj) {
        this.f4044c = obj;
    }

    @Override // T.C
    public final void a(T.C c3) {
        z2.h.d(c3, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableStateImpl.StateStateRecord<T of androidx.compose.runtime.SnapshotMutableStateImpl.StateStateRecord>");
        this.f4044c = ((K0) c3).f4044c;
    }

    @Override // T.C
    public final T.C b() {
        return new K0(this.f4044c);
    }
}
