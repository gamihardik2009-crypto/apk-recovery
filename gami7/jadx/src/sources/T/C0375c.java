package T;

import J.C0257c;
import j.AbstractC0740F;
import j.C0736B;
import java.util.ArrayList;
import java.util.HashMap;
import m2.C0865g;
import n2.AbstractC0961m;

/* renamed from: T.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0375c extends AbstractC0379g {

    /* renamed from: n, reason: collision with root package name */
    public static final int[] f5669n = new int[0];

    /* renamed from: e, reason: collision with root package name */
    public final y2.c f5670e;

    /* renamed from: f, reason: collision with root package name */
    public final y2.c f5671f;

    /* renamed from: g, reason: collision with root package name */
    public int f5672g;

    /* renamed from: h, reason: collision with root package name */
    public C0736B f5673h;

    /* renamed from: i, reason: collision with root package name */
    public ArrayList f5674i;

    /* renamed from: j, reason: collision with root package name */
    public l f5675j;

    /* renamed from: k, reason: collision with root package name */
    public int[] f5676k;

    /* renamed from: l, reason: collision with root package name */
    public int f5677l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f5678m;

    public C0375c(int i2, l lVar, y2.c cVar, y2.c cVar2) {
        super(i2, lVar);
        this.f5670e = cVar;
        this.f5671f = cVar2;
        this.f5675j = l.f5701l;
        this.f5676k = f5669n;
        this.f5677l = 1;
    }

    public void A(C0736B c0736b) {
        this.f5673h = c0736b;
    }

    public C0375c B(y2.c cVar, y2.c cVar2) {
        C0376d c0376d;
        if (!(!this.f5687c)) {
            C0257c.W("Cannot use a disposed snapshot");
            throw null;
        }
        if (this.f5678m && this.f5688d < 0) {
            C0257c.X("Unsupported operation on a disposed or applied snapshot");
            throw null;
        }
        z(d());
        Object obj = n.f5710b;
        synchronized (obj) {
            int i2 = n.f5712d;
            n.f5712d = i2 + 1;
            n.f5711c = n.f5711c.g(i2);
            l e3 = e();
            r(e3.g(i2));
            c0376d = new C0376d(i2, n.e(e3, d() + 1, i2), n.l(cVar, f(), true), n.b(cVar2, i()), this);
        }
        if (!this.f5678m && !this.f5687c) {
            int d3 = d();
            synchronized (obj) {
                int i3 = n.f5712d;
                n.f5712d = i3 + 1;
                q(i3);
                n.f5711c = n.f5711c.g(d());
            }
            r(n.e(e(), d3 + 1, d()));
        }
        return c0376d;
    }

    @Override // T.AbstractC0379g
    public final void b() {
        n.f5711c = n.f5711c.b(d()).a(this.f5675j);
    }

    @Override // T.AbstractC0379g
    public void c() {
        if (this.f5687c) {
            return;
        }
        this.f5687c = true;
        synchronized (n.f5710b) {
            int i2 = this.f5688d;
            if (i2 >= 0) {
                n.u(i2);
                this.f5688d = -1;
            }
        }
        l();
    }

    @Override // T.AbstractC0379g
    public boolean g() {
        return false;
    }

    @Override // T.AbstractC0379g
    public int h() {
        return this.f5672g;
    }

    @Override // T.AbstractC0379g
    public y2.c i() {
        return this.f5671f;
    }

    @Override // T.AbstractC0379g
    public void k() {
        this.f5677l++;
    }

    @Override // T.AbstractC0379g
    public void l() {
        int i2 = this.f5677l;
        if (!(i2 > 0)) {
            C0257c.W("no pending nested snapshots");
            throw null;
        }
        int i3 = i2 - 1;
        this.f5677l = i3;
        if (i3 != 0 || this.f5678m) {
            return;
        }
        C0736B w2 = w();
        if (w2 != null) {
            if (!(true ^ this.f5678m)) {
                C0257c.X("Unsupported operation on a snapshot that has been applied");
                throw null;
            }
            A(null);
            int d3 = d();
            Object[] objArr = w2.f7965b;
            long[] jArr = w2.f7964a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i4 = 0;
                while (true) {
                    long j3 = jArr[i4];
                    if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i5 = 8 - ((~(i4 - length)) >>> 31);
                        for (int i6 = 0; i6 < i5; i6++) {
                            if ((255 & j3) < 128) {
                                for (C a3 = ((A) objArr[(i4 << 3) + i6]).a(); a3 != null; a3 = a3.f5648b) {
                                    int i7 = a3.f5647a;
                                    if (i7 == d3 || AbstractC0961m.E(this.f5675j, Integer.valueOf(i7))) {
                                        a3.f5647a = 0;
                                    }
                                }
                            }
                            j3 >>= 8;
                        }
                        if (i5 != 8) {
                            break;
                        }
                    }
                    if (i4 == length) {
                        break;
                    } else {
                        i4++;
                    }
                }
            }
        }
        a();
    }

    @Override // T.AbstractC0379g
    public void m() {
        if (this.f5678m || this.f5687c) {
            return;
        }
        u();
    }

    @Override // T.AbstractC0379g
    public void n(A a3) {
        C0736B w2 = w();
        if (w2 == null) {
            int i2 = AbstractC0740F.f7972a;
            w2 = new C0736B();
            A(w2);
        }
        w2.a(a3);
    }

    @Override // T.AbstractC0379g
    public final void o() {
        int length = this.f5676k.length;
        for (int i2 = 0; i2 < length; i2++) {
            n.u(this.f5676k[i2]);
        }
        int i3 = this.f5688d;
        if (i3 >= 0) {
            n.u(i3);
            this.f5688d = -1;
        }
    }

    @Override // T.AbstractC0379g
    public void s(int i2) {
        this.f5672g = i2;
    }

    @Override // T.AbstractC0379g
    public AbstractC0379g t(y2.c cVar) {
        C0377e c0377e;
        if (!(!this.f5687c)) {
            C0257c.W("Cannot use a disposed snapshot");
            throw null;
        }
        if (this.f5678m && this.f5688d < 0) {
            C0257c.X("Unsupported operation on a disposed or applied snapshot");
            throw null;
        }
        int d3 = d();
        z(d());
        Object obj = n.f5710b;
        synchronized (obj) {
            int i2 = n.f5712d;
            n.f5712d = i2 + 1;
            n.f5711c = n.f5711c.g(i2);
            c0377e = new C0377e(i2, n.e(e(), d3 + 1, i2), n.l(cVar, f(), true), this);
        }
        if (!this.f5678m && !this.f5687c) {
            int d4 = d();
            synchronized (obj) {
                int i3 = n.f5712d;
                n.f5712d = i3 + 1;
                q(i3);
                n.f5711c = n.f5711c.g(d());
            }
            r(n.e(e(), d4 + 1, d()));
        }
        return c0377e;
    }

    public final void u() {
        z(d());
        if (this.f5678m || this.f5687c) {
            return;
        }
        int d3 = d();
        synchronized (n.f5710b) {
            int i2 = n.f5712d;
            n.f5712d = i2 + 1;
            q(i2);
            n.f5711c = n.f5711c.g(d());
        }
        r(n.e(e(), d3 + 1, d()));
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00c0 A[LOOP:1: B:31:0x00be->B:32:0x00c0, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00cf A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public T.s v() {
        /*
            Method dump skipped, instructions count: 395
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: T.C0375c.v():T.s");
    }

    public C0736B w() {
        return this.f5673h;
    }

    @Override // T.AbstractC0379g
    /* renamed from: x, reason: merged with bridge method [inline-methods] */
    public y2.c f() {
        return this.f5670e;
    }

    public final s y(int i2, HashMap hashMap, l lVar) {
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        ArrayList arrayList4;
        l lVar2;
        Object[] objArr;
        long[] jArr;
        l lVar3;
        Object[] objArr2;
        long[] jArr2;
        int i3;
        C s3;
        C e3;
        l f3 = e().g(d()).f(this.f5675j);
        C0736B w2 = w();
        z2.h.c(w2);
        Object[] objArr3 = w2.f7965b;
        long[] jArr3 = w2.f7964a;
        int length = jArr3.length - 2;
        if (length >= 0) {
            int i4 = 0;
            arrayList4 = null;
            arrayList3 = null;
            while (true) {
                long j3 = jArr3[i4];
                if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i5 = 8;
                    int i6 = 8 - ((~(i4 - length)) >>> 31);
                    int i7 = 0;
                    while (i7 < i6) {
                        if ((j3 & 255) < 128) {
                            A a3 = (A) objArr3[(i4 << 3) + i7];
                            C a4 = a3.a();
                            objArr2 = objArr3;
                            jArr2 = jArr3;
                            C s4 = n.s(a4, i2, lVar);
                            if (s4 == null || (s3 = n.s(a4, d(), f3)) == null) {
                                lVar3 = f3;
                            } else {
                                lVar3 = f3;
                                if (s3.f5647a != 1 && !z2.h.a(s4, s3)) {
                                    C s5 = n.s(a4, d(), e());
                                    if (s5 == null) {
                                        n.r();
                                        throw null;
                                    }
                                    if (hashMap == null || (e3 = (C) hashMap.get(s4)) == null) {
                                        e3 = a3.e(s3, s4, s5);
                                    }
                                    if (e3 == null) {
                                        return new h();
                                    }
                                    if (!z2.h.a(e3, s5)) {
                                        if (z2.h.a(e3, s4)) {
                                            if (arrayList4 == null) {
                                                arrayList4 = new ArrayList();
                                            }
                                            arrayList4.add(new C0865g(a3, s4.b()));
                                            if (arrayList3 == null) {
                                                arrayList3 = new ArrayList();
                                            }
                                            arrayList3.add(a3);
                                        } else {
                                            if (arrayList4 == null) {
                                                arrayList4 = new ArrayList();
                                            }
                                            arrayList4.add(!z2.h.a(e3, s3) ? new C0865g(a3, e3) : new C0865g(a3, s3.b()));
                                        }
                                    }
                                }
                            }
                            i3 = 8;
                        } else {
                            lVar3 = f3;
                            objArr2 = objArr3;
                            jArr2 = jArr3;
                            i3 = i5;
                        }
                        j3 >>= i3;
                        i7++;
                        i5 = i3;
                        objArr3 = objArr2;
                        jArr3 = jArr2;
                        f3 = lVar3;
                    }
                    lVar2 = f3;
                    objArr = objArr3;
                    jArr = jArr3;
                    if (i6 != i5) {
                        break;
                    }
                } else {
                    lVar2 = f3;
                    objArr = objArr3;
                    jArr = jArr3;
                }
                if (i4 == length) {
                    arrayList2 = arrayList4;
                    arrayList = arrayList3;
                    break;
                }
                i4++;
                objArr3 = objArr;
                jArr3 = jArr;
                f3 = lVar2;
            }
        } else {
            arrayList = null;
            arrayList2 = null;
        }
        arrayList3 = arrayList;
        arrayList4 = arrayList2;
        if (arrayList4 != null) {
            u();
            int size = arrayList4.size();
            for (int i8 = 0; i8 < size; i8++) {
                C0865g c0865g = (C0865g) arrayList4.get(i8);
                A a5 = (A) c0865g.f8646h;
                C c3 = (C) c0865g.f8647i;
                c3.f5647a = d();
                synchronized (n.f5710b) {
                    c3.f5648b = a5.a();
                    a5.b(c3);
                }
            }
        }
        if (arrayList3 != null) {
            int size2 = arrayList3.size();
            for (int i9 = 0; i9 < size2; i9++) {
                w2.j((A) arrayList3.get(i9));
            }
            ArrayList arrayList5 = this.f5674i;
            if (arrayList5 != null) {
                arrayList3 = AbstractC0961m.R(arrayList5, arrayList3);
            }
            this.f5674i = arrayList3;
        }
        return i.f5689c;
    }

    public final void z(int i2) {
        synchronized (n.f5710b) {
            this.f5675j = this.f5675j.g(i2);
        }
    }
}
