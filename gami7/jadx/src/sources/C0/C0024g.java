package C0;

import java.util.List;
import n2.AbstractC0961m;
import n2.C0970v;

/* renamed from: C0.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0024g implements CharSequence {

    /* renamed from: a, reason: collision with root package name */
    public final String f500a;

    /* renamed from: b, reason: collision with root package name */
    public final List f501b;

    /* renamed from: c, reason: collision with root package name */
    public final List f502c;

    /* renamed from: d, reason: collision with root package name */
    public final List f503d;

    static {
        K1.e eVar = B.f406a;
    }

    public C0024g(String str, List list, List list2, List list3) {
        this.f500a = str;
        this.f501b = list;
        this.f502c = list2;
        this.f503d = list3;
        if (list2 != null) {
            List T3 = AbstractC0961m.T(list2, new C0023f());
            int size = T3.size();
            int i2 = -1;
            int i3 = 0;
            while (i3 < size) {
                C0022e c0022e = (C0022e) T3.get(i3);
                if (c0022e.f497b < i2) {
                    throw new IllegalArgumentException("ParagraphStyle should not overlap".toString());
                }
                int length = this.f500a.length();
                int i4 = c0022e.f498c;
                if (i4 > length) {
                    throw new IllegalArgumentException(("ParagraphStyle range [" + c0022e.f497b + ", " + i4 + ") is out of boundary").toString());
                }
                i3++;
                i2 = i4;
            }
        }
    }

    public final List a() {
        List list = this.f501b;
        return list == null ? C0970v.f9165h : list;
    }

    @Override // java.lang.CharSequence
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final C0024g subSequence(int i2, int i3) {
        if (i2 > i3) {
            throw new IllegalArgumentException(("start (" + i2 + ") should be less or equal to end (" + i3 + ')').toString());
        }
        String str = this.f500a;
        if (i2 == 0 && i3 == str.length()) {
            return this;
        }
        String substring = str.substring(i2, i3);
        z2.h.e(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return new C0024g(substring, AbstractC0025h.a(this.f501b, i2, i3), AbstractC0025h.a(this.f502c, i2, i3), AbstractC0025h.a(this.f503d, i2, i3));
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i2) {
        return this.f500a.charAt(i2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0024g)) {
            return false;
        }
        C0024g c0024g = (C0024g) obj;
        return z2.h.a(this.f500a, c0024g.f500a) && z2.h.a(this.f501b, c0024g.f501b) && z2.h.a(this.f502c, c0024g.f502c) && z2.h.a(this.f503d, c0024g.f503d);
    }

    public final int hashCode() {
        int hashCode = this.f500a.hashCode() * 31;
        List list = this.f501b;
        int hashCode2 = (hashCode + (list != null ? list.hashCode() : 0)) * 31;
        List list2 = this.f502c;
        int hashCode3 = (hashCode2 + (list2 != null ? list2.hashCode() : 0)) * 31;
        List list3 = this.f503d;
        return hashCode3 + (list3 != null ? list3.hashCode() : 0);
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.f500a.length();
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        return this.f500a;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [n2.v] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C0024g(java.lang.String r2, java.util.ArrayList r3, int r4) {
        /*
            r1 = this;
            r4 = r4 & 2
            n2.v r0 = n2.C0970v.f9165h
            if (r4 == 0) goto L7
            r3 = r0
        L7:
            boolean r4 = r3.isEmpty()
            r0 = 0
            if (r4 == 0) goto Lf
            r3 = r0
        Lf:
            r1.<init>(r2, r3, r0, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: C0.C0024g.<init>(java.lang.String, java.util.ArrayList, int):void");
    }
}
