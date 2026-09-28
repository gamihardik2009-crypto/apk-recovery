package B1;

/* loaded from: classes.dex */
public final class x extends C {

    /* renamed from: f, reason: collision with root package name */
    public final Throwable f314f;

    public x(Throwable th) {
        super(2);
        this.f314f = th;
    }

    @Override // B1.C
    public final String toString() {
        return "FAILURE (" + this.f314f.getMessage() + ")";
    }
}
