package J;

import J2.InterfaceC0328z;
import m2.C0880v;
import q2.InterfaceC1073d;
import r2.EnumC1145a;
import s2.AbstractC1204i;

/* loaded from: classes.dex */
public final class P0 extends AbstractC1204i implements y2.e {

    /* renamed from: l, reason: collision with root package name */
    public int f4068l;

    /* renamed from: m, reason: collision with root package name */
    public /* synthetic */ Object f4069m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ y2.e f4070n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0258c0 f4071o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public P0(y2.e eVar, InterfaceC0258c0 interfaceC0258c0, InterfaceC1073d interfaceC1073d) {
        super(2, interfaceC1073d);
        this.f4070n = eVar;
        this.f4071o = interfaceC0258c0;
    }

    @Override // y2.e
    public final Object j(Object obj, Object obj2) {
        return ((P0) m((InterfaceC0328z) obj, (InterfaceC1073d) obj2)).p(C0880v.f8657a);
    }

    @Override // s2.AbstractC1196a
    public final InterfaceC1073d m(Object obj, InterfaceC1073d interfaceC1073d) {
        P0 p02 = new P0(this.f4070n, this.f4071o, interfaceC1073d);
        p02.f4069m = obj;
        return p02;
    }

    @Override // s2.AbstractC1196a
    public final Object p(Object obj) {
        EnumC1145a enumC1145a = EnumC1145a.f10026h;
        int i2 = this.f4068l;
        if (i2 == 0) {
            C1.y.J(obj);
            C0284p0 c0284p0 = new C0284p0(this.f4071o, ((InterfaceC0328z) this.f4069m).r());
            this.f4068l = 1;
            if (this.f4070n.j(c0284p0, this) == enumC1145a) {
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
