package n0;

import J.V;
import J2.C0311h;
import J2.InterfaceC0310g;
import J2.p0;
import java.util.ArrayList;
import java.util.List;
import m2.C0880v;
import n2.AbstractC0948C;
import q2.C1080k;
import q2.InterfaceC1073d;
import r2.EnumC1145a;
import t0.AbstractC1248f;
import t0.k0;

/* renamed from: n0.D, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0921D extends V.n implements O0.b, k0 {

    /* renamed from: C, reason: collision with root package name */
    public C0930i f8912C;

    /* renamed from: u, reason: collision with root package name */
    public Object f8914u;

    /* renamed from: v, reason: collision with root package name */
    public Object f8915v;

    /* renamed from: w, reason: collision with root package name */
    public Object[] f8916w;

    /* renamed from: x, reason: collision with root package name */
    public y2.e f8917x;

    /* renamed from: y, reason: collision with root package name */
    public p0 f8918y;

    /* renamed from: z, reason: collision with root package name */
    public C0930i f8919z = w.f8985a;

    /* renamed from: A, reason: collision with root package name */
    public final L.d f8910A = new L.d(new C0918A[16]);

    /* renamed from: B, reason: collision with root package name */
    public final L.d f8911B = new L.d(new C0918A[16]);

    /* renamed from: D, reason: collision with root package name */
    public long f8913D = 0;

    public C0921D(Object obj, Object obj2, Object[] objArr, y2.e eVar) {
        this.f8914u = obj;
        this.f8915v = obj2;
        this.f8916w = objArr;
        this.f8917x = eVar;
    }

    @Override // V.n
    public final void D0() {
        M0();
    }

    public final Object K0(y2.e eVar, InterfaceC1073d interfaceC1073d) {
        C0311h c0311h = new C0311h(1, AbstractC0948C.i(interfaceC1073d));
        c0311h.r();
        C0918A c0918a = new C0918A(this, c0311h);
        synchronized (this.f8910A) {
            this.f8910A.b(c0918a);
            new C1080k(AbstractC0948C.i(AbstractC0948C.g(c0918a, c0918a, eVar)), EnumC1145a.f10026h).t(C0880v.f8657a);
        }
        c0311h.u(new C0919B(0, c0918a));
        return c0311h.q();
    }

    public final void L0(C0930i c0930i, EnumC0931j enumC0931j) {
        InterfaceC0310g interfaceC0310g;
        InterfaceC0310g interfaceC0310g2;
        synchronized (this.f8910A) {
            L.d dVar = this.f8911B;
            dVar.c(dVar.f4620j, this.f8910A);
        }
        try {
            int ordinal = enumC0931j.ordinal();
            if (ordinal != 0) {
                if (ordinal == 1) {
                    L.d dVar2 = this.f8911B;
                    int i2 = dVar2.f4620j;
                    if (i2 > 0) {
                        int i3 = i2 - 1;
                        Object[] objArr = dVar2.f4618h;
                        do {
                            C0918A c0918a = (C0918A) objArr[i3];
                            if (enumC0931j == c0918a.f8904k && (interfaceC0310g2 = c0918a.f8903j) != null) {
                                c0918a.f8903j = null;
                                interfaceC0310g2.t(c0930i);
                            }
                            i3--;
                        } while (i3 >= 0);
                    }
                } else if (ordinal != 2) {
                }
            }
            L.d dVar3 = this.f8911B;
            int i4 = dVar3.f4620j;
            if (i4 > 0) {
                Object[] objArr2 = dVar3.f4618h;
                int i5 = 0;
                do {
                    C0918A c0918a2 = (C0918A) objArr2[i5];
                    if (enumC0931j == c0918a2.f8904k && (interfaceC0310g = c0918a2.f8903j) != null) {
                        c0918a2.f8903j = null;
                        interfaceC0310g.t(c0930i);
                    }
                    i5++;
                } while (i5 < i4);
            }
        } finally {
            this.f8911B.g();
        }
    }

    public final void M0() {
        p0 p0Var = this.f8918y;
        if (p0Var != null) {
            p0Var.a(new V("Pointer input was reset", 4));
            this.f8918y = null;
        }
    }

    @Override // t0.k0
    public final void N() {
        M0();
    }

    @Override // t0.k0
    public final void Y() {
        C0930i c0930i = this.f8912C;
        if (c0930i == null) {
            return;
        }
        List list = c0930i.f8943a;
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (!(!((r) list.get(i2)).f8960d)) {
                ArrayList arrayList = new ArrayList(list.size());
                int size2 = list.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    r rVar = (r) list.get(i3);
                    long j3 = rVar.f8957a;
                    boolean z3 = rVar.f8960d;
                    long j4 = rVar.f8958b;
                    long j5 = rVar.f8959c;
                    arrayList.add(new r(j3, j4, j5, false, rVar.f8961e, j4, j5, z3, z3, 1, 0L));
                }
                C0930i c0930i2 = new C0930i(arrayList, null);
                this.f8919z = c0930i2;
                L0(c0930i2, EnumC0931j.f8946h);
                L0(c0930i2, EnumC0931j.f8947i);
                L0(c0930i2, EnumC0931j.f8948j);
                this.f8912C = null;
                return;
            }
        }
    }

    @Override // O0.b
    public final float c() {
        return AbstractC1248f.v(this).f10402x.c();
    }

    @Override // t0.k0
    public final void n() {
        M0();
    }

    @Override // O0.b
    public final float s() {
        return AbstractC1248f.v(this).f10402x.s();
    }

    @Override // t0.k0
    public final void t0(C0930i c0930i, EnumC0931j enumC0931j, long j3) {
        this.f8913D = j3;
        if (enumC0931j == EnumC0931j.f8946h) {
            this.f8919z = c0930i;
        }
        if (this.f8918y == null) {
            this.f8918y = J2.B.r(y0(), null, 4, new C0920C(this, null), 1);
        }
        L0(c0930i, enumC0931j);
        List list = c0930i.f8943a;
        int size = list.size();
        boolean z3 = false;
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                z3 = true;
                break;
            } else if (!AbstractC0937p.c((r) list.get(i2))) {
                break;
            } else {
                i2++;
            }
        }
        if (!(!z3)) {
            c0930i = null;
        }
        this.f8912C = c0930i;
    }
}
