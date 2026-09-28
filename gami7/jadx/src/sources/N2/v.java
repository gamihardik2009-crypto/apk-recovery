package N2;

import J2.InterfaceC0328z;
import M2.InterfaceC0344h;
import m2.C0880v;
import q2.InterfaceC1073d;
import r2.EnumC1145a;
import s2.AbstractC1204i;

/* loaded from: classes.dex */
public final class v extends AbstractC1204i implements y2.e {

    /* renamed from: l, reason: collision with root package name */
    public int f5085l;

    /* renamed from: m, reason: collision with root package name */
    public /* synthetic */ Object f5086m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ y2.f f5087n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0344h f5088o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(y2.f fVar, InterfaceC0344h interfaceC0344h, InterfaceC1073d interfaceC1073d) {
        super(2, interfaceC1073d);
        this.f5087n = fVar;
        this.f5088o = interfaceC0344h;
    }

    @Override // y2.e
    public final Object j(Object obj, Object obj2) {
        return ((v) m((InterfaceC0328z) obj, (InterfaceC1073d) obj2)).p(C0880v.f8657a);
    }

    @Override // s2.AbstractC1196a
    public final InterfaceC1073d m(Object obj, InterfaceC1073d interfaceC1073d) {
        v vVar = new v(this.f5087n, this.f5088o, interfaceC1073d);
        vVar.f5086m = obj;
        return vVar;
    }

    @Override // s2.AbstractC1196a
    public final Object p(Object obj) {
        EnumC1145a enumC1145a = EnumC1145a.f10026h;
        int i2 = this.f5085l;
        if (i2 == 0) {
            C1.y.J(obj);
            InterfaceC0328z interfaceC0328z = (InterfaceC0328z) this.f5086m;
            this.f5085l = 1;
            if (this.f5087n.i(interfaceC0328z, this.f5088o, this) == enumC1145a) {
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
