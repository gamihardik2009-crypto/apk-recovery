package U2;

import A0.n;
import B.y;
import B1.C;
import B1.t;
import G2.l;
import W2.InterfaceC0404e;
import W2.w;
import j.C0744J;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import m2.C0865g;
import m2.C0870l;
import n1.C0944e;
import n2.AbstractC0946A;
import n2.AbstractC0961m;
import n2.AbstractC0964p;
import n2.C0973y;

/* loaded from: classes.dex */
public final class g implements f, InterfaceC0404e {

    /* renamed from: a, reason: collision with root package name */
    public final String f5813a;

    /* renamed from: b, reason: collision with root package name */
    public final C f5814b;

    /* renamed from: c, reason: collision with root package name */
    public final int f5815c;

    /* renamed from: d, reason: collision with root package name */
    public final HashSet f5816d;

    /* renamed from: e, reason: collision with root package name */
    public final String[] f5817e;

    /* renamed from: f, reason: collision with root package name */
    public final f[] f5818f;

    /* renamed from: g, reason: collision with root package name */
    public final f[] f5819g;

    /* renamed from: h, reason: collision with root package name */
    public final C0870l f5820h;

    public g(String str, C c3, int i2, List list, a aVar) {
        z2.h.f(str, "serialName");
        this.f5813a = str;
        this.f5814b = c3;
        this.f5815c = i2;
        ArrayList arrayList = aVar.f5793b;
        z2.h.f(arrayList, "<this>");
        HashSet hashSet = new HashSet(AbstractC0946A.m(AbstractC0964p.z(arrayList, 12)));
        AbstractC0961m.V(arrayList, hashSet);
        this.f5816d = hashSet;
        int i3 = 0;
        this.f5817e = (String[]) arrayList.toArray(new String[0]);
        this.f5818f = w.c(aVar.f5795d);
        ArrayList arrayList2 = aVar.f5797f;
        z2.h.f(arrayList2, "<this>");
        boolean[] zArr = new boolean[arrayList2.size()];
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            zArr[i3] = ((Boolean) it.next()).booleanValue();
            i3++;
        }
        String[] strArr = this.f5817e;
        z2.h.f(strArr, "<this>");
        l lVar = new l(2, new C0944e(1, strArr));
        ArrayList arrayList3 = new ArrayList(AbstractC0964p.z(lVar, 10));
        Iterator it2 = lVar.iterator();
        while (true) {
            C0744J c0744j = (C0744J) it2;
            if (!((Iterator) c0744j.f7984j).hasNext()) {
                AbstractC0946A.t(arrayList3);
                this.f5819g = w.c(list);
                this.f5820h = new C0870l(new y(21, this));
                return;
            }
            C0973y c0973y = (C0973y) c0744j.next();
            arrayList3.add(new C0865g(c0973y.f9169b, Integer.valueOf(c0973y.f9168a)));
        }
    }

    @Override // U2.f
    public final String a(int i2) {
        return this.f5817e[i2];
    }

    @Override // U2.f
    public final String b() {
        return this.f5813a;
    }

    @Override // W2.InterfaceC0404e
    public final Set c() {
        return this.f5816d;
    }

    @Override // U2.f
    public final f d(int i2) {
        return this.f5818f[i2];
    }

    @Override // U2.f
    public final C e() {
        return this.f5814b;
    }

    public final boolean equals(Object obj) {
        int i2;
        if (this == obj) {
            return true;
        }
        if (obj instanceof g) {
            f fVar = (f) obj;
            if (z2.h.a(this.f5813a, fVar.b()) && Arrays.equals(this.f5819g, ((g) obj).f5819g)) {
                int f3 = fVar.f();
                int i3 = this.f5815c;
                if (i3 == f3) {
                    for (0; i2 < i3; i2 + 1) {
                        f[] fVarArr = this.f5818f;
                        i2 = (z2.h.a(fVarArr[i2].b(), fVar.d(i2).b()) && z2.h.a(fVarArr[i2].e(), fVar.d(i2).e())) ? i2 + 1 : 0;
                    }
                    return true;
                }
            }
        }
        return false;
    }

    @Override // U2.f
    public final int f() {
        return this.f5815c;
    }

    public final int hashCode() {
        return ((Number) this.f5820h.getValue()).intValue();
    }

    public final String toString() {
        return AbstractC0961m.L(C.m0(0, this.f5815c), ", ", t.k(new StringBuilder(), this.f5813a, '('), ")", new n(18, this), 24);
    }
}
