package n;

import a0.EnumC0441r;
import a0.InterfaceC0426c;
import android.view.KeyEvent;
import java.util.Iterator;
import java.util.LinkedHashMap;
import l0.C0813a;
import m2.C0880v;
import n0.AbstractC0937p;
import n0.C0921D;
import n0.C0930i;
import n0.EnumC0931j;
import t0.AbstractC1256n;

/* renamed from: n.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0914w extends AbstractC1256n implements t0.k0, l0.d, InterfaceC0426c, t0.m0, t0.p0 {

    /* renamed from: N, reason: collision with root package name */
    public static final g0 f8866N = new g0(2);

    /* renamed from: A, reason: collision with root package name */
    public boolean f8867A;

    /* renamed from: B, reason: collision with root package name */
    public y2.a f8868B;

    /* renamed from: D, reason: collision with root package name */
    public final C0890I f8870D;
    public C0921D E;
    public C0882A F;

    /* renamed from: G, reason: collision with root package name */
    public r.n f8871G;

    /* renamed from: H, reason: collision with root package name */
    public r.h f8872H;

    /* renamed from: K, reason: collision with root package name */
    public r.l f8875K;

    /* renamed from: L, reason: collision with root package name */
    public boolean f8876L;

    /* renamed from: M, reason: collision with root package name */
    public final g0 f8877M;

    /* renamed from: w, reason: collision with root package name */
    public r.l f8878w;

    /* renamed from: x, reason: collision with root package name */
    public C0883B f8879x;

    /* renamed from: y, reason: collision with root package name */
    public String f8880y;

    /* renamed from: z, reason: collision with root package name */
    public A0.h f8881z;

    /* renamed from: C, reason: collision with root package name */
    public final C0886E f8869C = new C0886E();

    /* renamed from: I, reason: collision with root package name */
    public final LinkedHashMap f8873I = new LinkedHashMap();

    /* renamed from: J, reason: collision with root package name */
    public long f8874J = 0;

    public C0914w(r.l lVar, C0883B c0883b, boolean z3, String str, A0.h hVar, y2.a aVar) {
        this.f8878w = lVar;
        this.f8879x = c0883b;
        this.f8880y = str;
        this.f8881z = hVar;
        this.f8867A = z3;
        this.f8868B = aVar;
        this.f8870D = new C0890I(lVar);
        r.l lVar2 = this.f8878w;
        this.f8875K = lVar2;
        this.f8876L = lVar2 == null && this.f8879x != null;
        this.f8877M = f8866N;
    }

    @Override // V.n
    public final void C0() {
        if (!this.f8876L) {
            P0();
        }
        if (this.f8867A) {
            K0(this.f8869C);
            K0(this.f8870D);
        }
    }

    @Override // a0.InterfaceC0426c
    public final void D(EnumC0441r enumC0441r) {
        if (enumC0441r.a()) {
            P0();
        }
        if (this.f8867A) {
            this.f8870D.D(enumC0441r);
        }
    }

    @Override // V.n
    public final void D0() {
        O0();
        if (this.f8875K == null) {
            this.f8878w = null;
        }
        C0882A c0882a = this.F;
        if (c0882a != null) {
            L0(c0882a);
        }
        this.F = null;
    }

    public void N0(A0.k kVar) {
    }

    public final void O0() {
        r.l lVar = this.f8878w;
        LinkedHashMap linkedHashMap = this.f8873I;
        if (lVar != null) {
            r.n nVar = this.f8871G;
            if (nVar != null) {
                lVar.c(new r.m(nVar));
            }
            r.h hVar = this.f8872H;
            if (hVar != null) {
                lVar.c(new r.i(hVar));
            }
            Iterator it = linkedHashMap.values().iterator();
            while (it.hasNext()) {
                lVar.c(new r.m((r.n) it.next()));
            }
        }
        this.f8871G = null;
        this.f8872H = null;
        linkedHashMap.clear();
    }

    public final void P0() {
        if (this.F == null && this.f8879x != null) {
            if (this.f8878w == null) {
                this.f8878w = new r.l();
            }
            this.f8870D.N0(this.f8878w);
            r.l lVar = this.f8878w;
            z2.h.c(lVar);
            C0882A c0882a = new C0882A(lVar);
            K0(c0882a);
            this.F = c0882a;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0076, code lost:
    
        if (r3.F == null) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x007b, code lost:
    
        r4 = r3.F;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x007d, code lost:
    
        if (r4 != null) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0081, code lost:
    
        if (r3.f8876L != false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x008e, code lost:
    
        r0.N0(r3.f8878w);
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0093, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0083, code lost:
    
        if (r4 == null) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0085, code lost:
    
        L0(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0088, code lost:
    
        r3.F = null;
        P0();
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0079, code lost:
    
        if (r4 != false) goto L39;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Q0(r.l r4, n.C0883B r5, boolean r6, java.lang.String r7, A0.h r8, y2.a r9) {
        /*
            r3 = this;
            r.l r0 = r3.f8875K
            boolean r0 = z2.h.a(r0, r4)
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L13
            r3.O0()
            r3.f8875K = r4
            r3.f8878w = r4
            r4 = r2
            goto L14
        L13:
            r4 = r1
        L14:
            n.B r0 = r3.f8879x
            boolean r0 = z2.h.a(r0, r5)
            if (r0 != 0) goto L1f
            r3.f8879x = r5
            r4 = r2
        L1f:
            boolean r5 = r3.f8867A
            n.I r0 = r3.f8870D
            if (r5 == r6) goto L3e
            n.E r5 = r3.f8869C
            if (r6 == 0) goto L30
            r3.K0(r5)
            r3.K0(r0)
            goto L39
        L30:
            r3.L0(r5)
            r3.L0(r0)
            r3.O0()
        L39:
            t0.AbstractC1248f.p(r3)
            r3.f8867A = r6
        L3e:
            java.lang.String r5 = r3.f8880y
            boolean r5 = z2.h.a(r5, r7)
            if (r5 != 0) goto L4b
            r3.f8880y = r7
            t0.AbstractC1248f.p(r3)
        L4b:
            A0.h r5 = r3.f8881z
            boolean r5 = z2.h.a(r5, r8)
            if (r5 != 0) goto L58
            r3.f8881z = r8
            t0.AbstractC1248f.p(r3)
        L58:
            r3.f8868B = r9
            boolean r5 = r3.f8876L
            r.l r6 = r3.f8875K
            if (r6 != 0) goto L66
            n.B r7 = r3.f8879x
            if (r7 == 0) goto L66
            r7 = r2
            goto L67
        L66:
            r7 = r1
        L67:
            if (r5 == r7) goto L79
            if (r6 != 0) goto L70
            n.B r5 = r3.f8879x
            if (r5 == 0) goto L70
            r1 = r2
        L70:
            r3.f8876L = r1
            if (r1 != 0) goto L79
            n.A r5 = r3.F
            if (r5 != 0) goto L79
            goto L7b
        L79:
            if (r4 == 0) goto L8e
        L7b:
            n.A r4 = r3.F
            if (r4 != 0) goto L83
            boolean r5 = r3.f8876L
            if (r5 != 0) goto L8e
        L83:
            if (r4 == 0) goto L88
            r3.L0(r4)
        L88:
            r4 = 0
            r3.F = r4
            r3.P0()
        L8e:
            r.l r4 = r3.f8878w
            r0.N0(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: n.C0914w.Q0(r.l, n.B, boolean, java.lang.String, A0.h, y2.a):void");
    }

    @Override // t0.k0
    public final void Y() {
        r.h hVar;
        r.l lVar = this.f8878w;
        if (lVar != null && (hVar = this.f8872H) != null) {
            lVar.c(new r.i(hVar));
        }
        this.f8872H = null;
        C0921D c0921d = this.E;
        if (c0921d != null) {
            c0921d.Y();
        }
    }

    @Override // t0.m0
    public final boolean d0() {
        return true;
    }

    @Override // t0.m0
    public final void k(A0.k kVar) {
        A0.h hVar = this.f8881z;
        if (hVar != null) {
            A0.w.f(kVar, hVar.f30a);
        }
        String str = this.f8880y;
        B.y yVar = new B.y(28, this);
        F2.d[] dVarArr = A0.w.f123a;
        kVar.e(A0.j.f36b, new A0.a(str, yVar));
        if (this.f8867A) {
            this.f8870D.k(kVar);
        } else {
            kVar.e(A0.t.f103i, C0880v.f8657a);
        }
        N0(kVar);
    }

    @Override // l0.d
    public final boolean p(KeyEvent keyEvent) {
        return false;
    }

    @Override // l0.d
    public final boolean t(KeyEvent keyEvent) {
        int C3;
        P0();
        boolean z3 = this.f8867A;
        LinkedHashMap linkedHashMap = this.f8873I;
        if (z3) {
            int i2 = AbstractC0915x.f8892b;
            if (C1.y.r(l0.c.D(keyEvent), 2) && ((C3 = (int) (l0.c.C(keyEvent) >> 32)) == 23 || C3 == 66 || C3 == 160)) {
                if (linkedHashMap.containsKey(new C0813a(K1.f.d(keyEvent.getKeyCode())))) {
                    return false;
                }
                r.n nVar = new r.n(this.f8874J);
                linkedHashMap.put(new C0813a(K1.f.d(keyEvent.getKeyCode())), nVar);
                if (this.f8878w != null) {
                    J2.B.r(y0(), null, 0, new C0897e(this, nVar, null), 3);
                }
                return true;
            }
        }
        if (!this.f8867A) {
            return false;
        }
        int i3 = AbstractC0915x.f8892b;
        if (!C1.y.r(l0.c.D(keyEvent), 1)) {
            return false;
        }
        int C4 = (int) (l0.c.C(keyEvent) >> 32);
        if (C4 != 23 && C4 != 66 && C4 != 160) {
            return false;
        }
        r.n nVar2 = (r.n) linkedHashMap.remove(new C0813a(K1.f.d(keyEvent.getKeyCode())));
        if (nVar2 != null && this.f8878w != null) {
            J2.B.r(y0(), null, 0, new C0898f(this, nVar2, null), 3);
        }
        this.f8868B.c();
        return true;
    }

    @Override // t0.k0
    public final void t0(C0930i c0930i, EnumC0931j enumC0931j, long j3) {
        long j4 = ((j3 >> 33) << 32) | (((j3 << 32) >> 33) & 4294967295L);
        this.f8874J = K1.f.e((int) (j4 >> 32), (int) (j4 & 4294967295L));
        P0();
        if (this.f8867A && enumC0931j == EnumC0931j.f8947i) {
            int i2 = c0930i.f8945c;
            if (AbstractC0937p.d(i2, 4)) {
                J2.B.r(y0(), null, 0, new C0899g(this, null), 3);
            } else if (AbstractC0937p.d(i2, 5)) {
                J2.B.r(y0(), null, 0, new C0900h(this, null), 3);
            }
        }
        if (this.E == null) {
            C0901i c0901i = new C0901i(this, null);
            C0930i c0930i2 = n0.w.f8985a;
            C0921D c0921d = new C0921D(null, null, null, c0901i);
            K0(c0921d);
            this.E = c0921d;
        }
        C0921D c0921d2 = this.E;
        if (c0921d2 != null) {
            c0921d2.t0(c0930i, enumC0931j, j3);
        }
    }

    @Override // t0.p0
    public final Object w() {
        return this.f8877M;
    }

    @Override // V.n
    public final boolean z0() {
        return false;
    }
}
