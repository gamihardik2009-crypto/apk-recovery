package J;

import D.C0053w;
import J2.C0325w;
import J2.InterfaceC0310g;
import T.AbstractC0379g;
import T.C0375c;
import android.util.Log;
import j.C0736B;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import m2.C0880v;
import n2.C0970v;
import q2.InterfaceC1078i;

/* renamed from: J.z0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0303z0 extends AbstractC0288s {

    /* renamed from: v, reason: collision with root package name */
    public static final M2.d0 f4299v = M2.P.b(P.b.f5221l);

    /* renamed from: w, reason: collision with root package name */
    public static final AtomicReference f4300w = new AtomicReference(Boolean.FALSE);

    /* renamed from: a, reason: collision with root package name */
    public final C0265g f4301a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f4302b;

    /* renamed from: c, reason: collision with root package name */
    public J2.Z f4303c;

    /* renamed from: d, reason: collision with root package name */
    public Throwable f4304d;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f4305e;

    /* renamed from: f, reason: collision with root package name */
    public List f4306f;

    /* renamed from: g, reason: collision with root package name */
    public C0736B f4307g;

    /* renamed from: h, reason: collision with root package name */
    public final L.d f4308h;

    /* renamed from: i, reason: collision with root package name */
    public final ArrayList f4309i;

    /* renamed from: j, reason: collision with root package name */
    public final ArrayList f4310j;

    /* renamed from: k, reason: collision with root package name */
    public final LinkedHashMap f4311k;

    /* renamed from: l, reason: collision with root package name */
    public final LinkedHashMap f4312l;

    /* renamed from: m, reason: collision with root package name */
    public ArrayList f4313m;

    /* renamed from: n, reason: collision with root package name */
    public Set f4314n;

    /* renamed from: o, reason: collision with root package name */
    public InterfaceC0310g f4315o;

    /* renamed from: p, reason: collision with root package name */
    public B.F f4316p;
    public boolean q;

    /* renamed from: r, reason: collision with root package name */
    public final M2.d0 f4317r;

    /* renamed from: s, reason: collision with root package name */
    public final J2.c0 f4318s;

    /* renamed from: t, reason: collision with root package name */
    public final InterfaceC1078i f4319t;

    /* renamed from: u, reason: collision with root package name */
    public final W f4320u;

    public C0303z0(InterfaceC1078i interfaceC1078i) {
        C0265g c0265g = new C0265g(new B.y(15, this));
        this.f4301a = c0265g;
        this.f4302b = new Object();
        this.f4305e = new ArrayList();
        this.f4307g = new C0736B();
        this.f4308h = new L.d(new C0294v[16]);
        this.f4309i = new ArrayList();
        this.f4310j = new ArrayList();
        this.f4311k = new LinkedHashMap();
        this.f4312l = new LinkedHashMap();
        this.f4317r = M2.P.b(EnumC0293u0.f4250j);
        J2.c0 c0Var = new J2.c0((J2.Z) interfaceC1078i.s(C0325w.f4437i));
        c0Var.g(new A0.n(9, this));
        this.f4318s = c0Var;
        this.f4319t = interfaceC1078i.A(c0265g).A(c0Var);
        this.f4320u = new W(7);
    }

    public static /* synthetic */ void C(C0303z0 c0303z0, Exception exc, boolean z3, int i2) {
        if ((i2 & 4) != 0) {
            z3 = false;
        }
        c0303z0.B(exc, null, z3);
    }

    public static final C0294v q(C0303z0 c0303z0, C0294v c0294v, C0736B c0736b) {
        C0375c B3;
        if (c0294v.f4273z.E || c0294v.f4255A) {
            return null;
        }
        Set set = c0303z0.f4314n;
        if (set != null && set.contains(c0294v)) {
            return null;
        }
        A0.n nVar = new A0.n(10, c0294v);
        C0053w c0053w = new C0053w(c0294v, 11, c0736b);
        AbstractC0379g k3 = T.n.k();
        C0375c c0375c = k3 instanceof C0375c ? (C0375c) k3 : null;
        if (c0375c == null || (B3 = c0375c.B(nVar, c0053w)) == null) {
            throw new IllegalStateException("Cannot create a mutable snapshot of an read-only snapshot".toString());
        }
        try {
            AbstractC0379g j3 = B3.j();
            try {
                if (c0736b.h()) {
                    D.c0 c0Var = new D.c0(c0736b, 3, c0294v);
                    C0285q c0285q = c0294v.f4273z;
                    if (!(!c0285q.E)) {
                        C0257c.y("Preparing a composition while composing is not supported");
                        throw null;
                    }
                    c0285q.E = true;
                    try {
                        c0Var.c();
                        c0285q.E = false;
                    } catch (Throwable th) {
                        c0285q.E = false;
                        throw th;
                    }
                }
                boolean w2 = c0294v.w();
                AbstractC0379g.p(j3);
                if (!w2) {
                    c0294v = null;
                }
                return c0294v;
            } catch (Throwable th2) {
                AbstractC0379g.p(j3);
                throw th2;
            }
        } finally {
            s(B3);
        }
    }

    public static final boolean r(C0303z0 c0303z0) {
        boolean z3;
        List x2;
        synchronized (c0303z0.f4302b) {
            z3 = true;
            if (!c0303z0.f4307g.g()) {
                L.f fVar = new L.f(c0303z0.f4307g);
                c0303z0.f4307g = new C0736B();
                synchronized (c0303z0.f4302b) {
                    x2 = c0303z0.x();
                }
                try {
                    int size = x2.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        ((C0294v) x2.get(i2)).y(fVar);
                        if (((EnumC0293u0) c0303z0.f4317r.getValue()).compareTo(EnumC0293u0.f4249i) <= 0) {
                            break;
                        }
                    }
                    synchronized (c0303z0.f4302b) {
                        c0303z0.f4307g = new C0736B();
                    }
                    synchronized (c0303z0.f4302b) {
                        if (c0303z0.u() != null) {
                            throw new IllegalStateException("called outside of runRecomposeAndApplyChanges".toString());
                        }
                        if (!c0303z0.f4308h.l() && !c0303z0.v()) {
                            z3 = false;
                        }
                    }
                } catch (Throwable th) {
                    synchronized (c0303z0.f4302b) {
                        C0736B c0736b = c0303z0.f4307g;
                        c0736b.getClass();
                        Iterator it = fVar.iterator();
                        while (true) {
                            G2.h hVar = (G2.h) it;
                            if (!hVar.hasNext()) {
                                throw th;
                            }
                            Object next = hVar.next();
                            c0736b.f7965b[c0736b.d(next)] = next;
                        }
                    }
                }
            } else if (!c0303z0.f4308h.l() && !c0303z0.v()) {
                z3 = false;
            }
        }
        return z3;
    }

    public static void s(C0375c c0375c) {
        try {
            if (c0375c.v() instanceof T.h) {
                throw new IllegalStateException("Unsupported concurrent change during composition. A state object was modified by composition as well as being modified outside composition.".toString());
            }
        } finally {
            c0375c.c();
        }
    }

    public static final void z(ArrayList arrayList, C0303z0 c0303z0, C0294v c0294v) {
        arrayList.clear();
        synchronized (c0303z0.f4302b) {
            Iterator it = c0303z0.f4310j.iterator();
            while (it.hasNext()) {
                AbstractC0254a0 abstractC0254a0 = (AbstractC0254a0) it.next();
                abstractC0254a0.getClass();
                if (z2.h.a(null, c0294v)) {
                    arrayList.add(abstractC0254a0);
                    it.remove();
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x00e1, code lost:
    
        r3 = r10.size();
        r4 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00e6, code lost:
    
        if (r4 >= r3) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00f0, code lost:
    
        if (((m2.C0865g) r10.get(r4)).f8647i == null) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00f2, code lost:
    
        r4 = r4 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00f5, code lost:
    
        r3 = new java.util.ArrayList(r10.size());
        r4 = r10.size();
        r8 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0103, code lost:
    
        if (r8 >= r4) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0105, code lost:
    
        r11 = (m2.C0865g) r10.get(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x010d, code lost:
    
        if (r11.f8647i != null) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x010f, code lost:
    
        r11 = (J.AbstractC0254a0) r11.f8646h;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0116, code lost:
    
        r8 = r8 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0119, code lost:
    
        r4 = r18.f4302b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x011b, code lost:
    
        monitor-enter(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x011c, code lost:
    
        n2.AbstractC0968t.B(r18.f4310j, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0121, code lost:
    
        monitor-exit(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0122, code lost:
    
        r3 = new java.util.ArrayList(r10.size());
        r4 = r10.size();
        r8 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0130, code lost:
    
        if (r8 >= r4) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0132, code lost:
    
        r11 = r10.get(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x013b, code lost:
    
        if (((m2.C0865g) r11).f8647i == null) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x013d, code lost:
    
        r3.add(r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0140, code lost:
    
        r8 = r8 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0143, code lost:
    
        r10 = r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List A(java.util.List r19, j.C0736B r20) {
        /*
            Method dump skipped, instructions count: 373
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: J.C0303z0.A(java.util.List, j.B):java.util.List");
    }

    public final void B(Exception exc, C0294v c0294v, boolean z3) {
        int i2 = 7;
        if (!((Boolean) f4300w.get()).booleanValue() || (exc instanceof C0273k)) {
            synchronized (this.f4302b) {
                B.F f3 = this.f4316p;
                if (f3 != null) {
                    throw ((Exception) f3.f165i);
                }
                this.f4316p = new B.F(i2, exc);
            }
            throw exc;
        }
        synchronized (this.f4302b) {
            try {
                int i3 = AbstractC0253a.f4116b;
                Log.e("ComposeInternal", "Error was captured in composition while live edit was enabled.", exc);
                this.f4309i.clear();
                this.f4308h.g();
                this.f4307g = new C0736B();
                this.f4310j.clear();
                this.f4311k.clear();
                this.f4312l.clear();
                this.f4316p = new B.F(i2, exc);
                if (c0294v != null) {
                    D(c0294v);
                }
                u();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void D(C0294v c0294v) {
        ArrayList arrayList = this.f4313m;
        if (arrayList == null) {
            arrayList = new ArrayList();
            this.f4313m = arrayList;
        }
        if (!arrayList.contains(c0294v)) {
            arrayList.add(c0294v);
        }
        this.f4305e.remove(c0294v);
        this.f4306f = null;
    }

    @Override // J.AbstractC0288s
    public final void a(C0294v c0294v, R.a aVar) {
        C0375c B3;
        boolean z3 = c0294v.f4273z.E;
        try {
            A0.n nVar = new A0.n(10, c0294v);
            C0053w c0053w = new C0053w(c0294v, 11, null);
            AbstractC0379g k3 = T.n.k();
            C0375c c0375c = k3 instanceof C0375c ? (C0375c) k3 : null;
            if (c0375c == null || (B3 = c0375c.B(nVar, c0053w)) == null) {
                throw new IllegalStateException("Cannot create a mutable snapshot of an read-only snapshot".toString());
            }
            try {
                AbstractC0379g j3 = B3.j();
                try {
                    c0294v.k(aVar);
                    if (!z3) {
                        T.n.k().m();
                    }
                    synchronized (this.f4302b) {
                        if (((EnumC0293u0) this.f4317r.getValue()).compareTo(EnumC0293u0.f4249i) > 0 && !x().contains(c0294v)) {
                            this.f4305e.add(c0294v);
                            this.f4306f = null;
                        }
                    }
                    try {
                        y(c0294v);
                        try {
                            c0294v.f();
                            c0294v.h();
                            if (z3) {
                                return;
                            }
                            T.n.k().m();
                        } catch (Exception e3) {
                            C(this, e3, false, 6);
                        }
                    } catch (Exception e4) {
                        B(e4, c0294v, true);
                    }
                } finally {
                    AbstractC0379g.p(j3);
                }
            } finally {
                s(B3);
            }
        } catch (Exception e5) {
            B(e5, c0294v, true);
        }
    }

    @Override // J.AbstractC0288s
    public final boolean c() {
        return ((Boolean) f4300w.get()).booleanValue();
    }

    @Override // J.AbstractC0288s
    public final boolean d() {
        return false;
    }

    @Override // J.AbstractC0288s
    public final boolean e() {
        return false;
    }

    @Override // J.AbstractC0288s
    public final int g() {
        return 1000;
    }

    @Override // J.AbstractC0288s
    public final InterfaceC1078i h() {
        return this.f4319t;
    }

    @Override // J.AbstractC0288s
    public final void i(C0294v c0294v) {
        InterfaceC0310g interfaceC0310g;
        synchronized (this.f4302b) {
            if (this.f4308h.h(c0294v)) {
                interfaceC0310g = null;
            } else {
                this.f4308h.b(c0294v);
                interfaceC0310g = u();
            }
        }
        if (interfaceC0310g != null) {
            interfaceC0310g.t(C0880v.f8657a);
        }
    }

    @Override // J.AbstractC0288s
    public final Z j(AbstractC0254a0 abstractC0254a0) {
        Z z3;
        synchronized (this.f4302b) {
            z3 = (Z) this.f4312l.remove(abstractC0254a0);
        }
        return z3;
    }

    @Override // J.AbstractC0288s
    public final void k(Set set) {
    }

    @Override // J.AbstractC0288s
    public final void m(C0294v c0294v) {
        synchronized (this.f4302b) {
            try {
                Set set = this.f4314n;
                if (set == null) {
                    set = new LinkedHashSet();
                    this.f4314n = set;
                }
                set.add(c0294v);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // J.AbstractC0288s
    public final void p(C0294v c0294v) {
        synchronized (this.f4302b) {
            this.f4305e.remove(c0294v);
            this.f4306f = null;
            this.f4308h.m(c0294v);
            this.f4309i.remove(c0294v);
        }
    }

    public final void t() {
        synchronized (this.f4302b) {
            if (((EnumC0293u0) this.f4317r.getValue()).compareTo(EnumC0293u0.f4252l) >= 0) {
                this.f4317r.k(EnumC0293u0.f4249i);
            }
        }
        this.f4318s.a(null);
    }

    public final InterfaceC0310g u() {
        M2.d0 d0Var = this.f4317r;
        int compareTo = ((EnumC0293u0) d0Var.getValue()).compareTo(EnumC0293u0.f4249i);
        ArrayList arrayList = this.f4310j;
        ArrayList arrayList2 = this.f4309i;
        L.d dVar = this.f4308h;
        if (compareTo <= 0) {
            this.f4305e.clear();
            this.f4306f = C0970v.f9165h;
            this.f4307g = new C0736B();
            dVar.g();
            arrayList2.clear();
            arrayList.clear();
            this.f4313m = null;
            InterfaceC0310g interfaceC0310g = this.f4315o;
            if (interfaceC0310g != null) {
                interfaceC0310g.H(null);
            }
            this.f4315o = null;
            this.f4316p = null;
            return null;
        }
        B.F f3 = this.f4316p;
        EnumC0293u0 enumC0293u0 = EnumC0293u0.f4253m;
        EnumC0293u0 enumC0293u02 = EnumC0293u0.f4250j;
        if (f3 == null) {
            if (this.f4303c == null) {
                this.f4307g = new C0736B();
                dVar.g();
                if (v()) {
                    enumC0293u02 = EnumC0293u0.f4251k;
                }
            } else {
                enumC0293u02 = (dVar.l() || this.f4307g.h() || (arrayList2.isEmpty() ^ true) || (arrayList.isEmpty() ^ true) || v()) ? enumC0293u0 : EnumC0293u0.f4252l;
            }
        }
        d0Var.k(enumC0293u02);
        if (enumC0293u02 != enumC0293u0) {
            return null;
        }
        InterfaceC0310g interfaceC0310g2 = this.f4315o;
        this.f4315o = null;
        return interfaceC0310g2;
    }

    public final boolean v() {
        return (this.q || this.f4301a.f4139m.get() == 0) ? false : true;
    }

    public final boolean w() {
        boolean z3;
        synchronized (this.f4302b) {
            if (!this.f4307g.h() && !this.f4308h.l()) {
                z3 = v();
            }
        }
        return z3;
    }

    public final List x() {
        List list = this.f4306f;
        if (list == null) {
            ArrayList arrayList = this.f4305e;
            list = arrayList.isEmpty() ? C0970v.f9165h : new ArrayList(arrayList);
            this.f4306f = list;
        }
        return list;
    }

    public final void y(C0294v c0294v) {
        synchronized (this.f4302b) {
            ArrayList arrayList = this.f4310j;
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                ((AbstractC0254a0) arrayList.get(i2)).getClass();
                if (z2.h.a(null, c0294v)) {
                    ArrayList arrayList2 = new ArrayList();
                    z(arrayList2, this, c0294v);
                    while (!arrayList2.isEmpty()) {
                        A(arrayList2, null);
                        z(arrayList2, this, c0294v);
                    }
                    return;
                }
            }
        }
    }
}
