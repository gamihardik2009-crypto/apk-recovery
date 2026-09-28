package androidx.compose.foundation.lazy.layout;

import B1.t;
import V.n;
import V.o;
import j.AbstractC0739E;
import j.AbstractC0740F;
import j.C0736B;
import j.C0769y;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import n2.AbstractC0961m;
import n2.AbstractC0967s;
import t0.S;
import v.C1365s;
import v.C1367u;
import v.InterfaceC1330B;
import v.InterfaceC1331C;
import v.y;
import v.z;
import z2.h;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final C0769y f6655a;

    /* renamed from: b, reason: collision with root package name */
    public z f6656b;

    /* renamed from: c, reason: collision with root package name */
    public final C0736B f6657c;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f6658d;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f6659e;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f6660f;

    /* renamed from: g, reason: collision with root package name */
    public final ArrayList f6661g;

    /* renamed from: h, reason: collision with root package name */
    public final ArrayList f6662h;

    /* renamed from: i, reason: collision with root package name */
    public final o f6663i;

    public a() {
        long[] jArr = AbstractC0739E.f7971a;
        this.f6655a = new C0769y();
        int i2 = AbstractC0740F.f7972a;
        this.f6657c = new C0736B();
        this.f6658d = new ArrayList();
        this.f6659e = new ArrayList();
        this.f6660f = new ArrayList();
        this.f6661g = new ArrayList();
        this.f6662h = new ArrayList();
        this.f6663i = new S(this) { // from class: androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator$DisplayingDisappearingItemsElement

            /* renamed from: b, reason: collision with root package name */
            public final a f6648b;

            {
                this.f6648b = this;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof LazyLayoutItemAnimator$DisplayingDisappearingItemsElement) && h.a(this.f6648b, ((LazyLayoutItemAnimator$DisplayingDisappearingItemsElement) obj).f6648b);
            }

            public final int hashCode() {
                return this.f6648b.hashCode();
            }

            @Override // t0.S
            public final n l() {
                C1365s c1365s = new C1365s();
                c1365s.f11388u = this.f6648b;
                return c1365s;
            }

            @Override // t0.S
            public final void m(n nVar) {
                C1365s c1365s = (C1365s) nVar;
                a aVar = c1365s.f11388u;
                a aVar2 = this.f6648b;
                if (h.a(aVar, aVar2) || !c1365s.f5858h.f5869t) {
                    return;
                }
                c1365s.f11388u.e();
                aVar2.getClass();
                c1365s.f11388u = aVar2;
            }

            public final String toString() {
                return "DisplayingDisappearingItemsElement(animator=" + this.f6648b + ')';
            }
        };
    }

    public static int f(int[] iArr, InterfaceC1330B interfaceC1330B) {
        int f3 = interfaceC1330B.f();
        int d3 = interfaceC1330B.d() + f3;
        int i2 = 0;
        while (f3 < d3) {
            int a3 = interfaceC1330B.a() + iArr[f3];
            iArr[f3] = a3;
            i2 = Math.max(i2, a3);
            f3++;
        }
        return i2;
    }

    public final void a(int i2, Object obj) {
        t.w(this.f6655a.e(obj));
    }

    public final long b() {
        ArrayList arrayList = this.f6662h;
        if (arrayList.size() <= 0) {
            return 0L;
        }
        t.w(arrayList.get(0));
        throw null;
    }

    public final void c(int i2, int i3, ArrayList arrayList, z zVar, InterfaceC1331C interfaceC1331C, boolean z3, int i4, boolean z4, int i5, int i6) {
        C0736B c0736b;
        ArrayList arrayList2;
        long[] jArr;
        long[] jArr2;
        z zVar2 = this.f6656b;
        this.f6656b = zVar;
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            InterfaceC1330B interfaceC1330B = (InterfaceC1330B) arrayList.get(i7);
            int b3 = interfaceC1330B.b();
            for (int i8 = 0; i8 < b3; i8++) {
                interfaceC1330B.e(i8);
            }
        }
        C0769y c0769y = this.f6655a;
        if (c0769y.f8069e == 0) {
            e();
            return;
        }
        InterfaceC1330B interfaceC1330B2 = (InterfaceC1330B) AbstractC0961m.H(arrayList);
        if (interfaceC1330B2 != null) {
            interfaceC1330B2.getIndex();
        }
        boolean z5 = z3 || !z4;
        Object[] objArr = c0769y.f8066b;
        long[] jArr3 = c0769y.f8065a;
        int length = jArr3.length - 2;
        C0736B c0736b2 = this.f6657c;
        if (length >= 0) {
            int i9 = 0;
            while (true) {
                long j3 = jArr3[i9];
                c0736b = c0736b2;
                if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i10 = 8 - ((~(i9 - length)) >>> 31);
                    int i11 = 0;
                    while (i11 < i10) {
                        if ((j3 & 255) < 128) {
                            jArr2 = jArr3;
                            c0736b.a(objArr[(i9 << 3) + i11]);
                        } else {
                            jArr2 = jArr3;
                        }
                        j3 >>= 8;
                        i11++;
                        jArr3 = jArr2;
                    }
                    jArr = jArr3;
                    if (i10 != 8) {
                        break;
                    }
                } else {
                    jArr = jArr3;
                }
                if (i9 == length) {
                    break;
                }
                i9++;
                c0736b2 = c0736b;
                jArr3 = jArr;
            }
        } else {
            c0736b = c0736b2;
        }
        int size2 = arrayList.size();
        for (int i12 = 0; i12 < size2; i12++) {
            InterfaceC1330B interfaceC1330B3 = (InterfaceC1330B) arrayList.get(i12);
            c0736b.j(interfaceC1330B3.getKey());
            int b4 = interfaceC1330B3.b();
            for (int i13 = 0; i13 < b4; i13++) {
                interfaceC1330B3.e(i13);
            }
            d(interfaceC1330B3.getKey());
        }
        int[] iArr = new int[i4];
        for (int i14 = 0; i14 < i4; i14++) {
            iArr[i14] = 0;
        }
        ArrayList arrayList3 = this.f6659e;
        ArrayList arrayList4 = this.f6658d;
        if (z5 && zVar2 != null) {
            if (!arrayList4.isEmpty()) {
                if (arrayList4.size() > 1) {
                    AbstractC0967s.A(arrayList4, new C1367u(zVar2, 2));
                }
                if (arrayList4.size() > 0) {
                    InterfaceC1330B interfaceC1330B4 = (InterfaceC1330B) arrayList4.get(0);
                    f(iArr, interfaceC1330B4);
                    Object e3 = c0769y.e(interfaceC1330B4.getKey());
                    h.c(e3);
                    t.w(e3);
                    interfaceC1330B4.c(0);
                    throw null;
                }
                Arrays.fill(iArr, 0, i4, 0);
            }
            if (!arrayList3.isEmpty()) {
                if (arrayList3.size() > 1) {
                    AbstractC0967s.A(arrayList3, new C1367u(zVar2, 0));
                }
                if (arrayList3.size() > 0) {
                    InterfaceC1330B interfaceC1330B5 = (InterfaceC1330B) arrayList3.get(0);
                    f(iArr, interfaceC1330B5);
                    Object e4 = c0769y.e(interfaceC1330B5.getKey());
                    h.c(e4);
                    t.w(e4);
                    interfaceC1330B5.c(0);
                    throw null;
                }
                Arrays.fill(iArr, 0, i4, 0);
            }
        }
        Object[] objArr2 = c0736b.f7965b;
        long[] jArr4 = c0736b.f7964a;
        int length2 = jArr4.length - 2;
        ArrayList arrayList5 = this.f6661g;
        ArrayList arrayList6 = this.f6660f;
        if (length2 >= 0) {
            int i15 = length2;
            int i16 = 0;
            while (true) {
                long j4 = jArr4[i16];
                arrayList2 = arrayList3;
                long[] jArr5 = jArr4;
                if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i17 = 8;
                    int i18 = 8 - ((~(i16 - i15)) >>> 31);
                    long j5 = j4;
                    int i19 = 0;
                    while (i19 < i18) {
                        if ((j5 & 255) < 128) {
                            Object obj = objArr2[(i16 << 3) + i19];
                            Object e5 = c0769y.e(obj);
                            h.c(e5);
                            t.w(e5);
                            zVar.c(obj);
                            throw null;
                        }
                        j5 >>= i17;
                        i19++;
                        i17 = 8;
                    }
                    if (i18 != i17) {
                        break;
                    }
                }
                int i20 = i15;
                if (i16 == i20) {
                    break;
                }
                i16++;
                i15 = i20;
                arrayList3 = arrayList2;
                jArr4 = jArr5;
            }
        } else {
            arrayList2 = arrayList3;
        }
        if (!arrayList6.isEmpty()) {
            if (arrayList6.size() > 1) {
                AbstractC0967s.A(arrayList6, new C1367u(zVar, 3));
            }
            if (arrayList6.size() > 0) {
                InterfaceC1330B interfaceC1330B6 = (InterfaceC1330B) arrayList6.get(0);
                Object e6 = c0769y.e(interfaceC1330B6.getKey());
                h.c(e6);
                t.w(e6);
                f(iArr, interfaceC1330B6);
                if (!z3) {
                    throw null;
                }
                ((InterfaceC1330B) AbstractC0961m.G(arrayList)).c(0);
                throw null;
            }
            Arrays.fill(iArr, 0, i4, 0);
        }
        if (!arrayList5.isEmpty()) {
            if (arrayList5.size() > 1) {
                AbstractC0967s.A(arrayList5, new C1367u(zVar, 1));
            }
            if (arrayList5.size() > 0) {
                InterfaceC1330B interfaceC1330B7 = (InterfaceC1330B) arrayList5.get(0);
                Object e7 = c0769y.e(interfaceC1330B7.getKey());
                h.c(e7);
                t.w(e7);
                f(iArr, interfaceC1330B7);
                if (!z3) {
                    throw null;
                }
                ((InterfaceC1330B) AbstractC0961m.M(arrayList)).c(0);
                throw null;
            }
        }
        Collections.reverse(arrayList6);
        arrayList.addAll(0, arrayList6);
        arrayList.addAll(arrayList5);
        arrayList4.clear();
        arrayList2.clear();
        arrayList6.clear();
        arrayList5.clear();
        c0736b.b();
    }

    public final void d(Object obj) {
    }

    public final void e() {
        C0769y c0769y = this.f6655a;
        if (c0769y.f8069e != 0) {
            Object[] objArr = c0769y.f8067c;
            long[] jArr = c0769y.f8065a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i2 = 0;
                while (true) {
                    long j3 = jArr[i2];
                    if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i3 = 8 - ((~(i2 - length)) >>> 31);
                        for (int i4 = 0; i4 < i3; i4++) {
                            if ((255 & j3) < 128) {
                                t.w(objArr[(i2 << 3) + i4]);
                                throw null;
                            }
                            j3 >>= 8;
                        }
                        if (i3 != 8) {
                            break;
                        }
                    }
                    if (i2 == length) {
                        break;
                    } else {
                        i2++;
                    }
                }
            }
            c0769y.a();
        }
        this.f6656b = y.f11399a;
    }
}
