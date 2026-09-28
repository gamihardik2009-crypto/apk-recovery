package androidx.lifecycle;

import J2.InterfaceC0328z;
import m2.C0880v;
import q2.InterfaceC1073d;
import r2.EnumC1145a;
import s2.AbstractC1204i;

/* loaded from: classes.dex */
public final class I extends AbstractC1204i implements y2.e {

    /* renamed from: l, reason: collision with root package name */
    public int f6838l;

    /* renamed from: m, reason: collision with root package name */
    public /* synthetic */ Object f6839m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ C0472v f6840n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ EnumC0466o f6841o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ y2.e f6842p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public I(C0472v c0472v, EnumC0466o enumC0466o, y2.e eVar, InterfaceC1073d interfaceC1073d) {
        super(2, interfaceC1073d);
        this.f6840n = c0472v;
        this.f6841o = enumC0466o;
        this.f6842p = eVar;
    }

    @Override // y2.e
    public final Object j(Object obj, Object obj2) {
        return ((I) m((InterfaceC0328z) obj, (InterfaceC1073d) obj2)).p(C0880v.f8657a);
    }

    @Override // s2.AbstractC1196a
    public final InterfaceC1073d m(Object obj, InterfaceC1073d interfaceC1073d) {
        I i2 = new I(this.f6840n, this.f6841o, this.f6842p, interfaceC1073d);
        i2.f6839m = obj;
        return i2;
    }

    @Override // s2.AbstractC1196a
    public final Object p(Object obj) {
        EnumC1145a enumC1145a = EnumC1145a.f10026h;
        int i2 = this.f6838l;
        if (i2 == 0) {
            C1.y.J(obj);
            InterfaceC0328z interfaceC0328z = (InterfaceC0328z) this.f6839m;
            Q2.d dVar = J2.H.f4356a;
            K2.d dVar2 = O2.o.f5202a.f4610m;
            H h2 = new H(this.f6840n, this.f6841o, interfaceC0328z, this.f6842p, null);
            this.f6838l = 1;
            if (J2.B.z(dVar2, h2, this) == enumC1145a) {
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
