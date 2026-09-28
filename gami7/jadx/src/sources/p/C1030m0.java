package p;

import m2.C0880v;
import q2.InterfaceC1073d;
import r2.EnumC1145a;
import s2.AbstractC1204i;

/* renamed from: p.m0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1030m0 extends AbstractC1204i implements y2.e {

    /* renamed from: l, reason: collision with root package name */
    public int f9643l;

    /* renamed from: m, reason: collision with root package name */
    public /* synthetic */ Object f9644m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ y2.e f9645n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ C0 f9646o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1030m0(C0 c02, InterfaceC1073d interfaceC1073d, y2.e eVar) {
        super(2, interfaceC1073d);
        this.f9645n = eVar;
        this.f9646o = c02;
    }

    @Override // y2.e
    public final Object j(Object obj, Object obj2) {
        return ((C1030m0) m((C1055z0) obj, (InterfaceC1073d) obj2)).p(C0880v.f8657a);
    }

    @Override // s2.AbstractC1196a
    public final InterfaceC1073d m(Object obj, InterfaceC1073d interfaceC1073d) {
        C1030m0 c1030m0 = new C1030m0(this.f9646o, interfaceC1073d, this.f9645n);
        c1030m0.f9644m = obj;
        return c1030m0;
    }

    @Override // s2.AbstractC1196a
    public final Object p(Object obj) {
        EnumC1145a enumC1145a = EnumC1145a.f10026h;
        int i2 = this.f9643l;
        if (i2 == 0) {
            C1.y.J(obj);
            C1007b c1007b = new C1007b((C1055z0) this.f9644m, 3, this.f9646o);
            this.f9643l = 1;
            if (this.f9645n.j(c1007b, this) == enumC1145a) {
                return enumC1145a;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C1.y.J(obj);
        }
        return C0880v.f8657a;
    }
}
