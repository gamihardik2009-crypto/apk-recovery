package J2;

/* loaded from: classes.dex */
public final class K implements V {

    /* renamed from: h, reason: collision with root package name */
    public final boolean f4359h;

    public K(boolean z3) {
        this.f4359h = z3;
    }

    @Override // J2.V
    public final boolean b() {
        return this.f4359h;
    }

    @Override // J2.V
    public final k0 f() {
        return null;
    }

    public final String toString() {
        return B1.t.k(new StringBuilder("Empty{"), this.f4359h ? "Active" : "New", '}');
    }
}
