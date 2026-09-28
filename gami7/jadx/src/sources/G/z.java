package G;

import B.F;
import j.C0757m;
import n0.AbstractC0937p;
import n0.C0928g;
import n0.C0929h;
import t0.C1236E;

/* loaded from: classes.dex */
public final class z {

    /* renamed from: a, reason: collision with root package name */
    public boolean f1213a;

    /* renamed from: b, reason: collision with root package name */
    public Object f1214b;

    /* renamed from: c, reason: collision with root package name */
    public Object f1215c;

    /* renamed from: d, reason: collision with root package name */
    public Object f1216d;

    /* renamed from: e, reason: collision with root package name */
    public Object f1217e;

    /* JADX WARN: Multi-variable type inference failed */
    public int a(K1.c cVar, n0.v vVar, boolean z3) {
        Object[] objArr;
        K1.m mVar;
        int i2;
        t0.r rVar = (t0.r) this.f1217e;
        if (this.f1213a) {
            return 0;
        }
        try {
            this.f1213a = true;
            B.z B3 = ((F) this.f1216d).B(cVar, vVar);
            C0757m c0757m = (C0757m) B3.f239c;
            int c3 = c0757m.c();
            for (int i3 = 0; i3 < c3; i3++) {
                n0.r rVar2 = (n0.r) c0757m.d(i3);
                if (!rVar2.f8960d && !rVar2.f8964h) {
                }
                objArr = false;
                break;
            }
            objArr = true;
            int c4 = c0757m.c();
            int i4 = 0;
            while (true) {
                mVar = (K1.m) this.f1215c;
                if (i4 >= c4) {
                    break;
                }
                n0.r rVar3 = (n0.r) c0757m.d(i4);
                if (objArr != false || AbstractC0937p.a(rVar3)) {
                    ((C1236E) this.f1214b).w(rVar3.f8959c, (t0.r) this.f1217e, AbstractC0937p.e(rVar3.f8965i, 1), true);
                    if (!rVar.isEmpty()) {
                        mVar.a(rVar3.f8957a, rVar, AbstractC0937p.a(rVar3));
                        rVar.clear();
                    }
                }
                i4++;
            }
            ((C0929h) mVar.f4559b).d();
            boolean c5 = mVar.c(B3, z3);
            int c6 = c0757m.c();
            int i5 = 0;
            while (true) {
                if (i5 >= c6) {
                    i2 = 0;
                    break;
                }
                n0.r rVar4 = (n0.r) c0757m.d(i5);
                if ((!b0.c.b(AbstractC0937p.h(rVar4, true), 0L)) && rVar4.b()) {
                    i2 = 2;
                    break;
                }
                i5++;
            }
            int i6 = (c5 ? 1 : 0) | i2;
            this.f1213a = false;
            return i6;
        } catch (Throwable th) {
            this.f1213a = false;
            throw th;
        }
    }

    public void b() {
        if (this.f1213a) {
            return;
        }
        C0757m c0757m = (C0757m) ((F) this.f1216d).f165i;
        int i2 = c0757m.f8011k;
        Object[] objArr = c0757m.f8010j;
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            objArr[i4] = null;
        }
        c0757m.f8011k = 0;
        c0757m.f8008h = false;
        K1.m mVar = (K1.m) this.f1215c;
        L.d dVar = ((C0929h) mVar.f4559b).f8942a;
        int i5 = dVar.f4620j;
        if (i5 > 0) {
            Object[] objArr2 = dVar.f4618h;
            do {
                ((C0928g) objArr2[i3]).f();
                i3++;
            } while (i3 < i5);
        }
        ((C0929h) mVar.f4559b).f8942a.g();
    }
}
