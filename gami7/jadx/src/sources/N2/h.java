package N2;

import M2.InterfaceC0344h;
import m2.C0880v;
import q2.InterfaceC1073d;
import r2.EnumC1145a;
import s2.AbstractC1204i;

/* loaded from: classes.dex */
public final class h extends AbstractC1204i implements y2.e {

    /* renamed from: l, reason: collision with root package name */
    public int f5046l;

    /* renamed from: m, reason: collision with root package name */
    public /* synthetic */ Object f5047m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ i f5048n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(i iVar, InterfaceC1073d interfaceC1073d) {
        super(2, interfaceC1073d);
        this.f5048n = iVar;
    }

    @Override // y2.e
    public final Object j(Object obj, Object obj2) {
        return ((h) m((InterfaceC0344h) obj, (InterfaceC1073d) obj2)).p(C0880v.f8657a);
    }

    @Override // s2.AbstractC1196a
    public final InterfaceC1073d m(Object obj, InterfaceC1073d interfaceC1073d) {
        h hVar = new h(this.f5048n, interfaceC1073d);
        hVar.f5047m = obj;
        return hVar;
    }

    @Override // s2.AbstractC1196a
    public final Object p(Object obj) {
        EnumC1145a enumC1145a = EnumC1145a.f10026h;
        int i2 = this.f5046l;
        if (i2 == 0) {
            C1.y.J(obj);
            InterfaceC0344h interfaceC0344h = (InterfaceC0344h) this.f5047m;
            this.f5046l = 1;
            if (this.f5048n.j(interfaceC0344h, this) == enumC1145a) {
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
