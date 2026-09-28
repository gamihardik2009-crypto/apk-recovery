package s;

/* renamed from: s.H, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1155H implements Y {

    /* renamed from: a, reason: collision with root package name */
    public final Y f10056a;

    /* renamed from: b, reason: collision with root package name */
    public final int f10057b;

    public C1155H(C1164c c1164c, int i2) {
        this.f10056a = c1164c;
        this.f10057b = i2;
    }

    @Override // s.Y
    public final int a(O0.b bVar, O0.k kVar) {
        if (((kVar == O0.k.f5148h ? 8 : 2) & this.f10057b) != 0) {
            return this.f10056a.a(bVar, kVar);
        }
        return 0;
    }

    @Override // s.Y
    public final int b(O0.b bVar) {
        if ((this.f10057b & 16) != 0) {
            return this.f10056a.b(bVar);
        }
        return 0;
    }

    @Override // s.Y
    public final int c(O0.b bVar, O0.k kVar) {
        if (((kVar == O0.k.f5148h ? 4 : 1) & this.f10057b) != 0) {
            return this.f10056a.c(bVar, kVar);
        }
        return 0;
    }

    @Override // s.Y
    public final int d(O0.b bVar) {
        if ((this.f10057b & 32) != 0) {
            return this.f10056a.d(bVar);
        }
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1155H)) {
            return false;
        }
        C1155H c1155h = (C1155H) obj;
        if (z2.h.a(this.f10056a, c1155h.f10056a)) {
            if (this.f10057b == c1155h.f10057b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f10057b) + (this.f10056a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("(");
        sb.append(this.f10056a);
        sb.append(" only ");
        StringBuilder sb2 = new StringBuilder("WindowInsetsSides(");
        StringBuilder sb3 = new StringBuilder();
        int i2 = this.f10057b;
        int i3 = AbstractC1166e.f10135c;
        if ((i2 & i3) == i3) {
            AbstractC1166e.f(sb3, "Start");
        }
        int i4 = AbstractC1166e.f10137e;
        if ((i2 & i4) == i4) {
            AbstractC1166e.f(sb3, "Left");
        }
        if ((i2 & 16) == 16) {
            AbstractC1166e.f(sb3, "Top");
        }
        int i5 = AbstractC1166e.f10136d;
        if ((i2 & i5) == i5) {
            AbstractC1166e.f(sb3, "End");
        }
        int i6 = AbstractC1166e.f10138f;
        if ((i2 & i6) == i6) {
            AbstractC1166e.f(sb3, "Right");
        }
        if ((i2 & 32) == 32) {
            AbstractC1166e.f(sb3, "Bottom");
        }
        String sb4 = sb3.toString();
        z2.h.e(sb4, "StringBuilder().apply(builderAction).toString()");
        sb2.append(sb4);
        sb2.append(')');
        sb.append((Object) sb2.toString());
        sb.append(')');
        return sb.toString();
    }
}
