package t0;

import J.AbstractC0286q0;
import J.C0257c;
import J.C0292u;
import android.view.View;
import java.util.ArrayList;
import java.util.List;
import m.AbstractC0837j;
import n2.AbstractC0946A;
import r0.C1125n;
import r0.InterfaceC1126o;
import u0.C1314v;

/* renamed from: t0.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1248f {

    /* renamed from: a, reason: collision with root package name */
    public static final C1246d f10576a = new C1246d(0);

    public static final long a(float f3, boolean z3) {
        return ((z3 ? 1L : 0L) & 4294967295L) | (Float.floatToIntBits(f3) << 32);
    }

    public static final void b(L.d dVar, V.n nVar) {
        L.d v3 = v(nVar).v();
        int i2 = v3.f4620j;
        if (i2 > 0) {
            int i3 = i2 - 1;
            Object[] objArr = v3.f4618h;
            do {
                dVar.b((V.n) ((C1236E) objArr[i3]).f10378C.f4244f);
                i3--;
            } while (i3 >= 0);
        }
    }

    public static final int c(N n3, C1125n c1125n) {
        N y02 = n3.y0();
        if (y02 == null) {
            AbstractC0946A.r("Child of " + n3 + " cannot be null when calculating alignment line");
            throw null;
        }
        if (n3.C0().i().containsKey(c1125n)) {
            Integer num = (Integer) n3.C0().i().get(c1125n);
            if (num != null) {
                return num.intValue();
            }
            return Integer.MIN_VALUE;
        }
        int d02 = y02.d0(c1125n);
        if (d02 == Integer.MIN_VALUE) {
            return Integer.MIN_VALUE;
        }
        y02.f10486n = true;
        n3.f10487o = true;
        n3.G0();
        y02.f10486n = false;
        n3.f10487o = false;
        return d02 + ((int) (c1125n instanceof C1125n ? y02.E0() & 4294967295L : y02.E0() >> 32));
    }

    public static final boolean d(C1245c c1245c) {
        n0 n0Var = (n0) v(c1245c).f10378C.f4243e;
        z2.h.d(n0Var, "null cannot be cast to non-null type androidx.compose.ui.node.TailModifierNode");
        return n0Var.f10609u;
    }

    public static final V.n e(InterfaceC1255m interfaceC1255m, int i2) {
        V.n nVar = ((V.n) interfaceC1255m).f5858h.f5863m;
        if (nVar == null || (nVar.f5861k & i2) == 0) {
            return null;
        }
        while (nVar != null) {
            int i3 = nVar.f5860j;
            if ((i3 & 2) != 0) {
                return null;
            }
            if ((i3 & i2) != 0) {
                return nVar;
            }
            nVar = nVar.f5863m;
        }
        return null;
    }

    public static final V.n f(L.d dVar) {
        if (dVar == null || dVar.k()) {
            return null;
        }
        return (V.n) dVar.n(dVar.f4620j - 1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final InterfaceC1264w g(V.n nVar) {
        if ((nVar.f5860j & 2) != 0) {
            if (nVar instanceof InterfaceC1264w) {
                return (InterfaceC1264w) nVar;
            }
            if (nVar instanceof AbstractC1256n) {
                V.n nVar2 = ((AbstractC1256n) nVar).f10608v;
                while (nVar2 != 0) {
                    if (nVar2 instanceof InterfaceC1264w) {
                        return (InterfaceC1264w) nVar2;
                    }
                    nVar2 = (!(nVar2 instanceof AbstractC1256n) || (nVar2.f5860j & 2) == 0) ? nVar2.f5863m : ((AbstractC1256n) nVar2).f10608v;
                }
            }
        }
        return null;
    }

    public static final int h(long j3, long j4) {
        boolean z3 = ((int) (j3 & 4294967295L)) != 0;
        return z3 != (((int) (4294967295L & j4)) != 0) ? z3 ? -1 : 1 : (int) Math.signum(Float.intBitsToFloat((int) (j3 >> 32)) - Float.intBitsToFloat((int) (j4 >> 32)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object i(InterfaceC1254l interfaceC1254l, AbstractC0286q0 abstractC0286q0) {
        if (!((V.n) interfaceC1254l).f5858h.f5869t) {
            AbstractC0946A.r("Cannot read CompositionLocal because the Modifier node is not currently attached.");
            throw null;
        }
        R.e eVar = (R.e) v(interfaceC1254l).f10376A;
        eVar.getClass();
        return C0257c.P(eVar, abstractC0286q0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11, types: [V.n] */
    /* JADX WARN: Type inference failed for: r2v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8, types: [V.n] */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [L.d] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6, types: [L.d] */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    public static final p0 j(InterfaceC1255m interfaceC1255m, Object obj) {
        C0292u c0292u;
        V.n nVar = ((V.n) interfaceC1255m).f5858h;
        if (!nVar.f5869t) {
            throw new IllegalStateException("visitAncestors called on an unattached node".toString());
        }
        V.n nVar2 = nVar.f5862l;
        C1236E v3 = v(interfaceC1255m);
        while (v3 != null) {
            if ((((V.n) v3.f10378C.f4244f).f5861k & 262144) != 0) {
                while (nVar2 != null) {
                    if ((nVar2.f5860j & 262144) != 0) {
                        AbstractC1256n abstractC1256n = nVar2;
                        ?? r4 = 0;
                        while (abstractC1256n != 0) {
                            if (abstractC1256n instanceof p0) {
                                p0 p0Var = (p0) abstractC1256n;
                                if (z2.h.a(obj, p0Var.w())) {
                                    return p0Var;
                                }
                            } else if ((abstractC1256n.f5860j & 262144) != 0 && (abstractC1256n instanceof AbstractC1256n)) {
                                V.n nVar3 = abstractC1256n.f10608v;
                                int i2 = 0;
                                abstractC1256n = abstractC1256n;
                                r4 = r4;
                                while (nVar3 != null) {
                                    if ((nVar3.f5860j & 262144) != 0) {
                                        i2++;
                                        r4 = r4;
                                        if (i2 == 1) {
                                            abstractC1256n = nVar3;
                                        } else {
                                            if (r4 == 0) {
                                                r4 = new L.d(new V.n[16]);
                                            }
                                            if (abstractC1256n != 0) {
                                                r4.b(abstractC1256n);
                                                abstractC1256n = 0;
                                            }
                                            r4.b(nVar3);
                                        }
                                    }
                                    nVar3 = nVar3.f5863m;
                                    abstractC1256n = abstractC1256n;
                                    r4 = r4;
                                }
                                if (i2 == 1) {
                                }
                            }
                            abstractC1256n = f(r4);
                        }
                    }
                    nVar2 = nVar2.f5862l;
                }
            }
            v3 = v3.s();
            nVar2 = (v3 == null || (c0292u = v3.f10378C) == null) ? null : (n0) c0292u.f4243e;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [java.lang.Object, t0.m, t0.p0] */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11, types: [V.n] */
    /* JADX WARN: Type inference failed for: r3v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8, types: [V.n] */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [L.d] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [L.d] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    public static final p0 k(p0 p0Var) {
        C0292u c0292u;
        V.n nVar = ((V.n) p0Var).f5858h;
        if (!nVar.f5869t) {
            throw new IllegalStateException("visitAncestors called on an unattached node".toString());
        }
        V.n nVar2 = nVar.f5862l;
        C1236E v3 = v(p0Var);
        while (v3 != null) {
            if ((((V.n) v3.f10378C.f4244f).f5861k & 262144) != 0) {
                while (nVar2 != null) {
                    if ((nVar2.f5860j & 262144) != 0) {
                        AbstractC1256n abstractC1256n = nVar2;
                        ?? r5 = 0;
                        while (abstractC1256n != 0) {
                            if (abstractC1256n instanceof p0) {
                                p0 p0Var2 = (p0) abstractC1256n;
                                if (z2.h.a(p0Var.w(), p0Var2.w()) && V.a.a(p0Var, p0Var2)) {
                                    return p0Var2;
                                }
                            } else if ((abstractC1256n.f5860j & 262144) != 0 && (abstractC1256n instanceof AbstractC1256n)) {
                                V.n nVar3 = abstractC1256n.f10608v;
                                int i2 = 0;
                                abstractC1256n = abstractC1256n;
                                r5 = r5;
                                while (nVar3 != null) {
                                    if ((nVar3.f5860j & 262144) != 0) {
                                        i2++;
                                        r5 = r5;
                                        if (i2 == 1) {
                                            abstractC1256n = nVar3;
                                        } else {
                                            if (r5 == 0) {
                                                r5 = new L.d(new V.n[16]);
                                            }
                                            if (abstractC1256n != 0) {
                                                r5.b(abstractC1256n);
                                                abstractC1256n = 0;
                                            }
                                            r5.b(nVar3);
                                        }
                                    }
                                    nVar3 = nVar3.f5863m;
                                    abstractC1256n = abstractC1256n;
                                    r5 = r5;
                                }
                                if (i2 == 1) {
                                }
                            }
                            abstractC1256n = f(r5);
                        }
                    }
                    nVar2 = nVar2.f5862l;
                }
            }
            v3 = v3.s();
            nVar2 = (v3 == null || (c0292u = v3.f10378C) == null) ? null : (n0) c0292u.f4243e;
        }
        return null;
    }

    public static final ArrayList l(InterfaceC1126o interfaceC1126o) {
        z2.h.d(interfaceC1126o, "null cannot be cast to non-null type androidx.compose.ui.node.MeasureScopeWithLayoutNode");
        C1236E B02 = ((N) interfaceC1126o).B0();
        boolean q = q(B02);
        List p3 = B02.p();
        ArrayList arrayList = new ArrayList(p3.size());
        int size = p3.size();
        for (int i2 = 0; i2 < size; i2++) {
            C1236E c1236e = (C1236E) p3.get(i2);
            arrayList.add(q ? c1236e.l() : c1236e.m());
        }
        return arrayList;
    }

    public static final int m(int[] iArr) {
        return Math.min(iArr[2] - iArr[0], iArr[3] - iArr[1]);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void n(InterfaceC1257o interfaceC1257o) {
        if (((V.n) interfaceC1257o).f5858h.f5869t) {
            t(interfaceC1257o, 1).Z0();
        }
    }

    public static final void o(InterfaceC1264w interfaceC1264w) {
        v(interfaceC1264w).A();
    }

    public static final void p(m0 m0Var) {
        v(m0Var).B();
    }

    public static final boolean q(C1236E c1236e) {
        int d3 = AbstractC0837j.d(c1236e.f10379D.f10466c);
        if (d3 != 0) {
            if (d3 == 1) {
                return true;
            }
            if (d3 != 2) {
                if (d3 == 3) {
                    return true;
                }
                if (d3 != 4) {
                    throw new J2.r();
                }
                C1236E s3 = c1236e.s();
                if (s3 != null) {
                    return q(s3);
                }
                throw new IllegalArgumentException("no parent for idle node".toString());
            }
        }
        return false;
    }

    public static final boolean r(C1236E c1236e) {
        if (c1236e.f10389j != null) {
            C1236E s3 = c1236e.s();
            if ((s3 != null ? s3.f10389j : null) == null || c1236e.f10379D.f10465b) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void s(V.n nVar, y2.a aVar) {
        c0 c0Var = nVar.f5864n;
        if (c0Var == null) {
            c0Var = new c0((b0) nVar);
            nVar.f5864n = c0Var;
        }
        ((C1314v) w(nVar)).getSnapshotObserver().a(c0Var, C1247e.f10568n, aVar);
    }

    public static final Z t(InterfaceC1255m interfaceC1255m, int i2) {
        Z z3 = ((V.n) interfaceC1255m).f5858h.f5865o;
        z2.h.c(z3);
        if (z3.T0() != interfaceC1255m || !a0.h(i2)) {
            return z3;
        }
        Z z4 = z3.f10548u;
        z2.h.c(z4);
        return z4;
    }

    public static final Z u(InterfaceC1255m interfaceC1255m) {
        if (!((V.n) interfaceC1255m).f5858h.f5869t) {
            AbstractC0946A.r("Cannot get LayoutCoordinates, Modifier.Node is not attached.");
            throw null;
        }
        Z t3 = t(interfaceC1255m, 2);
        if (t3.T0().f5869t) {
            return t3;
        }
        AbstractC0946A.r("LayoutCoordinates is not attached.");
        throw null;
    }

    public static final C1236E v(InterfaceC1255m interfaceC1255m) {
        Z z3 = ((V.n) interfaceC1255m).f5858h.f5865o;
        if (z3 != null) {
            return z3.f10546s;
        }
        AbstractC0946A.s("Cannot obtain node coordinator. Is the Modifier.Node attached?");
        throw null;
    }

    public static final f0 w(InterfaceC1255m interfaceC1255m) {
        f0 f0Var = v(interfaceC1255m).f10395p;
        if (f0Var != null) {
            return f0Var;
        }
        AbstractC0946A.s("This node does not have an owner.");
        throw null;
    }

    public static final View x(InterfaceC1255m interfaceC1255m) {
        if (((V.n) interfaceC1255m).f5858h.f5869t) {
            return (View) AbstractC1239H.a(v(interfaceC1255m));
        }
        AbstractC0946A.r("Cannot get View because the Modifier node is not currently attached.");
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [java.lang.Object, t0.m, t0.p0] */
    /* JADX WARN: Type inference failed for: r11v0, types: [y2.c] */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14, types: [V.n] */
    /* JADX WARN: Type inference failed for: r2v15, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r2v21 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8, types: [V.n] */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [L.d] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [L.d] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    public static final void y(p0 p0Var, y2.c cVar) {
        C0292u c0292u;
        V.n nVar = ((V.n) p0Var).f5858h;
        if (!nVar.f5869t) {
            throw new IllegalStateException("visitAncestors called on an unattached node".toString());
        }
        V.n nVar2 = nVar.f5862l;
        C1236E v3 = v(p0Var);
        while (v3 != null) {
            if ((((V.n) v3.f10378C.f4244f).f5861k & 262144) != 0) {
                while (nVar2 != null) {
                    if ((nVar2.f5860j & 262144) != 0) {
                        AbstractC1256n abstractC1256n = nVar2;
                        ?? r5 = 0;
                        while (abstractC1256n != 0) {
                            if (abstractC1256n instanceof p0) {
                                p0 p0Var2 = (p0) abstractC1256n;
                                if (z2.h.a(p0Var.w(), p0Var2.w()) && V.a.a(p0Var, p0Var2) && !((Boolean) cVar.l(p0Var2)).booleanValue()) {
                                    return;
                                }
                            } else if ((abstractC1256n.f5860j & 262144) != 0 && (abstractC1256n instanceof AbstractC1256n)) {
                                V.n nVar3 = abstractC1256n.f10608v;
                                int i2 = 0;
                                abstractC1256n = abstractC1256n;
                                r5 = r5;
                                while (nVar3 != null) {
                                    if ((nVar3.f5860j & 262144) != 0) {
                                        i2++;
                                        r5 = r5;
                                        if (i2 == 1) {
                                            abstractC1256n = nVar3;
                                        } else {
                                            if (r5 == 0) {
                                                r5 = new L.d(new V.n[16]);
                                            }
                                            if (abstractC1256n != 0) {
                                                r5.b(abstractC1256n);
                                                abstractC1256n = 0;
                                            }
                                            r5.b(nVar3);
                                        }
                                    }
                                    nVar3 = nVar3.f5863m;
                                    abstractC1256n = abstractC1256n;
                                    r5 = r5;
                                }
                                if (i2 == 1) {
                                }
                            }
                            abstractC1256n = f(r5);
                        }
                    }
                    nVar2 = nVar2.f5862l;
                }
            }
            v3 = v3.s();
            nVar2 = (v3 == null || (c0292u = v3.f10378C) == null) ? null : (n0) c0292u.f4243e;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0, types: [java.lang.Object, t0.p0] */
    /* JADX WARN: Type inference failed for: r13v0, types: [y2.c] */
    /* JADX WARN: Type inference failed for: r7v10, types: [V.n] */
    /* JADX WARN: Type inference failed for: r7v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v16 */
    /* JADX WARN: Type inference failed for: r7v17 */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v3, types: [V.n] */
    /* JADX WARN: Type inference failed for: r7v9 */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v3, types: [L.d] */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6, types: [L.d] */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    public static final void z(p0 p0Var, y2.c cVar) {
        V.n nVar = ((V.n) p0Var).f5858h;
        if (!nVar.f5869t) {
            AbstractC0946A.r("visitSubtreeIf called on an unattached node");
            throw null;
        }
        L.d dVar = new L.d(new V.n[16]);
        V.n nVar2 = nVar.f5863m;
        if (nVar2 == null) {
            b(dVar, nVar);
        } else {
            dVar.b(nVar2);
        }
        while (dVar.l()) {
            V.n nVar3 = (V.n) dVar.n(dVar.f4620j - 1);
            if ((nVar3.f5861k & 262144) != 0) {
                for (V.n nVar4 = nVar3; nVar4 != null; nVar4 = nVar4.f5863m) {
                    if ((nVar4.f5860j & 262144) != 0) {
                        ?? r8 = 0;
                        AbstractC1256n abstractC1256n = nVar4;
                        while (abstractC1256n != 0) {
                            if (abstractC1256n instanceof p0) {
                                p0 p0Var2 = (p0) abstractC1256n;
                                o0 o0Var = (z2.h.a(p0Var.w(), p0Var2.w()) && V.a.a(p0Var, p0Var2)) ? (o0) cVar.l(p0Var2) : o0.f10610h;
                                if (o0Var == o0.f10612j) {
                                    return;
                                }
                                if (o0Var == o0.f10611i) {
                                    break;
                                }
                            } else if ((abstractC1256n.f5860j & 262144) != 0 && (abstractC1256n instanceof AbstractC1256n)) {
                                V.n nVar5 = abstractC1256n.f10608v;
                                int i2 = 0;
                                abstractC1256n = abstractC1256n;
                                r8 = r8;
                                while (nVar5 != null) {
                                    if ((nVar5.f5860j & 262144) != 0) {
                                        i2++;
                                        r8 = r8;
                                        if (i2 == 1) {
                                            abstractC1256n = nVar5;
                                        } else {
                                            if (r8 == 0) {
                                                r8 = new L.d(new V.n[16]);
                                            }
                                            if (abstractC1256n != 0) {
                                                r8.b(abstractC1256n);
                                                abstractC1256n = 0;
                                            }
                                            r8.b(nVar5);
                                        }
                                    }
                                    nVar5 = nVar5.f5863m;
                                    abstractC1256n = abstractC1256n;
                                    r8 = r8;
                                }
                                if (i2 == 1) {
                                }
                            }
                            abstractC1256n = f(r8);
                        }
                    }
                }
            }
            b(dVar, nVar3);
        }
    }
}
