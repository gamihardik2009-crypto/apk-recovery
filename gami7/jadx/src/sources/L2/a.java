package L2;

import J2.B;
import J2.C0311h;
import J2.w0;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import n2.AbstractC0948C;
import q2.InterfaceC1073d;
import q2.InterfaceC1078i;

/* loaded from: classes.dex */
public final class a implements w0 {

    /* renamed from: h, reason: collision with root package name */
    public Object f4689h = i.f4731p;

    /* renamed from: i, reason: collision with root package name */
    public C0311h f4690i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ g f4691j;

    public a(g gVar) {
        this.f4691j = gVar;
    }

    @Override // J2.w0
    public final void a(O2.t tVar, int i2) {
        C0311h c0311h = this.f4690i;
        if (c0311h != null) {
            c0311h.a(tVar, i2);
        }
    }

    public final Object b(InterfaceC1073d interfaceC1073d) {
        Boolean bool;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = g.f4709p;
        g gVar = this.f4691j;
        o oVar = (o) atomicReferenceFieldUpdater.get(gVar);
        while (!gVar.y()) {
            long andIncrement = g.f4705l.getAndIncrement(gVar);
            long j3 = i.f4717b;
            long j4 = andIncrement / j3;
            int i2 = (int) (andIncrement % j3);
            if (oVar.f5206j != j4) {
                o l3 = gVar.l(j4, oVar);
                if (l3 == null) {
                    continue;
                } else {
                    oVar = l3;
                }
            }
            Object J3 = gVar.J(oVar, i2, andIncrement, null);
            O2.v vVar = i.f4728m;
            if (J3 == vVar) {
                throw new IllegalStateException("unreachable".toString());
            }
            O2.v vVar2 = i.f4730o;
            if (J3 != vVar2) {
                if (J3 != i.f4729n) {
                    oVar.a();
                    this.f4689h = J3;
                    return Boolean.TRUE;
                }
                g gVar2 = this.f4691j;
                C0311h l4 = B.l(AbstractC0948C.i(interfaceC1073d));
                try {
                    this.f4690i = l4;
                    Object J4 = gVar2.J(oVar, i2, andIncrement, this);
                    if (J4 == vVar) {
                        a(oVar, i2);
                    } else {
                        d dVar = null;
                        InterfaceC1078i interfaceC1078i = l4.f4403l;
                        y2.c cVar = gVar2.f4713i;
                        if (J4 == vVar2) {
                            if (andIncrement < gVar2.s()) {
                                oVar.a();
                            }
                            o oVar2 = (o) g.f4709p.get(gVar2);
                            while (true) {
                                if (gVar2.y()) {
                                    C0311h c0311h = this.f4690i;
                                    z2.h.c(c0311h);
                                    this.f4690i = null;
                                    this.f4689h = i.f4727l;
                                    Throwable n3 = gVar.n();
                                    if (n3 == null) {
                                        c0311h.t(Boolean.FALSE);
                                    } else {
                                        c0311h.t(C1.y.n(n3));
                                    }
                                } else {
                                    long andIncrement2 = g.f4705l.getAndIncrement(gVar2);
                                    long j5 = i.f4717b;
                                    long j6 = andIncrement2 / j5;
                                    int i3 = (int) (andIncrement2 % j5);
                                    if (oVar2.f5206j != j6) {
                                        o l5 = gVar2.l(j6, oVar2);
                                        if (l5 != null) {
                                            oVar2 = l5;
                                        }
                                    }
                                    y2.c cVar2 = cVar;
                                    Object J5 = gVar2.J(oVar2, i3, andIncrement2, this);
                                    if (J5 == i.f4728m) {
                                        a(oVar2, i3);
                                        break;
                                    }
                                    if (J5 == i.f4730o) {
                                        if (andIncrement2 < gVar2.s()) {
                                            oVar2.a();
                                        }
                                        cVar = cVar2;
                                    } else {
                                        if (J5 == i.f4729n) {
                                            throw new IllegalStateException("unexpected".toString());
                                        }
                                        oVar2.a();
                                        this.f4689h = J5;
                                        this.f4690i = null;
                                        bool = Boolean.TRUE;
                                        if (cVar2 != null) {
                                            dVar = new d(cVar2, J5, interfaceC1078i, 1, false);
                                        }
                                    }
                                }
                            }
                        } else {
                            oVar.a();
                            this.f4689h = J4;
                            this.f4690i = null;
                            bool = Boolean.TRUE;
                            if (cVar != null) {
                                dVar = new d(cVar, J4, interfaceC1078i, 1, false);
                            }
                        }
                        l4.B(bool, dVar);
                    }
                    return l4.q();
                } catch (Throwable th) {
                    l4.A();
                    throw th;
                }
            }
            if (andIncrement < gVar.s()) {
                oVar.a();
            }
        }
        this.f4689h = i.f4727l;
        Throwable n4 = gVar.n();
        if (n4 == null) {
            return Boolean.FALSE;
        }
        int i4 = O2.u.f5207a;
        throw n4;
    }

    public final Object c() {
        Object obj = this.f4689h;
        O2.v vVar = i.f4731p;
        if (obj == vVar) {
            throw new IllegalStateException("`hasNext()` has not been invoked".toString());
        }
        this.f4689h = vVar;
        if (obj != i.f4727l) {
            return obj;
        }
        Throwable o3 = this.f4691j.o();
        int i2 = O2.u.f5207a;
        throw o3;
    }
}
