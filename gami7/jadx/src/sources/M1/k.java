package M1;

import l2.InterfaceFutureC0816a;

/* loaded from: classes.dex */
public final class k extends i {
    public final boolean j(Object obj) {
        if (obj == null) {
            obj = i.f4780g;
        }
        if (!i.f4779f.B(this, null, obj)) {
            return false;
        }
        i.c(this);
        return true;
    }

    public final boolean k(Throwable th) {
        th.getClass();
        if (!i.f4779f.B(this, null, new c(th))) {
            return false;
        }
        i.c(this);
        return true;
    }

    public final boolean l(InterfaceFutureC0816a interfaceFutureC0816a) {
        c cVar;
        interfaceFutureC0816a.getClass();
        Object obj = this.f4781a;
        if (obj == null) {
            if (interfaceFutureC0816a.isDone()) {
                if (!i.f4779f.B(this, null, i.f(interfaceFutureC0816a))) {
                    return false;
                }
                i.c(this);
            } else {
                f fVar = new f(this, interfaceFutureC0816a);
                if (i.f4779f.B(this, null, fVar)) {
                    try {
                        interfaceFutureC0816a.a(fVar, j.f4784h);
                    } catch (Throwable th) {
                        try {
                            cVar = new c(th);
                        } catch (Throwable unused) {
                            cVar = c.f4761b;
                        }
                        i.f4779f.B(this, fVar, cVar);
                    }
                } else {
                    obj = this.f4781a;
                }
            }
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        interfaceFutureC0816a.cancel(((a) obj).f4759a);
        return false;
    }
}
