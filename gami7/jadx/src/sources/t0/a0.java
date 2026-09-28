package t0;

import a0.AbstractC0427d;
import a0.C0429f;
import a0.C0442s;
import a0.InterfaceC0426c;
import a0.InterfaceC0436m;
import j.AbstractC0737C;
import j.C0766v;
import l.C0802k;
import n2.AbstractC0946A;
import p0.C1056a;
import r0.InterfaceC1131t;
import s0.InterfaceC1189c;
import s0.InterfaceC1191e;
import s0.InterfaceC1192f;
import u0.C1314v;
import v.C1350d;

/* loaded from: classes.dex */
public abstract class a0 {

    /* renamed from: a, reason: collision with root package name */
    public static final C0766v f10554a;

    static {
        C0766v c0766v = AbstractC0737C.f7969a;
        f10554a = new C0766v();
    }

    public static final void a(V.n nVar) {
        if (nVar.f5869t) {
            b(nVar, -1, 1);
        } else {
            AbstractC0946A.r("autoInvalidateInsertedNode called on unattached node");
            throw null;
        }
    }

    public static final void b(V.n nVar, int i2, int i3) {
        if (!(nVar instanceof AbstractC1256n)) {
            c(nVar, i2 & nVar.f5860j, i3);
            return;
        }
        AbstractC1256n abstractC1256n = (AbstractC1256n) nVar;
        c(nVar, abstractC1256n.f10607u & i2, i3);
        int i4 = (~abstractC1256n.f10607u) & i2;
        for (V.n nVar2 = abstractC1256n.f10608v; nVar2 != null; nVar2 = nVar2.f5863m) {
            b(nVar2, i4, i3);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void c(V.n nVar, int i2, int i3) {
        if (i3 != 0 || nVar.z0()) {
            if ((i2 & 2) != 0 && (nVar instanceof InterfaceC1264w)) {
                AbstractC1248f.o((InterfaceC1264w) nVar);
                if (i3 == 2) {
                    Z t3 = AbstractC1248f.t(nVar, 2);
                    t3.f10550w = true;
                    t3.f10542J.c();
                    if (t3.f10544L != null) {
                        if (t3.f10545M != null) {
                            t3.f10545M = null;
                        }
                        t3.p1(null, false);
                        t3.f10546s.T(false);
                    }
                }
            }
            if ((i2 & 128) != 0 && (nVar instanceof InterfaceC1263v) && i3 != 2) {
                AbstractC1248f.v(nVar).A();
            }
            if ((i2 & 256) != 0 && (nVar instanceof InterfaceC1258p) && i3 != 2) {
                C1236E v3 = AbstractC1248f.v(nVar);
                L l3 = v3.f10379D;
                if (!l3.f10468e && !l3.f10467d && !v3.f10383J) {
                    C1314v c1314v = (C1314v) AbstractC1239H.a(v3);
                    ((L.d) c1314v.f11176N.f10503e.f239c).b(v3);
                    v3.f10383J = true;
                    c1314v.E(null);
                }
            }
            if ((i2 & 4) != 0 && (nVar instanceof InterfaceC1257o)) {
                AbstractC1248f.n((InterfaceC1257o) nVar);
            }
            if ((i2 & 8) != 0 && (nVar instanceof m0)) {
                AbstractC1248f.p((m0) nVar);
            }
            if ((i2 & 64) != 0 && (nVar instanceof i0)) {
                L l4 = AbstractC1248f.v((i0) nVar).f10379D;
                l4.f10480r.f10461x = true;
                C1241J c1241j = l4.f10481s;
                if (c1241j != null) {
                    c1241j.f10423C = true;
                }
            }
            if ((i2 & 1024) != 0 && (nVar instanceof C0442s) && i3 != 2) {
                AbstractC0427d.q((C0442s) nVar);
            }
            if ((i2 & 2048) != 0 && (nVar instanceof InterfaceC0436m)) {
                InterfaceC0436m interfaceC0436m = (InterfaceC0436m) nVar;
                C1249g.f10579b = null;
                interfaceC0436m.H(C1249g.f10578a);
                if (C1249g.f10579b != null) {
                    if (i3 == 2) {
                        V.n nVar2 = ((V.n) interfaceC0436m).f5858h;
                        if (!nVar2.f5869t) {
                            throw new IllegalStateException("visitChildren called on an unattached node".toString());
                        }
                        L.d dVar = new L.d(new V.n[16]);
                        V.n nVar3 = nVar2.f5863m;
                        if (nVar3 == null) {
                            AbstractC1248f.b(dVar, nVar2);
                        } else {
                            dVar.b(nVar3);
                        }
                        while (dVar.l()) {
                            V.n nVar4 = (V.n) dVar.n(dVar.f4620j - 1);
                            if ((nVar4.f5861k & 1024) == 0) {
                                AbstractC1248f.b(dVar, nVar4);
                            } else {
                                while (true) {
                                    if (nVar4 == null) {
                                        break;
                                    }
                                    if ((nVar4.f5860j & 1024) != 0) {
                                        L.d dVar2 = null;
                                        while (nVar4 != null) {
                                            if (nVar4 instanceof C0442s) {
                                                AbstractC0427d.q((C0442s) nVar4);
                                            } else if ((nVar4.f5860j & 1024) != 0 && (nVar4 instanceof AbstractC1256n)) {
                                                int i4 = 0;
                                                for (V.n nVar5 = ((AbstractC1256n) nVar4).f10608v; nVar5 != null; nVar5 = nVar5.f5863m) {
                                                    if ((nVar5.f5860j & 1024) != 0) {
                                                        i4++;
                                                        if (i4 == 1) {
                                                            nVar4 = nVar5;
                                                        } else {
                                                            if (dVar2 == null) {
                                                                dVar2 = new L.d(new V.n[16]);
                                                            }
                                                            if (nVar4 != null) {
                                                                dVar2.b(nVar4);
                                                                nVar4 = null;
                                                            }
                                                            dVar2.b(nVar5);
                                                        }
                                                    }
                                                }
                                                if (i4 == 1) {
                                                }
                                            }
                                            nVar4 = AbstractC1248f.f(dVar2);
                                        }
                                    } else {
                                        nVar4 = nVar4.f5863m;
                                    }
                                }
                            }
                        }
                    } else {
                        C0429f c0429f = ((androidx.compose.ui.focus.b) ((C1314v) AbstractC1248f.w(interfaceC0436m)).getFocusOwner()).f6747g;
                        c0429f.b(c0429f.f6460e, interfaceC0436m);
                    }
                }
            }
            if ((i2 & 4096) == 0 || !(nVar instanceof InterfaceC0426c)) {
                return;
            }
            InterfaceC0426c interfaceC0426c = (InterfaceC0426c) nVar;
            C0429f c0429f2 = ((androidx.compose.ui.focus.b) ((C1314v) AbstractC1248f.w(interfaceC0426c)).getFocusOwner()).f6747g;
            c0429f2.b(c0429f2.f6459d, interfaceC0426c);
        }
    }

    public static final void d(V.n nVar) {
        if (nVar.f5869t) {
            b(nVar, -1, 0);
        } else {
            AbstractC0946A.r("autoInvalidateUpdatedNode called on unattached node");
            throw null;
        }
    }

    public static final int e(V.m mVar) {
        int i2 = mVar instanceof InterfaceC1131t ? 3 : 1;
        if (mVar instanceof Z.e) {
            i2 |= 4;
        }
        if (mVar instanceof A0.l) {
            i2 |= 8;
        }
        if ((mVar instanceof InterfaceC1189c) || (mVar instanceof InterfaceC1192f)) {
            i2 |= 32;
        }
        if (mVar instanceof C1350d) {
            i2 |= 256;
        }
        return mVar instanceof C0802k ? i2 | 64 : i2;
    }

    public static final int f(V.n nVar) {
        int i2 = nVar.f5860j;
        if (i2 != 0) {
            return i2;
        }
        Class<?> cls = nVar.getClass();
        C0766v c0766v = f10554a;
        int d3 = c0766v.d(cls);
        if (d3 >= 0) {
            return c0766v.f8053c[d3];
        }
        int i3 = nVar instanceof InterfaceC1264w ? 3 : 1;
        if (nVar instanceof InterfaceC1257o) {
            i3 |= 4;
        }
        if (nVar instanceof m0) {
            i3 |= 8;
        }
        if (nVar instanceof k0) {
            i3 |= 16;
        }
        if (nVar instanceof InterfaceC1191e) {
            i3 |= 32;
        }
        if (nVar instanceof i0) {
            i3 |= 64;
        }
        if (nVar instanceof InterfaceC1263v) {
            i3 |= 128;
        }
        if (nVar instanceof InterfaceC1258p) {
            i3 |= 256;
        }
        if (nVar instanceof C0442s) {
            i3 |= 1024;
        }
        if (nVar instanceof InterfaceC0436m) {
            i3 |= 2048;
        }
        if (nVar instanceof InterfaceC0426c) {
            i3 |= 4096;
        }
        if (nVar instanceof l0.d) {
            i3 |= 8192;
        }
        if (nVar instanceof C1056a) {
            i3 |= 16384;
        }
        if (nVar instanceof InterfaceC1254l) {
            i3 |= 32768;
        }
        int i4 = nVar instanceof p0 ? 262144 | i3 : i3;
        c0766v.h(i4, cls);
        return i4;
    }

    public static final int g(V.n nVar) {
        if (!(nVar instanceof AbstractC1256n)) {
            return f(nVar);
        }
        AbstractC1256n abstractC1256n = (AbstractC1256n) nVar;
        int i2 = abstractC1256n.f10607u;
        for (V.n nVar2 = abstractC1256n.f10608v; nVar2 != null; nVar2 = nVar2.f5863m) {
            i2 |= g(nVar2);
        }
        return i2;
    }

    public static final boolean h(int i2) {
        return (i2 & 128) != 0;
    }
}
