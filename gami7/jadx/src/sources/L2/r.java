package L2;

import B1.C;
import J2.w0;
import O2.AbstractC0369a;
import m2.C0880v;
import q2.InterfaceC1073d;

/* loaded from: classes.dex */
public final class r extends g {

    /* renamed from: t, reason: collision with root package name */
    public final int f4742t;

    public r(int i2, int i3, y2.c cVar) {
        super(i2, cVar);
        this.f4742t = i3;
        if (i3 == 1) {
            throw new IllegalArgumentException(("This implementation does not support suspension for senders, use " + z2.t.a(g.class).b() + " instead").toString());
        }
        if (i2 >= 1) {
            return;
        }
        throw new IllegalArgumentException(("Buffered channel capacity must be at least 1, but " + i2 + " was specified").toString());
    }

    public final Object M(Object obj, boolean z3) {
        o oVar;
        y2.c cVar;
        J2.r a3;
        C0880v c0880v = C0880v.f8657a;
        if (this.f4742t == 3) {
            Object q = super.q(obj);
            if ((!(q instanceof m)) || (q instanceof l)) {
                return q;
            }
            if (!z3 || (cVar = this.f4713i) == null || (a3 = AbstractC0369a.a(cVar, obj, null)) == null) {
                return c0880v;
            }
            throw a3;
        }
        v1.e eVar = i.f4719d;
        o oVar2 = (o) g.f4708o.get(this);
        while (true) {
            long andIncrement = g.f4704k.getAndIncrement(this);
            long j3 = andIncrement & 1152921504606846975L;
            boolean u3 = u(andIncrement, false);
            int i2 = i.f4717b;
            long j4 = i2;
            long j5 = j3 / j4;
            int i3 = (int) (j3 % j4);
            if (oVar2.f5206j != j5) {
                o b3 = g.b(this, j5, oVar2);
                if (b3 != null) {
                    oVar = b3;
                } else if (u3) {
                    return new l(r());
                }
            } else {
                oVar = oVar2;
            }
            int f3 = g.f(this, oVar, i3, obj, j3, eVar, u3);
            if (f3 == 0) {
                oVar.a();
                return c0880v;
            }
            if (f3 == 1) {
                return c0880v;
            }
            if (f3 == 2) {
                if (u3) {
                    oVar.h();
                    return new l(r());
                }
                w0 w0Var = eVar instanceof w0 ? (w0) eVar : null;
                if (w0Var != null) {
                    w0Var.a(oVar, i3 + i2);
                }
                j((oVar.f5206j * j4) + i3);
                return c0880v;
            }
            if (f3 == 3) {
                throw new IllegalStateException("unexpected".toString());
            }
            if (f3 == 4) {
                if (j3 < g.f4705l.get(this)) {
                    oVar.a();
                }
                return new l(r());
            }
            if (f3 == 5) {
                oVar.a();
            }
            oVar2 = oVar;
        }
    }

    @Override // L2.g, L2.x
    public final Object q(Object obj) {
        return M(obj, false);
    }

    @Override // L2.g, L2.x
    public final Object v(Object obj, InterfaceC1073d interfaceC1073d) {
        J2.r a3;
        if (!(M(obj, true) instanceof l)) {
            return C0880v.f8657a;
        }
        y2.c cVar = this.f4713i;
        if (cVar == null || (a3 = AbstractC0369a.a(cVar, obj, null)) == null) {
            throw r();
        }
        C.p(a3, r());
        throw a3;
    }

    @Override // L2.g
    public final boolean z() {
        return this.f4742t == 2;
    }
}
