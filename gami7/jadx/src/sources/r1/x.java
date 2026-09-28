package r1;

import java.util.concurrent.atomic.AtomicBoolean;
import m2.C0870l;
import n1.C0944e;
import w1.C1387i;

/* loaded from: classes.dex */
public abstract class x {

    /* renamed from: a, reason: collision with root package name */
    public final r f10020a;

    /* renamed from: b, reason: collision with root package name */
    public final AtomicBoolean f10021b;

    /* renamed from: c, reason: collision with root package name */
    public final C0870l f10022c;

    public x(r rVar) {
        z2.h.f(rVar, "database");
        this.f10020a = rVar;
        this.f10021b = new AtomicBoolean(false);
        this.f10022c = new C0870l(new C0944e(5, this));
    }

    public final C1387i a() {
        r rVar = this.f10020a;
        rVar.a();
        if (this.f10021b.compareAndSet(false, true)) {
            return (C1387i) this.f10022c.getValue();
        }
        String b3 = b();
        rVar.getClass();
        rVar.a();
        rVar.b();
        return rVar.g().q().c(b3);
    }

    public abstract String b();

    public final void c(C1387i c1387i) {
        z2.h.f(c1387i, "statement");
        if (c1387i == ((C1387i) this.f10022c.getValue())) {
            this.f10021b.set(false);
        }
    }
}
