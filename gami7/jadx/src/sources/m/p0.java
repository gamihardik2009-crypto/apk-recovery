package m;

import D.C0053w;
import H.C0157n1;
import J.AbstractC0253a;
import J.C0257c;
import J.C0270i0;
import J.C0274k0;
import J.C0275l;
import J.C0285q;
import J.C0291t0;
import J.C0302z;
import J.J0;
import J2.InterfaceC0328z;
import l.C0807p;

/* loaded from: classes.dex */
public final class p0 {

    /* renamed from: a, reason: collision with root package name */
    public final G.s f8547a;

    /* renamed from: b, reason: collision with root package name */
    public final p0 f8548b;

    /* renamed from: c, reason: collision with root package name */
    public final String f8549c;

    /* renamed from: d, reason: collision with root package name */
    public final C0274k0 f8550d;

    /* renamed from: e, reason: collision with root package name */
    public final C0274k0 f8551e;

    /* renamed from: f, reason: collision with root package name */
    public final C0270i0 f8552f;

    /* renamed from: g, reason: collision with root package name */
    public final C0270i0 f8553g;

    /* renamed from: h, reason: collision with root package name */
    public final C0274k0 f8554h;

    /* renamed from: i, reason: collision with root package name */
    public final T.r f8555i;

    /* renamed from: j, reason: collision with root package name */
    public final T.r f8556j;

    /* renamed from: k, reason: collision with root package name */
    public final C0274k0 f8557k;

    /* renamed from: l, reason: collision with root package name */
    public long f8558l;

    /* renamed from: m, reason: collision with root package name */
    public final J.F f8559m;

    public p0(G.s sVar, p0 p0Var, String str) {
        this.f8547a = sVar;
        this.f8548b = p0Var;
        this.f8549c = str;
        Object g3 = sVar.g();
        J.W w2 = J.W.f4109m;
        this.f8550d = C0257c.N(g3, w2);
        this.f8551e = C0257c.N(new l0(sVar.g(), sVar.g()), w2);
        int i2 = AbstractC0253a.f4116b;
        this.f8552f = new C0270i0(0L);
        this.f8553g = new C0270i0(Long.MIN_VALUE);
        Boolean bool = Boolean.FALSE;
        this.f8554h = C0257c.N(bool, w2);
        this.f8555i = new T.r();
        this.f8556j = new T.r();
        this.f8557k = C0257c.N(bool, w2);
        this.f8559m = C0257c.F(new C0807p(this, 1));
        sVar.k(this);
    }

    public final void a(Object obj, C0285q c0285q, int i2) {
        int i3;
        c0285q.W(-1493585151);
        if ((i2 & 6) == 0) {
            i3 = ((i2 & 8) == 0 ? c0285q.g(obj) : c0285q.i(obj) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= c0285q.g(this) ? 32 : 16;
        }
        if ((i3 & 19) == 18 && c0285q.A()) {
            c0285q.P();
        } else if (g()) {
            c0285q.U(1823861403);
            c0285q.r(false);
        } else {
            c0285q.U(1822376658);
            q(obj);
            if (z2.h.a(obj, this.f8547a.g())) {
                C0270i0 c0270i0 = this.f8553g;
                if (((J0) T.n.t(c0270i0.f4146i, c0270i0)).f4040c == Long.MIN_VALUE && !((Boolean) this.f8554h.getValue()).booleanValue()) {
                    c0285q.U(1823851483);
                    c0285q.r(false);
                    c0285q.r(false);
                }
            }
            c0285q.U(1822607949);
            Object K3 = c0285q.K();
            J.W w2 = C0275l.f4150a;
            if (K3 == w2) {
                C0302z c0302z = new C0302z(C0257c.B(c0285q));
                c0285q.e0(c0302z);
                K3 = c0302z;
            }
            InterfaceC0328z interfaceC0328z = ((C0302z) K3).f4298h;
            boolean i4 = ((i3 & 112) == 32) | c0285q.i(interfaceC0328z);
            Object K4 = c0285q.K();
            if (i4 || K4 == w2) {
                K4 = new C0053w(interfaceC0328z, 20, this);
                c0285q.e0(K4);
            }
            C0257c.c(interfaceC0328z, this, (y2.c) K4, c0285q);
            c0285q.r(false);
            c0285q.r(false);
        }
        C0291t0 t3 = c0285q.t();
        if (t3 != null) {
            t3.f4235d = new C0157n1(i2, 6, this, obj);
        }
    }

    public final long b() {
        T.r rVar = this.f8555i;
        int size = rVar.size();
        long j3 = 0;
        for (int i2 = 0; i2 < size; i2++) {
            C0270i0 c0270i0 = ((m0) rVar.get(i2)).f8529s;
            j3 = Math.max(j3, ((J0) T.n.t(c0270i0.f4146i, c0270i0)).f4040c);
        }
        T.r rVar2 = this.f8556j;
        int size2 = rVar2.size();
        for (int i3 = 0; i3 < size2; i3++) {
            j3 = Math.max(j3, ((p0) rVar2.get(i3)).b());
        }
        return j3;
    }

    public final void c() {
        T.r rVar = this.f8555i;
        int size = rVar.size();
        for (int i2 = 0; i2 < size; i2++) {
            m0 m0Var = (m0) rVar.get(i2);
            m0Var.f8524m = null;
            m0Var.f8523l = null;
            m0Var.f8527p = false;
        }
        T.r rVar2 = this.f8556j;
        int size2 = rVar2.size();
        for (int i3 = 0; i3 < size2; i3++) {
            ((p0) rVar2.get(i3)).c();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x002d, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean d() {
        /*
            r5 = this;
            T.r r0 = r5.f8555i
            int r1 = r0.size()
            r2 = 0
            r3 = r2
        L8:
            if (r3 >= r1) goto L18
            java.lang.Object r4 = r0.get(r3)
            m.m0 r4 = (m.m0) r4
            m.K r4 = r4.f8523l
            if (r4 == 0) goto L15
            goto L2d
        L15:
            int r3 = r3 + 1
            goto L8
        L18:
            T.r r0 = r5.f8556j
            int r1 = r0.size()
            r3 = r2
        L1f:
            if (r3 >= r1) goto L32
            java.lang.Object r4 = r0.get(r3)
            m.p0 r4 = (m.p0) r4
            boolean r4 = r4.d()
            if (r4 == 0) goto L2f
        L2d:
            r2 = 1
            goto L32
        L2f:
            int r3 = r3 + 1
            goto L1f
        L32:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: m.p0.d():boolean");
    }

    public final long e() {
        p0 p0Var = this.f8548b;
        if (p0Var != null) {
            return p0Var.e();
        }
        C0270i0 c0270i0 = this.f8552f;
        return ((J0) T.n.t(c0270i0.f4146i, c0270i0)).f4040c;
    }

    public final k0 f() {
        return (k0) this.f8551e.getValue();
    }

    public final boolean g() {
        return ((Boolean) this.f8557k.getValue()).booleanValue();
    }

    public final void h(long j3, boolean z3) {
        C0270i0 c0270i0 = this.f8553g;
        long j4 = ((J0) T.n.t(c0270i0.f4146i, c0270i0)).f4040c;
        G.s sVar = this.f8547a;
        if (j4 == Long.MIN_VALUE) {
            c0270i0.g(j3);
            ((C0274k0) sVar.f1200h).setValue(Boolean.TRUE);
        } else if (!((Boolean) ((C0274k0) sVar.f1200h).getValue()).booleanValue()) {
            ((C0274k0) sVar.f1200h).setValue(Boolean.TRUE);
        }
        this.f8554h.setValue(Boolean.FALSE);
        T.r rVar = this.f8555i;
        int size = rVar.size();
        boolean z4 = true;
        for (int i2 = 0; i2 < size; i2++) {
            m0 m0Var = (m0) rVar.get(i2);
            boolean booleanValue = ((Boolean) m0Var.f8525n.getValue()).booleanValue();
            C0274k0 c0274k0 = m0Var.f8525n;
            if (!booleanValue) {
                long c3 = z3 ? m0Var.a().c() : j3;
                m0Var.e(m0Var.a().b(c3));
                m0Var.f8528r = m0Var.a().g(c3);
                if (m0Var.a().f(c3)) {
                    c0274k0.setValue(Boolean.TRUE);
                }
            }
            if (!((Boolean) c0274k0.getValue()).booleanValue()) {
                z4 = false;
            }
        }
        T.r rVar2 = this.f8556j;
        int size2 = rVar2.size();
        for (int i3 = 0; i3 < size2; i3++) {
            p0 p0Var = (p0) rVar2.get(i3);
            Object value = p0Var.f8550d.getValue();
            G.s sVar2 = p0Var.f8547a;
            if (!z2.h.a(value, sVar2.g())) {
                p0Var.h(j3, z3);
            }
            if (!z2.h.a(p0Var.f8550d.getValue(), sVar2.g())) {
                z4 = false;
            }
        }
        if (z4) {
            i();
        }
    }

    public final void i() {
        this.f8553g.g(Long.MIN_VALUE);
        G.s sVar = this.f8547a;
        if (sVar instanceof G) {
            sVar.j(this.f8550d.getValue());
        }
        o(0L);
        ((C0274k0) sVar.f1200h).setValue(Boolean.FALSE);
        T.r rVar = this.f8556j;
        int size = rVar.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((p0) rVar.get(i2)).i();
        }
    }

    public final void j(float f3) {
        T.r rVar = this.f8555i;
        int size = rVar.size();
        for (int i2 = 0; i2 < size; i2++) {
            m0 m0Var = (m0) rVar.get(i2);
            m0Var.getClass();
            if (f3 == -4.0f || f3 == -5.0f) {
                h0 h0Var = m0Var.f8524m;
                if (h0Var != null) {
                    m0Var.a().h(h0Var.f8491c);
                    m0Var.f8523l = null;
                    m0Var.f8524m = null;
                }
                Object obj = f3 == -4.0f ? m0Var.a().f8492d : m0Var.a().f8491c;
                m0Var.a().h(obj);
                m0Var.a().i(obj);
                m0Var.e(obj);
                m0Var.f8529s.g(m0Var.a().c());
            } else {
                m0Var.f8526o.h(f3);
            }
        }
        T.r rVar2 = this.f8556j;
        int size2 = rVar2.size();
        for (int i3 = 0; i3 < size2; i3++) {
            ((p0) rVar2.get(i3)).j(f3);
        }
    }

    public final void k() {
        T.r rVar = this.f8555i;
        int size = rVar.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((m0) rVar.get(i2)).f8526o.h(-2.0f);
        }
        T.r rVar2 = this.f8556j;
        int size2 = rVar2.size();
        for (int i3 = 0; i3 < size2; i3++) {
            ((p0) rVar2.get(i3)).k();
        }
    }

    public final void l(Object obj, Object obj2, long j3) {
        this.f8553g.g(Long.MIN_VALUE);
        Boolean bool = Boolean.FALSE;
        G.s sVar = this.f8547a;
        ((C0274k0) sVar.f1200h).setValue(bool);
        boolean g3 = g();
        C0274k0 c0274k0 = this.f8550d;
        if (!g3 || !z2.h.a(sVar.g(), obj) || !z2.h.a(c0274k0.getValue(), obj2)) {
            if (!z2.h.a(sVar.g(), obj) && (sVar instanceof G)) {
                sVar.j(obj);
            }
            c0274k0.setValue(obj2);
            this.f8557k.setValue(Boolean.TRUE);
            this.f8551e.setValue(new l0(obj, obj2));
        }
        T.r rVar = this.f8556j;
        int size = rVar.size();
        for (int i2 = 0; i2 < size; i2++) {
            p0 p0Var = (p0) rVar.get(i2);
            z2.h.d(p0Var, "null cannot be cast to non-null type androidx.compose.animation.core.Transition<kotlin.Any>");
            if (p0Var.g()) {
                p0Var.l(p0Var.f8547a.g(), p0Var.f8550d.getValue(), j3);
            }
        }
        T.r rVar2 = this.f8555i;
        int size2 = rVar2.size();
        for (int i3 = 0; i3 < size2; i3++) {
            ((m0) rVar2.get(i3)).d(j3);
        }
        this.f8558l = j3;
    }

    public final void m(long j3) {
        C0270i0 c0270i0 = this.f8553g;
        if (((J0) T.n.t(c0270i0.f4146i, c0270i0)).f4040c == Long.MIN_VALUE) {
            c0270i0.g(j3);
        }
        o(j3);
        this.f8554h.setValue(Boolean.FALSE);
        T.r rVar = this.f8555i;
        int size = rVar.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((m0) rVar.get(i2)).d(j3);
        }
        T.r rVar2 = this.f8556j;
        int size2 = rVar2.size();
        for (int i3 = 0; i3 < size2; i3++) {
            p0 p0Var = (p0) rVar2.get(i3);
            if (!z2.h.a(p0Var.f8550d.getValue(), p0Var.f8547a.g())) {
                p0Var.m(j3);
            }
        }
    }

    public final void n(K k3) {
        T.r rVar = this.f8555i;
        int size = rVar.size();
        for (int i2 = 0; i2 < size; i2++) {
            m0 m0Var = (m0) rVar.get(i2);
            if (!z2.h.a(m0Var.a().f8491c, m0Var.a().f8492d)) {
                m0Var.f8524m = m0Var.a();
                m0Var.f8523l = k3;
            }
            C0274k0 c0274k0 = m0Var.q;
            m0Var.f8522k.setValue(new h0(m0Var.f8531u, m0Var.f8519h, c0274k0.getValue(), c0274k0.getValue(), m0Var.f8528r.c()));
            m0Var.f8529s.g(m0Var.a().c());
            m0Var.f8527p = true;
        }
        T.r rVar2 = this.f8556j;
        int size2 = rVar2.size();
        for (int i3 = 0; i3 < size2; i3++) {
            ((p0) rVar2.get(i3)).n(k3);
        }
    }

    public final void o(long j3) {
        if (this.f8548b == null) {
            this.f8552f.g(j3);
        }
    }

    public final void p() {
        h0 h0Var;
        T.r rVar = this.f8555i;
        int size = rVar.size();
        for (int i2 = 0; i2 < size; i2++) {
            m0 m0Var = (m0) rVar.get(i2);
            K k3 = m0Var.f8523l;
            if (k3 != null && (h0Var = m0Var.f8524m) != null) {
                long E = B2.a.E(k3.f8324g * k3.f8321d);
                Object b3 = h0Var.b(E);
                if (m0Var.f8527p) {
                    m0Var.a().i(b3);
                }
                m0Var.a().h(b3);
                m0Var.f8529s.g(m0Var.a().c());
                if (m0Var.f8526o.g() == -2.0f || m0Var.f8527p) {
                    m0Var.e(b3);
                } else {
                    m0Var.d(m0Var.f8532v.e());
                }
                if (E >= k3.f8324g) {
                    m0Var.f8523l = null;
                    m0Var.f8524m = null;
                } else {
                    k3.f8320c = false;
                }
            }
        }
        T.r rVar2 = this.f8556j;
        int size2 = rVar2.size();
        for (int i3 = 0; i3 < size2; i3++) {
            ((p0) rVar2.get(i3)).p();
        }
    }

    public final void q(Object obj) {
        C0274k0 c0274k0 = this.f8550d;
        if (z2.h.a(c0274k0.getValue(), obj)) {
            return;
        }
        this.f8551e.setValue(new l0(c0274k0.getValue(), obj));
        G.s sVar = this.f8547a;
        if (!z2.h.a(sVar.g(), c0274k0.getValue())) {
            sVar.j(c0274k0.getValue());
        }
        c0274k0.setValue(obj);
        C0270i0 c0270i0 = this.f8553g;
        if (((J0) T.n.t(c0270i0.f4146i, c0270i0)).f4040c == Long.MIN_VALUE) {
            this.f8554h.setValue(Boolean.TRUE);
        }
        k();
    }

    public final String toString() {
        T.r rVar = this.f8555i;
        int size = rVar.size();
        String str = "Transition animation values: ";
        for (int i2 = 0; i2 < size; i2++) {
            str = str + ((m0) rVar.get(i2)) + ", ";
        }
        return str;
    }
}
