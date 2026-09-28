package a2;

import C1.y;
import M2.InterfaceC0344h;
import M2.f0;
import m2.C0865g;
import m2.C0880v;
import q2.InterfaceC1073d;
import r2.EnumC1145a;
import s2.AbstractC1204i;

/* loaded from: classes.dex */
public final class i extends AbstractC1204i implements y2.f {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f6515l;

    /* renamed from: m, reason: collision with root package name */
    public int f6516m;

    /* renamed from: n, reason: collision with root package name */
    public /* synthetic */ InterfaceC0344h f6517n;

    /* renamed from: o, reason: collision with root package name */
    public /* synthetic */ Object f6518o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ l f6519p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(InterfaceC1073d interfaceC1073d, l lVar, int i2) {
        super(3, interfaceC1073d);
        this.f6515l = i2;
        this.f6519p = lVar;
    }

    @Override // y2.f
    public final Object i(Object obj, Object obj2, Object obj3) {
        InterfaceC0344h interfaceC0344h = (InterfaceC0344h) obj;
        InterfaceC1073d interfaceC1073d = (InterfaceC1073d) obj3;
        switch (this.f6515l) {
            case 0:
                i iVar = new i(interfaceC1073d, this.f6519p, 0);
                iVar.f6517n = interfaceC0344h;
                iVar.f6518o = obj2;
                return iVar.p(C0880v.f8657a);
            default:
                i iVar2 = new i(interfaceC1073d, this.f6519p, 1);
                iVar2.f6517n = interfaceC0344h;
                iVar2.f6518o = obj2;
                return iVar2.p(C0880v.f8657a);
        }
    }

    @Override // s2.AbstractC1196a
    public final Object p(Object obj) {
        switch (this.f6515l) {
            case 0:
                EnumC1145a enumC1145a = EnumC1145a.f10026h;
                int i2 = this.f6516m;
                C0880v c0880v = C0880v.f8657a;
                if (i2 == 0) {
                    y.J(obj);
                    InterfaceC0344h interfaceC0344h = this.f6517n;
                    C0865g c0865g = (C0865g) this.f6518o;
                    G1.h c3 = this.f6519p.f6526b.c((String) c0865g.f8646h, (R1.c) c0865g.f8647i);
                    this.f6516m = 1;
                    if (interfaceC0344h instanceof f0) {
                        throw ((f0) interfaceC0344h).f4883h;
                    }
                    Object b3 = c3.b(interfaceC0344h, this);
                    if (b3 != enumC1145a) {
                        b3 = c0880v;
                    }
                    if (b3 == enumC1145a) {
                        return enumC1145a;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    y.J(obj);
                }
                return c0880v;
            default:
                EnumC1145a enumC1145a2 = EnumC1145a.f10026h;
                int i3 = this.f6516m;
                C0880v c0880v2 = C0880v.f8657a;
                if (i3 == 0) {
                    y.J(obj);
                    InterfaceC0344h interfaceC0344h2 = this.f6517n;
                    G1.h c4 = this.f6519p.f6526b.c((String) this.f6518o, null);
                    this.f6516m = 1;
                    if (interfaceC0344h2 instanceof f0) {
                        throw ((f0) interfaceC0344h2).f4883h;
                    }
                    Object b4 = c4.b(interfaceC0344h2, this);
                    if (b4 != enumC1145a2) {
                        b4 = c0880v2;
                    }
                    if (b4 == enumC1145a2) {
                        return enumC1145a2;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    y.J(obj);
                }
                return c0880v2;
        }
    }
}
