package r0;

import H.C0148m;
import J.AbstractC0288s;
import J.C0257c;
import J.C0285q;
import J.C0294v;
import J.InterfaceC0271j;
import T.AbstractC0379g;
import T.C0374b;
import android.view.ViewGroup;
import j.C0736B;
import j.C0769y;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import t0.C1236E;
import t0.C1241J;
import t0.r0;
import u0.t1;

/* renamed from: r0.D, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1090D implements InterfaceC0271j {

    /* renamed from: h, reason: collision with root package name */
    public final C1236E f9808h;

    /* renamed from: i, reason: collision with root package name */
    public AbstractC0288s f9809i;

    /* renamed from: j, reason: collision with root package name */
    public c0 f9810j;

    /* renamed from: k, reason: collision with root package name */
    public int f9811k;

    /* renamed from: l, reason: collision with root package name */
    public int f9812l;

    /* renamed from: u, reason: collision with root package name */
    public int f9820u;

    /* renamed from: v, reason: collision with root package name */
    public int f9821v;

    /* renamed from: m, reason: collision with root package name */
    public final HashMap f9813m = new HashMap();

    /* renamed from: n, reason: collision with root package name */
    public final HashMap f9814n = new HashMap();

    /* renamed from: o, reason: collision with root package name */
    public final C1136y f9815o = new C1136y(this);

    /* renamed from: p, reason: collision with root package name */
    public final C1134w f9816p = new C1134w(this);
    public final HashMap q = new HashMap();

    /* renamed from: r, reason: collision with root package name */
    public final b0 f9817r = new b0();

    /* renamed from: s, reason: collision with root package name */
    public final LinkedHashMap f9818s = new LinkedHashMap();

    /* renamed from: t, reason: collision with root package name */
    public final L.d f9819t = new L.d(new Object[16]);

    /* renamed from: w, reason: collision with root package name */
    public final String f9822w = "Asking for intrinsic measurements of SubcomposeLayout layouts is not supported. This includes components that are built on top of SubcomposeLayout, such as lazy lists, BoxWithConstraints, TabRow, etc. To mitigate this:\n- if intrinsic measurements are used to achieve 'match parent' sizing, consider replacing the parent of the component with a custom layout which controls the order in which children are measured, making intrinsic measurement not needed\n- adding a size modifier to the component, in order to fast return the queried intrinsic measurement.";

    public C1090D(C1236E c1236e, c0 c0Var) {
        this.f9808h = c1236e;
        this.f9810j = c0Var;
    }

    public static C0294v i(C0294v c0294v, C1236E c1236e, boolean z3, AbstractC0288s abstractC0288s, R.a aVar) {
        if (c0294v == null || c0294v.f4255A) {
            ViewGroup.LayoutParams layoutParams = t1.f11152a;
            c0294v = new C0294v(abstractC0288s, new r0(c1236e));
        }
        if (z3) {
            C0285q c0285q = c0294v.f4273z;
            c0285q.f4218y = 100;
            c0285q.f4217x = true;
            c0294v.l(aVar);
            if (c0285q.E || c0285q.f4218y != 100) {
                C0257c.W("Cannot disable reuse from root if it was caused by other groups");
                throw null;
            }
            c0285q.f4218y = -1;
            c0285q.f4217x = false;
        } else {
            c0294v.l(aVar);
        }
        return c0294v;
    }

    @Override // J.InterfaceC0271j
    public final void a() {
        f(true);
    }

    @Override // J.InterfaceC0271j
    public final void b() {
        f(false);
    }

    @Override // J.InterfaceC0271j
    public final void c() {
        C1236E c1236e = this.f9808h;
        c1236e.f10396r = true;
        HashMap hashMap = this.f9813m;
        Iterator it = hashMap.values().iterator();
        while (it.hasNext()) {
            C0294v c0294v = ((C1133v) it.next()).f9891c;
            if (c0294v != null) {
                c0294v.a();
            }
        }
        c1236e.N();
        c1236e.f10396r = false;
        hashMap.clear();
        this.f9814n.clear();
        this.f9821v = 0;
        this.f9820u = 0;
        this.q.clear();
        e();
    }

    public final void d(int i2) {
        boolean z3 = false;
        this.f9820u = 0;
        int size = (this.f9808h.p().size() - this.f9821v) - 1;
        if (i2 <= size) {
            this.f9817r.clear();
            if (i2 <= size) {
                int i3 = i2;
                while (true) {
                    Object obj = this.f9813m.get((C1236E) this.f9808h.p().get(i3));
                    z2.h.c(obj);
                    this.f9817r.f9857h.add(((C1133v) obj).f9889a);
                    if (i3 == size) {
                        break;
                    } else {
                        i3++;
                    }
                }
            }
            this.f9810j.d(this.f9817r);
            AbstractC0379g c3 = T.s.c();
            y2.c f3 = c3 != null ? c3.f() : null;
            AbstractC0379g d3 = T.s.d(c3);
            boolean z4 = false;
            while (size >= i2) {
                try {
                    C1236E c1236e = (C1236E) this.f9808h.p().get(size);
                    Object obj2 = this.f9813m.get(c1236e);
                    z2.h.c(obj2);
                    C1133v c1133v = (C1133v) obj2;
                    Object obj3 = c1133v.f9889a;
                    if (this.f9817r.f9857h.contains(obj3)) {
                        this.f9820u++;
                        if (((Boolean) c1133v.f9894f.getValue()).booleanValue()) {
                            t0.L l3 = c1236e.f10379D;
                            l3.f10480r.f10455r = 3;
                            C1241J c1241j = l3.f10481s;
                            if (c1241j != null) {
                                c1241j.f10428p = 3;
                            }
                            c1133v.f9894f.setValue(Boolean.FALSE);
                            z4 = true;
                        }
                    } else {
                        C1236E c1236e2 = this.f9808h;
                        c1236e2.f10396r = true;
                        this.f9813m.remove(c1236e);
                        C0294v c0294v = c1133v.f9891c;
                        if (c0294v != null) {
                            c0294v.a();
                        }
                        this.f9808h.O(size, 1);
                        c1236e2.f10396r = false;
                    }
                    this.f9814n.remove(obj3);
                    size--;
                } catch (Throwable th) {
                    T.s.f(c3, d3, f3);
                    throw th;
                }
            }
            T.s.f(c3, d3, f3);
            if (z4) {
                synchronized (T.n.f5710b) {
                    C0736B c0736b = ((C0374b) T.n.f5717i.get()).f5673h;
                    if (c0736b != null) {
                        if (c0736b.h()) {
                            z3 = true;
                        }
                    }
                }
                if (z3) {
                    T.n.a();
                }
            }
        }
        e();
    }

    public final void e() {
        int size = this.f9808h.p().size();
        HashMap hashMap = this.f9813m;
        if (hashMap.size() != size) {
            throw new IllegalArgumentException(("Inconsistency between the count of nodes tracked by the state (" + hashMap.size() + ") and the children count on the SubcomposeLayout (" + size + "). Are you trying to use the state of the disposed SubcomposeLayout?").toString());
        }
        if ((size - this.f9820u) - this.f9821v < 0) {
            StringBuilder l3 = B1.t.l("Incorrect state. Total children ", size, ". Reusable children ");
            l3.append(this.f9820u);
            l3.append(". Precomposed children ");
            l3.append(this.f9821v);
            throw new IllegalArgumentException(l3.toString().toString());
        }
        HashMap hashMap2 = this.q;
        if (hashMap2.size() == this.f9821v) {
            return;
        }
        throw new IllegalArgumentException(("Incorrect state. Precomposed children " + this.f9821v + ". Map size " + hashMap2.size()).toString());
    }

    public final void f(boolean z3) {
        this.f9821v = 0;
        this.q.clear();
        C1236E c1236e = this.f9808h;
        int size = c1236e.p().size();
        if (this.f9820u != size) {
            this.f9820u = size;
            AbstractC0379g c3 = T.s.c();
            y2.c f3 = c3 != null ? c3.f() : null;
            AbstractC0379g d3 = T.s.d(c3);
            for (int i2 = 0; i2 < size; i2++) {
                try {
                    C1236E c1236e2 = (C1236E) c1236e.p().get(i2);
                    C1133v c1133v = (C1133v) this.f9813m.get(c1236e2);
                    if (c1133v != null && ((Boolean) c1133v.f9894f.getValue()).booleanValue()) {
                        t0.L l3 = c1236e2.f10379D;
                        l3.f10480r.f10455r = 3;
                        C1241J c1241j = l3.f10481s;
                        if (c1241j != null) {
                            c1241j.f10428p = 3;
                        }
                        if (z3) {
                            C0294v c0294v = c1133v.f9891c;
                            if (c0294v != null) {
                                c0294v.m();
                            }
                            c1133v.f9894f = C0257c.N(Boolean.FALSE, J.W.f4109m);
                        } else {
                            c1133v.f9894f.setValue(Boolean.FALSE);
                        }
                        c1133v.f9889a = AbstractC1108W.f9847a;
                    }
                } catch (Throwable th) {
                    T.s.f(c3, d3, f3);
                    throw th;
                }
            }
            T.s.f(c3, d3, f3);
            this.f9814n.clear();
        }
        e();
    }

    public final InterfaceC1109X g(Object obj, y2.e eVar) {
        C1236E c1236e = this.f9808h;
        if (!c1236e.D()) {
            return new C1088B();
        }
        e();
        if (!this.f9814n.containsKey(obj)) {
            this.f9818s.remove(obj);
            HashMap hashMap = this.q;
            Object obj2 = hashMap.get(obj);
            if (obj2 == null) {
                obj2 = j(obj);
                if (obj2 != null) {
                    int indexOf = c1236e.p().indexOf(obj2);
                    int size = c1236e.p().size();
                    c1236e.f10396r = true;
                    c1236e.H(indexOf, size, 1);
                    c1236e.f10396r = false;
                    this.f9821v++;
                } else {
                    int size2 = c1236e.p().size();
                    C1236E c1236e2 = new C1236E(2, 0, true);
                    c1236e.f10396r = true;
                    c1236e.x(size2, c1236e2);
                    c1236e.f10396r = false;
                    this.f9821v++;
                    obj2 = c1236e2;
                }
                hashMap.put(obj, obj2);
            }
            h((C1236E) obj2, obj, eVar);
        }
        return new C1089C(this, obj);
    }

    public final void h(C1236E c1236e, Object obj, y2.e eVar) {
        boolean z3;
        HashMap hashMap = this.f9813m;
        Object obj2 = hashMap.get(c1236e);
        Object obj3 = obj2;
        if (obj2 == null) {
            R.a aVar = AbstractC1121j.f9873a;
            C1133v c1133v = new C1133v();
            c1133v.f9889a = obj;
            c1133v.f9890b = aVar;
            c1133v.f9891c = null;
            c1133v.f9894f = C0257c.N(Boolean.TRUE, J.W.f4109m);
            hashMap.put(c1236e, c1133v);
            obj3 = c1133v;
        }
        C1133v c1133v2 = (C1133v) obj3;
        C0294v c0294v = c1133v2.f9891c;
        if (c0294v != null) {
            synchronized (c0294v.f4259k) {
                z3 = ((C0769y) c0294v.f4268u.f165i).f8069e > 0;
            }
        } else {
            z3 = true;
        }
        if (c1133v2.f9890b != eVar || z3 || c1133v2.f9892d) {
            c1133v2.f9890b = eVar;
            AbstractC0379g c3 = T.s.c();
            y2.c f3 = c3 != null ? c3.f() : null;
            AbstractC0379g d3 = T.s.d(c3);
            try {
                C1236E c1236e2 = this.f9808h;
                c1236e2.f10396r = true;
                y2.e eVar2 = c1133v2.f9890b;
                C0294v c0294v2 = c1133v2.f9891c;
                AbstractC0288s abstractC0288s = this.f9809i;
                if (abstractC0288s == null) {
                    throw new IllegalStateException("parent composition reference not set".toString());
                }
                c1133v2.f9891c = i(c0294v2, c1236e, c1133v2.f9893e, abstractC0288s, new R.a(-1750409193, new C0148m(c1133v2, 17, eVar2), true));
                c1133v2.f9893e = false;
                c1236e2.f10396r = false;
                T.s.f(c3, d3, f3);
                c1133v2.f9892d = false;
            } catch (Throwable th) {
                T.s.f(c3, d3, f3);
                throw th;
            }
        }
    }

    public final C1236E j(Object obj) {
        HashMap hashMap;
        int i2;
        if (this.f9820u == 0) {
            return null;
        }
        C1236E c1236e = this.f9808h;
        int size = c1236e.p().size() - this.f9821v;
        int i3 = size - this.f9820u;
        int i4 = size - 1;
        int i5 = i4;
        while (true) {
            hashMap = this.f9813m;
            if (i5 < i3) {
                i2 = -1;
                break;
            }
            Object obj2 = hashMap.get((C1236E) c1236e.p().get(i5));
            z2.h.c(obj2);
            if (z2.h.a(((C1133v) obj2).f9889a, obj)) {
                i2 = i5;
                break;
            }
            i5--;
        }
        if (i2 == -1) {
            while (i4 >= i3) {
                Object obj3 = hashMap.get((C1236E) c1236e.p().get(i4));
                z2.h.c(obj3);
                C1133v c1133v = (C1133v) obj3;
                Object obj4 = c1133v.f9889a;
                if (obj4 == AbstractC1108W.f9847a || this.f9810j.b(obj, obj4)) {
                    c1133v.f9889a = obj;
                    i5 = i4;
                    i2 = i5;
                    break;
                }
                i4--;
            }
            i5 = i4;
        }
        if (i2 == -1) {
            return null;
        }
        if (i5 != i3) {
            c1236e.f10396r = true;
            c1236e.H(i5, i3, 1);
            c1236e.f10396r = false;
        }
        this.f9820u--;
        C1236E c1236e2 = (C1236E) c1236e.p().get(i3);
        Object obj5 = hashMap.get(c1236e2);
        z2.h.c(obj5);
        C1133v c1133v2 = (C1133v) obj5;
        c1133v2.f9894f = C0257c.N(Boolean.TRUE, J.W.f4109m);
        c1133v2.f9893e = true;
        c1133v2.f9892d = true;
        return c1236e2;
    }
}
