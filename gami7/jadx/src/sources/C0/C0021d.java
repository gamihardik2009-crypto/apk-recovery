package C0;

import java.util.ArrayList;
import java.util.List;

/* renamed from: C0.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0021d implements Appendable {

    /* renamed from: a, reason: collision with root package name */
    public final StringBuilder f492a = new StringBuilder(16);

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f493b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f494c = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f495d = new ArrayList();

    public C0021d(C0024g c0024g) {
        new ArrayList();
        b(c0024g);
    }

    public final void a(C c3, int i2, int i3) {
        this.f493b.add(new C0020c(i2, i3, c3));
    }

    @Override // java.lang.Appendable
    public final Appendable append(CharSequence charSequence) {
        if (charSequence instanceof C0024g) {
            b((C0024g) charSequence);
        } else {
            this.f492a.append(charSequence);
        }
        return this;
    }

    public final void b(C0024g c0024g) {
        StringBuilder sb = this.f492a;
        int length = sb.length();
        sb.append(c0024g.f500a);
        List list = c0024g.f501b;
        if (list != null) {
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                C0022e c0022e = (C0022e) list.get(i2);
                a((C) c0022e.f496a, c0022e.f497b + length, c0022e.f498c + length);
            }
        }
        List list2 = c0024g.f502c;
        if (list2 != null) {
            int size2 = list2.size();
            for (int i3 = 0; i3 < size2; i3++) {
                C0022e c0022e2 = (C0022e) list2.get(i3);
                this.f494c.add(new C0020c(c0022e2.f497b + length, c0022e2.f498c + length, (t) c0022e2.f496a));
            }
        }
        List list3 = c0024g.f503d;
        if (list3 != null) {
            int size3 = list3.size();
            for (int i4 = 0; i4 < size3; i4++) {
                C0022e c0022e3 = (C0022e) list3.get(i4);
                this.f495d.add(new C0020c(c0022e3.f497b + length, c0022e3.f498c + length, c0022e3.f496a, c0022e3.f499d));
            }
        }
    }

    public final C0024g c() {
        StringBuilder sb = this.f492a;
        String sb2 = sb.toString();
        ArrayList arrayList = this.f493b;
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            arrayList2.add(((C0020c) arrayList.get(i2)).a(sb.length()));
        }
        if (arrayList2.isEmpty()) {
            arrayList2 = null;
        }
        ArrayList arrayList3 = this.f494c;
        ArrayList arrayList4 = new ArrayList(arrayList3.size());
        int size2 = arrayList3.size();
        for (int i3 = 0; i3 < size2; i3++) {
            arrayList4.add(((C0020c) arrayList3.get(i3)).a(sb.length()));
        }
        if (arrayList4.isEmpty()) {
            arrayList4 = null;
        }
        ArrayList arrayList5 = this.f495d;
        ArrayList arrayList6 = new ArrayList(arrayList5.size());
        int size3 = arrayList5.size();
        for (int i4 = 0; i4 < size3; i4++) {
            arrayList6.add(((C0020c) arrayList5.get(i4)).a(sb.length()));
        }
        return new C0024g(sb2, arrayList2, arrayList4, arrayList6.isEmpty() ? null : arrayList6);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r13v4, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r13v5 */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.util.List] */
    @Override // java.lang.Appendable
    public final Appendable append(CharSequence charSequence, int i2, int i3) {
        ?? r4;
        ?? r13;
        boolean z3 = charSequence instanceof C0024g;
        StringBuilder sb = this.f492a;
        if (z3) {
            C0024g c0024g = (C0024g) charSequence;
            int length = sb.length();
            sb.append((CharSequence) c0024g.f500a, i2, i3);
            List b3 = AbstractC0025h.b(c0024g, i2, i3);
            if (b3 != null) {
                int size = b3.size();
                for (int i4 = 0; i4 < size; i4++) {
                    C0022e c0022e = (C0022e) b3.get(i4);
                    a((C) c0022e.f496a, c0022e.f497b + length, c0022e.f498c + length);
                }
            }
            List list = null;
            String str = c0024g.f500a;
            if (i2 == i3 || (r4 = c0024g.f502c) == 0) {
                r4 = 0;
            } else if (i2 != 0 || i3 < str.length()) {
                ArrayList arrayList = new ArrayList(r4.size());
                int size2 = r4.size();
                for (int i5 = 0; i5 < size2; i5++) {
                    Object obj = r4.get(i5);
                    C0022e c0022e2 = (C0022e) obj;
                    if (AbstractC0025h.c(i2, i3, c0022e2.f497b, c0022e2.f498c)) {
                        arrayList.add(obj);
                    }
                }
                r4 = new ArrayList(arrayList.size());
                int size3 = arrayList.size();
                for (int i6 = 0; i6 < size3; i6++) {
                    C0022e c0022e3 = (C0022e) arrayList.get(i6);
                    r4.add(new C0022e(B1.C.C(c0022e3.f497b, i2, i3) - i2, B1.C.C(c0022e3.f498c, i2, i3) - i2, c0022e3.f496a));
                }
            }
            if (r4 != 0) {
                int size4 = r4.size();
                for (int i7 = 0; i7 < size4; i7++) {
                    C0022e c0022e4 = (C0022e) r4.get(i7);
                    this.f494c.add(new C0020c(c0022e4.f497b + length, c0022e4.f498c + length, (t) c0022e4.f496a));
                }
            }
            if (i2 != i3 && (r13 = c0024g.f503d) != 0) {
                if (i2 != 0 || i3 < str.length()) {
                    ArrayList arrayList2 = new ArrayList(r13.size());
                    int size5 = r13.size();
                    for (int i8 = 0; i8 < size5; i8++) {
                        Object obj2 = r13.get(i8);
                        C0022e c0022e5 = (C0022e) obj2;
                        if (AbstractC0025h.c(i2, i3, c0022e5.f497b, c0022e5.f498c)) {
                            arrayList2.add(obj2);
                        }
                    }
                    r13 = new ArrayList(arrayList2.size());
                    int size6 = arrayList2.size();
                    for (int i9 = 0; i9 < size6; i9++) {
                        C0022e c0022e6 = (C0022e) arrayList2.get(i9);
                        r13.add(new C0022e(B1.C.C(c0022e6.f497b, i2, i3) - i2, B1.C.C(c0022e6.f498c, i2, i3) - i2, c0022e6.f496a, c0022e6.f499d));
                    }
                }
                list = r13;
            }
            if (list != null) {
                int size7 = list.size();
                for (int i10 = 0; i10 < size7; i10++) {
                    C0022e c0022e7 = (C0022e) list.get(i10);
                    this.f495d.add(new C0020c(c0022e7.f497b + length, c0022e7.f498c + length, c0022e7.f496a, c0022e7.f499d));
                }
            }
        } else {
            sb.append(charSequence, i2, i3);
        }
        return this;
    }

    @Override // java.lang.Appendable
    public final Appendable append(char c3) {
        this.f492a.append(c3);
        return this;
    }
}
