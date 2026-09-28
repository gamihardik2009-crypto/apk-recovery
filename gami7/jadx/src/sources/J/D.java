package J;

import T.AbstractC0379g;
import j.AbstractC0737C;
import j.C0766v;

/* loaded from: classes.dex */
public final class D extends T.C {

    /* renamed from: h, reason: collision with root package name */
    public static final Object f3973h = new Object();

    /* renamed from: c, reason: collision with root package name */
    public int f3974c;

    /* renamed from: d, reason: collision with root package name */
    public int f3975d;

    /* renamed from: e, reason: collision with root package name */
    public C0766v f3976e;

    /* renamed from: f, reason: collision with root package name */
    public Object f3977f;

    /* renamed from: g, reason: collision with root package name */
    public int f3978g;

    public D() {
        C0766v c0766v = AbstractC0737C.f7969a;
        z2.h.d(c0766v, "null cannot be cast to non-null type androidx.collection.ObjectIntMap<K of androidx.collection.ObjectIntMapKt.emptyObjectIntMap>");
        this.f3976e = c0766v;
        this.f3977f = f3973h;
    }

    @Override // T.C
    public final void a(T.C c3) {
        z2.h.d(c3, "null cannot be cast to non-null type androidx.compose.runtime.DerivedSnapshotState.ResultRecord<T of androidx.compose.runtime.DerivedSnapshotState.ResultRecord>");
        D d3 = (D) c3;
        this.f3976e = d3.f3976e;
        this.f3977f = d3.f3977f;
        this.f3978g = d3.f3978g;
    }

    @Override // T.C
    public final T.C b() {
        return new D();
    }

    public final boolean c(F f3, AbstractC0379g abstractC0379g) {
        boolean z3;
        boolean z4;
        Object obj = T.n.f5710b;
        synchronized (obj) {
            z3 = true;
            if (this.f3974c == abstractC0379g.d()) {
                if (this.f3975d == abstractC0379g.h()) {
                    z4 = false;
                }
            }
            z4 = true;
        }
        if (this.f3977f == f3973h || (z4 && this.f3978g != d(f3, abstractC0379g))) {
            z3 = false;
        }
        if (z3 && z4) {
            synchronized (obj) {
                this.f3974c = abstractC0379g.d();
                this.f3975d = abstractC0379g.h();
            }
        }
        return z3;
    }

    public final int d(F f3, AbstractC0379g abstractC0379g) {
        C0766v c0766v;
        int i2;
        int i3;
        int i4;
        int i5;
        T.C j3;
        synchronized (T.n.f5710b) {
            c0766v = this.f3976e;
        }
        char c3 = 7;
        if (c0766v.f8055e == 0) {
            return 7;
        }
        L.d E = C0257c.E();
        int i6 = E.f4620j;
        int i7 = 1;
        if (i6 > 0) {
            Object[] objArr = E.f4618h;
            int i8 = 0;
            do {
                ((C0281o) objArr[i8]).b();
                i8++;
            } while (i8 < i6);
        }
        try {
            Object[] objArr2 = c0766v.f8052b;
            int[] iArr = c0766v.f8053c;
            long[] jArr = c0766v.f8051a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i9 = 7;
                int i10 = 0;
                while (true) {
                    long j4 = jArr[i10];
                    if ((((~j4) << c3) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i11 = 8;
                        int i12 = 8 - ((~(i10 - length)) >>> 31);
                        int i13 = 0;
                        while (i13 < i12) {
                            if ((j4 & 255) < 128) {
                                int i14 = (i10 << 3) + i13;
                                T.A a3 = (T.A) objArr2[i14];
                                if (iArr[i14] == i7) {
                                    if (a3 instanceof F) {
                                        F f4 = (F) a3;
                                        i2 = 0;
                                        try {
                                            j3 = f4.g((D) T.n.j(f4.f4009k, abstractC0379g), abstractC0379g, false, f4.f4007i);
                                        } catch (Throwable th) {
                                            th = th;
                                            int i15 = E.f4620j;
                                            if (i15 > 0) {
                                                Object[] objArr3 = E.f4618h;
                                                int i16 = i2;
                                                do {
                                                    ((C0281o) objArr3[i16]).a();
                                                    i16++;
                                                } while (i16 < i15);
                                            }
                                            throw th;
                                        }
                                    } else {
                                        i2 = 0;
                                        j3 = T.n.j(a3.a(), abstractC0379g);
                                    }
                                    i9 = (((i9 * 31) + System.identityHashCode(j3)) * 31) + j3.f5647a;
                                }
                                i5 = 8;
                            } else {
                                i5 = i11;
                            }
                            j4 >>= i5;
                            i13++;
                            i11 = i5;
                            i7 = 1;
                        }
                        i3 = 0;
                        if (i12 != i11) {
                            break;
                        }
                    } else {
                        i3 = 0;
                    }
                    if (i10 == length) {
                        break;
                    }
                    i10++;
                    c3 = 7;
                    i7 = 1;
                }
                i4 = i9;
            } else {
                i3 = 0;
                i4 = 7;
            }
            int i17 = E.f4620j;
            if (i17 <= 0) {
                return i4;
            }
            Object[] objArr4 = E.f4618h;
            int i18 = i3;
            do {
                ((C0281o) objArr4[i18]).a();
                i18++;
            } while (i18 < i17);
            return i4;
        } catch (Throwable th2) {
            th = th2;
            i2 = 0;
        }
    }
}
