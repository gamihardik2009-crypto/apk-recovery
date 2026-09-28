package a0;

import D.S;
import J.C0292u;
import J.E;
import android.graphics.Rect;
import android.view.FocusFinder;
import android.view.View;
import android.view.ViewGroup;
import java.util.Arrays;
import m.AbstractC0837j;
import n0.C0929h;
import r0.AbstractC1108W;
import r0.AbstractC1119h;
import s0.C1194h;
import t0.AbstractC1248f;
import t0.AbstractC1256n;
import t0.C1236E;
import t0.InterfaceC1255m;
import t0.Z;
import t0.n0;
import u0.C1314v;
import v.C1359m;
import v.C1361o;
import v.C1362p;
import v.InterfaceC1363q;

/* renamed from: a0.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0427d {

    /* renamed from: a, reason: collision with root package name */
    public static final int[] f6454a = new int[2];

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
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4, types: [L.d] */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7, types: [L.d] */
    public static final void A(C0442s c0442s) {
        C0292u c0292u;
        V.n nVar = c0442s.f5858h;
        if (!nVar.f5869t) {
            throw new IllegalStateException("visitAncestors called on an unattached node".toString());
        }
        C1236E v3 = AbstractC1248f.v(c0442s);
        V.n nVar2 = nVar;
        while (v3 != null) {
            if ((((V.n) v3.f10378C.f4244f).f5861k & 5120) != 0) {
                while (nVar2 != null) {
                    int i2 = nVar2.f5860j;
                    if ((i2 & 5120) != 0) {
                        if (nVar2 != nVar && (i2 & 1024) != 0) {
                            return;
                        }
                        if ((i2 & 4096) != 0) {
                            AbstractC1256n abstractC1256n = nVar2;
                            ?? r4 = 0;
                            while (abstractC1256n != 0) {
                                if (abstractC1256n instanceof InterfaceC0426c) {
                                    InterfaceC0426c interfaceC0426c = (InterfaceC0426c) abstractC1256n;
                                    interfaceC0426c.D(o(interfaceC0426c));
                                } else if ((abstractC1256n.f5860j & 4096) != 0 && (abstractC1256n instanceof AbstractC1256n)) {
                                    V.n nVar3 = abstractC1256n.f10608v;
                                    int i3 = 0;
                                    abstractC1256n = abstractC1256n;
                                    r4 = r4;
                                    while (nVar3 != null) {
                                        if ((nVar3.f5860j & 4096) != 0) {
                                            i3++;
                                            r4 = r4;
                                            if (i3 == 1) {
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
                                    if (i3 == 1) {
                                    }
                                }
                                abstractC1256n = AbstractC1248f.f(r4);
                            }
                        }
                    }
                    nVar2 = nVar2.f5862l;
                }
            }
            v3 = v3.s();
            nVar2 = (v3 == null || (c0292u = v3.f10378C) == null) ? null : (n0) c0292u.f4243e;
        }
    }

    public static final boolean B(C0442s c0442s) {
        Boolean C3 = C(c0442s, 7);
        if (C3 != null) {
            return C3.booleanValue();
        }
        return false;
    }

    public static final Boolean C(C0442s c0442s, int i2) {
        Boolean valueOf;
        S F = F(c0442s);
        C0443t c0443t = new C0443t(c0442s, 1);
        try {
            if (F.f762b) {
                S.a(F);
            }
            F.f762b = true;
            ((L.d) F.f764d).b(c0443t);
            int d3 = AbstractC0837j.d(w(c0442s, i2));
            if (d3 != 0) {
                if (d3 != 1) {
                    if (d3 == 2) {
                        valueOf = Boolean.TRUE;
                    } else if (d3 != 3) {
                        throw new J2.r();
                    }
                }
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(x(c0442s));
            }
            return valueOf;
        } finally {
            S.b(F);
        }
    }

    public static final boolean D(C0442s c0442s, C0442s c0442s2) {
        V.n nVar;
        V.n nVar2;
        C0292u c0292u;
        C0292u c0292u2;
        V.n nVar3 = c0442s2.f5858h;
        if (!nVar3.f5869t) {
            throw new IllegalStateException("visitAncestors called on an unattached node".toString());
        }
        V.n nVar4 = nVar3.f5862l;
        C1236E v3 = AbstractC1248f.v(c0442s2);
        loop0: while (true) {
            if (v3 == null) {
                nVar = null;
                break;
            }
            if ((((V.n) v3.f10378C.f4244f).f5861k & 1024) != 0) {
                while (nVar4 != null) {
                    if ((nVar4.f5860j & 1024) != 0) {
                        nVar = nVar4;
                        L.d dVar = null;
                        while (nVar != null) {
                            if (nVar instanceof C0442s) {
                                break loop0;
                            }
                            if ((nVar.f5860j & 1024) != 0 && (nVar instanceof AbstractC1256n)) {
                                int i2 = 0;
                                for (V.n nVar5 = ((AbstractC1256n) nVar).f10608v; nVar5 != null; nVar5 = nVar5.f5863m) {
                                    if ((nVar5.f5860j & 1024) != 0) {
                                        i2++;
                                        if (i2 == 1) {
                                            nVar = nVar5;
                                        } else {
                                            if (dVar == null) {
                                                dVar = new L.d(new V.n[16]);
                                            }
                                            if (nVar != null) {
                                                dVar.b(nVar);
                                                nVar = null;
                                            }
                                            dVar.b(nVar5);
                                        }
                                    }
                                }
                                if (i2 == 1) {
                                }
                            }
                            nVar = AbstractC1248f.f(dVar);
                        }
                    }
                    nVar4 = nVar4.f5862l;
                }
            }
            v3 = v3.s();
            nVar4 = (v3 == null || (c0292u2 = v3.f10378C) == null) ? null : (n0) c0292u2.f4243e;
        }
        if (!z2.h.a(nVar, c0442s)) {
            throw new IllegalStateException("Non child node cannot request focus.".toString());
        }
        int ordinal = c0442s.L0().ordinal();
        EnumC0441r enumC0441r = EnumC0441r.f6489i;
        if (ordinal == 0) {
            p(c0442s2);
            c0442s.P0(enumC0441r);
        } else if (ordinal != 1) {
            if (ordinal == 2) {
                return false;
            }
            if (ordinal != 3) {
                throw new J2.r();
            }
            V.n nVar6 = c0442s.f5858h;
            if (!nVar6.f5869t) {
                throw new IllegalStateException("visitAncestors called on an unattached node".toString());
            }
            V.n nVar7 = nVar6.f5862l;
            C1236E v4 = AbstractC1248f.v(c0442s);
            loop4: while (true) {
                if (v4 == null) {
                    nVar2 = null;
                    break;
                }
                if ((((V.n) v4.f10378C.f4244f).f5861k & 1024) != 0) {
                    while (nVar7 != null) {
                        if ((nVar7.f5860j & 1024) != 0) {
                            nVar2 = nVar7;
                            L.d dVar2 = null;
                            while (nVar2 != null) {
                                if (nVar2 instanceof C0442s) {
                                    break loop4;
                                }
                                if ((nVar2.f5860j & 1024) != 0 && (nVar2 instanceof AbstractC1256n)) {
                                    int i3 = 0;
                                    for (V.n nVar8 = ((AbstractC1256n) nVar2).f10608v; nVar8 != null; nVar8 = nVar8.f5863m) {
                                        if ((nVar8.f5860j & 1024) != 0) {
                                            i3++;
                                            if (i3 == 1) {
                                                nVar2 = nVar8;
                                            } else {
                                                if (dVar2 == null) {
                                                    dVar2 = new L.d(new V.n[16]);
                                                }
                                                if (nVar2 != null) {
                                                    dVar2.b(nVar2);
                                                    nVar2 = null;
                                                }
                                                dVar2.b(nVar8);
                                            }
                                        }
                                    }
                                    if (i3 == 1) {
                                    }
                                }
                                nVar2 = AbstractC1248f.f(dVar2);
                            }
                        }
                        nVar7 = nVar7.f5862l;
                    }
                }
                v4 = v4.s();
                nVar7 = (v4 == null || (c0292u = v4.f10378C) == null) ? null : (n0) c0292u.f4243e;
            }
            C0442s c0442s3 = (C0442s) nVar2;
            if (c0442s3 != null || !((Boolean) ((androidx.compose.ui.focus.b) ((C1314v) AbstractC1248f.w(c0442s)).getFocusOwner()).f6741a.j(null, null)).booleanValue()) {
                if (c0442s3 == null || !D(c0442s3, c0442s)) {
                    return false;
                }
                boolean D3 = D(c0442s, c0442s2);
                if (c0442s.L0() != enumC0441r) {
                    throw new IllegalStateException("Deactivated node is focused".toString());
                }
                if (!D3) {
                    return D3;
                }
                A(c0442s3);
                return D3;
            }
            p(c0442s2);
            c0442s.P0(enumC0441r);
        } else {
            if (n(c0442s) == null) {
                throw new IllegalArgumentException("ActiveParent with no focused child".toString());
            }
            C0442s n3 = n(c0442s);
            if (n3 != null && !e(n3, false, true)) {
                return false;
            }
            p(c0442s2);
        }
        return true;
    }

    public static final boolean E(View view, Integer num, Rect rect) {
        if (!(view instanceof ViewGroup)) {
            return view.requestFocus(num.intValue(), rect);
        }
        ViewGroup viewGroup = (ViewGroup) view;
        if (viewGroup.isFocused()) {
            return true;
        }
        if ((!viewGroup.isFocusable() || view.hasFocus()) && !(view instanceof C1314v)) {
            if (rect != null) {
                View findNextFocusFromRect = FocusFinder.getInstance().findNextFocusFromRect(viewGroup, rect, num.intValue());
                return findNextFocusFromRect != null ? findNextFocusFromRect.requestFocus(num.intValue(), rect) : view.requestFocus(num.intValue(), rect);
            }
            View findNextFocus = FocusFinder.getInstance().findNextFocus(viewGroup, view.hasFocus() ? view.findFocus() : null, num.intValue());
            return findNextFocus != null ? findNextFocus.requestFocus(num.intValue()) : view.requestFocus(num.intValue());
        }
        return view.requestFocus(num.intValue(), rect);
    }

    public static final S F(C0442s c0442s) {
        return ((androidx.compose.ui.focus.b) ((C1314v) AbstractC1248f.w(c0442s)).getFocusOwner()).f6748h;
    }

    public static final Object G(C0442s c0442s, int i2, y2.c cVar) {
        int i3;
        Object obj;
        V.n nVar;
        InterfaceC1363q interfaceC1363q;
        C0292u c0292u;
        V.n nVar2 = c0442s.f5858h;
        if (!nVar2.f5869t) {
            throw new IllegalStateException("visitAncestors called on an unattached node".toString());
        }
        V.n nVar3 = nVar2.f5862l;
        C1236E v3 = AbstractC1248f.v(c0442s);
        loop0: while (true) {
            i3 = 1;
            obj = null;
            if (v3 == null) {
                nVar = null;
                break;
            }
            if ((((V.n) v3.f10378C.f4244f).f5861k & 1024) != 0) {
                while (nVar3 != null) {
                    if ((nVar3.f5860j & 1024) != 0) {
                        nVar = nVar3;
                        L.d dVar = null;
                        while (nVar != null) {
                            if (nVar instanceof C0442s) {
                                break loop0;
                            }
                            if ((nVar.f5860j & 1024) != 0 && (nVar instanceof AbstractC1256n)) {
                                int i4 = 0;
                                for (V.n nVar4 = ((AbstractC1256n) nVar).f10608v; nVar4 != null; nVar4 = nVar4.f5863m) {
                                    if ((nVar4.f5860j & 1024) != 0) {
                                        i4++;
                                        if (i4 == 1) {
                                            nVar = nVar4;
                                        } else {
                                            if (dVar == null) {
                                                dVar = new L.d(new V.n[16]);
                                            }
                                            if (nVar != null) {
                                                dVar.b(nVar);
                                                nVar = null;
                                            }
                                            dVar.b(nVar4);
                                        }
                                    }
                                }
                                if (i4 == 1) {
                                }
                            }
                            nVar = AbstractC1248f.f(dVar);
                        }
                    }
                    nVar3 = nVar3.f5862l;
                }
            }
            v3 = v3.s();
            nVar3 = (v3 == null || (c0292u = v3.f10378C) == null) ? null : (n0) c0292u.f4243e;
        }
        C0442s c0442s2 = (C0442s) nVar;
        if (c0442s2 != null) {
            C1194h c1194h = AbstractC1119h.f9871a;
            if (z2.h.a((C1362p) c0442s2.i(c1194h), (C1362p) c0442s.i(c1194h))) {
                return null;
            }
        }
        C1362p c1362p = (C1362p) c0442s.i(AbstractC1119h.f9871a);
        if (c1362p == null) {
            return null;
        }
        int i5 = 5;
        if (!C0425b.a(i2, 5)) {
            i5 = 6;
            if (!C0425b.a(i2, 6)) {
                i5 = 3;
                if (!C0425b.a(i2, 3)) {
                    i5 = 4;
                    if (!C0425b.a(i2, 4)) {
                        if (C0425b.a(i2, 1)) {
                            i3 = 2;
                        } else if (!C0425b.a(i2, 2)) {
                            throw new IllegalStateException("Unsupported direction for beyond bounds layout".toString());
                        }
                        interfaceC1363q = c1362p.f11383b;
                        if (interfaceC1363q.a() > 0 || !interfaceC1363q.d()) {
                            return cVar.l(C1362p.f11382g);
                        }
                        int b3 = c1362p.m(i3) ? interfaceC1363q.b() : interfaceC1363q.c();
                        z2.s sVar = new z2.s();
                        C0929h c0929h = c1362p.f11384c;
                        c0929h.getClass();
                        C1359m c1359m = new C1359m(b3, b3);
                        L.d dVar2 = c0929h.f8942a;
                        dVar2.b(c1359m);
                        sVar.f11909h = c1359m;
                        while (obj == null && c1362p.l((C1359m) sVar.f11909h, i3)) {
                            C1359m c1359m2 = (C1359m) sVar.f11909h;
                            int i6 = c1359m2.f11377a;
                            boolean m3 = c1362p.m(i3);
                            int i7 = c1359m2.f11378b;
                            if (m3) {
                                i7++;
                            } else {
                                i6--;
                            }
                            C1359m c1359m3 = new C1359m(i6, i7);
                            dVar2.b(c1359m3);
                            dVar2.m((C1359m) sVar.f11909h);
                            sVar.f11909h = c1359m3;
                            interfaceC1363q.e();
                            obj = cVar.l(new C1361o(c1362p, sVar, i3));
                        }
                        dVar2.m((C1359m) sVar.f11909h);
                        interfaceC1363q.e();
                        return obj;
                    }
                }
            }
        }
        i3 = i5;
        interfaceC1363q = c1362p.f11383b;
        if (interfaceC1363q.a() > 0) {
        }
        return cVar.l(C1362p.f11382g);
    }

    public static final boolean H(C0442s c0442s, C0442s c0442s2, int i2, y2.c cVar) {
        V.n nVar;
        C0292u c0292u;
        if (c0442s.L0() != EnumC0441r.f6489i) {
            throw new IllegalStateException("This function should only be used within a parent that has focus.".toString());
        }
        Object[] objArr = new C0442s[16];
        V.n nVar2 = c0442s.f5858h;
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
        int i3 = 0;
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
                                C0442s c0442s3 = (C0442s) nVar4;
                                int i4 = i3 + 1;
                                if (objArr.length < i4) {
                                    objArr = Arrays.copyOf(objArr, Math.max(i4, objArr.length * 2));
                                    z2.h.e(objArr, "copyOf(this, newSize)");
                                }
                                objArr[i3] = c0442s3;
                                i3 = i4;
                            } else if ((nVar4.f5860j & 1024) != 0 && (nVar4 instanceof AbstractC1256n)) {
                                int i5 = 0;
                                for (V.n nVar5 = ((AbstractC1256n) nVar4).f10608v; nVar5 != null; nVar5 = nVar5.f5863m) {
                                    if ((nVar5.f5860j & 1024) != 0) {
                                        i5++;
                                        if (i5 == 1) {
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
                                if (i5 == 1) {
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
        C0444u c0444u = C0444u.f6497a;
        z2.h.f(objArr, "<this>");
        Arrays.sort(objArr, 0, i3, c0444u);
        if (C0425b.a(i2, 1)) {
            int i6 = new E2.d(0, i3 - 1, 1).f1077i;
            if (i6 >= 0) {
                boolean z3 = false;
                int i7 = 0;
                while (true) {
                    if (z3) {
                        C0442s c0442s4 = (C0442s) objArr[i7];
                        if (t(c0442s4) && k(c0442s4, cVar)) {
                            return true;
                        }
                    }
                    if (z2.h.a(objArr[i7], c0442s2)) {
                        z3 = true;
                    }
                    if (i7 == i6) {
                        break;
                    }
                    i7++;
                }
            }
        } else {
            if (!C0425b.a(i2, 2)) {
                throw new IllegalStateException("This function should only be used for 1-D focus search".toString());
            }
            int i8 = new E2.d(0, i3 - 1, 1).f1077i;
            if (i8 >= 0) {
                boolean z4 = false;
                while (true) {
                    if (z4) {
                        C0442s c0442s5 = (C0442s) objArr[i8];
                        if (t(c0442s5) && a(c0442s5, cVar)) {
                            return true;
                        }
                    }
                    if (z2.h.a(objArr[i8], c0442s2)) {
                        z4 = true;
                    }
                    if (i8 == 0) {
                        break;
                    }
                    i8--;
                }
            }
        }
        if (!C0425b.a(i2, 1) && c0442s.K0().f6471a) {
            V.n nVar6 = c0442s.f5858h;
            if (!nVar6.f5869t) {
                throw new IllegalStateException("visitAncestors called on an unattached node".toString());
            }
            V.n nVar7 = nVar6.f5862l;
            C1236E v3 = AbstractC1248f.v(c0442s);
            loop5: while (true) {
                if (v3 == null) {
                    nVar = null;
                    break;
                }
                if ((((V.n) v3.f10378C.f4244f).f5861k & 1024) != 0) {
                    while (nVar7 != null) {
                        if ((nVar7.f5860j & 1024) != 0) {
                            V.n nVar8 = nVar7;
                            L.d dVar3 = null;
                            while (nVar8 != null) {
                                if (nVar8 instanceof C0442s) {
                                    nVar = nVar8;
                                    break loop5;
                                }
                                if ((nVar8.f5860j & 1024) != 0 && (nVar8 instanceof AbstractC1256n)) {
                                    int i9 = 0;
                                    for (V.n nVar9 = ((AbstractC1256n) nVar8).f10608v; nVar9 != null; nVar9 = nVar9.f5863m) {
                                        if ((nVar9.f5860j & 1024) != 0) {
                                            i9++;
                                            if (i9 == 1) {
                                                nVar8 = nVar9;
                                            } else {
                                                if (dVar3 == null) {
                                                    dVar3 = new L.d(new V.n[16]);
                                                }
                                                if (nVar8 != null) {
                                                    dVar3.b(nVar8);
                                                    nVar8 = null;
                                                }
                                                dVar3.b(nVar9);
                                            }
                                        }
                                    }
                                    if (i9 == 1) {
                                    }
                                }
                                nVar8 = AbstractC1248f.f(dVar3);
                            }
                        }
                        nVar7 = nVar7.f5862l;
                    }
                }
                v3 = v3.s();
                nVar7 = (v3 == null || (c0292u = v3.f10378C) == null) ? null : (n0) c0292u.f4243e;
            }
            if (nVar != null) {
                return ((Boolean) cVar.l(c0442s)).booleanValue();
            }
        }
        return false;
    }

    public static final boolean I(C0442s c0442s, b0.d dVar, int i2, y2.c cVar) {
        C0442s h2;
        L.d dVar2 = new L.d(new C0442s[16]);
        V.n nVar = c0442s.f5858h;
        if (!nVar.f5869t) {
            throw new IllegalStateException("visitChildren called on an unattached node".toString());
        }
        L.d dVar3 = new L.d(new V.n[16]);
        V.n nVar2 = nVar.f5863m;
        if (nVar2 == null) {
            AbstractC1248f.b(dVar3, nVar);
        } else {
            dVar3.b(nVar2);
        }
        while (dVar3.l()) {
            V.n nVar3 = (V.n) dVar3.n(dVar3.f4620j - 1);
            if ((nVar3.f5861k & 1024) == 0) {
                AbstractC1248f.b(dVar3, nVar3);
            } else {
                while (true) {
                    if (nVar3 == null) {
                        break;
                    }
                    if ((nVar3.f5860j & 1024) != 0) {
                        L.d dVar4 = null;
                        while (nVar3 != null) {
                            if (nVar3 instanceof C0442s) {
                                C0442s c0442s2 = (C0442s) nVar3;
                                if (c0442s2.f5869t) {
                                    dVar2.b(c0442s2);
                                }
                            } else if ((nVar3.f5860j & 1024) != 0 && (nVar3 instanceof AbstractC1256n)) {
                                int i3 = 0;
                                for (V.n nVar4 = ((AbstractC1256n) nVar3).f10608v; nVar4 != null; nVar4 = nVar4.f5863m) {
                                    if ((nVar4.f5860j & 1024) != 0) {
                                        i3++;
                                        if (i3 == 1) {
                                            nVar3 = nVar4;
                                        } else {
                                            if (dVar4 == null) {
                                                dVar4 = new L.d(new V.n[16]);
                                            }
                                            if (nVar3 != null) {
                                                dVar4.b(nVar3);
                                                nVar3 = null;
                                            }
                                            dVar4.b(nVar4);
                                        }
                                    }
                                }
                                if (i3 == 1) {
                                }
                            }
                            nVar3 = AbstractC1248f.f(dVar4);
                        }
                    } else {
                        nVar3 = nVar3.f5863m;
                    }
                }
            }
        }
        while (dVar2.l() && (h2 = h(dVar2, dVar, i2)) != null) {
            if (h2.K0().f6471a) {
                return ((Boolean) cVar.l(h2)).booleanValue();
            }
            if (m(h2, dVar, i2, cVar)) {
                return true;
            }
            dVar2.m(h2);
        }
        return false;
    }

    public static final Integer J(int i2) {
        if (C0425b.a(i2, 5)) {
            return 33;
        }
        if (C0425b.a(i2, 6)) {
            return 130;
        }
        if (C0425b.a(i2, 3)) {
            return 17;
        }
        if (C0425b.a(i2, 4)) {
            return 66;
        }
        if (C0425b.a(i2, 1)) {
            return 2;
        }
        return C0425b.a(i2, 2) ? 1 : null;
    }

    public static final C0425b K(int i2) {
        if (i2 == 1) {
            return new C0425b(2);
        }
        if (i2 == 2) {
            return new C0425b(1);
        }
        if (i2 == 17) {
            return new C0425b(3);
        }
        if (i2 == 33) {
            return new C0425b(5);
        }
        if (i2 == 66) {
            return new C0425b(4);
        }
        if (i2 != 130) {
            return null;
        }
        return new C0425b(6);
    }

    public static final Boolean L(C0442s c0442s, int i2, b0.d dVar, L2.d dVar2) {
        int ordinal = c0442s.L0().ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                C0442s n3 = n(c0442s);
                if (n3 == null) {
                    throw new IllegalStateException("ActiveParent must have a focusedChild".toString());
                }
                int ordinal2 = n3.L0().ordinal();
                if (ordinal2 != 0) {
                    if (ordinal2 == 1) {
                        Boolean L3 = L(n3, i2, dVar, dVar2);
                        if (!z2.h.a(L3, Boolean.FALSE)) {
                            return L3;
                        }
                        if (dVar == null) {
                            if (n3.L0() != EnumC0441r.f6489i) {
                                throw new IllegalStateException("Searching for active node in inactive hierarchy".toString());
                            }
                            C0442s g3 = g(n3);
                            if (g3 == null) {
                                throw new IllegalStateException("ActiveParent must have a focusedChild".toString());
                            }
                            dVar = j(g3);
                        }
                        return Boolean.valueOf(m(c0442s, dVar, i2, dVar2));
                    }
                    if (ordinal2 != 2) {
                        if (ordinal2 != 3) {
                            throw new J2.r();
                        }
                        throw new IllegalStateException("ActiveParent must have a focusedChild".toString());
                    }
                }
                if (dVar == null) {
                    dVar = j(n3);
                }
                return Boolean.valueOf(m(c0442s, dVar, i2, dVar2));
            }
            if (ordinal != 2) {
                if (ordinal == 3) {
                    return c0442s.K0().f6471a ? (Boolean) dVar2.l(c0442s) : dVar == null ? Boolean.valueOf(i(c0442s, i2, dVar2)) : Boolean.valueOf(I(c0442s, dVar, i2, dVar2));
                }
                throw new J2.r();
            }
        }
        return Boolean.valueOf(i(c0442s, i2, dVar2));
    }

    public static final boolean a(C0442s c0442s, y2.c cVar) {
        int ordinal = c0442s.L0().ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                C0442s n3 = n(c0442s);
                if (n3 == null) {
                    throw new IllegalStateException("ActiveParent must have a focusedChild".toString());
                }
                int ordinal2 = n3.L0().ordinal();
                if (ordinal2 != 0) {
                    if (ordinal2 != 1) {
                        if (ordinal2 != 2) {
                            if (ordinal2 != 3) {
                                throw new J2.r();
                            }
                            throw new IllegalStateException("ActiveParent must have a focusedChild".toString());
                        }
                    } else if (!a(n3, cVar) && !l(c0442s, n3, 2, cVar) && (!n3.K0().f6471a || !((Boolean) cVar.l(n3)).booleanValue())) {
                        return false;
                    }
                }
                return l(c0442s, n3, 2, cVar);
            }
            if (ordinal != 2) {
                if (ordinal != 3) {
                    throw new J2.r();
                }
                if (!y(c0442s, cVar) && (!c0442s.K0().f6471a || !((Boolean) cVar.l(c0442s)).booleanValue())) {
                    return false;
                }
            }
            return true;
        }
        return y(c0442s, cVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x005b, code lost:
    
        if (a0.C0425b.a(r19, 3) != false) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0061, code lost:
    
        if (a0.C0425b.a(r19, 4) == false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0068, code lost:
    
        if (a0.C0425b.a(r19, 3) == false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x006a, code lost:
    
        r1 = r0 - r17.f7062c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x008d, code lost:
    
        r1 = java.lang.Math.max(0.0f, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0096, code lost:
    
        if (a0.C0425b.a(r19, 3) == false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0098, code lost:
    
        r0 = r0 - r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00bc, code lost:
    
        if (r1 >= java.lang.Math.max(1.0f, r0)) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x009e, code lost:
    
        if (a0.C0425b.a(r19, 4) == false) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00a0, code lost:
    
        r0 = r2 - r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00a7, code lost:
    
        if (a0.C0425b.a(r19, 5) == false) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00a9, code lost:
    
        r0 = r5 - r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00b0, code lost:
    
        if (a0.C0425b.a(r19, 6) == false) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00b2, code lost:
    
        r0 = r13 - r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00cb, code lost:
    
        throw new java.lang.IllegalStateException("This function should only be used for 2-D focus search".toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0073, code lost:
    
        if (a0.C0425b.a(r19, 4) == false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0075, code lost:
    
        r1 = r17.f7060a - r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x007d, code lost:
    
        if (a0.C0425b.a(r19, 5) == false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x007f, code lost:
    
        r1 = r5 - r17.f7063d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0088, code lost:
    
        if (a0.C0425b.a(r19, 6) == false) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x008a, code lost:
    
        r1 = r17.f7061b - r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00d5, code lost:
    
        throw new java.lang.IllegalStateException("This function should only be used for 2-D focus search".toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x003f, code lost:
    
        if (r7 <= r14) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x004a, code lost:
    
        if (r5 >= r13) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0055, code lost:
    
        if (r15 <= r12) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0034, code lost:
    
        if (r0 >= r2) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x00be, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean b(b0.d r16, b0.d r17, b0.d r18, int r19) {
        /*
            Method dump skipped, instructions count: 225
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a0.AbstractC0427d.b(b0.d, b0.d, b0.d, int):boolean");
    }

    public static final boolean c(int i2, b0.d dVar, b0.d dVar2) {
        if (C0425b.a(i2, 3) || C0425b.a(i2, 4)) {
            if (dVar.f7063d <= dVar2.f7061b || dVar.f7061b >= dVar2.f7063d) {
                return false;
            }
        } else {
            if (!C0425b.a(i2, 5) && !C0425b.a(i2, 6)) {
                throw new IllegalStateException("This function should only be used for 2-D focus search".toString());
            }
            if (dVar.f7062c <= dVar2.f7060a || dVar.f7060a >= dVar2.f7062c) {
                return false;
            }
        }
        return true;
    }

    public static final b0.d d(View view) {
        int[] iArr = f6454a;
        view.getLocationInWindow(iArr);
        int i2 = iArr[0];
        return new b0.d(i2, iArr[1], i2 + view.getWidth(), iArr[1] + view.getHeight());
    }

    public static final boolean e(C0442s c0442s, boolean z3, boolean z4) {
        int ordinal = c0442s.L0().ordinal();
        EnumC0441r enumC0441r = EnumC0441r.f6490j;
        if (ordinal == 0) {
            c0442s.P0(enumC0441r);
            if (z4) {
                A(c0442s);
            }
        } else if (ordinal == 1) {
            C0442s n3 = n(c0442s);
            if (!(n3 != null ? e(n3, z3, z4) : true)) {
                return false;
            }
            c0442s.P0(enumC0441r);
            if (z4) {
                A(c0442s);
            }
        } else {
            if (ordinal == 2) {
                if (!z3) {
                    return z3;
                }
                c0442s.P0(enumC0441r);
                if (!z4) {
                    return z3;
                }
                A(c0442s);
                return z3;
            }
            if (ordinal != 3) {
                throw new J2.r();
            }
        }
        return true;
    }

    public static final void f(InterfaceC1255m interfaceC1255m, L.d dVar) {
        V.n nVar = ((V.n) interfaceC1255m).f5858h;
        if (!nVar.f5869t) {
            throw new IllegalStateException("visitChildren called on an unattached node".toString());
        }
        L.d dVar2 = new L.d(new V.n[16]);
        V.n nVar2 = nVar.f5863m;
        if (nVar2 == null) {
            AbstractC1248f.b(dVar2, nVar);
        } else {
            dVar2.b(nVar2);
        }
        while (dVar2.l()) {
            V.n nVar3 = (V.n) dVar2.n(dVar2.f4620j - 1);
            if ((nVar3.f5861k & 1024) == 0) {
                AbstractC1248f.b(dVar2, nVar3);
            } else {
                while (true) {
                    if (nVar3 == null) {
                        break;
                    }
                    if ((nVar3.f5860j & 1024) != 0) {
                        L.d dVar3 = null;
                        while (nVar3 != null) {
                            if (nVar3 instanceof C0442s) {
                                C0442s c0442s = (C0442s) nVar3;
                                if (c0442s.f5869t && !AbstractC1248f.v(c0442s).f10384K) {
                                    if (c0442s.K0().f6471a) {
                                        dVar.b(c0442s);
                                    } else {
                                        f(c0442s, dVar);
                                    }
                                }
                            } else if ((nVar3.f5860j & 1024) != 0 && (nVar3 instanceof AbstractC1256n)) {
                                int i2 = 0;
                                for (V.n nVar4 = ((AbstractC1256n) nVar3).f10608v; nVar4 != null; nVar4 = nVar4.f5863m) {
                                    if ((nVar4.f5860j & 1024) != 0) {
                                        i2++;
                                        if (i2 == 1) {
                                            nVar3 = nVar4;
                                        } else {
                                            if (dVar3 == null) {
                                                dVar3 = new L.d(new V.n[16]);
                                            }
                                            if (nVar3 != null) {
                                                dVar3.b(nVar3);
                                                nVar3 = null;
                                            }
                                            dVar3.b(nVar4);
                                        }
                                    }
                                }
                                if (i2 == 1) {
                                }
                            }
                            nVar3 = AbstractC1248f.f(dVar3);
                        }
                    } else {
                        nVar3 = nVar3.f5863m;
                    }
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:69:0x0035, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final a0.C0442s g(a0.C0442s r8) {
        /*
            a0.r r0 = r8.L0()
            int r0 = r0.ordinal()
            if (r0 == 0) goto Lb1
            r1 = 1
            r2 = 0
            if (r0 == r1) goto L1b
            r1 = 2
            if (r0 == r1) goto Lb1
            r8 = 3
            if (r0 != r8) goto L15
            return r2
        L15:
            J2.r r8 = new J2.r
            r8.<init>()
            throw r8
        L1b:
            V.n r8 = r8.f5858h
            boolean r0 = r8.f5869t
            if (r0 == 0) goto La5
            L.d r0 = new L.d
            r3 = 16
            V.n[] r4 = new V.n[r3]
            r0.<init>(r4)
            V.n r4 = r8.f5863m
            if (r4 != 0) goto L32
            t0.AbstractC1248f.b(r0, r8)
            goto L35
        L32:
            r0.b(r4)
        L35:
            boolean r8 = r0.l()
            if (r8 == 0) goto La4
            int r8 = r0.f4620j
            int r8 = r8 - r1
            java.lang.Object r8 = r0.n(r8)
            V.n r8 = (V.n) r8
            int r4 = r8.f5861k
            r4 = r4 & 1024(0x400, float:1.435E-42)
            if (r4 != 0) goto L4e
            t0.AbstractC1248f.b(r0, r8)
            goto L35
        L4e:
            if (r8 == 0) goto L35
            int r4 = r8.f5860j
            r4 = r4 & 1024(0x400, float:1.435E-42)
            if (r4 == 0) goto La1
            r4 = r2
        L57:
            if (r8 == 0) goto L35
            boolean r5 = r8 instanceof a0.C0442s
            if (r5 == 0) goto L66
            a0.s r8 = (a0.C0442s) r8
            a0.s r8 = g(r8)
            if (r8 == 0) goto L9c
            return r8
        L66:
            int r5 = r8.f5860j
            r5 = r5 & 1024(0x400, float:1.435E-42)
            if (r5 == 0) goto L9c
            boolean r5 = r8 instanceof t0.AbstractC1256n
            if (r5 == 0) goto L9c
            r5 = r8
            t0.n r5 = (t0.AbstractC1256n) r5
            V.n r5 = r5.f10608v
            r6 = 0
        L76:
            if (r5 == 0) goto L99
            int r7 = r5.f5860j
            r7 = r7 & 1024(0x400, float:1.435E-42)
            if (r7 == 0) goto L96
            int r6 = r6 + 1
            if (r6 != r1) goto L84
            r8 = r5
            goto L96
        L84:
            if (r4 != 0) goto L8d
            L.d r4 = new L.d
            V.n[] r7 = new V.n[r3]
            r4.<init>(r7)
        L8d:
            if (r8 == 0) goto L93
            r4.b(r8)
            r8 = r2
        L93:
            r4.b(r5)
        L96:
            V.n r5 = r5.f5863m
            goto L76
        L99:
            if (r6 != r1) goto L9c
            goto L57
        L9c:
            V.n r8 = t0.AbstractC1248f.f(r4)
            goto L57
        La1:
            V.n r8 = r8.f5863m
            goto L4e
        La4:
            return r2
        La5:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "visitChildren called on an unattached node"
            java.lang.String r0 = r0.toString()
            r8.<init>(r0)
            throw r8
        Lb1:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: a0.AbstractC0427d.g(a0.s):a0.s");
    }

    public static final C0442s h(L.d dVar, b0.d dVar2, int i2) {
        b0.d h2;
        if (C0425b.a(i2, 3)) {
            h2 = dVar2.h(dVar2.d() + 1, 0.0f);
        } else if (C0425b.a(i2, 4)) {
            h2 = dVar2.h(-(dVar2.d() + 1), 0.0f);
        } else if (C0425b.a(i2, 5)) {
            h2 = dVar2.h(0.0f, dVar2.c() + 1);
        } else {
            if (!C0425b.a(i2, 6)) {
                throw new IllegalStateException("This function should only be used for 2-D focus search".toString());
            }
            h2 = dVar2.h(0.0f, -(dVar2.c() + 1));
        }
        int i3 = dVar.f4620j;
        C0442s c0442s = null;
        if (i3 > 0) {
            Object[] objArr = dVar.f4618h;
            int i4 = 0;
            do {
                C0442s c0442s2 = (C0442s) objArr[i4];
                if (t(c0442s2)) {
                    b0.d j3 = j(c0442s2);
                    if (r(i2, j3, dVar2) && (!r(i2, h2, dVar2) || b(dVar2, j3, h2, i2) || (!b(dVar2, h2, j3, i2) && s(i2, dVar2, j3) < s(i2, dVar2, h2)))) {
                        c0442s = c0442s2;
                        h2 = j3;
                    }
                }
                i4++;
            } while (i4 < i3);
        }
        return c0442s;
    }

    public static final boolean i(C0442s c0442s, int i2, y2.c cVar) {
        b0.d dVar;
        L.d dVar2 = new L.d(new C0442s[16]);
        f(c0442s, dVar2);
        if (dVar2.f4620j <= 1) {
            C0442s c0442s2 = (C0442s) (dVar2.k() ? null : dVar2.f4618h[0]);
            if (c0442s2 != null) {
                return ((Boolean) cVar.l(c0442s2)).booleanValue();
            }
            return false;
        }
        if (C0425b.a(i2, 7)) {
            i2 = 4;
        }
        if (C0425b.a(i2, 4) || C0425b.a(i2, 6)) {
            b0.d j3 = j(c0442s);
            float f3 = j3.f7061b;
            float f4 = j3.f7060a;
            dVar = new b0.d(f4, f3, f4, f3);
        } else {
            if (!C0425b.a(i2, 3) && !C0425b.a(i2, 5)) {
                throw new IllegalStateException("This function should only be used for 2-D focus search".toString());
            }
            b0.d j4 = j(c0442s);
            float f5 = j4.f7063d;
            float f6 = j4.f7062c;
            dVar = new b0.d(f6, f5, f6, f5);
        }
        C0442s h2 = h(dVar2, dVar, i2);
        if (h2 != null) {
            return ((Boolean) cVar.l(h2)).booleanValue();
        }
        return false;
    }

    public static final b0.d j(C0442s c0442s) {
        Z z3 = c0442s.f5865o;
        return z3 != null ? AbstractC1108W.g(z3).D(z3, false) : b0.d.f7059e;
    }

    public static final boolean k(C0442s c0442s, y2.c cVar) {
        int ordinal = c0442s.L0().ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                C0442s n3 = n(c0442s);
                if (n3 != null) {
                    return k(n3, cVar) || l(c0442s, n3, 1, cVar);
                }
                throw new IllegalStateException("ActiveParent must have a focusedChild".toString());
            }
            if (ordinal != 2) {
                if (ordinal == 3) {
                    return c0442s.K0().f6471a ? ((Boolean) cVar.l(c0442s)).booleanValue() : z(c0442s, cVar);
                }
                throw new J2.r();
            }
        }
        return z(c0442s, cVar);
    }

    public static final boolean l(C0442s c0442s, C0442s c0442s2, int i2, y2.c cVar) {
        if (H(c0442s, c0442s2, i2, cVar)) {
            return true;
        }
        Boolean bool = (Boolean) G(c0442s, i2, new E(c0442s, c0442s2, i2, cVar, 1));
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public static final boolean m(C0442s c0442s, b0.d dVar, int i2, y2.c cVar) {
        if (I(c0442s, dVar, i2, cVar)) {
            return true;
        }
        Boolean bool = (Boolean) G(c0442s, i2, new E(c0442s, dVar, i2, cVar, 2));
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:67:0x001e, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final a0.C0442s n(a0.C0442s r8) {
        /*
            V.n r8 = r8.f5858h
            boolean r0 = r8.f5869t
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            if (r0 == 0) goto L9f
            L.d r0 = new L.d
            r2 = 16
            V.n[] r3 = new V.n[r2]
            r0.<init>(r3)
            V.n r3 = r8.f5863m
            if (r3 != 0) goto L1b
            t0.AbstractC1248f.b(r0, r8)
            goto L1e
        L1b:
            r0.b(r3)
        L1e:
            boolean r8 = r0.l()
            if (r8 == 0) goto L9e
            int r8 = r0.f4620j
            r3 = 1
            int r8 = r8 - r3
            java.lang.Object r8 = r0.n(r8)
            V.n r8 = (V.n) r8
            int r4 = r8.f5861k
            r4 = r4 & 1024(0x400, float:1.435E-42)
            if (r4 != 0) goto L38
            t0.AbstractC1248f.b(r0, r8)
            goto L1e
        L38:
            if (r8 == 0) goto L1e
            int r4 = r8.f5860j
            r4 = r4 & 1024(0x400, float:1.435E-42)
            if (r4 == 0) goto L9b
            r4 = r1
        L41:
            if (r8 == 0) goto L1e
            boolean r5 = r8 instanceof a0.C0442s
            if (r5 == 0) goto L60
            a0.s r8 = (a0.C0442s) r8
            V.n r5 = r8.f5858h
            boolean r5 = r5.f5869t
            if (r5 == 0) goto L96
            a0.r r5 = r8.L0()
            int r5 = r5.ordinal()
            if (r5 == 0) goto L5f
            if (r5 == r3) goto L5f
            r6 = 2
            if (r5 == r6) goto L5f
            goto L96
        L5f:
            return r8
        L60:
            int r5 = r8.f5860j
            r5 = r5 & 1024(0x400, float:1.435E-42)
            if (r5 == 0) goto L96
            boolean r5 = r8 instanceof t0.AbstractC1256n
            if (r5 == 0) goto L96
            r5 = r8
            t0.n r5 = (t0.AbstractC1256n) r5
            V.n r5 = r5.f10608v
            r6 = 0
        L70:
            if (r5 == 0) goto L93
            int r7 = r5.f5860j
            r7 = r7 & 1024(0x400, float:1.435E-42)
            if (r7 == 0) goto L90
            int r6 = r6 + 1
            if (r6 != r3) goto L7e
            r8 = r5
            goto L90
        L7e:
            if (r4 != 0) goto L87
            L.d r4 = new L.d
            V.n[] r7 = new V.n[r2]
            r4.<init>(r7)
        L87:
            if (r8 == 0) goto L8d
            r4.b(r8)
            r8 = r1
        L8d:
            r4.b(r5)
        L90:
            V.n r5 = r5.f5863m
            goto L70
        L93:
            if (r6 != r3) goto L96
            goto L41
        L96:
            V.n r8 = t0.AbstractC1248f.f(r4)
            goto L41
        L9b:
            V.n r8 = r8.f5863m
            goto L38
        L9e:
            return r1
        L9f:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "visitChildren called on an unattached node"
            java.lang.String r0 = r0.toString()
            r8.<init>(r0)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: a0.AbstractC0427d.n(a0.s):a0.s");
    }

    /* JADX WARN: Code restructure failed: missing block: B:106:0x0075, code lost:
    
        continue;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final a0.EnumC0441r o(a0.InterfaceC0426c r10) {
        /*
            Method dump skipped, instructions count: 252
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a0.AbstractC0427d.o(a0.c):a0.r");
    }

    public static final void p(C0442s c0442s) {
        AbstractC1248f.s(c0442s, new C0443t(c0442s, 0));
        int ordinal = c0442s.L0().ordinal();
        if (ordinal == 1 || ordinal == 3) {
            c0442s.P0(EnumC0441r.f6488h);
        }
    }

    public static final void q(C0442s c0442s) {
        C0429f c0429f = ((androidx.compose.ui.focus.b) ((C1314v) AbstractC1248f.w(c0442s)).getFocusOwner()).f6747g;
        c0429f.b(c0429f.f6458c, c0442s);
    }

    public static final boolean r(int i2, b0.d dVar, b0.d dVar2) {
        boolean a3 = C0425b.a(i2, 3);
        float f3 = dVar.f7060a;
        float f4 = dVar.f7062c;
        if (a3) {
            float f5 = dVar2.f7062c;
            float f6 = dVar2.f7060a;
            if ((f5 <= f4 && f6 < f4) || f6 <= f3) {
                return false;
            }
        } else if (C0425b.a(i2, 4)) {
            float f7 = dVar2.f7060a;
            float f8 = dVar2.f7062c;
            if ((f7 >= f3 && f8 > f3) || f8 >= f4) {
                return false;
            }
        } else {
            boolean a4 = C0425b.a(i2, 5);
            float f9 = dVar.f7061b;
            float f10 = dVar.f7063d;
            if (a4) {
                float f11 = dVar2.f7063d;
                float f12 = dVar2.f7061b;
                if ((f11 <= f10 && f12 < f10) || f12 <= f9) {
                    return false;
                }
            } else {
                if (!C0425b.a(i2, 6)) {
                    throw new IllegalStateException("This function should only be used for 2-D focus search".toString());
                }
                float f13 = dVar2.f7061b;
                float f14 = dVar2.f7063d;
                if ((f13 >= f9 && f14 > f9) || f14 >= f10) {
                    return false;
                }
            }
        }
        return true;
    }

    public static final long s(int i2, b0.d dVar, b0.d dVar2) {
        float f3;
        float f4;
        float f5;
        float c3;
        float c4;
        boolean a3 = C0425b.a(i2, 3);
        float f6 = dVar2.f7061b;
        float f7 = dVar2.f7060a;
        if (!a3) {
            if (C0425b.a(i2, 4)) {
                f3 = f7 - dVar.f7062c;
            } else if (C0425b.a(i2, 5)) {
                f4 = dVar.f7061b;
                f5 = dVar2.f7063d;
            } else {
                if (!C0425b.a(i2, 6)) {
                    throw new IllegalStateException("This function should only be used for 2-D focus search".toString());
                }
                f3 = f6 - dVar.f7063d;
            }
            long abs = (long) Math.abs(Math.max(0.0f, f3));
            if (C0425b.a(i2, 3) || C0425b.a(i2, 4)) {
                float f8 = 2;
                c3 = (dVar.c() / f8) + dVar.f7061b;
                c4 = (dVar2.c() / f8) + f6;
            } else {
                if (!C0425b.a(i2, 5) && !C0425b.a(i2, 6)) {
                    throw new IllegalStateException("This function should only be used for 2-D focus search".toString());
                }
                float f9 = 2;
                c3 = (dVar.d() / f9) + dVar.f7060a;
                c4 = (dVar2.d() / f9) + f7;
            }
            long abs2 = (long) Math.abs(c3 - c4);
            return (abs2 * abs2) + (13 * abs * abs);
        }
        f4 = dVar.f7060a;
        f5 = dVar2.f7062c;
        f3 = f4 - f5;
        long abs3 = (long) Math.abs(Math.max(0.0f, f3));
        if (C0425b.a(i2, 3)) {
            if (!C0425b.a(i2, 5)) {
                throw new IllegalStateException("This function should only be used for 2-D focus search".toString());
            }
            float f92 = 2;
            c3 = (dVar.d() / f92) + dVar.f7060a;
            c4 = (dVar2.d() / f92) + f7;
            long abs22 = (long) Math.abs(c3 - c4);
            return (abs22 * abs22) + (13 * abs3 * abs3);
        }
        float f82 = 2;
        c3 = (dVar.c() / f82) + dVar.f7061b;
        c4 = (dVar2.c() / f82) + f6;
        long abs222 = (long) Math.abs(c3 - c4);
        return (abs222 * abs222) + (13 * abs3 * abs3);
    }

    public static final boolean t(C0442s c0442s) {
        C1236E c1236e;
        Z z3;
        C1236E c1236e2;
        Z z4 = c0442s.f5865o;
        return (z4 == null || (c1236e = z4.f10546s) == null || !c1236e.E() || (z3 = c0442s.f5865o) == null || (c1236e2 = z3.f10546s) == null || !c1236e2.D()) ? false : true;
    }

    public static final int u(C0442s c0442s, int i2) {
        int ordinal = c0442s.L0().ordinal();
        if (ordinal == 0) {
            return 1;
        }
        if (ordinal != 1) {
            if (ordinal == 2) {
                return 2;
            }
            if (ordinal == 3) {
                return 1;
            }
            throw new J2.r();
        }
        C0442s n3 = n(c0442s);
        if (n3 == null) {
            throw new IllegalArgumentException("ActiveParent with no focused child".toString());
        }
        int u3 = u(n3, i2);
        if (u3 == 1) {
            u3 = 0;
        }
        if (u3 != 0) {
            return u3;
        }
        if (c0442s.f6492u) {
            return 1;
        }
        c0442s.f6492u = true;
        try {
            c0442s.K0().f6481k.getClass();
            C0438o c0438o = C0438o.f6484b;
            return 1;
        } finally {
            c0442s.f6492u = false;
        }
    }

    public static final void v(C0442s c0442s) {
        if (c0442s.f6493v) {
            return;
        }
        c0442s.f6493v = true;
        try {
            c0442s.K0().f6480j.getClass();
            C0438o c0438o = C0438o.f6484b;
        } finally {
            c0442s.f6493v = false;
        }
    }

    public static final int w(C0442s c0442s, int i2) {
        V.n nVar;
        C0292u c0292u;
        int ordinal = c0442s.L0().ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                C0442s n3 = n(c0442s);
                if (n3 != null) {
                    return u(n3, i2);
                }
                throw new IllegalArgumentException("ActiveParent with no focused child".toString());
            }
            if (ordinal != 2) {
                if (ordinal != 3) {
                    throw new J2.r();
                }
                V.n nVar2 = c0442s.f5858h;
                if (!nVar2.f5869t) {
                    throw new IllegalStateException("visitAncestors called on an unattached node".toString());
                }
                V.n nVar3 = nVar2.f5862l;
                C1236E v3 = AbstractC1248f.v(c0442s);
                loop0: while (true) {
                    nVar = null;
                    if (v3 == null) {
                        break;
                    }
                    if ((((V.n) v3.f10378C.f4244f).f5861k & 1024) != 0) {
                        while (nVar3 != null) {
                            if ((nVar3.f5860j & 1024) != 0) {
                                V.n nVar4 = nVar3;
                                L.d dVar = null;
                                while (nVar4 != null) {
                                    if (nVar4 instanceof C0442s) {
                                        nVar = nVar4;
                                        break loop0;
                                    }
                                    if ((nVar4.f5860j & 1024) != 0 && (nVar4 instanceof AbstractC1256n)) {
                                        int i3 = 0;
                                        for (V.n nVar5 = ((AbstractC1256n) nVar4).f10608v; nVar5 != null; nVar5 = nVar5.f5863m) {
                                            if ((nVar5.f5860j & 1024) != 0) {
                                                i3++;
                                                if (i3 == 1) {
                                                    nVar4 = nVar5;
                                                } else {
                                                    if (dVar == null) {
                                                        dVar = new L.d(new V.n[16]);
                                                    }
                                                    if (nVar4 != null) {
                                                        dVar.b(nVar4);
                                                        nVar4 = null;
                                                    }
                                                    dVar.b(nVar5);
                                                }
                                            }
                                        }
                                        if (i3 == 1) {
                                        }
                                    }
                                    nVar4 = AbstractC1248f.f(dVar);
                                }
                            }
                            nVar3 = nVar3.f5862l;
                        }
                    }
                    v3 = v3.s();
                    nVar3 = (v3 == null || (c0292u = v3.f10378C) == null) ? null : (n0) c0292u.f4243e;
                }
                C0442s c0442s2 = (C0442s) nVar;
                if (c0442s2 == null) {
                    return 1;
                }
                int ordinal2 = c0442s2.L0().ordinal();
                if (ordinal2 == 0) {
                    v(c0442s2);
                    return 1;
                }
                if (ordinal2 == 1) {
                    return w(c0442s2, i2);
                }
                if (ordinal2 == 2) {
                    return 2;
                }
                if (ordinal2 != 3) {
                    throw new J2.r();
                }
                int w2 = w(c0442s2, i2);
                int i4 = w2 != 1 ? w2 : 0;
                if (i4 != 0) {
                    return i4;
                }
                v(c0442s2);
                return 1;
            }
        }
        return 1;
    }

    public static final boolean x(C0442s c0442s) {
        V.n nVar;
        C0292u c0292u;
        int ordinal = c0442s.L0().ordinal();
        boolean z3 = true;
        if (ordinal != 0) {
            if (ordinal == 1) {
                C0442s n3 = n(c0442s);
                if (n3 != null ? e(n3, false, true) : true) {
                    p(c0442s);
                }
                z3 = false;
            } else if (ordinal != 2) {
                if (ordinal != 3) {
                    throw new J2.r();
                }
                V.n nVar2 = c0442s.f5858h;
                if (!nVar2.f5869t) {
                    throw new IllegalStateException("visitAncestors called on an unattached node".toString());
                }
                V.n nVar3 = nVar2.f5862l;
                C1236E v3 = AbstractC1248f.v(c0442s);
                loop0: while (true) {
                    if (v3 == null) {
                        nVar = null;
                        break;
                    }
                    if ((((V.n) v3.f10378C.f4244f).f5861k & 1024) != 0) {
                        while (nVar3 != null) {
                            if ((nVar3.f5860j & 1024) != 0) {
                                nVar = nVar3;
                                L.d dVar = null;
                                while (nVar != null) {
                                    if (nVar instanceof C0442s) {
                                        break loop0;
                                    }
                                    if ((nVar.f5860j & 1024) != 0 && (nVar instanceof AbstractC1256n)) {
                                        int i2 = 0;
                                        for (V.n nVar4 = ((AbstractC1256n) nVar).f10608v; nVar4 != null; nVar4 = nVar4.f5863m) {
                                            if ((nVar4.f5860j & 1024) != 0) {
                                                i2++;
                                                if (i2 == 1) {
                                                    nVar = nVar4;
                                                } else {
                                                    if (dVar == null) {
                                                        dVar = new L.d(new V.n[16]);
                                                    }
                                                    if (nVar != null) {
                                                        dVar.b(nVar);
                                                        nVar = null;
                                                    }
                                                    dVar.b(nVar4);
                                                }
                                            }
                                        }
                                        if (i2 == 1) {
                                        }
                                    }
                                    nVar = AbstractC1248f.f(dVar);
                                }
                            }
                            nVar3 = nVar3.f5862l;
                        }
                    }
                    v3 = v3.s();
                    nVar3 = (v3 == null || (c0292u = v3.f10378C) == null) ? null : (n0) c0292u.f4243e;
                }
                C0442s c0442s2 = (C0442s) nVar;
                if (c0442s2 != null) {
                    EnumC0441r L02 = c0442s2.L0();
                    z3 = D(c0442s2, c0442s);
                    if (z3 && L02 != c0442s2.L0()) {
                        A(c0442s2);
                    }
                } else {
                    if (((Boolean) ((androidx.compose.ui.focus.b) ((C1314v) AbstractC1248f.w(c0442s)).getFocusOwner()).f6741a.j(null, null)).booleanValue()) {
                        p(c0442s);
                    }
                    z3 = false;
                }
            }
        }
        if (z3) {
            A(c0442s);
        }
        return z3;
    }

    public static final boolean y(C0442s c0442s, y2.c cVar) {
        Object[] objArr = new C0442s[16];
        V.n nVar = c0442s.f5858h;
        if (!nVar.f5869t) {
            throw new IllegalStateException("visitChildren called on an unattached node".toString());
        }
        L.d dVar = new L.d(new V.n[16]);
        V.n nVar2 = nVar.f5863m;
        if (nVar2 == null) {
            AbstractC1248f.b(dVar, nVar);
        } else {
            dVar.b(nVar2);
        }
        int i2 = 0;
        while (dVar.l()) {
            V.n nVar3 = (V.n) dVar.n(dVar.f4620j - 1);
            if ((nVar3.f5861k & 1024) == 0) {
                AbstractC1248f.b(dVar, nVar3);
            } else {
                while (true) {
                    if (nVar3 == null) {
                        break;
                    }
                    if ((nVar3.f5860j & 1024) != 0) {
                        L.d dVar2 = null;
                        while (nVar3 != null) {
                            if (nVar3 instanceof C0442s) {
                                C0442s c0442s2 = (C0442s) nVar3;
                                int i3 = i2 + 1;
                                if (objArr.length < i3) {
                                    objArr = Arrays.copyOf(objArr, Math.max(i3, objArr.length * 2));
                                    z2.h.e(objArr, "copyOf(this, newSize)");
                                }
                                objArr[i2] = c0442s2;
                                i2 = i3;
                            } else if ((nVar3.f5860j & 1024) != 0 && (nVar3 instanceof AbstractC1256n)) {
                                int i4 = 0;
                                for (V.n nVar4 = ((AbstractC1256n) nVar3).f10608v; nVar4 != null; nVar4 = nVar4.f5863m) {
                                    if ((nVar4.f5860j & 1024) != 0) {
                                        i4++;
                                        if (i4 == 1) {
                                            nVar3 = nVar4;
                                        } else {
                                            if (dVar2 == null) {
                                                dVar2 = new L.d(new V.n[16]);
                                            }
                                            if (nVar3 != null) {
                                                dVar2.b(nVar3);
                                                nVar3 = null;
                                            }
                                            dVar2.b(nVar4);
                                        }
                                    }
                                }
                                if (i4 == 1) {
                                }
                            }
                            nVar3 = AbstractC1248f.f(dVar2);
                        }
                    } else {
                        nVar3 = nVar3.f5863m;
                    }
                }
            }
        }
        C0444u c0444u = C0444u.f6497a;
        z2.h.f(objArr, "<this>");
        Arrays.sort(objArr, 0, i2, c0444u);
        if (i2 > 0) {
            int i5 = i2 - 1;
            do {
                C0442s c0442s3 = (C0442s) objArr[i5];
                if (t(c0442s3) && a(c0442s3, cVar)) {
                    return true;
                }
                i5--;
            } while (i5 >= 0);
        }
        return false;
    }

    public static final boolean z(C0442s c0442s, y2.c cVar) {
        Object[] objArr = new C0442s[16];
        V.n nVar = c0442s.f5858h;
        if (!nVar.f5869t) {
            throw new IllegalStateException("visitChildren called on an unattached node".toString());
        }
        L.d dVar = new L.d(new V.n[16]);
        V.n nVar2 = nVar.f5863m;
        if (nVar2 == null) {
            AbstractC1248f.b(dVar, nVar);
        } else {
            dVar.b(nVar2);
        }
        int i2 = 0;
        while (dVar.l()) {
            V.n nVar3 = (V.n) dVar.n(dVar.f4620j - 1);
            if ((nVar3.f5861k & 1024) == 0) {
                AbstractC1248f.b(dVar, nVar3);
            } else {
                while (true) {
                    if (nVar3 == null) {
                        break;
                    }
                    if ((nVar3.f5860j & 1024) != 0) {
                        L.d dVar2 = null;
                        while (nVar3 != null) {
                            if (nVar3 instanceof C0442s) {
                                C0442s c0442s2 = (C0442s) nVar3;
                                int i3 = i2 + 1;
                                if (objArr.length < i3) {
                                    objArr = Arrays.copyOf(objArr, Math.max(i3, objArr.length * 2));
                                    z2.h.e(objArr, "copyOf(this, newSize)");
                                }
                                objArr[i2] = c0442s2;
                                i2 = i3;
                            } else if ((nVar3.f5860j & 1024) != 0 && (nVar3 instanceof AbstractC1256n)) {
                                int i4 = 0;
                                for (V.n nVar4 = ((AbstractC1256n) nVar3).f10608v; nVar4 != null; nVar4 = nVar4.f5863m) {
                                    if ((nVar4.f5860j & 1024) != 0) {
                                        i4++;
                                        if (i4 == 1) {
                                            nVar3 = nVar4;
                                        } else {
                                            if (dVar2 == null) {
                                                dVar2 = new L.d(new V.n[16]);
                                            }
                                            if (nVar3 != null) {
                                                dVar2.b(nVar3);
                                                nVar3 = null;
                                            }
                                            dVar2.b(nVar4);
                                        }
                                    }
                                }
                                if (i4 == 1) {
                                }
                            }
                            nVar3 = AbstractC1248f.f(dVar2);
                        }
                    } else {
                        nVar3 = nVar3.f5863m;
                    }
                }
            }
        }
        C0444u c0444u = C0444u.f6497a;
        z2.h.f(objArr, "<this>");
        Arrays.sort(objArr, 0, i2, c0444u);
        if (i2 <= 0) {
            return false;
        }
        int i5 = 0;
        do {
            C0442s c0442s3 = (C0442s) objArr[i5];
            if (t(c0442s3) && k(c0442s3, cVar)) {
                return true;
            }
            i5++;
        } while (i5 < i2);
        return false;
    }
}
