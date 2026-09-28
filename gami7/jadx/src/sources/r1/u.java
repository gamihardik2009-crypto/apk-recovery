package r1;

import J2.InterfaceC0328z;
import m2.C0880v;
import q2.InterfaceC1073d;
import q2.InterfaceC1076g;
import r2.EnumC1145a;
import s2.AbstractC1204i;

/* loaded from: classes.dex */
public final class u extends AbstractC1204i implements y2.e {

    /* renamed from: l, reason: collision with root package name */
    public int f10007l;

    /* renamed from: m, reason: collision with root package name */
    public /* synthetic */ Object f10008m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ r f10009n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ y2.c f10010o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(r rVar, y2.c cVar, InterfaceC1073d interfaceC1073d) {
        super(2, interfaceC1073d);
        this.f10009n = rVar;
        this.f10010o = cVar;
    }

    @Override // y2.e
    public final Object j(Object obj, Object obj2) {
        return ((u) m((InterfaceC0328z) obj, (InterfaceC1073d) obj2)).p(C0880v.f8657a);
    }

    @Override // s2.AbstractC1196a
    public final InterfaceC1073d m(Object obj, InterfaceC1073d interfaceC1073d) {
        u uVar = new u(this.f10009n, this.f10010o, interfaceC1073d);
        uVar.f10008m = obj;
        return uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, r2.a] */
    /* JADX WARN: Type inference failed for: r0v5 */
    @Override // s2.AbstractC1196a
    public final Object p(Object obj) {
        Throwable th;
        y yVar;
        y yVar2 = EnumC1145a.f10026h;
        int i2 = this.f10007l;
        r rVar = this.f10009n;
        try {
            if (i2 == 0) {
                C1.y.J(obj);
                InterfaceC1076g s3 = ((InterfaceC0328z) this.f10008m).r().s(y.f10023j);
                z2.h.c(s3);
                y yVar3 = (y) s3;
                yVar3.f10025i.incrementAndGet();
                try {
                    rVar.c();
                    try {
                        y2.c cVar = this.f10010o;
                        this.f10008m = yVar3;
                        this.f10007l = 1;
                        Object l3 = cVar.l(this);
                        if (l3 == yVar2) {
                            return yVar2;
                        }
                        yVar = yVar3;
                        obj = l3;
                    } catch (Throwable th2) {
                        th = th2;
                        rVar.j();
                        throw th;
                    }
                } catch (Throwable th3) {
                    yVar2 = yVar3;
                    th = th3;
                    if (yVar2.f10025i.decrementAndGet() >= 0) {
                        throw th;
                    }
                    throw new IllegalStateException("Transaction was never started or was already released.");
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                yVar = (y) this.f10008m;
                try {
                    C1.y.J(obj);
                } catch (Throwable th4) {
                    th = th4;
                    rVar.j();
                    throw th;
                }
            }
            rVar.o();
            rVar.j();
            if (yVar.f10025i.decrementAndGet() >= 0) {
                return obj;
            }
            throw new IllegalStateException("Transaction was never started or was already released.");
        } catch (Throwable th5) {
            th = th5;
        }
    }
}
