package O2;

import J2.AbstractC0324v;
import J2.C0319p;
import J2.C0320q;
import J2.G;
import J2.Q;
import J2.r0;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import m2.AbstractC0868j;
import q2.InterfaceC1073d;
import q2.InterfaceC1078i;
import s2.AbstractC1198c;
import s2.InterfaceC1199d;

/* loaded from: classes.dex */
public final class h extends G implements InterfaceC1199d, InterfaceC1073d {

    /* renamed from: o, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f5178o = AtomicReferenceFieldUpdater.newUpdater(h.class, Object.class, "_reusableCancellableContinuation");
    private volatile Object _reusableCancellableContinuation;

    /* renamed from: k, reason: collision with root package name */
    public final AbstractC0324v f5179k;

    /* renamed from: l, reason: collision with root package name */
    public final InterfaceC1073d f5180l;

    /* renamed from: m, reason: collision with root package name */
    public Object f5181m;

    /* renamed from: n, reason: collision with root package name */
    public final Object f5182n;

    public h(AbstractC0324v abstractC0324v, AbstractC1198c abstractC1198c) {
        super(-1);
        this.f5179k = abstractC0324v;
        this.f5180l = abstractC1198c;
        this.f5181m = AbstractC0369a.f5167c;
        this.f5182n = AbstractC0369a.k(abstractC1198c.n());
    }

    @Override // J2.G
    public final void c(Object obj, CancellationException cancellationException) {
        if (obj instanceof C0320q) {
            ((C0320q) obj).f4424b.l(cancellationException);
        }
    }

    @Override // J2.G
    public final InterfaceC1073d d() {
        return this;
    }

    @Override // J2.G
    public final Object h() {
        Object obj = this.f5181m;
        this.f5181m = AbstractC0369a.f5167c;
        return obj;
    }

    @Override // s2.InterfaceC1199d
    public final InterfaceC1199d k() {
        InterfaceC1073d interfaceC1073d = this.f5180l;
        if (interfaceC1073d instanceof InterfaceC1199d) {
            return (InterfaceC1199d) interfaceC1073d;
        }
        return null;
    }

    @Override // q2.InterfaceC1073d
    public final InterfaceC1078i n() {
        return this.f5180l.n();
    }

    @Override // q2.InterfaceC1073d
    public final void t(Object obj) {
        InterfaceC1073d interfaceC1073d = this.f5180l;
        InterfaceC1078i n3 = interfaceC1073d.n();
        Throwable a3 = AbstractC0868j.a(obj);
        Object c0319p = a3 == null ? obj : new C0319p(a3, false);
        AbstractC0324v abstractC0324v = this.f5179k;
        if (abstractC0324v.w()) {
            this.f5181m = c0319p;
            this.f4355j = 0;
            abstractC0324v.r(n3, this);
            return;
        }
        Q a4 = r0.a();
        if (a4.E()) {
            this.f5181m = c0319p;
            this.f4355j = 0;
            a4.z(this);
            return;
        }
        a4.D(true);
        try {
            InterfaceC1078i n4 = interfaceC1073d.n();
            Object l3 = AbstractC0369a.l(n4, this.f5182n);
            try {
                interfaceC1073d.t(obj);
                while (a4.G()) {
                }
            } finally {
                AbstractC0369a.g(n4, l3);
            }
        } finally {
            try {
            } finally {
            }
        }
    }

    public final String toString() {
        return "DispatchedContinuation[" + this.f5179k + ", " + J2.B.v(this.f5180l) + ']';
    }
}
