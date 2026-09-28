package D;

import J2.InterfaceC0328z;
import m.C0829d;
import m2.C0880v;
import q2.InterfaceC1073d;
import r2.EnumC1145a;
import s2.AbstractC1204i;

/* loaded from: classes.dex */
public final class I extends AbstractC1204i implements y2.e {

    /* renamed from: l, reason: collision with root package name */
    public int f735l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C0829d f736m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ long f737n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public I(C0829d c0829d, long j3, InterfaceC1073d interfaceC1073d) {
        super(2, interfaceC1073d);
        this.f736m = c0829d;
        this.f737n = j3;
    }

    @Override // y2.e
    public final Object j(Object obj, Object obj2) {
        return ((I) m((InterfaceC0328z) obj, (InterfaceC1073d) obj2)).p(C0880v.f8657a);
    }

    @Override // s2.AbstractC1196a
    public final InterfaceC1073d m(Object obj, InterfaceC1073d interfaceC1073d) {
        return new I(this.f736m, this.f737n, interfaceC1073d);
    }

    @Override // s2.AbstractC1196a
    public final Object p(Object obj) {
        EnumC1145a enumC1145a = EnumC1145a.f10026h;
        int i2 = this.f735l;
        if (i2 == 0) {
            C1.y.J(obj);
            b0.c cVar = new b0.c(this.f737n);
            m.Z z3 = L.f748d;
            this.f735l = 1;
            if (C0829d.b(this.f736m, cVar, z3, null, this, 12) == enumC1145a) {
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
