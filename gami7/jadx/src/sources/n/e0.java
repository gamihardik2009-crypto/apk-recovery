package n;

import J2.C0325w;
import J2.InterfaceC0328z;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
import m2.C0880v;
import q2.InterfaceC1073d;
import q2.InterfaceC1076g;
import r2.EnumC1145a;
import s2.AbstractC1204i;

/* loaded from: classes.dex */
public final class e0 extends AbstractC1204i implements y2.e {

    /* renamed from: l, reason: collision with root package name */
    public S2.a f8767l;

    /* renamed from: m, reason: collision with root package name */
    public Object f8768m;

    /* renamed from: n, reason: collision with root package name */
    public Object f8769n;

    /* renamed from: o, reason: collision with root package name */
    public f0 f8770o;

    /* renamed from: p, reason: collision with root package name */
    public int f8771p;
    public /* synthetic */ Object q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ c0 f8772r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ f0 f8773s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ y2.e f8774t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Object f8775u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(c0 c0Var, f0 f0Var, y2.e eVar, Object obj, InterfaceC1073d interfaceC1073d) {
        super(2, interfaceC1073d);
        this.f8772r = c0Var;
        this.f8773s = f0Var;
        this.f8774t = eVar;
        this.f8775u = obj;
    }

    @Override // y2.e
    public final Object j(Object obj, Object obj2) {
        return ((e0) m((InterfaceC0328z) obj, (InterfaceC1073d) obj2)).p(C0880v.f8657a);
    }

    @Override // s2.AbstractC1196a
    public final InterfaceC1073d m(Object obj, InterfaceC1073d interfaceC1073d) {
        e0 e0Var = new e0(this.f8772r, this.f8773s, this.f8774t, this.f8775u, interfaceC1073d);
        e0Var.q = obj;
        return e0Var;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    @Override // s2.AbstractC1196a
    public final Object p(Object obj) {
        f0 f0Var;
        Object obj2;
        d0 d0Var;
        S2.a aVar;
        y2.e eVar;
        d0 d0Var2;
        f0 f0Var2;
        Throwable th;
        AtomicReference atomicReference;
        AtomicReference atomicReference2;
        EnumC1145a enumC1145a = EnumC1145a.f10026h;
        ?? r12 = this.f8771p;
        try {
            try {
                if (r12 == 0) {
                    C1.y.J(obj);
                    InterfaceC1076g s3 = ((InterfaceC0328z) this.q).r().s(C0325w.f4437i);
                    z2.h.c(s3);
                    d0 d0Var3 = new d0(this.f8772r, (J2.Z) s3);
                    while (true) {
                        f0Var = this.f8773s;
                        AtomicReference atomicReference3 = f0Var.f8779a;
                        d0 d0Var4 = (d0) atomicReference3.get();
                        if (d0Var4 != null && d0Var3.f8762a.compareTo(d0Var4.f8762a) < 0) {
                            throw new CancellationException("Current mutation had a higher priority");
                        }
                        while (!atomicReference3.compareAndSet(d0Var4, d0Var3)) {
                            if (atomicReference3.get() != d0Var4) {
                                break;
                            }
                        }
                        if (d0Var4 != null) {
                            d0Var4.f8763b.a(new J.V("Mutation interrupted", 3));
                        }
                        this.q = d0Var3;
                        S2.d dVar = f0Var.f8780b;
                        this.f8767l = dVar;
                        y2.e eVar2 = this.f8774t;
                        this.f8768m = eVar2;
                        Object obj3 = this.f8775u;
                        this.f8769n = obj3;
                        this.f8770o = f0Var;
                        this.f8771p = 1;
                        if (dVar.c(null, this) == enumC1145a) {
                            return enumC1145a;
                        }
                        obj2 = obj3;
                        d0Var = d0Var3;
                        aVar = dVar;
                        eVar = eVar2;
                    }
                } else {
                    if (r12 != 1) {
                        if (r12 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        f0Var2 = (f0) this.f8768m;
                        aVar = this.f8767l;
                        d0Var2 = (d0) this.q;
                        try {
                            C1.y.J(obj);
                            atomicReference2 = f0Var2.f8779a;
                            while (!atomicReference2.compareAndSet(d0Var2, null) && atomicReference2.get() == d0Var2) {
                            }
                            ((S2.d) aVar).d(null);
                            return obj;
                        } catch (Throwable th2) {
                            th = th2;
                            atomicReference = f0Var2.f8779a;
                            while (!atomicReference.compareAndSet(d0Var2, null)) {
                            }
                            throw th;
                        }
                    }
                    f0 f0Var3 = this.f8770o;
                    obj2 = this.f8769n;
                    eVar = (y2.e) this.f8768m;
                    S2.a aVar2 = this.f8767l;
                    d0Var = (d0) this.q;
                    C1.y.J(obj);
                    f0Var = f0Var3;
                    aVar = aVar2;
                }
                this.q = d0Var;
                this.f8767l = aVar;
                this.f8768m = f0Var;
                this.f8769n = null;
                this.f8770o = null;
                this.f8771p = 2;
                Object j3 = eVar.j(obj2, this);
                if (j3 == enumC1145a) {
                    return enumC1145a;
                }
                f0Var2 = f0Var;
                obj = j3;
                d0Var2 = d0Var;
                atomicReference2 = f0Var2.f8779a;
                while (!atomicReference2.compareAndSet(d0Var2, null)) {
                }
                ((S2.d) aVar).d(null);
                return obj;
            } catch (Throwable th3) {
                d0Var2 = d0Var;
                f0Var2 = f0Var;
                th = th3;
                atomicReference = f0Var2.f8779a;
                while (!atomicReference.compareAndSet(d0Var2, null) && atomicReference.get() == d0Var2) {
                }
                throw th;
            }
        } catch (Throwable th4) {
            ((S2.d) r12).d(null);
            throw th4;
        }
    }
}
