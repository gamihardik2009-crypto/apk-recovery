package t0;

import J.C0292u;
import a0.EnumC0441r;
import a0.InterfaceC0426c;
import a0.InterfaceC0433j;
import a0.InterfaceC0436m;
import a0.InterfaceC0439p;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import l.C0802k;
import m2.C0880v;
import m2.InterfaceC0861c;
import n0.C0930i;
import n0.EnumC0931j;
import n2.AbstractC0946A;
import q2.C1080k;
import r0.InterfaceC1093G;
import r0.InterfaceC1095I;
import r0.InterfaceC1096J;
import r0.InterfaceC1126o;
import r0.InterfaceC1131t;
import s0.C1187a;
import s0.C1188b;
import s0.C1190d;
import s0.C1194h;
import s0.InterfaceC1189c;
import s0.InterfaceC1191e;
import s0.InterfaceC1192f;
import s0.InterfaceC1193g;
import t.C1223r;
import u0.C1314v;
import v.C1350d;

/* renamed from: t0.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1245c extends V.n implements InterfaceC1264w, InterfaceC1257o, m0, k0, InterfaceC1191e, InterfaceC1193g, i0, InterfaceC1263v, InterfaceC1258p, InterfaceC0426c, InterfaceC0436m, InterfaceC0439p, g0, Z.a {

    /* renamed from: u, reason: collision with root package name */
    public V.m f10557u;

    /* renamed from: v, reason: collision with root package name */
    public C1187a f10558v;

    /* renamed from: w, reason: collision with root package name */
    public HashSet f10559w;

    @Override // V.n
    public final void C0() {
        K0(true);
    }

    @Override // a0.InterfaceC0426c
    public final void D(EnumC0441r enumC0441r) {
        AbstractC0946A.r("onFocusEvent called on wrong node");
        throw null;
    }

    @Override // V.n
    public final void D0() {
        L0();
    }

    @Override // t0.InterfaceC1263v
    public final void E(long j3) {
    }

    @Override // a0.InterfaceC0436m
    public final void H(InterfaceC0433j interfaceC0433j) {
        AbstractC0946A.r("applyFocusProperties called on wrong node");
        throw null;
    }

    public final void K0(boolean z3) {
        if (!this.f5869t) {
            AbstractC0946A.r("initializeModifier called on unattached node");
            throw null;
        }
        V.m mVar = this.f10557u;
        if ((this.f5860j & 32) != 0) {
            if (mVar instanceof InterfaceC1189c) {
                C1244b c1244b = new C1244b(this, 0);
                L.d dVar = ((C1314v) AbstractC1248f.w(this)).f11220w0;
                if (!dVar.h(c1244b)) {
                    dVar.b(c1244b);
                }
            }
            if (mVar instanceof InterfaceC1192f) {
                InterfaceC1192f interfaceC1192f = (InterfaceC1192f) mVar;
                C1187a c1187a = this.f10558v;
                if (c1187a == null || !c1187a.g(interfaceC1192f.getKey())) {
                    C1187a c1187a2 = new C1187a();
                    c1187a2.f10192a = interfaceC1192f;
                    this.f10558v = c1187a2;
                    if (AbstractC1248f.d(this)) {
                        C1190d modifierLocalManager = ((C1314v) AbstractC1248f.w(this)).getModifierLocalManager();
                        C1194h key = interfaceC1192f.getKey();
                        modifierLocalManager.f10195b.b(this);
                        modifierLocalManager.f10196c.b(key);
                        modifierLocalManager.a();
                    }
                } else {
                    c1187a.f10192a = interfaceC1192f;
                    C1190d modifierLocalManager2 = ((C1314v) AbstractC1248f.w(this)).getModifierLocalManager();
                    C1194h key2 = interfaceC1192f.getKey();
                    modifierLocalManager2.f10195b.b(this);
                    modifierLocalManager2.f10196c.b(key2);
                    modifierLocalManager2.a();
                }
            }
        }
        if ((this.f5860j & 4) != 0 && !z3) {
            AbstractC1248f.t(this, 2).Z0();
        }
        if ((this.f5860j & 2) != 0) {
            if (AbstractC1248f.d(this)) {
                Z z4 = this.f5865o;
                z2.h.c(z4);
                ((C1267z) z4).s1(this);
                e0 e0Var = z4.f10544L;
                if (e0Var != null) {
                    e0Var.invalidate();
                }
            }
            if (!z3) {
                AbstractC1248f.t(this, 2).Z0();
                AbstractC1248f.v(this).A();
            }
        }
        if (mVar instanceof C1223r) {
            ((C1223r) mVar).l(AbstractC1248f.v(this));
        }
        if ((this.f5860j & 256) != 0 && (mVar instanceof C1350d) && AbstractC1248f.d(this)) {
            AbstractC1248f.v(this).A();
        }
        if ((this.f5860j & 8) != 0) {
            ((C1314v) AbstractC1248f.w(this)).B();
        }
    }

    public final void L0() {
        if (!this.f5869t) {
            AbstractC0946A.r("unInitializeModifier called on unattached node");
            throw null;
        }
        V.m mVar = this.f10557u;
        if ((this.f5860j & 32) != 0) {
            if (mVar instanceof InterfaceC1192f) {
                C1190d modifierLocalManager = ((C1314v) AbstractC1248f.w(this)).getModifierLocalManager();
                C1194h key = ((InterfaceC1192f) mVar).getKey();
                modifierLocalManager.f10197d.b(AbstractC1248f.v(this));
                modifierLocalManager.f10198e.b(key);
                modifierLocalManager.a();
            }
            if (mVar instanceof InterfaceC1189c) {
                ((InterfaceC1189c) mVar).i(AbstractC1248f.f10576a);
            }
        }
        if ((this.f5860j & 8) != 0) {
            ((C1314v) AbstractC1248f.w(this)).B();
        }
    }

    public final void M0() {
        if (this.f5869t) {
            this.f10559w.clear();
            ((C1314v) AbstractC1248f.w(this)).getSnapshotObserver().a(this, C1247e.f10564j, new C1244b(this, 1));
        }
    }

    @Override // t0.g0
    public final boolean R() {
        return this.f5869t;
    }

    @Override // t0.k0
    public final void Y() {
        V.m mVar = this.f10557u;
        z2.h.d(mVar, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.PointerInputModifier");
        B1.t.v(mVar);
        throw null;
    }

    @Override // t0.InterfaceC1264w
    public final int a(InterfaceC1126o interfaceC1126o, InterfaceC1093G interfaceC1093G, int i2) {
        V.m mVar = this.f10557u;
        z2.h.d(mVar, "null cannot be cast to non-null type androidx.compose.ui.layout.LayoutModifier");
        return ((InterfaceC1131t) mVar).a(interfaceC1126o, interfaceC1093G, i2);
    }

    @Override // t0.InterfaceC1264w
    public final int b(InterfaceC1126o interfaceC1126o, InterfaceC1093G interfaceC1093G, int i2) {
        V.m mVar = this.f10557u;
        z2.h.d(mVar, "null cannot be cast to non-null type androidx.compose.ui.layout.LayoutModifier");
        return ((InterfaceC1131t) mVar).b(interfaceC1126o, interfaceC1093G, i2);
    }

    @Override // t0.InterfaceC1263v
    public final void b0(Z z3) {
    }

    @Override // Z.a
    public final O0.b c() {
        return AbstractC1248f.v(this).f10402x;
    }

    @Override // t0.InterfaceC1264w
    public final int d(InterfaceC1126o interfaceC1126o, InterfaceC1093G interfaceC1093G, int i2) {
        V.m mVar = this.f10557u;
        z2.h.d(mVar, "null cannot be cast to non-null type androidx.compose.ui.layout.LayoutModifier");
        return ((InterfaceC1131t) mVar).d(interfaceC1126o, interfaceC1093G, i2);
    }

    @Override // Z.a
    public final long e() {
        return l0.c.U(AbstractC1248f.t(this, 128).f9836j);
    }

    @Override // t0.InterfaceC1264w
    public final InterfaceC1095I f(InterfaceC1096J interfaceC1096J, InterfaceC1093G interfaceC1093G, long j3) {
        V.m mVar = this.f10557u;
        z2.h.d(mVar, "null cannot be cast to non-null type androidx.compose.ui.layout.LayoutModifier");
        return ((InterfaceC1131t) mVar).f(interfaceC1096J, interfaceC1093G, j3);
    }

    @Override // t0.InterfaceC1257o
    public final void g(C1238G c1238g) {
        V.m mVar = this.f10557u;
        z2.h.d(mVar, "null cannot be cast to non-null type androidx.compose.ui.draw.DrawModifier");
        ((Z.e) mVar).g(c1238g);
    }

    @Override // Z.a
    public final O0.k getLayoutDirection() {
        return AbstractC1248f.v(this).f10403y;
    }

    @Override // t0.InterfaceC1264w
    public final int h(InterfaceC1126o interfaceC1126o, InterfaceC1093G interfaceC1093G, int i2) {
        V.m mVar = this.f10557u;
        z2.h.d(mVar, "null cannot be cast to non-null type androidx.compose.ui.layout.LayoutModifier");
        return ((InterfaceC1131t) mVar).h(interfaceC1126o, interfaceC1093G, i2);
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
    @Override // s0.InterfaceC1191e, s0.InterfaceC1193g
    public final Object i(C1194h c1194h) {
        C0292u c0292u;
        this.f10559w.add(c1194h);
        V.n nVar = this.f5858h;
        if (!nVar.f5869t) {
            throw new IllegalStateException("visitAncestors called on an unattached node".toString());
        }
        V.n nVar2 = nVar.f5862l;
        C1236E v3 = AbstractC1248f.v(this);
        while (v3 != null) {
            if ((((V.n) v3.f10378C.f4244f).f5861k & 32) != 0) {
                while (nVar2 != null) {
                    if ((nVar2.f5860j & 32) != 0) {
                        AbstractC1256n abstractC1256n = nVar2;
                        ?? r4 = 0;
                        while (abstractC1256n != 0) {
                            if (abstractC1256n instanceof InterfaceC1191e) {
                                InterfaceC1191e interfaceC1191e = (InterfaceC1191e) abstractC1256n;
                                if (interfaceC1191e.m().g(c1194h)) {
                                    return interfaceC1191e.m().j(c1194h);
                                }
                            } else if ((abstractC1256n.f5860j & 32) != 0 && (abstractC1256n instanceof AbstractC1256n)) {
                                V.n nVar3 = abstractC1256n.f10608v;
                                int i2 = 0;
                                abstractC1256n = abstractC1256n;
                                r4 = r4;
                                while (nVar3 != null) {
                                    if ((nVar3.f5860j & 32) != 0) {
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
                            abstractC1256n = AbstractC1248f.f(r4);
                        }
                    }
                    nVar2 = nVar2.f5862l;
                }
            }
            v3 = v3.s();
            nVar2 = (v3 == null || (c0292u = v3.f10378C) == null) ? null : (n0) c0292u.f4243e;
        }
        return c1194h.f10200a.c();
    }

    @Override // t0.i0
    public final Object i0(Object obj) {
        V.m mVar = this.f10557u;
        z2.h.d(mVar, "null cannot be cast to non-null type androidx.compose.ui.layout.ParentDataModifier");
        return (C0802k) mVar;
    }

    @Override // t0.InterfaceC1257o
    public final void j0() {
        AbstractC1248f.n(this);
    }

    @Override // t0.m0
    public final void k(A0.k kVar) {
        V.m mVar = this.f10557u;
        z2.h.d(mVar, "null cannot be cast to non-null type androidx.compose.ui.semantics.SemanticsModifier");
        A0.k j3 = ((A0.l) mVar).j();
        z2.h.d(kVar, "null cannot be cast to non-null type androidx.compose.ui.semantics.SemanticsConfiguration");
        if (j3.f61i) {
            kVar.f61i = true;
        }
        if (j3.f62j) {
            kVar.f62j = true;
        }
        for (Map.Entry entry : j3.f60h.entrySet()) {
            A0.x xVar = (A0.x) entry.getKey();
            Object value = entry.getValue();
            LinkedHashMap linkedHashMap = kVar.f60h;
            if (!linkedHashMap.containsKey(xVar)) {
                linkedHashMap.put(xVar, value);
            } else if (value instanceof A0.a) {
                Object obj = linkedHashMap.get(xVar);
                z2.h.d(obj, "null cannot be cast to non-null type androidx.compose.ui.semantics.AccessibilityAction<*>");
                A0.a aVar = (A0.a) obj;
                String str = aVar.f16a;
                if (str == null) {
                    str = ((A0.a) value).f16a;
                }
                InterfaceC0861c interfaceC0861c = aVar.f17b;
                if (interfaceC0861c == null) {
                    interfaceC0861c = ((A0.a) value).f17b;
                }
                linkedHashMap.put(xVar, new A0.a(str, interfaceC0861c));
            }
        }
    }

    @Override // t0.k0
    public final boolean l0() {
        V.m mVar = this.f10557u;
        z2.h.d(mVar, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.PointerInputModifier");
        B1.t.v(mVar);
        throw null;
    }

    @Override // s0.InterfaceC1191e
    public final n1.E m() {
        C1187a c1187a = this.f10558v;
        return c1187a != null ? c1187a : C1188b.f10193a;
    }

    @Override // t0.InterfaceC1258p
    public final void q0(Z z3) {
        V.m mVar = this.f10557u;
        z2.h.d(mVar, "null cannot be cast to non-null type androidx.compose.ui.layout.OnGloballyPositionedModifier");
        C1350d c1350d = (C1350d) mVar;
        if (c1350d.f11341b) {
            return;
        }
        c1350d.f11341b = true;
        C1080k c1080k = c1350d.f11342c;
        if (c1080k != null) {
            c1080k.t(C0880v.f8657a);
        }
        c1350d.f11342c = null;
    }

    @Override // t0.k0
    public final void t0(C0930i c0930i, EnumC0931j enumC0931j, long j3) {
        V.m mVar = this.f10557u;
        z2.h.d(mVar, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.PointerInputModifier");
        B1.t.v(mVar);
        throw null;
    }

    public final String toString() {
        return this.f10557u.toString();
    }

    @Override // t0.k0
    public final boolean z() {
        V.m mVar = this.f10557u;
        z2.h.d(mVar, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.PointerInputModifier");
        B1.t.v(mVar);
        throw null;
    }
}
