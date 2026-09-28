package J;

import D.C0043l;
import K.C0329a;
import K.C0330b;
import c0.C0573M;
import c0.InterfaceC0600s;
import f0.C0663b;
import java.util.List;
import java.util.NoSuchElementException;
import m2.C0880v;
import n.C0907o;
import n0.C0929h;
import p.C1021i;
import p.C1027l;
import p.InterfaceC1013e;
import p.e1;
import r0.InterfaceC1129r;
import s.AbstractC1166e;
import t.C1208c;
import t.C1213h;
import t.C1214i;
import t.C1228w;
import t0.C1236E;
import t0.C1237F;
import t0.C1238G;
import t0.C1241J;
import u0.AbstractC1273a;
import u0.ViewOnAttachStateChangeListenerC1320y;

/* renamed from: J.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0283p extends z2.i implements y2.a {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f4175i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f4176j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Object f4177k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Object f4178l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0283p(C0285q c0285q, C0329a c0329a, D0 d02, AbstractC0254a0 abstractC0254a0) {
        super(0);
        this.f4175i = 0;
        this.f4176j = c0285q;
        this.f4177k = c0329a;
        this.f4178l = d02;
    }

    @Override // y2.a
    public final Object c() {
        b0.d L02;
        int i2 = 0;
        C0880v c0880v = C0880v.f8657a;
        Object obj = this.f4178l;
        Object obj2 = this.f4177k;
        Object obj3 = this.f4176j;
        switch (this.f4175i) {
            case 0:
                C0285q c0285q = (C0285q) obj3;
                C0330b c0330b = c0285q.f4190L;
                C0329a c0329a = (C0329a) obj2;
                D0 d02 = (D0) obj;
                C0329a c0329a2 = c0330b.f4459b;
                try {
                    c0330b.f4459b = c0329a;
                    D0 d03 = c0285q.F;
                    int[] iArr = c0285q.f4208n;
                    B.F f3 = c0285q.f4214u;
                    c0285q.f4208n = null;
                    c0285q.f4214u = null;
                    try {
                        c0285q.F = d02;
                        boolean z3 = c0330b.f4462e;
                        try {
                            c0330b.f4462e = false;
                            throw null;
                        } catch (Throwable th) {
                            c0330b.f4462e = z3;
                            throw th;
                        }
                    } catch (Throwable th2) {
                        c0285q.F = d03;
                        c0285q.f4208n = iArr;
                        c0285q.f4214u = f3;
                        throw th2;
                    }
                } catch (Throwable th3) {
                    c0330b.f4459b = c0329a2;
                    throw th3;
                }
            case 1:
                C1238G c1238g = (C1238G) obj;
                ((z2.s) obj3).f11909h = ((C0907o) obj2).f8819x.c(c1238g.f10415h.e(), c1238g.getLayoutDirection(), c1238g);
                return c0880v;
            case 2:
                C1027l c1027l = (C1027l) obj3;
                C0929h c0929h = c1027l.f9634y;
                while (c0929h.f8942a.l()) {
                    L.d dVar = c0929h.f8942a;
                    if (dVar.k()) {
                        throw new NoSuchElementException("MutableVector is empty.");
                    }
                    b0.d dVar2 = (b0.d) ((C1021i) dVar.f4618h[dVar.f4620j - 1]).f9601a.c();
                    if (dVar2 != null && !c1027l.M0(dVar2, c1027l.f9628C)) {
                        if (c1027l.f9627B && (L02 = c1027l.L0()) != null && c1027l.M0(L02, c1027l.f9628C)) {
                            c1027l.f9627B = false;
                        }
                        ((e1) obj2).f9593e = C1027l.K0(c1027l, (InterfaceC1013e) obj);
                        return c0880v;
                    }
                    ((C1021i) dVar.n(dVar.f4620j - 1)).f9602b.t(c0880v);
                }
                if (c1027l.f9627B) {
                    c1027l.f9627B = false;
                }
                ((e1) obj2).f9593e = C1027l.K0(c1027l, (InterfaceC1013e) obj);
                return c0880v;
            case 3:
                C1213h c1213h = (C1213h) ((W0) obj3).getValue();
                C1228w c1228w = (C1228w) obj2;
                return new C1214i(c1228w, c1213h, (C1208c) obj, new C0043l((E2.d) c1228w.f10346d.f10325f.getValue(), c1213h));
            case 4:
                C1241J c1241j = (C1241J) obj3;
                t0.L l3 = c1241j.F;
                l3.f10473j = 0;
                L.d v3 = l3.f10464a.v();
                int i3 = v3.f4620j;
                if (i3 > 0) {
                    Object[] objArr = v3.f4618h;
                    int i4 = 0;
                    do {
                        C1241J c1241j2 = ((C1236E) objArr[i4]).f10379D.f10481s;
                        z2.h.c(c1241j2);
                        c1241j2.f10426n = c1241j2.f10427o;
                        c1241j2.f10427o = Integer.MAX_VALUE;
                        if (c1241j2.f10428p == 2) {
                            c1241j2.f10428p = 3;
                        }
                        i4++;
                    } while (i4 < i3);
                }
                t0.L l4 = c1241j.F;
                L.d v4 = l4.f10464a.v();
                int i5 = v4.f4620j;
                if (i5 > 0) {
                    Object[] objArr2 = v4.f4618h;
                    int i6 = 0;
                    do {
                        C1241J c1241j3 = ((C1236E) objArr2[i6]).f10379D.f10481s;
                        z2.h.c(c1241j3);
                        c1241j3.f10436y.f10408d = false;
                        i6++;
                    } while (i6 < i5);
                }
                t0.O o3 = c1241j.T().f10627T;
                t0.L l5 = (t0.L) obj;
                if (o3 != null) {
                    boolean z4 = o3.f10487o;
                    List n3 = l5.f10464a.n();
                    int size = n3.size();
                    for (int i7 = 0; i7 < size; i7++) {
                        t0.O R02 = ((t0.Z) ((C1236E) n3.get(i7)).f10378C.f4242d).R0();
                        if (R02 != null) {
                            R02.f10487o = z4;
                        }
                    }
                }
                ((t0.O) obj2).C0().j();
                if (c1241j.T().f10627T != null) {
                    List n4 = l5.f10464a.n();
                    int size2 = n4.size();
                    for (int i8 = 0; i8 < size2; i8++) {
                        t0.O R03 = ((t0.Z) ((C1236E) n4.get(i8)).f10378C.f4242d).R0();
                        if (R03 != null) {
                            R03.f10487o = false;
                        }
                    }
                }
                C1236E c1236e = l4.f10464a;
                L.d v5 = c1236e.v();
                int i9 = v5.f4620j;
                if (i9 > 0) {
                    Object[] objArr3 = v5.f4618h;
                    int i10 = 0;
                    do {
                        C1241J c1241j4 = ((C1236E) objArr3[i10]).f10379D.f10481s;
                        z2.h.c(c1241j4);
                        int i11 = c1241j4.f10426n;
                        int i12 = c1241j4.f10427o;
                        if (i11 != i12 && i12 == Integer.MAX_VALUE) {
                            c1241j4.t0();
                        }
                        i10++;
                    } while (i10 < i9);
                }
                L.d v6 = c1236e.v();
                int i13 = v6.f4620j;
                if (i13 > 0) {
                    Object[] objArr4 = v6.f4618h;
                    do {
                        C1241J c1241j5 = ((C1236E) objArr4[i2]).f10379D.f10481s;
                        z2.h.c(c1241j5);
                        C1237F c1237f = c1241j5.f10436y;
                        c1237f.f10409e = c1237f.f10408d;
                        i2++;
                    } while (i2 < i13);
                }
                return c0880v;
            case AbstractC1166e.f10138f /* 5 */:
                C0573M c0573m = t0.Z.f10530N;
                ((t0.Z) obj3).N0((InterfaceC0600s) obj2, (C0663b) obj);
                return c0880v;
            case AbstractC1166e.f10136d /* 6 */:
                AbstractC1273a abstractC1273a = (AbstractC1273a) obj3;
                abstractC1273a.removeOnAttachStateChangeListener((ViewOnAttachStateChangeListenerC1320y) obj2);
                C0.E e3 = (C0.E) obj;
                z2.h.f(e3, "listener");
                K1.f.z(abstractC1273a).f7697a.remove(e3);
                return c0880v;
            default:
                w.i iVar = (w.i) obj3;
                b0.d K02 = w.i.K0(iVar, (InterfaceC1129r) obj2, (y2.a) obj);
                if (K02 == null) {
                    return null;
                }
                C1027l c1027l2 = iVar.f11429u;
                if (!O0.j.a(c1027l2.f9628C, 0L)) {
                    return K02.i(c1027l2.O0(K02, c1027l2.f9628C) ^ (-9223372034707292160L));
                }
                throw new IllegalStateException("Expected BringIntoViewRequester to not be used before parents are placed.".toString());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0283p(Object obj, Object obj2, Object obj3, int i2) {
        super(0);
        this.f4175i = i2;
        this.f4176j = obj;
        this.f4177k = obj2;
        this.f4178l = obj3;
    }
}
