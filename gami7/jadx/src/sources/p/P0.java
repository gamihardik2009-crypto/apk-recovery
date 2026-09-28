package p;

import m2.C0880v;
import n0.C0918A;
import n0.EnumC0931j;
import q2.InterfaceC1073d;
import r2.EnumC1145a;
import s2.AbstractC1203h;

/* loaded from: classes.dex */
public final class P0 extends AbstractC1203h implements y2.e {

    /* renamed from: j, reason: collision with root package name */
    public int f9486j;

    /* renamed from: k, reason: collision with root package name */
    public /* synthetic */ Object f9487k;

    @Override // y2.e
    public final Object j(Object obj, Object obj2) {
        return ((P0) m((C0918A) obj, (InterfaceC1073d) obj2)).p(C0880v.f8657a);
    }

    @Override // s2.AbstractC1196a
    public final InterfaceC1073d m(Object obj, InterfaceC1073d interfaceC1073d) {
        P0 p02 = new P0(interfaceC1073d);
        p02.f9487k = obj;
        return p02;
    }

    @Override // s2.AbstractC1196a
    public final Object p(Object obj) {
        EnumC1145a enumC1145a = EnumC1145a.f10026h;
        int i2 = this.f9486j;
        if (i2 == 0) {
            C1.y.J(obj);
            C0918A c0918a = (C0918A) this.f9487k;
            this.f9486j = 1;
            obj = b1.e(c0918a, EnumC0931j.f8947i, this);
            if (obj == enumC1145a) {
                return enumC1145a;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C1.y.J(obj);
        }
        return obj;
    }
}
