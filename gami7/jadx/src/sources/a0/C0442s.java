package a0;

import D.S;
import D.c0;
import J.C0292u;
import j.C0769y;
import n2.AbstractC0946A;
import s0.InterfaceC1191e;
import t0.AbstractC1248f;
import t0.AbstractC1256n;
import t0.C1236E;
import t0.InterfaceC1254l;
import t0.Z;
import t0.b0;
import t0.f0;
import t0.n0;
import u0.C1314v;

/* renamed from: a0.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0442s extends V.n implements InterfaceC1254l, b0, InterfaceC1191e {

    /* renamed from: u, reason: collision with root package name */
    public boolean f6492u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f6493v;

    /* renamed from: w, reason: collision with root package name */
    public EnumC0441r f6494w;

    public static final boolean M0(C0442s c0442s) {
        V.n nVar = c0442s.f5858h;
        if (!nVar.f5869t) {
            AbstractC0946A.r("visitSubtreeIf called on an unattached node");
            throw null;
        }
        L.d dVar = new L.d(new V.n[16]);
        V.n nVar2 = nVar.f5863m;
        if (nVar2 == null) {
            AbstractC1248f.b(dVar, nVar);
        } else {
            dVar.b(nVar2);
        }
        while (dVar.l()) {
            V.n nVar3 = (V.n) dVar.n(dVar.f4620j - 1);
            if ((nVar3.f5861k & 1024) != 0) {
                for (V.n nVar4 = nVar3; nVar4 != null; nVar4 = nVar4.f5863m) {
                    if ((nVar4.f5860j & 1024) != 0) {
                        L.d dVar2 = null;
                        V.n nVar5 = nVar4;
                        while (nVar5 != null) {
                            if (nVar5 instanceof C0442s) {
                                C0442s c0442s2 = (C0442s) nVar5;
                                if (c0442s2.f6494w != null) {
                                    int ordinal = c0442s2.L0().ordinal();
                                    if (ordinal == 0 || ordinal == 1 || ordinal == 2) {
                                        return true;
                                    }
                                    if (ordinal == 3) {
                                        return false;
                                    }
                                    throw new J2.r();
                                }
                            } else if ((nVar5.f5860j & 1024) != 0 && (nVar5 instanceof AbstractC1256n)) {
                                int i2 = 0;
                                for (V.n nVar6 = ((AbstractC1256n) nVar5).f10608v; nVar6 != null; nVar6 = nVar6.f5863m) {
                                    if ((nVar6.f5860j & 1024) != 0) {
                                        i2++;
                                        if (i2 == 1) {
                                            nVar5 = nVar6;
                                        } else {
                                            if (dVar2 == null) {
                                                dVar2 = new L.d(new V.n[16]);
                                            }
                                            if (nVar5 != null) {
                                                dVar2.b(nVar5);
                                                nVar5 = null;
                                            }
                                            dVar2.b(nVar6);
                                        }
                                    }
                                }
                                if (i2 == 1) {
                                }
                            }
                            nVar5 = AbstractC1248f.f(dVar2);
                        }
                    }
                }
            }
            AbstractC1248f.b(dVar, nVar3);
        }
        return false;
    }

    public static final boolean N0(C0442s c0442s) {
        C0292u c0292u;
        V.n nVar = c0442s.f5858h;
        if (!nVar.f5869t) {
            throw new IllegalStateException("visitAncestors called on an unattached node".toString());
        }
        V.n nVar2 = nVar.f5862l;
        C1236E v3 = AbstractC1248f.v(c0442s);
        while (v3 != null) {
            if ((((V.n) v3.f10378C.f4244f).f5861k & 1024) != 0) {
                while (nVar2 != null) {
                    if ((nVar2.f5860j & 1024) != 0) {
                        V.n nVar3 = nVar2;
                        L.d dVar = null;
                        while (nVar3 != null) {
                            if (nVar3 instanceof C0442s) {
                                C0442s c0442s2 = (C0442s) nVar3;
                                if (c0442s2.f6494w != null) {
                                    int ordinal = c0442s2.L0().ordinal();
                                    if (ordinal == 0) {
                                        return false;
                                    }
                                    if (ordinal == 1) {
                                        return true;
                                    }
                                    if (ordinal == 2 || ordinal == 3) {
                                        return false;
                                    }
                                    throw new J2.r();
                                }
                            } else if ((nVar3.f5860j & 1024) != 0 && (nVar3 instanceof AbstractC1256n)) {
                                int i2 = 0;
                                for (V.n nVar4 = ((AbstractC1256n) nVar3).f10608v; nVar4 != null; nVar4 = nVar4.f5863m) {
                                    if ((nVar4.f5860j & 1024) != 0) {
                                        i2++;
                                        if (i2 == 1) {
                                            nVar3 = nVar4;
                                        } else {
                                            if (dVar == null) {
                                                dVar = new L.d(new V.n[16]);
                                            }
                                            if (nVar3 != null) {
                                                dVar.b(nVar3);
                                                nVar3 = null;
                                            }
                                            dVar.b(nVar4);
                                        }
                                    }
                                }
                                if (i2 == 1) {
                                }
                            }
                            nVar3 = AbstractC1248f.f(dVar);
                        }
                    }
                    nVar2 = nVar2.f5862l;
                }
            }
            v3 = v3.s();
            nVar2 = (v3 == null || (c0292u = v3.f10378C) == null) ? null : (n0) c0292u.f4243e;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x000e, code lost:
    
        if (r0 != 2) goto L19;
     */
    @Override // V.n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void D0() {
        /*
            r4 = this;
            a0.r r0 = r4.L0()
            int r0 = r0.ordinal()
            r1 = 1
            if (r0 == 0) goto L2e
            if (r0 == r1) goto L11
            r2 = 2
            if (r0 == r2) goto L2e
            goto L43
        L11:
            D.S r0 = a0.AbstractC0427d.F(r4)
            boolean r2 = r0.f762b     // Catch: java.lang.Throwable -> L1d
            if (r2 == 0) goto L1f
            D.S.a(r0)     // Catch: java.lang.Throwable -> L1d
            goto L1f
        L1d:
            r1 = move-exception
            goto L2a
        L1f:
            r0.f762b = r1     // Catch: java.lang.Throwable -> L1d
            a0.r r1 = a0.EnumC0441r.f6490j     // Catch: java.lang.Throwable -> L1d
            r4.P0(r1)     // Catch: java.lang.Throwable -> L1d
            D.S.b(r0)
            goto L43
        L2a:
            D.S.b(r0)
            throw r1
        L2e:
            t0.f0 r0 = t0.AbstractC1248f.w(r4)
            u0.v r0 = (u0.C1314v) r0
            a0.h r0 = r0.getFocusOwner()
            androidx.compose.ui.focus.b r0 = (androidx.compose.ui.focus.b) r0
            r2 = 0
            r3 = 8
            r0.a(r3, r1, r2)
            a0.AbstractC0427d.q(r4)
        L43:
            r0 = 0
            r4.f6494w = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: a0.C0442s.D0():void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11, types: [V.n] */
    /* JADX WARN: Type inference failed for: r5v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v15 */
    /* JADX WARN: Type inference failed for: r5v16 */
    /* JADX WARN: Type inference failed for: r5v17 */
    /* JADX WARN: Type inference failed for: r5v18 */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8, types: [V.n] */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4, types: [L.d] */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7, types: [L.d] */
    public final C0434k K0() {
        C0292u c0292u;
        C0434k c0434k = new C0434k();
        c0434k.f6471a = true;
        C0438o c0438o = C0438o.f6484b;
        c0434k.f6472b = c0438o;
        c0434k.f6473c = c0438o;
        c0434k.f6474d = c0438o;
        c0434k.f6475e = c0438o;
        c0434k.f6476f = c0438o;
        c0434k.f6477g = c0438o;
        c0434k.f6478h = c0438o;
        c0434k.f6479i = c0438o;
        c0434k.f6480j = C0432i.f6466k;
        c0434k.f6481k = C0432i.f6467l;
        V.n nVar = this.f5858h;
        if (!nVar.f5869t) {
            throw new IllegalStateException("visitAncestors called on an unattached node".toString());
        }
        C1236E v3 = AbstractC1248f.v(this);
        V.n nVar2 = nVar;
        loop0: while (v3 != null) {
            if ((((V.n) v3.f10378C.f4244f).f5861k & 3072) != 0) {
                while (nVar2 != null) {
                    int i2 = nVar2.f5860j;
                    if ((i2 & 3072) != 0) {
                        if (nVar2 != nVar && (i2 & 1024) != 0) {
                            break loop0;
                        }
                        if ((i2 & 2048) != 0) {
                            AbstractC1256n abstractC1256n = nVar2;
                            ?? r7 = 0;
                            while (abstractC1256n != 0) {
                                if (abstractC1256n instanceof InterfaceC0436m) {
                                    ((InterfaceC0436m) abstractC1256n).H(c0434k);
                                } else if ((abstractC1256n.f5860j & 2048) != 0 && (abstractC1256n instanceof AbstractC1256n)) {
                                    V.n nVar3 = abstractC1256n.f10608v;
                                    int i3 = 0;
                                    abstractC1256n = abstractC1256n;
                                    r7 = r7;
                                    while (nVar3 != null) {
                                        if ((nVar3.f5860j & 2048) != 0) {
                                            i3++;
                                            r7 = r7;
                                            if (i3 == 1) {
                                                abstractC1256n = nVar3;
                                            } else {
                                                if (r7 == 0) {
                                                    r7 = new L.d(new V.n[16]);
                                                }
                                                if (abstractC1256n != 0) {
                                                    r7.b(abstractC1256n);
                                                    abstractC1256n = 0;
                                                }
                                                r7.b(nVar3);
                                            }
                                        }
                                        nVar3 = nVar3.f5863m;
                                        abstractC1256n = abstractC1256n;
                                        r7 = r7;
                                    }
                                    if (i3 == 1) {
                                    }
                                }
                                abstractC1256n = AbstractC1248f.f(r7);
                            }
                        }
                    }
                    nVar2 = nVar2.f5862l;
                }
            }
            v3 = v3.s();
            nVar2 = (v3 == null || (c0292u = v3.f10378C) == null) ? null : (n0) c0292u.f4243e;
        }
        return c0434k;
    }

    public final EnumC0441r L0() {
        EnumC0441r enumC0441r;
        C1236E c1236e;
        f0 f0Var;
        InterfaceC0431h focusOwner;
        Z z3 = this.f5858h.f5865o;
        S s3 = (z3 == null || (c1236e = z3.f10546s) == null || (f0Var = c1236e.f10395p) == null || (focusOwner = ((C1314v) f0Var).getFocusOwner()) == null) ? null : ((androidx.compose.ui.focus.b) focusOwner).f6748h;
        if (s3 != null && (enumC0441r = (EnumC0441r) ((C0769y) s3.f763c).e(this)) != null) {
            return enumC0441r;
        }
        EnumC0441r enumC0441r2 = this.f6494w;
        return enumC0441r2 == null ? EnumC0441r.f6490j : enumC0441r2;
    }

    public final void O0() {
        EnumC0441r enumC0441r = this.f6494w;
        if (enumC0441r == null) {
            if (!(!(enumC0441r != null))) {
                throw new IllegalStateException("Re-initializing focus target node.".toString());
            }
            S F = AbstractC0427d.F(this);
            try {
                if (F.f762b) {
                    S.a(F);
                }
                F.f762b = true;
                P0((N0(this) && M0(this)) ? EnumC0441r.f6489i : EnumC0441r.f6490j);
                S.b(F);
            } catch (Throwable th) {
                S.b(F);
                throw th;
            }
        }
        int ordinal = L0().ordinal();
        if (ordinal == 0 || ordinal == 2) {
            z2.s sVar = new z2.s();
            AbstractC1248f.s(this, new c0(sVar, 7, this));
            Object obj = sVar.f11909h;
            if (obj == null) {
                z2.h.j("focusProperties");
                throw null;
            }
            if (((InterfaceC0433j) obj).a()) {
                return;
            }
            ((androidx.compose.ui.focus.b) ((C1314v) AbstractC1248f.w(this)).getFocusOwner()).a(8, true, true);
        }
    }

    public final void P0(EnumC0441r enumC0441r) {
        ((C0769y) AbstractC0427d.F(this).f763c).j(this, enumC0441r);
    }

    @Override // t0.b0
    public final void s0() {
        EnumC0441r L02 = L0();
        O0();
        if (L02 != L0()) {
            AbstractC0427d.A(this);
        }
    }

    @Override // V.n
    public final boolean z0() {
        return false;
    }
}
