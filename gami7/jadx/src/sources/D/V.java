package D;

import z.EnumC1406F;
import z.p0;

/* loaded from: classes.dex */
public final class V implements z.a0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ X f776a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f777b;

    public V(X x2, boolean z3) {
        this.f776a = x2;
        this.f777b = z3;
    }

    @Override // z.a0
    public final void a() {
        X x2 = this.f776a;
        X.b(x2, null);
        X.a(x2, null);
        x2.t(true);
    }

    @Override // z.a0
    public final void b() {
        X x2 = this.f776a;
        X.b(x2, null);
        X.a(x2, null);
        x2.t(true);
    }

    @Override // z.a0
    public final void c(long j3) {
    }

    @Override // z.a0
    public final void d(long j3) {
        X x2 = this.f776a;
        long h2 = b0.c.h(x2.f794o, j3);
        x2.f794o = h2;
        x2.q.setValue(new b0.c(b0.c.h(x2.f792m, h2)));
        I0.z l3 = x2.l();
        b0.c i2 = x2.i();
        z2.h.c(i2);
        C0.E e3 = r.f887g;
        X.c(x2, l3, i2.f7058a, false, this.f777b, e3, true);
        x2.t(false);
    }

    @Override // z.a0
    public final void e() {
        p0 d3;
        boolean z3 = this.f777b;
        EnumC1406F enumC1406F = z3 ? EnumC1406F.f11508i : EnumC1406F.f11509j;
        X x2 = this.f776a;
        X.b(x2, enumC1406F);
        long k3 = x2.k(z3);
        float f3 = E.f723a;
        long e3 = K1.f.e(b0.c.d(k3), b0.c.e(k3) - 1.0f);
        z.S s3 = x2.f783d;
        if (s3 == null || (d3 = s3.d()) == null) {
            return;
        }
        long e4 = d3.e(e3);
        x2.f792m = e4;
        x2.q.setValue(new b0.c(e4));
        x2.f794o = 0L;
        x2.f796r = -1;
        z.S s4 = x2.f783d;
        if (s4 != null) {
            s4.q.setValue(Boolean.TRUE);
        }
        x2.t(false);
    }

    @Override // z.a0
    public final void onCancel() {
    }
}
