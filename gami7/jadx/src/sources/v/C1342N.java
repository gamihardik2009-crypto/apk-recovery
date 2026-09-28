package v;

import J2.InterfaceC0328z;
import m2.C0880v;
import q2.InterfaceC1073d;
import r2.EnumC1145a;
import s2.AbstractC1204i;

/* renamed from: v.N, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1342N extends AbstractC1204i implements y2.e {

    /* renamed from: l, reason: collision with root package name */
    public int f11297l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C1343O f11298m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f11299n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1342N(C1343O c1343o, int i2, InterfaceC1073d interfaceC1073d) {
        super(2, interfaceC1073d);
        this.f11298m = c1343o;
        this.f11299n = i2;
    }

    @Override // y2.e
    public final Object j(Object obj, Object obj2) {
        return ((C1342N) m((InterfaceC0328z) obj, (InterfaceC1073d) obj2)).p(C0880v.f8657a);
    }

    @Override // s2.AbstractC1196a
    public final InterfaceC1073d m(Object obj, InterfaceC1073d interfaceC1073d) {
        return new C1342N(this.f11298m, this.f11299n, interfaceC1073d);
    }

    @Override // s2.AbstractC1196a
    public final Object p(Object obj) {
        EnumC1145a enumC1145a = EnumC1145a.f10026h;
        int i2 = this.f11297l;
        if (i2 == 0) {
            C1.y.J(obj);
            InterfaceC1339K interfaceC1339K = this.f11298m.f11303v;
            this.f11297l = 1;
            if (interfaceC1339K.e(this.f11299n, this) == enumC1145a) {
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
