package J;

/* loaded from: classes.dex */
public final class J0 extends T.C {

    /* renamed from: c, reason: collision with root package name */
    public long f4040c;

    public J0(long j3) {
        this.f4040c = j3;
    }

    @Override // T.C
    public final void a(T.C c3) {
        z2.h.d(c3, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableLongStateImpl.LongStateStateRecord");
        this.f4040c = ((J0) c3).f4040c;
    }

    @Override // T.C
    public final T.C b() {
        return new J0(this.f4040c);
    }
}
