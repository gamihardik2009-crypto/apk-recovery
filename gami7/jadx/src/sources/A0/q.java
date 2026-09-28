package A0;

import B1.C;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import n2.AbstractC0961m;
import n2.C0970v;
import r0.AbstractC1108W;
import t0.AbstractC1248f;
import t0.C1236E;
import t0.InterfaceC1255m;
import t0.Z;

/* loaded from: classes.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public final V.n f69a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f70b;

    /* renamed from: c, reason: collision with root package name */
    public final C1236E f71c;

    /* renamed from: d, reason: collision with root package name */
    public final k f72d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f73e;

    /* renamed from: f, reason: collision with root package name */
    public q f74f;

    /* renamed from: g, reason: collision with root package name */
    public final int f75g;

    public q(V.n nVar, boolean z3, C1236E c1236e, k kVar) {
        this.f69a = nVar;
        this.f70b = z3;
        this.f71c = c1236e;
        this.f72d = kVar;
        this.f75g = c1236e.f10388i;
    }

    public static /* synthetic */ List h(q qVar, boolean z3, int i2) {
        boolean z4 = (i2 & 1) != 0 ? !qVar.f70b : false;
        if ((i2 & 2) != 0) {
            z3 = false;
        }
        return qVar.g(z4, z3, false);
    }

    public final q a(h hVar, y2.c cVar) {
        k kVar = new k();
        kVar.f61i = false;
        kVar.f62j = false;
        cVar.l(kVar);
        q qVar = new q(new p(cVar), false, new C1236E(this.f75g + (hVar != null ? 1000000000 : 2000000000), true), kVar);
        qVar.f73e = true;
        qVar.f74f = this;
        return qVar;
    }

    public final void b(C1236E c1236e, ArrayList arrayList, boolean z3) {
        L.d u3 = c1236e.u();
        int i2 = u3.f4620j;
        if (i2 > 0) {
            Object[] objArr = u3.f4618h;
            int i3 = 0;
            do {
                C1236E c1236e2 = (C1236E) objArr[i3];
                if (c1236e2.D() && (z3 || !c1236e2.f10384K)) {
                    if (c1236e2.f10378C.f(8)) {
                        arrayList.add(B2.a.g(c1236e2, this.f70b));
                    } else {
                        b(c1236e2, arrayList, z3);
                    }
                }
                i3++;
            } while (i3 < i2);
        }
    }

    public final Z c() {
        if (this.f73e) {
            q j3 = j();
            if (j3 != null) {
                return j3.c();
            }
            return null;
        }
        InterfaceC1255m u3 = B2.a.u(this.f71c);
        if (u3 == null) {
            u3 = this.f69a;
        }
        return AbstractC1248f.t(u3, 8);
    }

    public final void d(List list) {
        List p3 = p(false, false);
        int size = p3.size();
        for (int i2 = 0; i2 < size; i2++) {
            q qVar = (q) p3.get(i2);
            if (qVar.m()) {
                list.add(qVar);
            } else if (!qVar.f72d.f62j) {
                qVar.d(list);
            }
        }
    }

    public final b0.d e() {
        Z c3 = c();
        if (c3 != null) {
            if (!c3.T0().f5869t) {
                c3 = null;
            }
            if (c3 != null) {
                return AbstractC1108W.g(c3).D(c3, true);
            }
        }
        return b0.d.f7059e;
    }

    public final b0.d f() {
        Z c3 = c();
        if (c3 != null) {
            if (!c3.T0().f5869t) {
                c3 = null;
            }
            if (c3 != null) {
                return AbstractC1108W.e(c3);
            }
        }
        return b0.d.f7059e;
    }

    public final List g(boolean z3, boolean z4, boolean z5) {
        if (!z3 && this.f72d.f62j) {
            return C0970v.f9165h;
        }
        if (!m()) {
            return p(z4, z5);
        }
        ArrayList arrayList = new ArrayList();
        d(arrayList);
        return arrayList;
    }

    public final k i() {
        boolean m3 = m();
        k kVar = this.f72d;
        if (!m3) {
            return kVar;
        }
        kVar.getClass();
        k kVar2 = new k();
        kVar2.f61i = kVar.f61i;
        kVar2.f62j = kVar.f62j;
        kVar2.f60h.putAll(kVar.f60h);
        o(kVar2);
        return kVar2;
    }

    public final q j() {
        C1236E c1236e;
        q qVar = this.f74f;
        if (qVar != null) {
            return qVar;
        }
        C1236E c1236e2 = this.f71c;
        boolean z3 = this.f70b;
        if (z3) {
            c1236e = c1236e2.s();
            while (c1236e != null) {
                k o3 = c1236e.o();
                boolean z4 = false;
                if (o3 != null && o3.f61i) {
                    z4 = true;
                }
                if (z4) {
                    break;
                }
                c1236e = c1236e.s();
            }
        }
        c1236e = null;
        if (c1236e == null) {
            C1236E s3 = c1236e2.s();
            while (true) {
                if (s3 == null) {
                    c1236e = null;
                    break;
                }
                if (s3.f10378C.f(8)) {
                    c1236e = s3;
                    break;
                }
                s3 = s3.s();
            }
        }
        if (c1236e == null) {
            return null;
        }
        return B2.a.g(c1236e, z3);
    }

    public final List k() {
        return h(this, true, 4);
    }

    public final k l() {
        return this.f72d;
    }

    public final boolean m() {
        return this.f70b && this.f72d.f61i;
    }

    public final boolean n() {
        if (this.f73e || !k().isEmpty()) {
            return false;
        }
        C1236E s3 = this.f71c.s();
        while (true) {
            if (s3 == null) {
                s3 = null;
                break;
            }
            k o3 = s3.o();
            if (Boolean.valueOf(o3 != null && o3.f61i).booleanValue()) {
                break;
            }
            s3 = s3.s();
        }
        return s3 == null;
    }

    public final void o(k kVar) {
        if (this.f72d.f62j) {
            return;
        }
        List p3 = p(false, false);
        int size = p3.size();
        for (int i2 = 0; i2 < size; i2++) {
            q qVar = (q) p3.get(i2);
            if (!qVar.m()) {
                for (Map.Entry entry : qVar.f72d.f60h.entrySet()) {
                    x xVar = (x) entry.getKey();
                    Object value = entry.getValue();
                    LinkedHashMap linkedHashMap = kVar.f60h;
                    Object obj = linkedHashMap.get(xVar);
                    z2.h.d(xVar, "null cannot be cast to non-null type androidx.compose.ui.semantics.SemanticsPropertyKey<kotlin.Any?>");
                    Object j3 = xVar.f125b.j(obj, value);
                    if (j3 != null) {
                        linkedHashMap.put(xVar, j3);
                    }
                }
                qVar.o(kVar);
            }
        }
    }

    public final List p(boolean z3, boolean z4) {
        if (this.f73e) {
            return C0970v.f9165h;
        }
        ArrayList arrayList = new ArrayList();
        b(this.f71c, arrayList, z4);
        if (z3) {
            x xVar = t.f112s;
            k kVar = this.f72d;
            h hVar = (h) C.T(kVar, xVar);
            if (hVar != null && kVar.f61i && (!arrayList.isEmpty())) {
                arrayList.add(a(hVar, new n(0, hVar)));
            }
            x xVar2 = t.f95a;
            LinkedHashMap linkedHashMap = kVar.f60h;
            if (linkedHashMap.containsKey(xVar2) && (!arrayList.isEmpty()) && kVar.f61i) {
                Object obj = linkedHashMap.get(xVar2);
                if (obj == null) {
                    obj = null;
                }
                List list = (List) obj;
                String str = list != null ? (String) AbstractC0961m.H(list) : null;
                if (str != null) {
                    arrayList.add(0, a(null, new o(str, 0)));
                }
            }
        }
        return arrayList;
    }
}
