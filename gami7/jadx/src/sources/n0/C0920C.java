package n0;

import J2.InterfaceC0328z;
import m2.C0880v;
import q2.InterfaceC1073d;
import r2.EnumC1145a;
import s2.AbstractC1204i;

/* renamed from: n0.C, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0920C extends AbstractC1204i implements y2.e {

    /* renamed from: l, reason: collision with root package name */
    public int f8908l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C0921D f8909m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0920C(C0921D c0921d, InterfaceC1073d interfaceC1073d) {
        super(2, interfaceC1073d);
        this.f8909m = c0921d;
    }

    @Override // y2.e
    public final Object j(Object obj, Object obj2) {
        return ((C0920C) m((InterfaceC0328z) obj, (InterfaceC1073d) obj2)).p(C0880v.f8657a);
    }

    @Override // s2.AbstractC1196a
    public final InterfaceC1073d m(Object obj, InterfaceC1073d interfaceC1073d) {
        return new C0920C(this.f8909m, interfaceC1073d);
    }

    @Override // s2.AbstractC1196a
    public final Object p(Object obj) {
        EnumC1145a enumC1145a = EnumC1145a.f10026h;
        int i2 = this.f8908l;
        if (i2 == 0) {
            C1.y.J(obj);
            C0921D c0921d = this.f8909m;
            y2.e eVar = c0921d.f8917x;
            this.f8908l = 1;
            if (eVar.j(c0921d, this) == enumC1145a) {
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
