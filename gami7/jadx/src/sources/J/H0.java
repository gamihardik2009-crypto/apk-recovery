package J;

/* loaded from: classes.dex */
public final class H0 extends T.C {

    /* renamed from: c, reason: collision with root package name */
    public float f4037c;

    public H0(float f3) {
        this.f4037c = f3;
    }

    @Override // T.C
    public final void a(T.C c3) {
        z2.h.d(c3, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableFloatStateImpl.FloatStateStateRecord");
        this.f4037c = ((H0) c3).f4037c;
    }

    @Override // T.C
    public final T.C b() {
        return new H0(this.f4037c);
    }
}
