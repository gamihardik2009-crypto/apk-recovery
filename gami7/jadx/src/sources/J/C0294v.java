package J;

import K.C0329a;
import android.os.Trace;
import j.C0735A;
import j.C0736B;
import j.C0761q;
import j.C0766v;
import j.C0769y;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import m2.C0865g;

/* renamed from: J.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0294v implements r {

    /* renamed from: A, reason: collision with root package name */
    public boolean f4255A;

    /* renamed from: h, reason: collision with root package name */
    public final AbstractC0288s f4256h;

    /* renamed from: i, reason: collision with root package name */
    public final InterfaceC0259d f4257i;

    /* renamed from: j, reason: collision with root package name */
    public final AtomicReference f4258j = new AtomicReference(null);

    /* renamed from: k, reason: collision with root package name */
    public final Object f4259k = new Object();

    /* renamed from: l, reason: collision with root package name */
    public final C0735A f4260l;

    /* renamed from: m, reason: collision with root package name */
    public final E0 f4261m;

    /* renamed from: n, reason: collision with root package name */
    public final B.F f4262n;

    /* renamed from: o, reason: collision with root package name */
    public final C0736B f4263o;

    /* renamed from: p, reason: collision with root package name */
    public final C0736B f4264p;
    public final B.F q;

    /* renamed from: r, reason: collision with root package name */
    public final C0329a f4265r;

    /* renamed from: s, reason: collision with root package name */
    public final C0329a f4266s;

    /* renamed from: t, reason: collision with root package name */
    public final B.F f4267t;

    /* renamed from: u, reason: collision with root package name */
    public B.F f4268u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f4269v;

    /* renamed from: w, reason: collision with root package name */
    public C0294v f4270w;

    /* renamed from: x, reason: collision with root package name */
    public int f4271x;

    /* renamed from: y, reason: collision with root package name */
    public final C0300y f4272y;

    /* renamed from: z, reason: collision with root package name */
    public final C0285q f4273z;

    public C0294v(AbstractC0288s abstractC0288s, t0.r0 r0Var) {
        this.f4256h = abstractC0288s;
        this.f4257i = r0Var;
        C0735A c0735a = new C0735A(new C0736B());
        this.f4260l = c0735a;
        E0 e02 = new E0();
        if (abstractC0288s.c()) {
            e02.q = new C0761q();
        }
        if (abstractC0288s.e()) {
            e02.b();
        }
        this.f4261m = e02;
        this.f4262n = new B.F(10);
        this.f4263o = new C0736B();
        this.f4264p = new C0736B();
        this.q = new B.F(10);
        C0329a c0329a = new C0329a();
        this.f4265r = c0329a;
        C0329a c0329a2 = new C0329a();
        this.f4266s = c0329a2;
        this.f4267t = new B.F(10);
        this.f4268u = new B.F(10);
        C0300y c0300y = new C0300y();
        c0300y.f4287a = false;
        this.f4272y = c0300y;
        C0285q c0285q = new C0285q(r0Var, abstractC0288s, e02, c0735a, c0329a, c0329a2, this);
        abstractC0288s.l(c0285q);
        this.f4273z = c0285q;
        boolean z3 = abstractC0288s instanceof C0303z0;
        int i2 = AbstractC0269i.f4145a;
    }

    public final void A(Object obj) {
        synchronized (this.f4259k) {
            try {
                t(obj);
                Object e3 = ((C0769y) this.q.f165i).e(obj);
                if (e3 != null) {
                    if (e3 instanceof C0736B) {
                        C0736B c0736b = (C0736B) e3;
                        Object[] objArr = c0736b.f7965b;
                        long[] jArr = c0736b.f7964a;
                        int length = jArr.length - 2;
                        if (length >= 0) {
                            int i2 = 0;
                            while (true) {
                                long j3 = jArr[i2];
                                if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                                    int i3 = 8 - ((~(i2 - length)) >>> 31);
                                    for (int i4 = 0; i4 < i3; i4++) {
                                        if ((255 & j3) < 128) {
                                            t((F) objArr[(i2 << 3) + i4]);
                                        }
                                        j3 >>= 8;
                                    }
                                    if (i3 != 8) {
                                        break;
                                    }
                                }
                                if (i2 == length) {
                                    break;
                                } else {
                                    i2++;
                                }
                            }
                        }
                    } else {
                        t((F) e3);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // J.r
    public final void a() {
        synchronized (this.f4259k) {
            try {
                C0285q c0285q = this.f4273z;
                if (!(!c0285q.E)) {
                    C0257c.X("Composition is disposed while composing. If dispose is triggered by a call in @Composable function, consider wrapping it with SideEffect block.");
                    throw null;
                }
                if (!this.f4255A) {
                    this.f4255A = true;
                    int i2 = AbstractC0269i.f4145a;
                    C0329a c0329a = c0285q.f4189K;
                    if (c0329a != null) {
                        g(c0329a);
                    }
                    boolean z3 = this.f4261m.f3999i > 0;
                    if (z3 || (!this.f4260l.f7962h.g())) {
                        C0292u c0292u = new C0292u(this.f4260l);
                        if (z3) {
                            this.f4257i.getClass();
                            G0 f3 = this.f4261m.f();
                            try {
                                C0257c.S(f3, c0292u);
                                f3.e(true);
                                this.f4257i.clear();
                                this.f4257i.e();
                                c0292u.e();
                            } catch (Throwable th) {
                                f3.e(false);
                                throw th;
                            }
                        }
                        c0292u.d();
                    }
                    C0285q c0285q2 = this.f4273z;
                    c0285q2.getClass();
                    Trace.beginSection("Compose:Composer.dispose");
                    try {
                        c0285q2.f4196b.o(c0285q2);
                        c0285q2.f4184D.f4104h.clear();
                        c0285q2.f4211r.clear();
                        c0285q2.f4199e.f4457h.J();
                        c0285q2.f4214u = null;
                        c0285q2.f4195a.clear();
                        Trace.endSection();
                    } catch (Throwable th2) {
                        Trace.endSection();
                        throw th2;
                    }
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        this.f4256h.p(this);
    }

    public final void b() {
        this.f4258j.set(null);
        this.f4265r.f4457h.J();
        this.f4266s.f4457h.J();
        C0735A c0735a = this.f4260l;
        if (!c0735a.f7962h.g()) {
            new ArrayList();
            new ArrayList();
            new ArrayList();
            new ArrayList();
            if (!c0735a.f7962h.g()) {
                Trace.beginSection("Compose:abandons");
                try {
                    Iterator it = c0735a.iterator();
                    while (((G2.h) ((G2.e) it).f1259j).hasNext()) {
                        A0 a02 = (A0) ((G2.h) ((G2.e) it).f1259j).next();
                        ((G2.e) it).remove();
                        a02.c();
                    }
                } finally {
                    Trace.endSection();
                }
            }
        }
    }

    @Override // J.r
    public final void c(y2.e eVar) {
        l((R.a) eVar);
    }

    public final void d(Object obj, boolean z3) {
        int i2;
        Object e3 = ((C0769y) this.f4262n.f165i).e(obj);
        if (e3 == null) {
            return;
        }
        boolean z4 = e3 instanceof C0736B;
        C0736B c0736b = this.f4263o;
        C0736B c0736b2 = this.f4264p;
        B.F f3 = this.f4267t;
        if (!z4) {
            C0291t0 c0291t0 = (C0291t0) e3;
            if (f3.D(obj, c0291t0) || c0291t0.c(obj) == 1) {
                return;
            }
            if (c0291t0.f4238g == null || z3) {
                c0736b.a(c0291t0);
                return;
            } else {
                c0736b2.a(c0291t0);
                return;
            }
        }
        C0736B c0736b3 = (C0736B) e3;
        Object[] objArr = c0736b3.f7965b;
        long[] jArr = c0736b3.f7964a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i3 = 0;
        while (true) {
            long j3 = jArr[i3];
            if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i4 = 8;
                int i5 = 8 - ((~(i3 - length)) >>> 31);
                int i6 = 0;
                while (i6 < i5) {
                    if ((j3 & 255) < 128) {
                        C0291t0 c0291t02 = (C0291t0) objArr[(i3 << 3) + i6];
                        if (!f3.D(obj, c0291t02) && c0291t02.c(obj) != 1) {
                            if (c0291t02.f4238g == null || z3) {
                                c0736b.a(c0291t02);
                            } else {
                                c0736b2.a(c0291t02);
                            }
                        }
                        i2 = 8;
                    } else {
                        i2 = i4;
                    }
                    j3 >>= i2;
                    i6++;
                    i4 = i2;
                }
                if (i5 != i4) {
                    return;
                }
            }
            if (i3 == length) {
                return;
            } else {
                i3++;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:103:0x0293, code lost:
    
        if (r5.c(r13) == false) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0277, code lost:
    
        if (r13.g() != false) goto L119;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e(java.util.Set r32, boolean r33) {
        /*
            Method dump skipped, instructions count: 1107
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: J.C0294v.e(java.util.Set, boolean):void");
    }

    public final void f() {
        synchronized (this.f4259k) {
            try {
                g(this.f4265r);
                o();
            } catch (Throwable th) {
                try {
                    try {
                        if (!this.f4260l.f7962h.g()) {
                            C0735A c0735a = this.f4260l;
                            new ArrayList();
                            new ArrayList();
                            new ArrayList();
                            new ArrayList();
                            if (!c0735a.f7962h.g()) {
                                Trace.beginSection("Compose:abandons");
                                try {
                                    Iterator it = c0735a.iterator();
                                    while (((G2.h) ((G2.e) it).f1259j).hasNext()) {
                                        A0 a02 = (A0) ((G2.h) ((G2.e) it).f1259j).next();
                                        ((G2.e) it).remove();
                                        a02.c();
                                    }
                                    Trace.endSection();
                                } catch (Throwable th2) {
                                    Trace.endSection();
                                    throw th2;
                                }
                            }
                        }
                        throw th;
                    } catch (Throwable th3) {
                        throw th3;
                    }
                } catch (Exception e3) {
                    b();
                    throw e3;
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:89:0x0174, code lost:
    
        if (((J.C0291t0) r12).b() == false) goto L73;
     */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0204  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void g(K.C0329a r32) {
        /*
            Method dump skipped, instructions count: 520
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: J.C0294v.g(K.a):void");
    }

    public final void h() {
        synchronized (this.f4259k) {
            try {
                if (this.f4266s.f4457h.M()) {
                    g(this.f4266s);
                }
            } catch (Throwable th) {
                try {
                    try {
                        if (!this.f4260l.f7962h.g()) {
                            C0735A c0735a = this.f4260l;
                            new ArrayList();
                            new ArrayList();
                            new ArrayList();
                            new ArrayList();
                            if (!c0735a.f7962h.g()) {
                                Trace.beginSection("Compose:abandons");
                                try {
                                    Iterator it = c0735a.iterator();
                                    while (((G2.h) ((G2.e) it).f1259j).hasNext()) {
                                        A0 a02 = (A0) ((G2.h) ((G2.e) it).f1259j).next();
                                        ((G2.e) it).remove();
                                        a02.c();
                                    }
                                    Trace.endSection();
                                } catch (Throwable th2) {
                                    Trace.endSection();
                                    throw th2;
                                }
                            }
                        }
                        throw th;
                    } catch (Exception e3) {
                        b();
                        throw e3;
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }
    }

    public final void i() {
        synchronized (this.f4259k) {
            try {
                this.f4273z.f4214u = null;
                if (!this.f4260l.f7962h.g()) {
                    C0735A c0735a = this.f4260l;
                    new ArrayList();
                    new ArrayList();
                    new ArrayList();
                    new ArrayList();
                    if (!c0735a.f7962h.g()) {
                        Trace.beginSection("Compose:abandons");
                        try {
                            Iterator it = c0735a.iterator();
                            while (((G2.h) ((G2.e) it).f1259j).hasNext()) {
                                A0 a02 = (A0) ((G2.h) ((G2.e) it).f1259j).next();
                                ((G2.e) it).remove();
                                a02.c();
                            }
                            Trace.endSection();
                        } finally {
                        }
                    }
                }
            } catch (Throwable th) {
                try {
                    try {
                        if (!this.f4260l.f7962h.g()) {
                            C0735A c0735a2 = this.f4260l;
                            new ArrayList();
                            new ArrayList();
                            new ArrayList();
                            new ArrayList();
                            if (!c0735a2.f7962h.g()) {
                                Trace.beginSection("Compose:abandons");
                                try {
                                    Iterator it2 = c0735a2.iterator();
                                    while (((G2.h) ((G2.e) it2).f1259j).hasNext()) {
                                        A0 a03 = (A0) ((G2.h) ((G2.e) it2).f1259j).next();
                                        ((G2.e) it2).remove();
                                        a03.c();
                                    }
                                    Trace.endSection();
                                } finally {
                                }
                            }
                        }
                        throw th;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                } catch (Exception e3) {
                    b();
                    throw e3;
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x00dd, code lost:
    
        if (r8.g() != false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00fc, code lost:
    
        r0 = 8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00f9, code lost:
    
        r1.h(r15);
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00f7, code lost:
    
        if (((j.C0769y) r13.f165i).b((J.F) r8) == false) goto L40;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void j() {
        /*
            Method dump skipped, instructions count: 438
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: J.C0294v.j():void");
    }

    public final void k(R.a aVar) {
        try {
            synchronized (this.f4259k) {
                n();
                B.F f3 = this.f4268u;
                this.f4268u = new B.F(10);
                try {
                    u();
                    C0285q c0285q = this.f4273z;
                    if (!c0285q.f4199e.f4457h.L()) {
                        C0257c.y("Expected applyChanges() to have been called");
                        throw null;
                    }
                    c0285q.p(f3, aVar);
                } catch (Exception e3) {
                    this.f4268u = f3;
                    throw e3;
                }
            }
        } catch (Throwable th) {
            try {
                if (!this.f4260l.f7962h.g()) {
                    C0735A c0735a = this.f4260l;
                    new ArrayList();
                    new ArrayList();
                    new ArrayList();
                    new ArrayList();
                    if (!c0735a.f7962h.g()) {
                        Trace.beginSection("Compose:abandons");
                        try {
                            Iterator it = c0735a.iterator();
                            while (((G2.h) ((G2.e) it).f1259j).hasNext()) {
                                A0 a02 = (A0) ((G2.h) ((G2.e) it).f1259j).next();
                                ((G2.e) it).remove();
                                a02.c();
                            }
                            Trace.endSection();
                        } catch (Throwable th2) {
                            Trace.endSection();
                            throw th2;
                        }
                    }
                }
                throw th;
            } catch (Exception e4) {
                b();
                throw e4;
            }
        }
    }

    public final void l(R.a aVar) {
        if (!this.f4255A) {
            this.f4256h.a(this, aVar);
        } else {
            C0257c.X("The composition is disposed");
            throw null;
        }
    }

    public final void m() {
        synchronized (this.f4259k) {
            try {
                boolean z3 = this.f4261m.f3999i > 0;
                try {
                    if (!z3) {
                        if (!this.f4260l.f7962h.g()) {
                        }
                        ((C0769y) this.f4262n.f165i).a();
                        ((C0769y) this.q.f165i).a();
                        ((C0769y) this.f4268u.f165i).a();
                        this.f4265r.f4457h.J();
                        this.f4266s.f4457h.J();
                        C0285q c0285q = this.f4273z;
                        c0285q.f4184D.f4104h.clear();
                        c0285q.f4211r.clear();
                        c0285q.f4199e.f4457h.J();
                        c0285q.f4214u = null;
                    }
                    C0292u c0292u = new C0292u(this.f4260l);
                    if (z3) {
                        this.f4257i.getClass();
                        G0 f3 = this.f4261m.f();
                        try {
                            C0257c.D(f3, c0292u);
                            f3.e(true);
                            this.f4257i.e();
                            c0292u.e();
                        } catch (Throwable th) {
                            f3.e(false);
                            throw th;
                        }
                    }
                    c0292u.d();
                    Trace.endSection();
                    ((C0769y) this.f4262n.f165i).a();
                    ((C0769y) this.q.f165i).a();
                    ((C0769y) this.f4268u.f165i).a();
                    this.f4265r.f4457h.J();
                    this.f4266s.f4457h.J();
                    C0285q c0285q2 = this.f4273z;
                    c0285q2.f4184D.f4104h.clear();
                    c0285q2.f4211r.clear();
                    c0285q2.f4199e.f4457h.J();
                    c0285q2.f4214u = null;
                } catch (Throwable th2) {
                    Trace.endSection();
                    throw th2;
                }
                Trace.beginSection("Compose:deactivate");
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public final void n() {
        AtomicReference atomicReference = this.f4258j;
        Object obj = C0257c.f4125g;
        Object andSet = atomicReference.getAndSet(obj);
        if (andSet != null) {
            if (z2.h.a(andSet, obj)) {
                C0257c.z("pending composition has not been applied");
                throw null;
            }
            if (andSet instanceof Set) {
                e((Set) andSet, true);
                return;
            }
            if (!(andSet instanceof Object[])) {
                C0257c.z("corrupt pendingModifications drain: " + atomicReference);
                throw null;
            }
            for (Set set : (Set[]) andSet) {
                e(set, true);
            }
        }
    }

    public final void o() {
        AtomicReference atomicReference = this.f4258j;
        Object andSet = atomicReference.getAndSet(null);
        if (z2.h.a(andSet, C0257c.f4125g)) {
            return;
        }
        if (andSet instanceof Set) {
            e((Set) andSet, false);
            return;
        }
        if (andSet instanceof Object[]) {
            for (Set set : (Set[]) andSet) {
                e(set, false);
            }
            return;
        }
        if (andSet == null) {
            C0257c.z("calling recordModificationsOf and applyChanges concurrently is not supported");
            throw null;
        }
        C0257c.z("corrupt pendingModifications drain: " + atomicReference);
        throw null;
    }

    public final void p(ArrayList arrayList) {
        int size = arrayList.size();
        boolean z3 = false;
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                z3 = true;
                break;
            }
            ((AbstractC0254a0) ((C0865g) arrayList.get(i2)).f8646h).getClass();
            if (!z2.h.a(null, this)) {
                break;
            } else {
                i2++;
            }
        }
        C0257c.T(z3);
        try {
            C0285q c0285q = this.f4273z;
            c0285q.getClass();
            try {
                c0285q.B(arrayList);
                c0285q.j();
            } catch (Throwable th) {
                c0285q.a();
                throw th;
            }
        } catch (Throwable th2) {
            C0735A c0735a = this.f4260l;
            try {
                if (!c0735a.f7962h.g()) {
                    new ArrayList();
                    new ArrayList();
                    new ArrayList();
                    new ArrayList();
                    if (!c0735a.f7962h.g()) {
                        Trace.beginSection("Compose:abandons");
                        try {
                            Iterator it = c0735a.iterator();
                            while (((G2.h) ((G2.e) it).f1259j).hasNext()) {
                                A0 a02 = (A0) ((G2.h) ((G2.e) it).f1259j).next();
                                ((G2.e) it).remove();
                                a02.c();
                            }
                            Trace.endSection();
                        } catch (Throwable th3) {
                            Trace.endSection();
                            throw th3;
                        }
                    }
                }
                throw th2;
            } catch (Exception e3) {
                b();
                throw e3;
            }
        }
    }

    public final int q(C0291t0 c0291t0, Object obj) {
        C0294v c0294v;
        int i2 = c0291t0.f4232a;
        if ((i2 & 2) != 0) {
            c0291t0.f4232a = i2 | 4;
        }
        C0255b c0255b = c0291t0.f4234c;
        if (c0255b != null && c0255b.a()) {
            if (!this.f4261m.g(c0255b)) {
                synchronized (this.f4259k) {
                    c0294v = this.f4270w;
                }
                if (c0294v != null) {
                    C0285q c0285q = c0294v.f4273z;
                    if (c0285q.E && c0285q.a0(c0291t0, obj)) {
                        return 4;
                    }
                }
                return 1;
            }
            if (c0291t0.f4235d != null) {
                return s(c0291t0, c0255b, obj);
            }
        }
        return 1;
    }

    public final void r() {
        C0294v c0294v;
        synchronized (this.f4259k) {
            try {
                for (Object obj : this.f4261m.f4000j) {
                    C0291t0 c0291t0 = obj instanceof C0291t0 ? (C0291t0) obj : null;
                    if (c0291t0 != null && (c0294v = c0291t0.f4233b) != null) {
                        c0294v.q(c0291t0, null);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final int s(C0291t0 c0291t0, C0255b c0255b, Object obj) {
        C0294v c0294v;
        int i2;
        synchronized (this.f4259k) {
            try {
                C0294v c0294v2 = this.f4270w;
                if (c0294v2 != null) {
                    E0 e02 = this.f4261m;
                    int i3 = this.f4271x;
                    if (!(!e02.f4003m)) {
                        C0257c.y("Writer is active");
                        throw null;
                    }
                    if (i3 < 0 || i3 >= e02.f3999i) {
                        C0257c.y("Invalid group index");
                        throw null;
                    }
                    if (e02.g(c0255b)) {
                        int j3 = C0257c.j(e02.f3998h, i3) + i3;
                        int i4 = c0255b.f4117a;
                        c0294v = (i3 <= i4 && i4 < j3) ? c0294v2 : null;
                    }
                    c0294v2 = null;
                }
                if (c0294v == null) {
                    C0285q c0285q = this.f4273z;
                    if (c0285q.E && c0285q.a0(c0291t0, obj)) {
                        return 4;
                    }
                    u();
                    if (obj == null) {
                        ((C0769y) this.f4268u.f165i).j(c0291t0, W.f4108l);
                    } else if (obj instanceof F) {
                        Object e3 = ((C0769y) this.f4268u.f165i).e(c0291t0);
                        if (e3 != null) {
                            if (e3 instanceof C0736B) {
                                C0736B c0736b = (C0736B) e3;
                                Object[] objArr = c0736b.f7965b;
                                long[] jArr = c0736b.f7964a;
                                int length = jArr.length - 2;
                                if (length >= 0) {
                                    int i5 = 0;
                                    loop0: while (true) {
                                        long j4 = jArr[i5];
                                        if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                                            int i6 = 8;
                                            int i7 = 8 - ((~(i5 - length)) >>> 31);
                                            int i8 = 0;
                                            while (i8 < i7) {
                                                if ((j4 & 255) >= 128) {
                                                    i2 = i6;
                                                } else {
                                                    if (objArr[(i5 << 3) + i8] == W.f4108l) {
                                                        break loop0;
                                                    }
                                                    i2 = 8;
                                                }
                                                j4 >>= i2;
                                                i8++;
                                                i6 = i2;
                                            }
                                            if (i7 != i6) {
                                                break;
                                            }
                                        }
                                        if (i5 == length) {
                                            break;
                                        }
                                        i5++;
                                    }
                                }
                            } else if (e3 == W.f4108l) {
                            }
                        }
                        this.f4268u.r(c0291t0, obj);
                    } else {
                        ((C0769y) this.f4268u.f165i).j(c0291t0, W.f4108l);
                    }
                }
                if (c0294v != null) {
                    return c0294v.s(c0291t0, c0255b, obj);
                }
                this.f4256h.i(this);
                return this.f4273z.E ? 3 : 2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void t(Object obj) {
        Object e3 = ((C0769y) this.f4262n.f165i).e(obj);
        if (e3 == null) {
            return;
        }
        boolean z3 = e3 instanceof C0736B;
        B.F f3 = this.f4267t;
        if (!z3) {
            C0291t0 c0291t0 = (C0291t0) e3;
            if (c0291t0.c(obj) == 4) {
                f3.r(obj, c0291t0);
                return;
            }
            return;
        }
        C0736B c0736b = (C0736B) e3;
        Object[] objArr = c0736b.f7965b;
        long[] jArr = c0736b.f7964a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i2 = 0;
        while (true) {
            long j3 = jArr[i2];
            if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i3 = 8 - ((~(i2 - length)) >>> 31);
                for (int i4 = 0; i4 < i3; i4++) {
                    if ((255 & j3) < 128) {
                        C0291t0 c0291t02 = (C0291t0) objArr[(i2 << 3) + i4];
                        if (c0291t02.c(obj) == 4) {
                            f3.r(obj, c0291t02);
                        }
                    }
                    j3 >>= 8;
                }
                if (i3 != 8) {
                    return;
                }
            }
            if (i2 == length) {
                return;
            } else {
                i2++;
            }
        }
    }

    public final void u() {
        if (this.f4272y.f4287a) {
            return;
        }
        this.f4256h.getClass();
        z2.h.a(null, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x005a, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean v(java.util.Set r19) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            boolean r2 = r1 instanceof L.f
            B.F r3 = r0.q
            B.F r4 = r0.f4262n
            r5 = 0
            r6 = 1
            if (r2 == 0) goto L66
            L.f r1 = (L.f) r1
            j.B r1 = r1.f4630h
            java.lang.Object[] r2 = r1.f7965b
            long[] r1 = r1.f7964a
            int r7 = r1.length
            int r7 = r7 + (-2)
            if (r7 < 0) goto L8b
            r8 = r5
        L1c:
            r9 = r1[r8]
            long r11 = ~r9
            r13 = 7
            long r11 = r11 << r13
            long r11 = r11 & r9
            r13 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r11 = r11 & r13
            int r11 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r11 == 0) goto L61
            int r11 = r8 - r7
            int r11 = ~r11
            int r11 = r11 >>> 31
            r12 = 8
            int r11 = 8 - r11
            r13 = r5
        L36:
            if (r13 >= r11) goto L5f
            r14 = 255(0xff, double:1.26E-321)
            long r14 = r14 & r9
            r16 = 128(0x80, double:6.3E-322)
            int r14 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r14 >= 0) goto L5b
            int r14 = r8 << 3
            int r14 = r14 + r13
            r14 = r2[r14]
            java.lang.Object r15 = r4.f165i
            j.y r15 = (j.C0769y) r15
            boolean r15 = r15.b(r14)
            if (r15 != 0) goto L5a
            java.lang.Object r15 = r3.f165i
            j.y r15 = (j.C0769y) r15
            boolean r14 = r15.b(r14)
            if (r14 == 0) goto L5b
        L5a:
            return r6
        L5b:
            long r9 = r9 >> r12
            int r13 = r13 + 1
            goto L36
        L5f:
            if (r11 != r12) goto L8b
        L61:
            if (r8 == r7) goto L8b
            int r8 = r8 + 1
            goto L1c
        L66:
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.Iterator r1 = r1.iterator()
        L6c:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L8b
            java.lang.Object r2 = r1.next()
            java.lang.Object r7 = r4.f165i
            j.y r7 = (j.C0769y) r7
            boolean r7 = r7.b(r2)
            if (r7 != 0) goto L8a
            java.lang.Object r7 = r3.f165i
            j.y r7 = (j.C0769y) r7
            boolean r2 = r7.b(r2)
            if (r2 == 0) goto L6c
        L8a:
            return r6
        L8b:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: J.C0294v.v(java.util.Set):boolean");
    }

    public final boolean w() {
        boolean E;
        synchronized (this.f4259k) {
            try {
                n();
                try {
                    B.F f3 = this.f4268u;
                    this.f4268u = new B.F(10);
                    try {
                        u();
                        E = this.f4273z.E(f3);
                        if (!E) {
                            o();
                        }
                    } catch (Exception e3) {
                        this.f4268u = f3;
                        throw e3;
                    }
                } catch (Throwable th) {
                    try {
                        if (!this.f4260l.f7962h.g()) {
                            C0735A c0735a = this.f4260l;
                            new ArrayList();
                            new ArrayList();
                            new ArrayList();
                            new ArrayList();
                            if (!c0735a.f7962h.g()) {
                                Trace.beginSection("Compose:abandons");
                                try {
                                    Iterator it = c0735a.iterator();
                                    while (((G2.h) ((G2.e) it).f1259j).hasNext()) {
                                        A0 a02 = (A0) ((G2.h) ((G2.e) it).f1259j).next();
                                        ((G2.e) it).remove();
                                        a02.c();
                                    }
                                    Trace.endSection();
                                } catch (Throwable th2) {
                                    Trace.endSection();
                                    throw th2;
                                }
                            }
                        }
                        throw th;
                    } catch (Exception e4) {
                        b();
                        throw e4;
                    }
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return E;
    }

    public final void x() {
        this.f4269v = true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r1v12, types: [java.util.Set[]] */
    public final void y(L.f fVar) {
        L.f fVar2;
        while (true) {
            Object obj = this.f4258j.get();
            if (obj == null || z2.h.a(obj, C0257c.f4125g)) {
                fVar2 = fVar;
            } else if (obj instanceof Set) {
                fVar2 = new Set[]{obj, fVar};
            } else {
                if (!(obj instanceof Object[])) {
                    throw new IllegalStateException(("corrupt pendingModifications: " + this.f4258j).toString());
                }
                Set[] setArr = (Set[]) obj;
                int length = setArr.length;
                ?? copyOf = Arrays.copyOf(setArr, length + 1);
                copyOf[length] = fVar;
                fVar2 = copyOf;
            }
            AtomicReference atomicReference = this.f4258j;
            while (!atomicReference.compareAndSet(obj, fVar2)) {
                if (atomicReference.get() != obj) {
                    break;
                }
            }
            if (obj == null) {
                synchronized (this.f4259k) {
                    o();
                }
                return;
            }
            return;
        }
    }

    public final void z(Object obj) {
        C0291t0 y3;
        boolean z3;
        boolean z4;
        int i2;
        int i3;
        C0285q c0285q = this.f4273z;
        if (c0285q.f4219z <= 0 && (y3 = c0285q.y()) != null) {
            boolean z5 = true;
            int i4 = y3.f4232a | 1;
            y3.f4232a = i4;
            if ((i4 & 32) == 0) {
                C0766v c0766v = y3.f4237f;
                if (c0766v == null) {
                    c0766v = new C0766v();
                    y3.f4237f = c0766v;
                }
                int i5 = y3.f4236e;
                int c3 = c0766v.c(obj);
                if (c3 < 0) {
                    c3 = ~c3;
                    i3 = -1;
                } else {
                    i3 = c0766v.f8053c[c3];
                }
                c0766v.f8052b[c3] = obj;
                c0766v.f8053c[c3] = i5;
                if (i3 == y3.f4236e) {
                    return;
                }
            }
            if (obj instanceof T.B) {
                ((T.B) obj).f(1);
            }
            this.f4262n.r(obj, y3);
            if (obj instanceof F) {
                F f3 = (F) obj;
                D h2 = f3.h();
                B.F f4 = this.q;
                f4.E(obj);
                C0766v c0766v2 = h2.f3976e;
                Object[] objArr = c0766v2.f8052b;
                long[] jArr = c0766v2.f8051a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i6 = 0;
                    while (true) {
                        long j3 = jArr[i6];
                        if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i7 = 8;
                            int i8 = 8 - ((~(i6 - length)) >>> 31);
                            int i9 = 0;
                            while (i9 < i8) {
                                if ((j3 & 255) < 128) {
                                    T.A a3 = (T.A) objArr[(i6 << 3) + i9];
                                    if (a3 instanceof T.B) {
                                        z4 = true;
                                        ((T.B) a3).f(1);
                                    } else {
                                        z4 = true;
                                    }
                                    f4.r(a3, obj);
                                    i2 = 8;
                                } else {
                                    z4 = z5;
                                    i2 = i7;
                                }
                                j3 >>= i2;
                                i9++;
                                i7 = i2;
                                z5 = z4;
                            }
                            z3 = z5;
                            if (i8 != i7) {
                                break;
                            }
                        } else {
                            z3 = z5;
                        }
                        if (i6 == length) {
                            break;
                        }
                        i6++;
                        z5 = z3;
                    }
                }
                Object obj2 = h2.f3977f;
                C0769y c0769y = y3.f4238g;
                if (c0769y == null) {
                    c0769y = new C0769y();
                    y3.f4238g = c0769y;
                }
                c0769y.j(f3, obj2);
            }
        }
    }
}
