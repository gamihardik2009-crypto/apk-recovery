package v;

import android.os.Trace;
import g2.C0690a;
import j.C0768x;
import java.util.List;
import n2.C0970v;
import r0.C1111Z;
import r0.InterfaceC1109X;

/* loaded from: classes.dex */
public final class T implements InterfaceC1336H {

    /* renamed from: a, reason: collision with root package name */
    public final int f11314a;

    /* renamed from: b, reason: collision with root package name */
    public final long f11315b;

    /* renamed from: c, reason: collision with root package name */
    public final U f11316c;

    /* renamed from: d, reason: collision with root package name */
    public InterfaceC1109X f11317d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f11318e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f11319f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f11320g;

    /* renamed from: h, reason: collision with root package name */
    public T.j f11321h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f11322i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Q1.r f11323j;

    public T(Q1.r rVar, int i2, long j3, U u3) {
        this.f11323j = rVar;
        this.f11314a = i2;
        this.f11315b = j3;
        this.f11316c = u3;
    }

    @Override // v.InterfaceC1336H
    public final void a() {
        this.f11322i = true;
    }

    public final boolean b(C1347a c1347a) {
        List list;
        if (!c()) {
            return false;
        }
        Object d3 = ((x) ((w) this.f11323j.f5322b).f11397b.c()).d(this.f11314a);
        boolean z3 = this.f11317d != null;
        U u3 = this.f11316c;
        if (!z3) {
            long c3 = (d3 == null || u3.f11324a.b(d3) < 0) ? u3.f11326c : u3.f11324a.c(d3);
            long a3 = c1347a.a();
            if ((!this.f11322i || a3 <= 0) && c3 >= a3) {
                return true;
            }
            long nanoTime = System.nanoTime();
            Trace.beginSection("compose:lazy:prefetch:compose");
            try {
                d();
                Trace.endSection();
                long nanoTime2 = System.nanoTime() - nanoTime;
                if (d3 != null) {
                    C0768x c0768x = u3.f11324a;
                    int b3 = c0768x.b(d3);
                    u3.f11324a.e(U.a(u3, nanoTime2, b3 >= 0 ? c0768x.f8061c[b3] : 0L), d3);
                }
                u3.f11326c = U.a(u3, nanoTime2, u3.f11326c);
            } finally {
            }
        }
        if (!this.f11322i) {
            if (!this.f11320g) {
                if (c1347a.a() <= 0) {
                    return true;
                }
                Trace.beginSection("compose:lazy:prefetch:resolve-nested");
                try {
                    this.f11321h = f();
                    this.f11320g = true;
                } finally {
                }
            }
            T.j jVar = this.f11321h;
            if (jVar != null) {
                List[] listArr = (List[]) jVar.f5693d;
                int i2 = jVar.f5690a;
                List list2 = (List) jVar.f5692c;
                if (i2 < list2.size()) {
                    if (!(!((T) jVar.f5694e).f11319f)) {
                        throw new IllegalStateException("Should not execute nested prefetch on canceled request".toString());
                    }
                    Trace.beginSection("compose:lazy:prefetch:nested");
                    while (jVar.f5690a < list2.size()) {
                        try {
                            if (listArr[jVar.f5690a] == null) {
                                if (c1347a.a() <= 0) {
                                    return true;
                                }
                                int i3 = jVar.f5690a;
                                C1337I c1337i = (C1337I) list2.get(i3);
                                y2.c cVar = c1337i.f11288a;
                                if (cVar == null) {
                                    list = C0970v.f9165h;
                                } else {
                                    C1335G c1335g = new C1335G(c1337i);
                                    cVar.l(c1335g);
                                    list = c1335g.f11286a;
                                }
                                listArr[i3] = list;
                            }
                            List list3 = listArr[jVar.f5690a];
                            z2.h.c(list3);
                            while (jVar.f5691b < list3.size()) {
                                if (((T) list3.get(jVar.f5691b)).b(c1347a)) {
                                    return true;
                                }
                                jVar.f5691b++;
                            }
                            jVar.f5691b = 0;
                            jVar.f5690a++;
                        } finally {
                        }
                    }
                }
            }
        }
        if (!this.f11318e) {
            long j3 = this.f11315b;
            int i4 = (int) (3 & j3);
            int i5 = (((i4 & 2) >> 1) * 3) + ((i4 & 1) << 1);
            if ((((int) (j3 >> 33)) & ((1 << (i5 + 13)) - 1)) - 1 != 0) {
                if ((((1 << (18 - i5)) - 1) & ((int) (j3 >> (i5 + 46)))) - 1 != 0) {
                    long c4 = (d3 == null || u3.f11325b.b(d3) < 0) ? u3.f11327d : u3.f11325b.c(d3);
                    long a4 = c1347a.a();
                    if ((!this.f11322i || a4 <= 0) && c4 >= a4) {
                        return true;
                    }
                    long nanoTime3 = System.nanoTime();
                    Trace.beginSection("compose:lazy:prefetch:measure");
                    try {
                        e(j3);
                        Trace.endSection();
                        long nanoTime4 = System.nanoTime() - nanoTime3;
                        if (d3 != null) {
                            C0768x c0768x2 = u3.f11325b;
                            int b4 = c0768x2.b(d3);
                            u3.f11325b.e(U.a(u3, nanoTime4, b4 >= 0 ? c0768x2.f8061c[b4] : 0L), d3);
                        }
                        u3.f11327d = U.a(u3, nanoTime4, u3.f11327d);
                    } finally {
                    }
                }
            }
        }
        return false;
    }

    public final boolean c() {
        if (!this.f11319f) {
            int a3 = ((x) ((w) this.f11323j.f5322b).f11397b.c()).a();
            int i2 = this.f11314a;
            if (i2 >= 0 && i2 < a3) {
                return true;
            }
        }
        return false;
    }

    @Override // v.InterfaceC1336H
    public final void cancel() {
        if (this.f11319f) {
            return;
        }
        this.f11319f = true;
        InterfaceC1109X interfaceC1109X = this.f11317d;
        if (interfaceC1109X != null) {
            interfaceC1109X.a();
        }
        this.f11317d = null;
    }

    public final void d() {
        if (!c()) {
            throw new IllegalArgumentException("Callers should check whether the request is still valid before calling performComposition()".toString());
        }
        if (this.f11317d != null) {
            throw new IllegalArgumentException("Request was already composed!".toString());
        }
        Q1.r rVar = this.f11323j;
        x xVar = (x) ((w) rVar.f5322b).f11397b.c();
        int i2 = this.f11314a;
        Object b3 = xVar.b(i2);
        this.f11317d = ((C1111Z) rVar.f5323c).a().g(b3, ((w) rVar.f5322b).a(b3, i2, xVar.d(i2)));
    }

    public final void e(long j3) {
        if (!(!this.f11319f)) {
            throw new IllegalArgumentException("Callers should check whether the request is still valid before calling performMeasure()".toString());
        }
        if (!(!this.f11318e)) {
            throw new IllegalArgumentException("Request was already measured!".toString());
        }
        this.f11318e = true;
        InterfaceC1109X interfaceC1109X = this.f11317d;
        if (interfaceC1109X == null) {
            throw new IllegalArgumentException("performComposition() must be called before performMeasure()".toString());
        }
        int b3 = interfaceC1109X.b();
        for (int i2 = 0; i2 < b3; i2++) {
            interfaceC1109X.d(j3, i2);
        }
    }

    public final T.j f() {
        InterfaceC1109X interfaceC1109X = this.f11317d;
        if (interfaceC1109X == null) {
            throw new IllegalArgumentException("Should precompose before resolving nested prefetch states".toString());
        }
        z2.s sVar = new z2.s();
        interfaceC1109X.c(new C0690a(sVar, 4));
        List list = (List) sVar.f11909h;
        if (list == null) {
            return null;
        }
        T.j jVar = new T.j();
        jVar.f5694e = this;
        jVar.f5692c = list;
        jVar.f5693d = new List[list.size()];
        if (!list.isEmpty()) {
            return jVar;
        }
        throw new IllegalArgumentException("NestedPrefetchController shouldn't be created with no states".toString());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("HandleAndRequestImpl { index = ");
        sb.append(this.f11314a);
        sb.append(", constraints = ");
        sb.append((Object) O0.a.k(this.f11315b));
        sb.append(", isComposed = ");
        sb.append(this.f11317d != null);
        sb.append(", isMeasured = ");
        sb.append(this.f11318e);
        sb.append(", isCanceled = ");
        sb.append(this.f11319f);
        sb.append(" }");
        return sb.toString();
    }
}
