package C0;

import m.AbstractC0837j;

/* loaded from: classes.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public final C0019b f533a;

    /* renamed from: b, reason: collision with root package name */
    public final int f534b;

    /* renamed from: c, reason: collision with root package name */
    public final int f535c;

    /* renamed from: d, reason: collision with root package name */
    public final int f536d;

    /* renamed from: e, reason: collision with root package name */
    public final int f537e;

    /* renamed from: f, reason: collision with root package name */
    public final float f538f;

    /* renamed from: g, reason: collision with root package name */
    public final float f539g;

    public q(C0019b c0019b, int i2, int i3, int i4, int i5, float f3, float f4) {
        this.f533a = c0019b;
        this.f534b = i2;
        this.f535c = i3;
        this.f536d = i4;
        this.f537e = i5;
        this.f538f = f3;
        this.f539g = f4;
    }

    public final long a(long j3, boolean z3) {
        if (z3) {
            int i2 = J.f472c;
            long j4 = J.f471b;
            if (J.a(j3, j4)) {
                return j4;
            }
        }
        int i3 = J.f472c;
        int i4 = (int) (j3 >> 32);
        int i5 = this.f534b;
        return B1.C.j(i4 + i5, ((int) (j3 & 4294967295L)) + i5);
    }

    public final int b(int i2) {
        int i3 = this.f535c;
        int i4 = this.f534b;
        return B1.C.C(i2, i4, i3) - i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return z2.h.a(this.f533a, qVar.f533a) && this.f534b == qVar.f534b && this.f535c == qVar.f535c && this.f536d == qVar.f536d && this.f537e == qVar.f537e && Float.compare(this.f538f, qVar.f538f) == 0 && Float.compare(this.f539g, qVar.f539g) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f539g) + B1.t.c(this.f538f, AbstractC0837j.b(this.f537e, AbstractC0837j.b(this.f536d, AbstractC0837j.b(this.f535c, AbstractC0837j.b(this.f534b, this.f533a.hashCode() * 31, 31), 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ParagraphInfo(paragraph=");
        sb.append(this.f533a);
        sb.append(", startIndex=");
        sb.append(this.f534b);
        sb.append(", endIndex=");
        sb.append(this.f535c);
        sb.append(", startLineIndex=");
        sb.append(this.f536d);
        sb.append(", endLineIndex=");
        sb.append(this.f537e);
        sb.append(", top=");
        sb.append(this.f538f);
        sb.append(", bottom=");
        return B1.t.i(sb, this.f539g, ')');
    }
}
