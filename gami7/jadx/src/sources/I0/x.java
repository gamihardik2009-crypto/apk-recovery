package I0;

/* loaded from: classes.dex */
public final class x implements InterfaceC0252i {

    /* renamed from: a, reason: collision with root package name */
    public final int f3928a;

    /* renamed from: b, reason: collision with root package name */
    public final int f3929b;

    public x(int i2, int i3) {
        this.f3928a = i2;
        this.f3929b = i3;
    }

    @Override // I0.InterfaceC0252i
    public final void a(j jVar) {
        int C3 = B1.C.C(this.f3928a, 0, jVar.f3898a.b());
        int C4 = B1.C.C(this.f3929b, 0, jVar.f3898a.b());
        if (C3 < C4) {
            jVar.f(C3, C4);
        } else {
            jVar.f(C4, C3);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        return this.f3928a == xVar.f3928a && this.f3929b == xVar.f3929b;
    }

    public final int hashCode() {
        return (this.f3928a * 31) + this.f3929b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SetSelectionCommand(start=");
        sb.append(this.f3928a);
        sb.append(", end=");
        return B1.t.j(sb, this.f3929b, ')');
    }
}
