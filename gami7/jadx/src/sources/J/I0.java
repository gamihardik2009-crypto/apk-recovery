package J;

/* loaded from: classes.dex */
public final class I0 extends T.C {

    /* renamed from: c, reason: collision with root package name */
    public int f4038c;

    public I0(int i2) {
        this.f4038c = i2;
    }

    @Override // T.C
    public final void a(T.C c3) {
        z2.h.d(c3, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableIntStateImpl.IntStateStateRecord");
        this.f4038c = ((I0) c3).f4038c;
    }

    @Override // T.C
    public final T.C b() {
        return new I0(this.f4038c);
    }
}
