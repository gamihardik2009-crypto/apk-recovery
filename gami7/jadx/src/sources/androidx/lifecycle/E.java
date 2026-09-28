package androidx.lifecycle;

import J2.InterfaceC0328z;
import m2.C0880v;
import q2.InterfaceC1073d;
import r2.EnumC1145a;
import s2.AbstractC1204i;

/* loaded from: classes.dex */
public final class E extends AbstractC1204i implements y2.e {

    /* renamed from: l, reason: collision with root package name */
    public int f6817l;

    /* renamed from: m, reason: collision with root package name */
    public /* synthetic */ Object f6818m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ y2.e f6819n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public E(y2.e eVar, InterfaceC1073d interfaceC1073d) {
        super(2, interfaceC1073d);
        this.f6819n = eVar;
    }

    @Override // y2.e
    public final Object j(Object obj, Object obj2) {
        return ((E) m((InterfaceC0328z) obj, (InterfaceC1073d) obj2)).p(C0880v.f8657a);
    }

    @Override // s2.AbstractC1196a
    public final InterfaceC1073d m(Object obj, InterfaceC1073d interfaceC1073d) {
        E e3 = new E(this.f6819n, interfaceC1073d);
        e3.f6818m = obj;
        return e3;
    }

    @Override // s2.AbstractC1196a
    public final Object p(Object obj) {
        EnumC1145a enumC1145a = EnumC1145a.f10026h;
        int i2 = this.f6817l;
        if (i2 == 0) {
            C1.y.J(obj);
            InterfaceC0328z interfaceC0328z = (InterfaceC0328z) this.f6818m;
            this.f6817l = 1;
            if (this.f6819n.j(interfaceC0328z, this) == enumC1145a) {
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
