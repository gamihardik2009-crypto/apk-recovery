package C0;

import m.AbstractC0837j;

/* loaded from: classes.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public final s f540a;

    /* renamed from: b, reason: collision with root package name */
    public final int f541b;

    /* renamed from: c, reason: collision with root package name */
    public final int f542c;

    public r(K0.d dVar, int i2, int i3) {
        this.f540a = dVar;
        this.f541b = i2;
        this.f542c = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return z2.h.a(this.f540a, rVar.f540a) && this.f541b == rVar.f541b && this.f542c == rVar.f542c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f542c) + AbstractC0837j.b(this.f541b, this.f540a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ParagraphIntrinsicInfo(intrinsics=");
        sb.append(this.f540a);
        sb.append(", startIndex=");
        sb.append(this.f541b);
        sb.append(", endIndex=");
        return B1.t.j(sb, this.f542c, ')');
    }
}
