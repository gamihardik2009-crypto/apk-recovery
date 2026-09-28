package z;

import m.AbstractC0837j;

/* loaded from: classes.dex */
public final class Q {

    /* renamed from: g, reason: collision with root package name */
    public static final Q f11536g = new Q(0, null, 0, 0, null, 127);

    /* renamed from: a, reason: collision with root package name */
    public final int f11537a;

    /* renamed from: b, reason: collision with root package name */
    public final Boolean f11538b;

    /* renamed from: c, reason: collision with root package name */
    public final int f11539c;

    /* renamed from: d, reason: collision with root package name */
    public final int f11540d;

    /* renamed from: e, reason: collision with root package name */
    public final Boolean f11541e;

    /* renamed from: f, reason: collision with root package name */
    public final J0.b f11542f;

    public Q(int i2, Boolean bool, int i3, int i4, Boolean bool2, int i5) {
        i2 = (i5 & 1) != 0 ? -1 : i2;
        bool = (i5 & 2) != 0 ? null : bool;
        i3 = (i5 & 4) != 0 ? 0 : i3;
        i4 = (i5 & 8) != 0 ? -1 : i4;
        bool2 = (i5 & 32) != 0 ? null : bool2;
        this.f11537a = i2;
        this.f11538b = bool;
        this.f11539c = i3;
        this.f11540d = i4;
        this.f11541e = bool2;
        this.f11542f = null;
    }

    public final I0.m a(boolean z3) {
        int i2 = this.f11537a;
        I0.n nVar = new I0.n(i2);
        if (I0.n.a(i2, -1)) {
            nVar = null;
        }
        int i3 = nVar != null ? nVar.f3911a : 0;
        Boolean bool = this.f11538b;
        boolean booleanValue = bool != null ? bool.booleanValue() : true;
        int i4 = this.f11539c;
        I0.o oVar = new I0.o(i4);
        if (I0.o.a(i4, 0)) {
            oVar = null;
        }
        int i5 = oVar != null ? oVar.f3912a : 1;
        int i6 = this.f11540d;
        I0.l lVar = I0.l.a(i6, -1) ? null : new I0.l(i6);
        int i7 = lVar != null ? lVar.f3903a : 1;
        J0.b bVar = this.f11542f;
        if (bVar == null) {
            bVar = J0.b.f4322j;
        }
        return new I0.m(z3, i3, booleanValue, i5, i7, bVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Q)) {
            return false;
        }
        Q q = (Q) obj;
        if (!I0.n.a(this.f11537a, q.f11537a) || !z2.h.a(this.f11538b, q.f11538b) || !I0.o.a(this.f11539c, q.f11539c) || !I0.l.a(this.f11540d, q.f11540d)) {
            return false;
        }
        q.getClass();
        return z2.h.a(null, null) && z2.h.a(this.f11541e, q.f11541e) && z2.h.a(this.f11542f, q.f11542f);
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.f11537a) * 31;
        Boolean bool = this.f11538b;
        int b3 = AbstractC0837j.b(this.f11540d, AbstractC0837j.b(this.f11539c, (hashCode + (bool != null ? bool.hashCode() : 0)) * 31, 31), 961);
        Boolean bool2 = this.f11541e;
        int hashCode2 = (b3 + (bool2 != null ? bool2.hashCode() : 0)) * 31;
        J0.b bVar = this.f11542f;
        return hashCode2 + (bVar != null ? bVar.f4323h.hashCode() : 0);
    }

    public final String toString() {
        return "KeyboardOptions(capitalization=" + ((Object) I0.n.b(this.f11537a)) + ", autoCorrectEnabled=" + this.f11538b + ", keyboardType=" + ((Object) I0.o.b(this.f11539c)) + ", imeAction=" + ((Object) I0.l.b(this.f11540d)) + ", platformImeOptions=nullshowKeyboardOnFocus=" + this.f11541e + ", hintLocales=" + this.f11542f + ')';
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public Q(int r10, int r11) {
        /*
            r9 = this;
            r11 = r11 & 2
            z.Q r0 = z.Q.f11536g
            r1 = 1
            if (r11 == 0) goto L12
            java.lang.Boolean r11 = r0.f11538b
            if (r11 == 0) goto L10
            boolean r11 = r11.booleanValue()
            goto L13
        L10:
            r11 = r1
            goto L13
        L12:
            r11 = 0
        L13:
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r11)
            java.lang.Boolean r11 = r0.f11541e
            if (r11 == 0) goto L1f
            boolean r1 = r11.booleanValue()
        L1f:
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r1)
            r8 = 64
            r3 = 0
            r5 = 3
            r2 = r9
            r6 = r10
            r2.<init>(r3, r4, r5, r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: z.Q.<init>(int, int):void");
    }
}
