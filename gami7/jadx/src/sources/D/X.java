package D;

import C0.C0019b;
import C0.C0021d;
import C0.C0024g;
import J.C0257c;
import J.C0274k0;
import a.AbstractC0423a;
import a0.C0438o;
import android.view.ActionMode;
import j0.InterfaceC0771a;
import java.util.ArrayList;
import n2.AbstractC0963o;
import u0.C1287h;
import u0.InterfaceC1288h0;
import u0.S0;
import z.EnumC1406F;
import z.EnumC1407G;
import z.p0;
import z.q0;
import z.r0;

/* loaded from: classes.dex */
public final class X {

    /* renamed from: a, reason: collision with root package name */
    public final q0 f780a;

    /* renamed from: b, reason: collision with root package name */
    public I0.s f781b = r0.f11804a;

    /* renamed from: c, reason: collision with root package name */
    public y2.c f782c = F.f728l;

    /* renamed from: d, reason: collision with root package name */
    public z.S f783d;

    /* renamed from: e, reason: collision with root package name */
    public final C0274k0 f784e;

    /* renamed from: f, reason: collision with root package name */
    public I0.I f785f;

    /* renamed from: g, reason: collision with root package name */
    public InterfaceC1288h0 f786g;

    /* renamed from: h, reason: collision with root package name */
    public S0 f787h;

    /* renamed from: i, reason: collision with root package name */
    public InterfaceC0771a f788i;

    /* renamed from: j, reason: collision with root package name */
    public C0438o f789j;

    /* renamed from: k, reason: collision with root package name */
    public final C0274k0 f790k;

    /* renamed from: l, reason: collision with root package name */
    public final C0274k0 f791l;

    /* renamed from: m, reason: collision with root package name */
    public long f792m;

    /* renamed from: n, reason: collision with root package name */
    public Integer f793n;

    /* renamed from: o, reason: collision with root package name */
    public long f794o;

    /* renamed from: p, reason: collision with root package name */
    public final C0274k0 f795p;
    public final C0274k0 q;

    /* renamed from: r, reason: collision with root package name */
    public int f796r;

    /* renamed from: s, reason: collision with root package name */
    public I0.z f797s;

    /* renamed from: t, reason: collision with root package name */
    public S f798t;

    /* renamed from: u, reason: collision with root package name */
    public final U f799u;

    /* renamed from: v, reason: collision with root package name */
    public final B.F f800v;

    public X(q0 q0Var) {
        this.f780a = q0Var;
        I0.z zVar = new I0.z((String) null, 0L, 7);
        J.W w2 = J.W.f4109m;
        this.f784e = C0257c.N(zVar, w2);
        this.f785f = I0.H.f3866h;
        Boolean bool = Boolean.TRUE;
        this.f790k = C0257c.N(bool, w2);
        this.f791l = C0257c.N(bool, w2);
        this.f792m = 0L;
        this.f794o = 0L;
        this.f795p = C0257c.N(null, w2);
        this.q = C0257c.N(null, w2);
        this.f796r = -1;
        this.f797s = new I0.z((String) null, 0L, 7);
        this.f799u = new U(this, 1);
        this.f800v = new B.F(3, this);
    }

    public static final void a(X x2, b0.c cVar) {
        x2.q.setValue(cVar);
    }

    public static final void b(X x2, EnumC1406F enumC1406F) {
        x2.f795p.setValue(enumC1406F);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r10v1 D.S, still in use, count: 2, list:
          (r10v1 D.S) from 0x008c: MOVE (r20v0 D.S) = (r10v1 D.S)
          (r10v1 D.S) from 0x0067: MOVE (r20v2 D.S) = (r10v1 D.S)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:91)
        	at jadx.core.utils.InsnRemover.addAndUnbind(InsnRemover.java:57)
        	at jadx.core.dex.visitors.ModVisitor.removeStep(ModVisitor.java:447)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
        */
    public static final long c(D.X r21, I0.z r22, long r23, boolean r25, boolean r26, C0.E r27, boolean r28) {
        /*
            Method dump skipped, instructions count: 448
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: D.X.c(D.X, I0.z, long, boolean, boolean, C0.E, boolean):long");
    }

    public static I0.z e(C0024g c0024g, long j3) {
        return new I0.z(c0024g, j3, (C0.J) null);
    }

    public final void d(boolean z3) {
        if (C0.J.b(l().f3933b)) {
            return;
        }
        InterfaceC1288h0 interfaceC1288h0 = this.f786g;
        if (interfaceC1288h0 != null) {
            ((C1287h) interfaceC1288h0).a(B1.C.U(l()));
        }
        if (z3) {
            int d3 = C0.J.d(l().f3933b);
            this.f782c.l(e(l().f3932a, B1.C.j(d3, d3)));
            r(EnumC1407G.f11511h);
        }
    }

    public final void f() {
        if (C0.J.b(l().f3933b)) {
            return;
        }
        InterfaceC1288h0 interfaceC1288h0 = this.f786g;
        if (interfaceC1288h0 != null) {
            ((C1287h) interfaceC1288h0).a(B1.C.U(l()));
        }
        C0024g a02 = B1.C.a0(l(), l().f3932a.f500a.length());
        C0024g Z2 = B1.C.Z(l(), l().f3932a.f500a.length());
        C0021d c0021d = new C0021d(a02);
        c0021d.b(Z2);
        C0024g c3 = c0021d.c();
        int e3 = C0.J.e(l().f3933b);
        this.f782c.l(e(c3, B1.C.j(e3, e3)));
        r(EnumC1407G.f11511h);
        q0 q0Var = this.f780a;
        if (q0Var != null) {
            q0Var.f11798f = true;
        }
    }

    public final void g(b0.c cVar) {
        if (!C0.J.b(l().f3933b)) {
            z.S s3 = this.f783d;
            p0 d3 = s3 != null ? s3.d() : null;
            int d4 = (cVar == null || d3 == null) ? C0.J.d(l().f3933b) : this.f781b.i(d3.b(cVar.f7058a, true));
            this.f782c.l(I0.z.a(l(), null, B1.C.j(d4, d4), 5));
        }
        r((cVar == null || l().f3932a.f500a.length() <= 0) ? EnumC1407G.f11511h : EnumC1407G.f11513j);
        t(false);
    }

    public final void h(boolean z3) {
        C0438o c0438o;
        z.S s3 = this.f783d;
        if (s3 != null && !s3.b() && (c0438o = this.f789j) != null) {
            c0438o.b();
        }
        this.f797s = l();
        t(z3);
        r(EnumC1407G.f11512i);
    }

    public final b0.c i() {
        return (b0.c) this.q.getValue();
    }

    public final boolean j() {
        return ((Boolean) this.f791l.getValue()).booleanValue();
    }

    public final long k(boolean z3) {
        p0 d3;
        C0.H h2;
        long j3;
        z.Z z4;
        z.S s3 = this.f783d;
        if (s3 == null || (d3 = s3.d()) == null || (h2 = d3.f11788a) == null) {
            return 9205357640488583168L;
        }
        z.S s4 = this.f783d;
        C0024g c0024g = (s4 == null || (z4 = s4.f11543a) == null) ? null : z4.f11605a;
        if (c0024g == null) {
            return 9205357640488583168L;
        }
        if (!z2.h.a(c0024g.f500a, h2.f461a.f451a.f500a)) {
            return 9205357640488583168L;
        }
        I0.z l3 = l();
        if (z3) {
            long j4 = l3.f3933b;
            int i2 = C0.J.f472c;
            j3 = j4 >> 32;
        } else {
            long j5 = l3.f3933b;
            int i3 = C0.J.f472c;
            j3 = j5 & 4294967295L;
        }
        int l4 = this.f781b.l((int) j3);
        boolean f3 = C0.J.f(l().f3933b);
        int e3 = h2.e(l4);
        C0.o oVar = h2.f462b;
        if (e3 >= oVar.f528f) {
            return 9205357640488583168L;
        }
        boolean z5 = h2.a(((!z3 || f3) && (z3 || !f3)) ? Math.max(l4 + (-1), 0) : l4) == h2.i(l4);
        oVar.j(l4);
        int length = ((C0024g) oVar.f523a.f5277a).f500a.length();
        ArrayList arrayList = oVar.f530h;
        C0.q qVar = (C0.q) arrayList.get(l4 == length ? AbstractC0963o.u(arrayList) : AbstractC0423a.G(l4, arrayList));
        C0019b c0019b = qVar.f533a;
        int b3 = qVar.b(l4);
        D0.D d4 = c0019b.f485d;
        float h3 = z5 ? d4.h(b3, false) : d4.i(b3, false);
        long j6 = h2.f463c;
        return K1.f.e(B1.C.B(h3, 0.0f, (int) (j6 >> 32)), B1.C.B(oVar.b(e3), 0.0f, (int) (j6 & 4294967295L)));
    }

    public final I0.z l() {
        return (I0.z) this.f784e.getValue();
    }

    public final void m() {
        S0 s02 = this.f787h;
        if (s02 == null || ((u0.V) s02).f10984d != 1 || s02 == null) {
            return;
        }
        u0.V v3 = (u0.V) s02;
        v3.f10984d = 2;
        ActionMode actionMode = v3.f10982b;
        if (actionMode != null) {
            actionMode.finish();
        }
        v3.f10982b = null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:150:0x00c6, code lost:
    
        r16 = r2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void n() {
        /*
            Method dump skipped, instructions count: 710
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: D.X.n():void");
    }

    public final void o() {
        I0.z e3 = e(l().f3932a, B1.C.j(0, l().f3932a.f500a.length()));
        this.f782c.l(e3);
        this.f797s = I0.z.a(this.f797s, null, e3.f3933b, 5);
        h(true);
    }

    public final void p(boolean z3) {
        this.f790k.setValue(Boolean.valueOf(z3));
    }

    public final void q(boolean z3) {
        this.f791l.setValue(Boolean.valueOf(z3));
    }

    public final void r(EnumC1407G enumC1407G) {
        z.S s3 = this.f783d;
        if (s3 != null) {
            if (s3.a() == enumC1407G) {
                s3 = null;
            }
            if (s3 != null) {
                s3.f11553k.setValue(enumC1407G);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:71:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01b3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void s() {
        /*
            Method dump skipped, instructions count: 439
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: D.X.s():void");
    }

    public final void t(boolean z3) {
        z.S s3 = this.f783d;
        if (s3 != null) {
            s3.f11554l.setValue(Boolean.valueOf(z3));
        }
        if (z3) {
            s();
        } else {
            m();
        }
    }
}
