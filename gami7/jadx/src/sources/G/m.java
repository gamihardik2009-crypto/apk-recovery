package G;

import J2.InterfaceC0328z;
import m.AbstractC0831e;
import m.AbstractC0852z;
import m.C0829d;
import m.w0;
import m2.C0880v;
import q2.InterfaceC1073d;
import r2.EnumC1145a;
import s2.AbstractC1204i;

/* loaded from: classes.dex */
public final class m extends AbstractC1204i implements y2.e {

    /* renamed from: l, reason: collision with root package name */
    public int f1171l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ o f1172m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(o oVar, InterfaceC1073d interfaceC1073d) {
        super(2, interfaceC1073d);
        this.f1172m = oVar;
    }

    @Override // y2.e
    public final Object j(Object obj, Object obj2) {
        return ((m) m((InterfaceC0328z) obj, (InterfaceC1073d) obj2)).p(C0880v.f8657a);
    }

    @Override // s2.AbstractC1196a
    public final InterfaceC1073d m(Object obj, InterfaceC1073d interfaceC1073d) {
        return new m(this.f1172m, interfaceC1073d);
    }

    @Override // s2.AbstractC1196a
    public final Object p(Object obj) {
        EnumC1145a enumC1145a = EnumC1145a.f10026h;
        int i2 = this.f1171l;
        if (i2 == 0) {
            C1.y.J(obj);
            C0829d c0829d = this.f1172m.f1181g;
            Float f3 = new Float(0.0f);
            w0 n3 = AbstractC0831e.n(150, 0, AbstractC0852z.f8613c, 2);
            this.f1171l = 1;
            if (C0829d.b(c0829d, f3, n3, null, this, 12) == enumC1145a) {
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
