package H1;

import B1.s;
import C1.y;
import D.c0;
import I1.g;
import L2.u;
import m2.C0880v;
import q2.InterfaceC1073d;
import r2.EnumC1145a;
import s2.AbstractC1204i;

/* loaded from: classes.dex */
public final class c extends AbstractC1204i implements y2.e {

    /* renamed from: l, reason: collision with root package name */
    public int f3421l;

    /* renamed from: m, reason: collision with root package name */
    public /* synthetic */ Object f3422m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ d f3423n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d dVar, InterfaceC1073d interfaceC1073d) {
        super(2, interfaceC1073d);
        this.f3423n = dVar;
    }

    @Override // y2.e
    public final Object j(Object obj, Object obj2) {
        return ((c) m((u) obj, (InterfaceC1073d) obj2)).p(C0880v.f8657a);
    }

    @Override // s2.AbstractC1196a
    public final InterfaceC1073d m(Object obj, InterfaceC1073d interfaceC1073d) {
        c cVar = new c(this.f3423n, interfaceC1073d);
        cVar.f3422m = obj;
        return cVar;
    }

    @Override // s2.AbstractC1196a
    public final Object p(Object obj) {
        EnumC1145a enumC1145a = EnumC1145a.f10026h;
        int i2 = this.f3421l;
        if (i2 == 0) {
            y.J(obj);
            u uVar = (u) this.f3422m;
            d dVar = this.f3423n;
            b bVar = new b(dVar, uVar);
            I1.f fVar = dVar.f3424a;
            fVar.getClass();
            synchronized (fVar.f3944c) {
                try {
                    if (fVar.f3945d.add(bVar)) {
                        if (fVar.f3945d.size() == 1) {
                            fVar.f3946e = fVar.a();
                            s.d().a(g.f3947a, fVar.getClass().getSimpleName() + ": initial state = " + fVar.f3946e);
                            fVar.c();
                        }
                        bVar.a(fVar.f3946e);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            c0 c0Var = new c0(this.f3423n, 2, bVar);
            this.f3421l = 1;
            if (K1.f.m(uVar, c0Var, this) == enumC1145a) {
                return enumC1145a;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            y.J(obj);
        }
        return C0880v.f8657a;
    }
}
