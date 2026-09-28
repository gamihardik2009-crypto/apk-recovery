package J;

import T.AbstractC0379g;
import j.C0766v;

/* loaded from: classes.dex */
public final class F extends T.B implements W0 {

    /* renamed from: i, reason: collision with root package name */
    public final y2.a f4007i;

    /* renamed from: j, reason: collision with root package name */
    public final L0 f4008j;

    /* renamed from: k, reason: collision with root package name */
    public D f4009k = new D();

    public F(L0 l02, y2.a aVar) {
        this.f4007i = aVar;
        this.f4008j = l02;
    }

    @Override // T.A
    public final T.C a() {
        return this.f4009k;
    }

    @Override // T.A
    public final void b(T.C c3) {
        this.f4009k = (D) c3;
    }

    /* JADX WARN: Finally extract failed */
    public final D g(D d3, AbstractC0379g abstractC0379g, boolean z3, y2.a aVar) {
        int i2;
        L0 l02;
        int i3;
        D d4 = d3;
        if (d4.c(this, abstractC0379g)) {
            if (z3) {
                L.d E = C0257c.E();
                int i4 = E.f4620j;
                if (i4 > 0) {
                    Object[] objArr = E.f4618h;
                    int i5 = 0;
                    do {
                        ((C0281o) objArr[i5]).b();
                        i5++;
                    } while (i5 < i4);
                }
                try {
                    C0766v c0766v = d4.f3976e;
                    K1.m mVar = M0.f4051a;
                    R.c cVar = (R.c) mVar.d();
                    if (cVar == null) {
                        cVar = new R.c(0);
                        mVar.m(cVar);
                    }
                    int i6 = cVar.f5374a;
                    Object[] objArr2 = c0766v.f8052b;
                    int[] iArr = c0766v.f8053c;
                    long[] jArr = c0766v.f8051a;
                    int length = jArr.length - 2;
                    if (length >= 0) {
                        int i7 = 0;
                        while (true) {
                            long j3 = jArr[i7];
                            if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i8 = 8;
                                int i9 = 8 - ((~(i7 - length)) >>> 31);
                                int i10 = 0;
                                while (i10 < i9) {
                                    if ((j3 & 255) < 128) {
                                        int i11 = (i7 << 3) + i10;
                                        T.A a3 = (T.A) objArr2[i11];
                                        cVar.f5374a = i6 + iArr[i11];
                                        y2.c f3 = abstractC0379g.f();
                                        if (f3 != null) {
                                            f3.l(a3);
                                        }
                                        i3 = 8;
                                    } else {
                                        i3 = i8;
                                    }
                                    j3 >>= i3;
                                    i10++;
                                    i8 = i3;
                                }
                                if (i9 != i8) {
                                    break;
                                }
                            }
                            if (i7 == length) {
                                break;
                            }
                            i7++;
                        }
                    }
                    cVar.f5374a = i6;
                    int i12 = E.f4620j;
                    if (i12 > 0) {
                        Object[] objArr3 = E.f4618h;
                        int i13 = 0;
                        do {
                            ((C0281o) objArr3[i13]).a();
                            i13++;
                        } while (i13 < i12);
                    }
                } catch (Throwable th) {
                    int i14 = E.f4620j;
                    if (i14 > 0) {
                        Object[] objArr4 = E.f4618h;
                        int i15 = 0;
                        do {
                            ((C0281o) objArr4[i15]).a();
                            i15++;
                        } while (i15 < i14);
                    }
                    throw th;
                }
            }
            return d4;
        }
        C0766v c0766v2 = new C0766v();
        K1.m mVar2 = M0.f4051a;
        R.c cVar2 = (R.c) mVar2.d();
        if (cVar2 == null) {
            i2 = 0;
            cVar2 = new R.c(0);
            mVar2.m(cVar2);
        } else {
            i2 = 0;
        }
        R.c cVar3 = cVar2;
        int i16 = cVar3.f5374a;
        L.d E3 = C0257c.E();
        int i17 = E3.f4620j;
        if (i17 > 0) {
            Object[] objArr5 = E3.f4618h;
            int i18 = i2;
            do {
                ((C0281o) objArr5[i18]).b();
                i18++;
            } while (i18 < i17);
        }
        try {
            cVar3.f5374a = i16 + 1;
            Object e3 = T.s.e(new E(this, cVar3, c0766v2, i16, 0), aVar);
            cVar3.f5374a = i16;
            int i19 = E3.f4620j;
            if (i19 > 0) {
                Object[] objArr6 = E3.f4618h;
                do {
                    ((C0281o) objArr6[i2]).a();
                    i2++;
                } while (i2 < i19);
            }
            Object obj = T.n.f5710b;
            synchronized (obj) {
                try {
                    AbstractC0379g k3 = T.n.k();
                    Object obj2 = d4.f3977f;
                    if (obj2 == D.f3973h || (l02 = this.f4008j) == null || !l02.a(e3, obj2)) {
                        D d5 = this.f4009k;
                        synchronized (obj) {
                            T.C m3 = T.n.m(d5, this);
                            m3.a(d5);
                            m3.f5647a = k3.d();
                            d4 = (D) m3;
                            d4.f3976e = c0766v2;
                            d4.f3978g = d4.d(this, k3);
                            d4.f3977f = e3;
                        }
                        return d4;
                    }
                    d4.f3976e = c0766v2;
                    d4.f3978g = d4.d(this, k3);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            R.c cVar4 = (R.c) M0.f4051a.d();
            if (cVar4 != null && cVar4.f5374a == 0) {
                T.n.k().m();
                synchronized (obj) {
                    AbstractC0379g k4 = T.n.k();
                    d4.f3974c = k4.d();
                    d4.f3975d = k4.h();
                }
            }
            return d4;
        } catch (Throwable th3) {
            int i20 = E3.f4620j;
            if (i20 > 0) {
                Object[] objArr7 = E3.f4618h;
                do {
                    ((C0281o) objArr7[i2]).a();
                    i2++;
                } while (i2 < i20);
            }
            throw th3;
        }
    }

    @Override // J.W0
    public final Object getValue() {
        y2.c f3 = T.n.k().f();
        if (f3 != null) {
            f3.l(this);
        }
        AbstractC0379g k3 = T.n.k();
        return g((D) T.n.j(this.f4009k, k3), k3, true, this.f4007i).f3977f;
    }

    public final D h() {
        AbstractC0379g k3 = T.n.k();
        return g((D) T.n.j(this.f4009k, k3), k3, false, this.f4007i);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DerivedState(value=");
        D d3 = (D) T.n.i(this.f4009k);
        sb.append(d3.c(this, T.n.k()) ? String.valueOf(d3.f3977f) : "<Not calculated>");
        sb.append(")@");
        sb.append(hashCode());
        return sb.toString();
    }
}
