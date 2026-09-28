package J;

import D.C0053w;
import J2.C0311h;
import java.util.ArrayList;
import java.util.List;
import n2.AbstractC0948C;
import q2.InterfaceC1073d;
import q2.InterfaceC1076g;
import q2.InterfaceC1077h;
import q2.InterfaceC1078i;

/* renamed from: J.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0265g implements X {

    /* renamed from: h, reason: collision with root package name */
    public final y2.a f4134h;

    /* renamed from: j, reason: collision with root package name */
    public Throwable f4136j;

    /* renamed from: i, reason: collision with root package name */
    public final Object f4135i = new Object();

    /* renamed from: k, reason: collision with root package name */
    public List f4137k = new ArrayList();

    /* renamed from: l, reason: collision with root package name */
    public List f4138l = new ArrayList();

    /* renamed from: m, reason: collision with root package name */
    public final C0261e f4139m = new C0261e(0);

    public C0265g(B.y yVar) {
        this.f4134h = yVar;
    }

    @Override // q2.InterfaceC1078i
    public final InterfaceC1078i A(InterfaceC1078i interfaceC1078i) {
        return AbstractC0948C.n(this, interfaceC1078i);
    }

    public final void c(long j3) {
        Object n3;
        synchronized (this.f4135i) {
            try {
                List list = this.f4137k;
                this.f4137k = this.f4138l;
                this.f4138l = list;
                this.f4139m.set(0);
                int size = list.size();
                for (int i2 = 0; i2 < size; i2++) {
                    C0263f c0263f = (C0263f) list.get(i2);
                    c0263f.getClass();
                    try {
                        n3 = c0263f.f4131a.l(Long.valueOf(j3));
                    } catch (Throwable th) {
                        n3 = C1.y.n(th);
                    }
                    c0263f.f4132b.t(n3);
                }
                list.clear();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // J.X
    public final Object d(y2.c cVar, InterfaceC1073d interfaceC1073d) {
        y2.a aVar;
        C0311h c0311h = new C0311h(1, AbstractC0948C.i(interfaceC1073d));
        c0311h.r();
        C0263f c0263f = new C0263f(cVar, c0311h);
        synchronized (this.f4135i) {
            Throwable th = this.f4136j;
            if (th != null) {
                c0311h.t(C1.y.n(th));
            } else {
                boolean isEmpty = this.f4137k.isEmpty();
                boolean z3 = !isEmpty;
                this.f4137k.add(c0263f);
                if (!z3) {
                    this.f4139m.set(1);
                }
                c0311h.u(new C0053w(this, 8, c0263f));
                if (isEmpty && (aVar = this.f4134h) != null) {
                    try {
                        aVar.c();
                    } catch (Throwable th2) {
                        synchronized (this.f4135i) {
                            try {
                                if (this.f4136j == null) {
                                    this.f4136j = th2;
                                    List list = this.f4137k;
                                    int size = list.size();
                                    for (int i2 = 0; i2 < size; i2++) {
                                        ((C0263f) list.get(i2)).f4132b.t(C1.y.n(th2));
                                    }
                                    this.f4137k.clear();
                                    this.f4139m.set(0);
                                }
                            } catch (Throwable th3) {
                                throw th3;
                            }
                        }
                    }
                }
            }
        }
        return c0311h.q();
    }

    @Override // q2.InterfaceC1078i
    public final InterfaceC1078i h(InterfaceC1077h interfaceC1077h) {
        return AbstractC0948C.k(this, interfaceC1077h);
    }

    @Override // q2.InterfaceC1078i
    public final InterfaceC1076g s(InterfaceC1077h interfaceC1077h) {
        return AbstractC0948C.h(this, interfaceC1077h);
    }

    @Override // q2.InterfaceC1078i
    public final Object y(Object obj, y2.e eVar) {
        return eVar.j(obj, this);
    }
}
