package z;

import J.InterfaceC0258c0;
import J2.InterfaceC0328z;
import m2.C0880v;
import q2.InterfaceC1073d;
import r2.EnumC1145a;
import s2.AbstractC1204i;

/* loaded from: classes.dex */
public final class h0 extends AbstractC1204i implements y2.e {

    /* renamed from: l, reason: collision with root package name */
    public InterfaceC0258c0 f11698l;

    /* renamed from: m, reason: collision with root package name */
    public int f11699m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0258c0 f11700n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ boolean f11701o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ r.l f11702p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(InterfaceC0258c0 interfaceC0258c0, boolean z3, r.l lVar, InterfaceC1073d interfaceC1073d) {
        super(2, interfaceC1073d);
        this.f11700n = interfaceC0258c0;
        this.f11701o = z3;
        this.f11702p = lVar;
    }

    @Override // y2.e
    public final Object j(Object obj, Object obj2) {
        return ((h0) m((InterfaceC0328z) obj, (InterfaceC1073d) obj2)).p(C0880v.f8657a);
    }

    @Override // s2.AbstractC1196a
    public final InterfaceC1073d m(Object obj, InterfaceC1073d interfaceC1073d) {
        return new h0(this.f11700n, this.f11701o, this.f11702p, interfaceC1073d);
    }

    @Override // s2.AbstractC1196a
    public final Object p(Object obj) {
        InterfaceC0258c0 interfaceC0258c0;
        InterfaceC0258c0 interfaceC0258c02;
        EnumC1145a enumC1145a = EnumC1145a.f10026h;
        int i2 = this.f11699m;
        if (i2 == 0) {
            C1.y.J(obj);
            interfaceC0258c0 = this.f11700n;
            r.n nVar = (r.n) interfaceC0258c0.getValue();
            if (nVar != null) {
                r.j oVar = this.f11701o ? new r.o(nVar) : new r.m(nVar);
                r.l lVar = this.f11702p;
                if (lVar != null) {
                    this.f11698l = interfaceC0258c0;
                    this.f11699m = 1;
                    if (lVar.b(oVar, this) == enumC1145a) {
                        return enumC1145a;
                    }
                    interfaceC0258c02 = interfaceC0258c0;
                }
                interfaceC0258c0.setValue(null);
            }
            return C0880v.f8657a;
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        interfaceC0258c02 = this.f11698l;
        C1.y.J(obj);
        interfaceC0258c0 = interfaceC0258c02;
        interfaceC0258c0.setValue(null);
        return C0880v.f8657a;
    }
}
