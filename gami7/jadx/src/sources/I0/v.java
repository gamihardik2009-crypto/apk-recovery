package I0;

/* loaded from: classes.dex */
public final class v implements InterfaceC0252i {

    /* renamed from: a, reason: collision with root package name */
    public final int f3924a;

    /* renamed from: b, reason: collision with root package name */
    public final int f3925b;

    public v(int i2, int i3) {
        this.f3924a = i2;
        this.f3925b = i3;
    }

    @Override // I0.InterfaceC0252i
    public final void a(j jVar) {
        if (jVar.f3901d != -1) {
            jVar.f3901d = -1;
            jVar.f3902e = -1;
        }
        E0.f fVar = jVar.f3898a;
        int C3 = B1.C.C(this.f3924a, 0, fVar.b());
        int C4 = B1.C.C(this.f3925b, 0, fVar.b());
        if (C3 != C4) {
            if (C3 < C4) {
                jVar.e(C3, C4);
            } else {
                jVar.e(C4, C3);
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        return this.f3924a == vVar.f3924a && this.f3925b == vVar.f3925b;
    }

    public final int hashCode() {
        return (this.f3924a * 31) + this.f3925b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SetComposingRegionCommand(start=");
        sb.append(this.f3924a);
        sb.append(", end=");
        return B1.t.j(sb, this.f3925b, ')');
    }
}
