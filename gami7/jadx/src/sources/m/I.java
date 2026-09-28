package m;

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
public final class I extends AbstractC1204i implements y2.e {

    /* renamed from: l, reason: collision with root package name */
    public S2.a f8309l;

    /* renamed from: m, reason: collision with root package name */
    public Object f8310m;

    /* renamed from: n, reason: collision with root package name */
    public J f8311n;

    /* renamed from: o, reason: collision with root package name */
    public int f8312o;

    /* renamed from: p, reason: collision with root package name */
    public /* synthetic */ Object f8313p;
    public final /* synthetic */ int q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ J f8314r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ y2.c f8315s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public I(int i2, J j3, y2.c cVar, InterfaceC1073d interfaceC1073d) {
        super(2, interfaceC1073d);
        this.q = i2;
        this.f8314r = j3;
        this.f8315s = cVar;
    }

    @Override // y2.e
    public final Object j(Object obj, Object obj2) {
        return ((I) m((InterfaceC0328z) obj, (InterfaceC1073d) obj2)).p(C0880v.f8657a);
    }

    @Override // s2.AbstractC1196a
    public final InterfaceC1073d m(Object obj, InterfaceC1073d interfaceC1073d) {
        I i2 = new I(this.q, this.f8314r, this.f8315s, interfaceC1073d);
        i2.f8313p = obj;
        return i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r5v6, types: [S2.a] */
    @Override // s2.AbstractC1196a
    public final Object p(Object obj) {
        J j3;
        y2.c cVar;
        H h2;
        S2.d dVar;
        S2.a aVar;
        H h3;
        J j4;
        Throwable th;
        AtomicReference atomicReference;
        AtomicReference atomicReference2;
        EnumC1145a enumC1145a = EnumC1145a.f10026h;
        ?? r12 = this.f8312o;
        try {
            try {
                if (r12 == 0) {
                    C1.y.J(obj);
                    InterfaceC1076g s3 = ((InterfaceC0328z) this.f8313p).r().s(C0325w.f4437i);
                    z2.h.c(s3);
                    H h4 = new H(this.q, (J2.Z) s3);
                    while (true) {
                        j3 = this.f8314r;
                        AtomicReference atomicReference3 = j3.f8316a;
                        H h5 = (H) atomicReference3.get();
                        if (h5 != null && AbstractC0837j.a(h4.f8307a, h5.f8307a) < 0) {
                            throw new CancellationException("Current mutation had a higher priority");
                        }
                        while (!atomicReference3.compareAndSet(h5, h4)) {
                            if (atomicReference3.get() != h5) {
                                break;
                            }
                        }
                        if (h5 != null) {
                            h5.f8308b.a(new J.V("Mutation interrupted", 2));
                        }
                        this.f8313p = h4;
                        S2.d dVar2 = j3.f8317b;
                        this.f8309l = dVar2;
                        y2.c cVar2 = this.f8315s;
                        this.f8310m = cVar2;
                        this.f8311n = j3;
                        this.f8312o = 1;
                        if (dVar2.c(null, this) == enumC1145a) {
                            return enumC1145a;
                        }
                        cVar = cVar2;
                        h2 = h4;
                        dVar = dVar2;
                    }
                } else {
                    if (r12 != 1) {
                        if (r12 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        j4 = (J) this.f8310m;
                        aVar = this.f8309l;
                        h3 = (H) this.f8313p;
                        try {
                            C1.y.J(obj);
                            atomicReference2 = j4.f8316a;
                            while (!atomicReference2.compareAndSet(h3, null) && atomicReference2.get() == h3) {
                            }
                            ((S2.d) aVar).d(null);
                            return obj;
                        } catch (Throwable th2) {
                            th = th2;
                            atomicReference = j4.f8316a;
                            while (!atomicReference.compareAndSet(h3, null)) {
                            }
                            throw th;
                        }
                    }
                    J j5 = this.f8311n;
                    cVar = (y2.c) this.f8310m;
                    ?? r5 = this.f8309l;
                    h2 = (H) this.f8313p;
                    C1.y.J(obj);
                    j3 = j5;
                    dVar = r5;
                }
                this.f8313p = h2;
                this.f8309l = aVar;
                this.f8310m = j3;
                this.f8311n = null;
                this.f8312o = 2;
                Object l3 = cVar.l(this);
                if (l3 == enumC1145a) {
                    return enumC1145a;
                }
                j4 = j3;
                obj = l3;
                h3 = h2;
                atomicReference2 = j4.f8316a;
                while (!atomicReference2.compareAndSet(h3, null)) {
                }
                ((S2.d) aVar).d(null);
                return obj;
            } catch (Throwable th3) {
                h3 = h2;
                j4 = j3;
                th = th3;
                atomicReference = j4.f8316a;
                while (!atomicReference.compareAndSet(h3, null) && atomicReference.get() == h3) {
                }
                throw th;
            }
            aVar = dVar;
        } catch (Throwable th4) {
            ((S2.d) r12).d(null);
            throw th4;
        }
    }
}
