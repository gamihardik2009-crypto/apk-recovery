package J;

import J2.C0325w;
import K.C0329a;
import M2.InterfaceC0343g;
import j.AbstractC0740F;
import j.C0736B;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import n2.AbstractC0959k;
import n2.C0970v;
import q2.C1079j;
import q2.InterfaceC1078i;
import s.AbstractC1166e;

/* renamed from: J.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0257c {

    /* renamed from: a, reason: collision with root package name */
    public static final C0262e0 f4119a = new C0262e0("provider");

    /* renamed from: b, reason: collision with root package name */
    public static final C0262e0 f4120b = new C0262e0("provider");

    /* renamed from: c, reason: collision with root package name */
    public static final C0262e0 f4121c = new C0262e0("compositionLocalMap");

    /* renamed from: d, reason: collision with root package name */
    public static final C0262e0 f4122d = new C0262e0("providers");

    /* renamed from: e, reason: collision with root package name */
    public static final C0262e0 f4123e = new C0262e0("reference");

    /* renamed from: f, reason: collision with root package name */
    public static final D0.r f4124f = new D0.r(1);

    /* renamed from: g, reason: collision with root package name */
    public static final Object f4125g = new Object();

    /* renamed from: h, reason: collision with root package name */
    public static final I f4126h = new I();

    public static final int A(int i2) {
        switch (i2) {
            case 0:
                return 0;
            case 1:
            case 2:
            case 4:
                return 1;
            case 3:
            case AbstractC1166e.f10138f /* 5 */:
            case AbstractC1166e.f10136d /* 6 */:
                return 2;
            default:
                return 3;
        }
    }

    public static final O2.e B(C0285q c0285q) {
        C1079j c1079j = C1079j.f9784h;
        C0325w c0325w = C0325w.f4437i;
        InterfaceC1078i h2 = c0285q.f4196b.h();
        return J2.B.a(h2.A(new J2.c0((J2.Z) h2.s(c0325w))).A(c1079j));
    }

    public static final long C() {
        return Thread.currentThread().getId();
    }

    public static final void D(G0 g02, C0292u c0292u) {
        int i2;
        int i3;
        int i4;
        int i5 = g02.f4032s;
        int i6 = g02.f4033t;
        while (i5 < i6) {
            Object y3 = g02.y(i5);
            if (y3 instanceof InterfaceC0271j) {
                c0292u.h((InterfaceC0271j) y3, g02.o() - g02.G(g02.f4016b, g02.p(i5)), -1, -1);
            }
            int G3 = g02.G(g02.f4016b, g02.p(i5));
            int i7 = i5 + 1;
            int f3 = g02.f(g02.f4016b, g02.p(i7));
            int i8 = G3;
            while (i8 < f3) {
                int i9 = i8 - G3;
                Object obj = g02.f4017c[g02.g(i8)];
                boolean z3 = obj instanceof B0;
                W w2 = C0275l.f4150a;
                if (z3) {
                    B0 b02 = (B0) obj;
                    A0 a02 = b02.f3969a;
                    if (a02 instanceof C0277m) {
                        i2 = i6;
                    } else {
                        int g3 = g02.g(g02.H(i5, i9));
                        Object[] objArr = g02.f4017c;
                        i2 = i6;
                        Object obj2 = objArr[g3];
                        objArr[g3] = w2;
                        if (obj != obj2) {
                            y("Slot table is out of sync");
                            throw null;
                        }
                        int o3 = g02.o() - i9;
                        C0255b c0255b = b02.f3970b;
                        if (c0255b == null || !c0255b.a()) {
                            i3 = -1;
                            i4 = -1;
                        } else {
                            i3 = g02.c(c0255b);
                            i4 = g02.o() - g02.f(g02.f4016b, g02.p(g02.q(i3) + i3));
                        }
                        c0292u.h(a02, o3, i3, i4);
                    }
                } else {
                    i2 = i6;
                    if (obj instanceof C0291t0) {
                        int g4 = g02.g(g02.H(i5, i9));
                        Object[] objArr2 = g02.f4017c;
                        Object obj3 = objArr2[g4];
                        objArr2[g4] = w2;
                        if (obj != obj3) {
                            y("Slot table is out of sync");
                            throw null;
                        }
                        ((C0291t0) obj).d();
                    } else {
                        continue;
                    }
                }
                i8++;
                i6 = i2;
            }
            i5 = i7;
        }
    }

    public static final L.d E() {
        K1.m mVar = M0.f4052b;
        L.d dVar = (L.d) mVar.d();
        if (dVar != null) {
            return dVar;
        }
        L.d dVar2 = new L.d(new C0281o[0]);
        mVar.m(dVar2);
        return dVar2;
    }

    public static final F F(y2.a aVar) {
        K1.m mVar = M0.f4051a;
        return new F(null, aVar);
    }

    public static final int G(int i2, ArrayList arrayList) {
        int size = arrayList.size() - 1;
        int i3 = 0;
        while (i3 <= size) {
            int i4 = (i3 + size) >>> 1;
            int g3 = z2.h.g(((O) arrayList.get(i4)).f4060b, i2);
            if (g3 < 0) {
                i3 = i4 + 1;
            } else {
                if (g3 <= 0) {
                    return i4;
                }
                size = i4 - 1;
            }
        }
        return -(i3 + 1);
    }

    public static final X H(InterfaceC1078i interfaceC1078i) {
        X x2 = (X) interfaceC1078i.s(W.f4105i);
        if (x2 != null) {
            return x2;
        }
        throw new IllegalStateException("A MonotonicFrameClock is not available in this CoroutineContext. Callers should supply an appropriate MonotonicFrameClock using withContext.".toString());
    }

    public static final void I() {
        throw new IllegalStateException("Invalid applier".toString());
    }

    public static final void J(C0285q c0285q, y2.e eVar) {
        z2.h.d(eVar, "null cannot be cast to non-null type kotlin.Function2<androidx.compose.runtime.Composer, kotlin.Int, kotlin.Unit>");
        z2.v.d(2, eVar);
        eVar.j(c0285q, 1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static List K(G0 g02, int i2, G0 g03, boolean z3, boolean z4, boolean z5) {
        C0970v c0970v;
        boolean C3;
        int i3;
        int i4;
        int i5;
        int q = g02.q(i2);
        int i6 = i2 + q;
        int f3 = g02.f(g02.f4016b, g02.p(i2));
        int f4 = g02.f(g02.f4016b, g02.p(i6));
        int i7 = f4 - f3;
        boolean z6 = i2 >= 0 && (g02.f4016b[(g02.p(i2) * 5) + 1] & 201326592) != 0;
        g03.s(q);
        g03.t(i7, g03.f4032s);
        if (g02.f4021g < i6) {
            g02.w(i6);
        }
        if (g02.f4025k < f4) {
            g02.x(f4, i6);
        }
        int[] iArr = g03.f4016b;
        int i8 = g03.f4032s;
        int i9 = i8 * 5;
        AbstractC0959k.p(g02.f4016b, iArr, i9, i2 * 5, i6 * 5);
        Object[] objArr = g03.f4017c;
        int i10 = g03.f4023i;
        AbstractC0959k.q(g02.f4017c, objArr, i10, f3, f4);
        int i11 = g03.f4034u;
        iArr[i9 + 2] = i11;
        int i12 = i8 - i2;
        int i13 = i8 + q;
        int f5 = i10 - g03.f(iArr, i8);
        int i14 = g03.f4027m;
        int i15 = g03.f4026l;
        int length = objArr.length;
        boolean z7 = z6;
        int i16 = i14;
        int i17 = i8;
        while (i17 < i13) {
            if (i17 != i8) {
                int i18 = (i17 * 5) + 2;
                iArr[i18] = iArr[i18] + i12;
            }
            int i19 = i13;
            int f6 = g03.f(iArr, i17) + f5;
            if (i16 < i17) {
                i4 = i8;
                i5 = 0;
            } else {
                i4 = i8;
                i5 = g03.f4025k;
            }
            iArr[(i17 * 5) + 4] = G0.h(f6, i5, i15, length);
            if (i17 == i16) {
                i16++;
            }
            i17++;
            i8 = i4;
            i13 = i19;
        }
        int i20 = i8;
        int i21 = i13;
        g03.f4027m = i16;
        int n3 = n(g02.f4018d, i2, g02.n());
        int n4 = n(g02.f4018d, i6, g02.n());
        if (n3 < n4) {
            ArrayList arrayList = g02.f4018d;
            ArrayList arrayList2 = new ArrayList(n4 - n3);
            for (int i22 = n3; i22 < n4; i22++) {
                C0255b c0255b = (C0255b) arrayList.get(i22);
                c0255b.f4117a += i12;
                arrayList2.add(c0255b);
            }
            g03.f4018d.addAll(n(g03.f4018d, g03.f4032s, g03.n()), arrayList2);
            arrayList.subList(n3, n4).clear();
            c0970v = arrayList2;
        } else {
            c0970v = C0970v.f9165h;
        }
        if (!c0970v.isEmpty()) {
            HashMap hashMap = g02.f4019e;
            HashMap hashMap2 = g03.f4019e;
            if (hashMap != null && hashMap2 != null) {
                int size = c0970v.size();
                for (int i23 = 0; i23 < size; i23++) {
                }
            }
        }
        int i24 = g03.f4034u;
        g03.I(i11);
        int z8 = g02.z(g02.f4016b, i2);
        if (!z5) {
            i3 = 1;
            C3 = false;
        } else if (z3) {
            boolean z9 = z8 >= 0;
            if (z9) {
                g02.J();
                g02.a(z8 - g02.f4032s);
                g02.J();
            }
            g02.a(i2 - g02.f4032s);
            boolean B3 = g02.B();
            if (z9) {
                g02.F();
                g02.i();
                g02.F();
                g02.i();
            }
            C3 = B3;
            i3 = 1;
        } else {
            C3 = g02.C(i2, q);
            i3 = 1;
            g02.D(f3, i7, i2 - 1);
        }
        if (!(!C3)) {
            y("Unexpectedly removed anchors");
            throw null;
        }
        g03.f4029o += m(iArr, i20) ? i3 : o(iArr, i20);
        if (z4) {
            g03.f4032s = i21;
            g03.f4023i = i10 + i7;
        }
        if (z7) {
            g03.O(i11);
        }
        return c0970v;
    }

    public static final C0266g0 L(float f3) {
        int i2 = AbstractC0253a.f4116b;
        return new C0266g0(f3);
    }

    public static final C0268h0 M(int i2) {
        int i3 = AbstractC0253a.f4116b;
        return new C0268h0(i2);
    }

    public static final C0274k0 N(Object obj, L0 l02) {
        int i2 = AbstractC0253a.f4116b;
        return new C0274k0(obj, l02);
    }

    public static final Object P(InterfaceC0282o0 interfaceC0282o0, AbstractC0286q0 abstractC0286q0) {
        z2.h.d(abstractC0286q0, "null cannot be cast to non-null type androidx.compose.runtime.CompositionLocal<kotlin.Any?>");
        R.e eVar = (R.e) interfaceC0282o0;
        Object obj = eVar.get(abstractC0286q0);
        if (obj == null) {
            obj = abstractC0286q0.b();
        }
        return ((Z0) obj).a(eVar);
    }

    public static final C0279n Q(C0285q c0285q) {
        c0285q.S(206, f4123e);
        if (c0285q.f4193O) {
            G0.u(c0285q.f4186H);
        }
        Object C3 = c0285q.C();
        C0277m c0277m = C3 instanceof C0277m ? (C0277m) C3 : null;
        if (c0277m == null) {
            int i2 = c0285q.f4194P;
            boolean z3 = c0285q.f4210p;
            boolean z4 = c0285q.f4182B;
            C0294v c0294v = c0285q.f4201g;
            if (!(c0294v instanceof C0294v)) {
                c0294v = null;
            }
            c0277m = new C0277m(new C0279n(c0285q, i2, z3, z4, c0294v != null ? c0294v.f4272y : null));
            c0285q.f0(c0277m);
        }
        InterfaceC0282o0 n3 = c0285q.n();
        C0279n c0279n = c0277m.f4156h;
        c0279n.f4165f.setValue(n3);
        c0285q.r(false);
        return c0279n;
    }

    public static final InterfaceC0258c0 R(Object obj, C0285q c0285q) {
        Object K3 = c0285q.K();
        if (K3 == C0275l.f4150a) {
            K3 = N(obj, W.f4109m);
            c0285q.e0(K3);
        }
        InterfaceC0258c0 interfaceC0258c0 = (InterfaceC0258c0) K3;
        interfaceC0258c0.setValue(obj);
        return interfaceC0258c0;
    }

    public static final void S(G0 g02, C0292u c0292u) {
        int i2;
        int[] iArr = g02.f4016b;
        int i3 = g02.f4032s;
        int f3 = g02.f(iArr, g02.p(g02.q(i3) + i3));
        for (int f4 = g02.f(g02.f4016b, g02.p(g02.f4032s)); f4 < f3; f4++) {
            Object obj = g02.f4017c[g02.g(f4)];
            int i4 = -1;
            if (obj instanceof InterfaceC0271j) {
                int o3 = g02.o() - f4;
                InterfaceC0271j interfaceC0271j = (InterfaceC0271j) obj;
                C0736B c0736b = (C0736B) c0292u.f4245g;
                if (c0736b == null) {
                    int i5 = AbstractC0740F.f7972a;
                    c0736b = new C0736B();
                    c0292u.f4245g = c0736b;
                }
                c0736b.f7965b[c0736b.d(interfaceC0271j)] = interfaceC0271j;
                c0292u.h(interfaceC0271j, o3, -1, -1);
            }
            if (obj instanceof B0) {
                int o4 = g02.o() - f4;
                B0 b02 = (B0) obj;
                C0255b c0255b = b02.f3970b;
                if (c0255b == null || !c0255b.a()) {
                    i2 = -1;
                } else {
                    i4 = g02.c(c0255b);
                    i2 = g02.o() - g02.f(g02.f4016b, g02.p(g02.q(i4) + i4));
                }
                c0292u.h(b02.f3969a, o4, i4, i2);
            }
            if (obj instanceof C0291t0) {
                ((C0291t0) obj).d();
            }
        }
        g02.B();
    }

    public static final void T(boolean z3) {
        if (z3) {
            return;
        }
        y("Check failed");
        throw null;
    }

    public static final int U(ArrayList arrayList, int i2, int i3) {
        int size = arrayList.size() - 1;
        int i4 = 0;
        while (i4 <= size) {
            int i5 = (i4 + size) >>> 1;
            int i6 = ((C0255b) arrayList.get(i5)).f4117a;
            if (i6 < 0) {
                i6 += i3;
            }
            int g3 = z2.h.g(i6, i2);
            if (g3 < 0) {
                i4 = i5 + 1;
            } else {
                if (g3 <= 0) {
                    return i5;
                }
                size = i5 - 1;
            }
        }
        return -(i4 + 1);
    }

    public static final void V(C0285q c0285q, Object obj, y2.e eVar) {
        if (c0285q.f4193O || !z2.h.a(c0285q.K(), obj)) {
            c0285q.e0(obj);
            c0285q.c(obj, eVar);
        }
    }

    public static final void W(String str) {
        throw new IllegalArgumentException(str);
    }

    public static final void X(String str) {
        throw new IllegalStateException(str);
    }

    public static final int Y(int i2) {
        int i3 = 306783378 & i2;
        int i4 = 613566756 & i2;
        return (i2 & (-920350135)) | (i4 >> 1) | i3 | ((i3 << 1) & i4);
    }

    public static final R.e Z(C0287r0[] c0287r0Arr, InterfaceC0282o0 interfaceC0282o0, InterfaceC0282o0 interfaceC0282o02) {
        R.e eVar = R.e.f5376k;
        R.d dVar = new R.d(eVar);
        dVar.f5375n = eVar;
        for (C0287r0 c0287r0 : c0287r0Arr) {
            AbstractC0286q0 abstractC0286q0 = c0287r0.f4221a;
            z2.h.d(abstractC0286q0, "null cannot be cast to non-null type androidx.compose.runtime.ProvidableCompositionLocal<kotlin.Any?>");
            if (c0287r0.f4226f || !((R.e) interfaceC0282o0).containsKey(abstractC0286q0)) {
                dVar.put(abstractC0286q0, abstractC0286q0.c(c0287r0, (Z0) ((R.e) interfaceC0282o02).get(abstractC0286q0)));
            }
        }
        return dVar.c();
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x004d, code lost:
    
        if (r1 == false) goto L15;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(J.C0287r0 r10, y2.e r11, J.C0285q r12, int r13) {
        /*
            Method dump skipped, instructions count: 258
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: J.C0257c.a(J.r0, y2.e, J.q, int):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r1v4, types: [J.o0, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(J.C0287r0[] r7, y2.e r8, J.C0285q r9, int r10) {
        /*
            r0 = -1390796515(0xffffffffad1a211d, float:-8.761239E-12)
            r9.W(r0)
            J.o0 r0 = r9.n()
            J.e0 r1 = J.C0257c.f4120b
            r2 = 201(0xc9, float:2.82E-43)
            r9.S(r2, r1)
            boolean r1 = r9.f4193O
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L25
            R.e r1 = R.e.f5376k
            R.e r1 = Z(r7, r0, r1)
            R.e r0 = r9.d0(r0, r1)
            r9.f4187I = r2
        L23:
            r1 = r3
            goto L72
        L25:
            J.D0 r1 = r9.F
            int r4 = r1.f3985g
            java.lang.Object r1 = r1.g(r4, r3)
            java.lang.String r4 = "null cannot be cast to non-null type androidx.compose.runtime.PersistentCompositionLocalMap"
            z2.h.d(r1, r4)
            J.o0 r1 = (J.InterfaceC0282o0) r1
            J.D0 r5 = r9.F
            int r6 = r5.f3985g
            java.lang.Object r5 = r5.g(r6, r2)
            z2.h.d(r5, r4)
            J.o0 r5 = (J.InterfaceC0282o0) r5
            R.e r4 = Z(r7, r0, r5)
            boolean r6 = r9.A()
            if (r6 == 0) goto L63
            boolean r6 = r9.f4217x
            if (r6 != 0) goto L63
            boolean r5 = z2.h.a(r5, r4)
            if (r5 != 0) goto L56
            goto L63
        L56:
            int r0 = r9.f4205k
            J.D0 r4 = r9.F
            int r4 = r4.l()
            int r4 = r4 + r0
            r9.f4205k = r4
            r0 = r1
            goto L23
        L63:
            R.e r0 = r9.d0(r0, r4)
            boolean r4 = r9.f4217x
            if (r4 != 0) goto L71
            boolean r1 = z2.h.a(r0, r1)
            if (r1 != 0) goto L23
        L71:
            r1 = r2
        L72:
            if (r1 == 0) goto L7b
            boolean r4 = r9.f4193O
            if (r4 != 0) goto L7b
            r9.I(r0)
        L7b:
            boolean r4 = r9.f4215v
            J.N r5 = r9.f4216w
            r5.b(r4)
            r9.f4215v = r1
            r9.f4188J = r0
            J.e0 r1 = J.C0257c.f4121c
            r4 = 202(0xca, float:2.83E-43)
            r9.Q(r4, r3, r1, r0)
            int r0 = r10 >> 3
            r0 = r0 & 14
            B1.t.s(r0, r8, r9, r3, r3)
            int r0 = r5.a()
            if (r0 == 0) goto L9b
            goto L9c
        L9b:
            r2 = r3
        L9c:
            r9.f4215v = r2
            r0 = 0
            r9.f4188J = r0
            J.t0 r9 = r9.t()
            if (r9 == 0) goto Laf
            H.n1 r0 = new H.n1
            r1 = 3
            r0.<init>(r10, r1, r7, r8)
            r9.f4235d = r0
        Laf:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: J.C0257c.b(J.r0[], y2.e, J.q, int):void");
    }

    public static final void c(Object obj, Object obj2, y2.c cVar, C0285q c0285q) {
        boolean g3 = c0285q.g(obj) | c0285q.g(obj2);
        Object K3 = c0285q.K();
        if (g3 || K3 == C0275l.f4150a) {
            K3 = new G(cVar);
            c0285q.e0(K3);
        }
    }

    public static final void d(Object obj, y2.c cVar, C0285q c0285q) {
        boolean g3 = c0285q.g(obj);
        Object K3 = c0285q.K();
        if (g3 || K3 == C0275l.f4150a) {
            K3 = new G(cVar);
            c0285q.e0(K3);
        }
    }

    public static final void e(C0285q c0285q, Object obj, y2.e eVar) {
        InterfaceC1078i h2 = c0285q.f4196b.h();
        boolean g3 = c0285q.g(obj);
        Object K3 = c0285q.K();
        if (g3 || K3 == C0275l.f4150a) {
            K3 = new T(h2, eVar);
            c0285q.e0(K3);
        }
    }

    public static final void f(Object obj, Object obj2, y2.e eVar, C0285q c0285q) {
        InterfaceC1078i h2 = c0285q.f4196b.h();
        boolean g3 = c0285q.g(obj) | c0285q.g(obj2);
        Object K3 = c0285q.K();
        if (g3 || K3 == C0275l.f4150a) {
            K3 = new T(h2, eVar);
            c0285q.e0(K3);
        }
    }

    public static final void g(y2.a aVar, C0285q c0285q) {
        C0329a c0329a = c0285q.f4190L.f4459b;
        c0329a.getClass();
        K.z zVar = K.z.f4498c;
        K.H h2 = c0329a.f4457h;
        h2.P(zVar);
        B1.C.k0(h2, 0, aVar);
        int i2 = h2.f4455n;
        int i3 = zVar.f4447a;
        int I3 = K.H.I(h2, i3);
        int i4 = zVar.f4448b;
        if (i2 == I3 && h2.f4456o == K.H.I(h2, i4)) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        int i5 = 0;
        for (int i6 = 0; i6 < i3; i6++) {
            if (((1 << i6) & h2.f4455n) != 0) {
                if (i5 > 0) {
                    sb.append(", ");
                }
                sb.append(zVar.b(i6));
                i5++;
            }
        }
        String sb2 = sb.toString();
        StringBuilder m3 = B1.t.m(sb2, "StringBuilder().apply(builderAction).toString()");
        int i7 = 0;
        for (int i8 = 0; i8 < i4; i8++) {
            if (((1 << i8) & h2.f4456o) != 0) {
                if (i5 > 0) {
                    m3.append(", ");
                }
                m3.append(zVar.c(i8));
                i7++;
            }
        }
        String sb3 = m3.toString();
        z2.h.e(sb3, "StringBuilder().apply(builderAction).toString()");
        StringBuilder sb4 = new StringBuilder("Error while pushing ");
        sb4.append(zVar);
        sb4.append(". Not all arguments were provided. Missing ");
        B1.t.x(sb4, i5, " int arguments (", sb2, ") and ");
        B1.t.z(sb4, i7, " object arguments (", sb3, ").");
        throw null;
    }

    public static final boolean h(int[] iArr, int i2) {
        return (iArr[(i2 * 5) + 1] & 67108864) != 0;
    }

    public static final int i(int[] iArr, int i2) {
        return iArr[(i2 * 5) + 4];
    }

    public static final int j(int[] iArr, int i2) {
        return iArr[(i2 * 5) + 3];
    }

    public static final boolean k(int[] iArr, int i2) {
        return (iArr[(i2 * 5) + 1] & 268435456) != 0;
    }

    public static final boolean l(int[] iArr, int i2) {
        return (iArr[(i2 * 5) + 1] & 536870912) != 0;
    }

    public static final boolean m(int[] iArr, int i2) {
        return (iArr[(i2 * 5) + 1] & 1073741824) != 0;
    }

    public static final int n(ArrayList arrayList, int i2, int i3) {
        int U3 = U(arrayList, i2, i3);
        return U3 >= 0 ? U3 : -(U3 + 1);
    }

    public static final int o(int[] iArr, int i2) {
        return iArr[(i2 * 5) + 1] & 67108863;
    }

    public static final int p(int[] iArr, int i2) {
        return iArr[(i2 * 5) + 2];
    }

    public static final void q(ArrayList arrayList, int i2, int i3) {
        int G3 = G(i2, arrayList);
        if (G3 < 0) {
            G3 = -(G3 + 1);
        }
        while (G3 < arrayList.size() && ((O) arrayList.get(G3)).f4060b < i3) {
            arrayList.remove(G3);
        }
    }

    public static final int r(int[] iArr, int i2) {
        int i3 = i2 * 5;
        return A(iArr[i3 + 1] >> 28) + iArr[i3 + 4];
    }

    public static final void s(int[] iArr, int i2, int i3) {
        T(i3 >= 0);
        iArr[(i2 * 5) + 3] = i3;
    }

    public static final void t(int[] iArr, int i2, int i3) {
        T(i3 >= 0 && i3 < 67108863);
        int i4 = (i2 * 5) + 1;
        iArr[i4] = i3 | (iArr[i4] & (-67108864));
    }

    public static void u(G0 g02, List list, C0294v c0294v) {
        if (!list.isEmpty()) {
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                int c3 = g02.c((C0255b) list.get(i2));
                int G3 = g02.G(g02.f4016b, g02.p(c3));
                Object obj = G3 < g02.f(g02.f4016b, g02.p(c3 + 1)) ? g02.f4017c[g02.g(G3)] : C0275l.f4150a;
                C0291t0 c0291t0 = obj instanceof C0291t0 ? (C0291t0) obj : null;
                if (c0291t0 != null) {
                    c0291t0.f4233b = c0294v;
                }
            }
        }
    }

    public static final InterfaceC0258c0 v(InterfaceC0343g interfaceC0343g, Object obj, InterfaceC1078i interfaceC1078i, C0285q c0285q, int i2, int i3) {
        if ((i3 & 2) != 0) {
            interfaceC1078i = C1079j.f9784h;
        }
        boolean i4 = c0285q.i(interfaceC1078i) | c0285q.i(interfaceC0343g);
        Object K3 = c0285q.K();
        Object obj2 = C0275l.f4150a;
        if (i4 || K3 == obj2) {
            K3 = new S0(interfaceC1078i, interfaceC0343g, null);
            c0285q.e0(K3);
        }
        y2.e eVar = (y2.e) K3;
        Object K4 = c0285q.K();
        if (K4 == obj2) {
            K4 = N(obj, W.f4109m);
            c0285q.e0(K4);
        }
        InterfaceC0258c0 interfaceC0258c0 = (InterfaceC0258c0) K4;
        boolean i5 = c0285q.i(eVar);
        Object K5 = c0285q.K();
        if (i5 || K5 == obj2) {
            K5 = new O0(eVar, interfaceC0258c0, null);
            c0285q.e0(K5);
        }
        f(interfaceC0343g, interfaceC1078i, (y2.e) K5, c0285q);
        return interfaceC0258c0;
    }

    public static final InterfaceC0258c0 w(M2.K k3, C0285q c0285q) {
        return v(k3, k3.f4811h.getValue(), C1079j.f9784h, c0285q, 0, 0);
    }

    public static final void x(D0 d02, ArrayList arrayList, int i2) {
        int[] iArr = d02.f3980b;
        if (m(iArr, i2)) {
            arrayList.add(d02.i(i2));
            return;
        }
        int j3 = j(iArr, i2) + i2;
        for (int i3 = i2 + 1; i3 < j3; i3 += iArr[(i3 * 5) + 3]) {
            x(d02, arrayList, i3);
        }
    }

    public static final void y(String str) {
        throw new C0273k("Compose Runtime internal error. Unexpected or incorrect use of the Compose internal runtime API (" + str + "). Please report to Google or use https://goo.gle/compose-feedback");
    }

    public static final void z(String str) {
        throw new C0273k("Compose Runtime internal error. Unexpected or incorrect use of the Compose internal runtime API (" + str + "). Please report to Google or use https://goo.gle/compose-feedback");
    }
}
