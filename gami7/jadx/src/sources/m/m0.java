package m;

import J.AbstractC0253a;
import J.C0257c;
import J.C0266g0;
import J.C0270i0;
import J.C0274k0;
import J.J0;
import J.W0;

/* loaded from: classes.dex */
public final class m0 implements W0 {

    /* renamed from: h, reason: collision with root package name */
    public final x0 f8519h;

    /* renamed from: i, reason: collision with root package name */
    public final C0274k0 f8520i;

    /* renamed from: j, reason: collision with root package name */
    public final C0274k0 f8521j;

    /* renamed from: k, reason: collision with root package name */
    public final C0274k0 f8522k;

    /* renamed from: l, reason: collision with root package name */
    public K f8523l;

    /* renamed from: m, reason: collision with root package name */
    public h0 f8524m;

    /* renamed from: n, reason: collision with root package name */
    public final C0274k0 f8525n;

    /* renamed from: o, reason: collision with root package name */
    public final C0266g0 f8526o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f8527p;
    public final C0274k0 q;

    /* renamed from: r, reason: collision with root package name */
    public AbstractC0845s f8528r;

    /* renamed from: s, reason: collision with root package name */
    public final C0270i0 f8529s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f8530t;

    /* renamed from: u, reason: collision with root package name */
    public final Z f8531u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ p0 f8532v;

    public m0(p0 p0Var, Object obj, AbstractC0845s abstractC0845s, x0 x0Var) {
        this.f8532v = p0Var;
        this.f8519h = x0Var;
        J.W w2 = J.W.f4109m;
        C0274k0 N3 = C0257c.N(obj, w2);
        this.f8520i = N3;
        Object obj2 = null;
        C0274k0 N4 = C0257c.N(AbstractC0831e.m(0.0f, null, 7), w2);
        this.f8521j = N4;
        this.f8522k = C0257c.N(new h0((InterfaceC0817A) N4.getValue(), x0Var, obj, N3.getValue(), abstractC0845s), w2);
        this.f8525n = C0257c.N(Boolean.TRUE, w2);
        this.f8526o = C0257c.L(-1.0f);
        this.q = C0257c.N(obj, w2);
        this.f8528r = abstractC0845s;
        long c3 = a().c();
        int i2 = AbstractC0253a.f4116b;
        this.f8529s = new C0270i0(c3);
        Float f3 = (Float) E0.f8301a.get(x0Var);
        if (f3 != null) {
            float floatValue = f3.floatValue();
            AbstractC0845s abstractC0845s2 = (AbstractC0845s) x0Var.f8600a.l(obj);
            int b3 = abstractC0845s2.b();
            for (int i3 = 0; i3 < b3; i3++) {
                abstractC0845s2.e(floatValue, i3);
            }
            obj2 = this.f8519h.f8601b.l(abstractC0845s2);
        }
        this.f8531u = AbstractC0831e.m(0.0f, obj2, 3);
    }

    public final h0 a() {
        return (h0) this.f8522k.getValue();
    }

    public final float b() {
        return this.f8526o.g();
    }

    public final void d(long j3) {
        if (b() == -1.0f) {
            this.f8530t = true;
            if (z2.h.a(a().f8491c, a().f8492d)) {
                e(a().f8491c);
            } else {
                e(a().b(j3));
                this.f8528r = a().g(j3);
            }
        }
    }

    public final void e(Object obj) {
        this.q.setValue(obj);
    }

    public final void f(Object obj, boolean z3) {
        h0 h0Var = this.f8524m;
        Object obj2 = h0Var != null ? h0Var.f8491c : null;
        C0274k0 c0274k0 = this.f8520i;
        boolean a3 = z2.h.a(obj2, c0274k0.getValue());
        C0270i0 c0270i0 = this.f8529s;
        C0274k0 c0274k02 = this.f8522k;
        if (a3) {
            c0274k02.setValue(new h0(this.f8531u, this.f8519h, obj, obj, this.f8528r.c()));
            this.f8527p = true;
            c0270i0.g(a().c());
            return;
        }
        C0274k0 c0274k03 = this.f8521j;
        InterfaceC0817A interfaceC0817A = (!z3 || this.f8530t) ? (InterfaceC0817A) c0274k03.getValue() : ((InterfaceC0817A) c0274k03.getValue()) instanceof Z ? (InterfaceC0817A) c0274k03.getValue() : this.f8531u;
        p0 p0Var = this.f8532v;
        long j3 = 0;
        c0274k02.setValue(new h0(p0Var.e() <= 0 ? interfaceC0817A : new C0824a0(interfaceC0817A, p0Var.e()), this.f8519h, obj, c0274k0.getValue(), this.f8528r));
        c0270i0.g(a().c());
        this.f8527p = false;
        Boolean bool = Boolean.TRUE;
        C0274k0 c0274k04 = p0Var.f8554h;
        c0274k04.setValue(bool);
        if (p0Var.g()) {
            T.r rVar = p0Var.f8555i;
            int size = rVar.size();
            for (int i2 = 0; i2 < size; i2++) {
                m0 m0Var = (m0) rVar.get(i2);
                C0270i0 c0270i02 = m0Var.f8529s;
                j3 = Math.max(j3, ((J0) T.n.t(c0270i02.f4146i, c0270i02)).f4040c);
                m0Var.d(p0Var.f8558l);
            }
            c0274k04.setValue(Boolean.FALSE);
        }
    }

    public final void g(Object obj, Object obj2, InterfaceC0817A interfaceC0817A) {
        this.f8520i.setValue(obj2);
        this.f8521j.setValue(interfaceC0817A);
        if (z2.h.a(a().f8492d, obj) && z2.h.a(a().f8491c, obj2)) {
            return;
        }
        f(obj, false);
    }

    @Override // J.W0
    public final Object getValue() {
        return this.q.getValue();
    }

    public final void h(Object obj, InterfaceC0817A interfaceC0817A) {
        if (this.f8527p) {
            h0 h0Var = this.f8524m;
            if (z2.h.a(obj, h0Var != null ? h0Var.f8491c : null)) {
                return;
            }
        }
        C0274k0 c0274k0 = this.f8520i;
        boolean a3 = z2.h.a(c0274k0.getValue(), obj);
        C0266g0 c0266g0 = this.f8526o;
        if (a3 && c0266g0.g() == -1.0f) {
            return;
        }
        c0274k0.setValue(obj);
        this.f8521j.setValue(interfaceC0817A);
        Object value = c0266g0.g() == -3.0f ? obj : this.q.getValue();
        C0274k0 c0274k02 = this.f8525n;
        f(value, !((Boolean) c0274k02.getValue()).booleanValue());
        c0274k02.setValue(Boolean.valueOf(c0266g0.g() == -3.0f));
        if (c0266g0.g() >= 0.0f) {
            e(a().b((long) (c0266g0.g() * a().c())));
        } else if (c0266g0.g() == -3.0f) {
            e(obj);
        }
        this.f8527p = false;
        c0266g0.h(-1.0f);
    }

    public final String toString() {
        return "current value: " + this.q.getValue() + ", target: " + this.f8520i.getValue() + ", spec: " + ((InterfaceC0817A) this.f8521j.getValue());
    }
}
