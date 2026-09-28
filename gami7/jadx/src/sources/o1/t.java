package o1;

import J.C0266g0;
import J.W0;
import J2.InterfaceC0328z;
import java.util.List;
import m.W;
import m2.C0880v;
import n1.C0945f;
import q2.InterfaceC1073d;
import r2.EnumC1145a;
import s2.AbstractC1204i;

/* loaded from: classes.dex */
public final class t extends AbstractC1204i implements y2.e {

    /* renamed from: l, reason: collision with root package name */
    public int f9286l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ W f9287m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ W0 f9288n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ C0266g0 f9289o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(W w2, W0 w02, C0266g0 c0266g0, InterfaceC1073d interfaceC1073d) {
        super(2, interfaceC1073d);
        this.f9287m = w2;
        this.f9288n = w02;
        this.f9289o = c0266g0;
    }

    @Override // y2.e
    public final Object j(Object obj, Object obj2) {
        return ((t) m((InterfaceC0328z) obj, (InterfaceC1073d) obj2)).p(C0880v.f8657a);
    }

    @Override // s2.AbstractC1196a
    public final InterfaceC1073d m(Object obj, InterfaceC1073d interfaceC1073d) {
        return new t(this.f9287m, this.f9288n, this.f9289o, interfaceC1073d);
    }

    @Override // s2.AbstractC1196a
    public final Object p(Object obj) {
        EnumC1145a enumC1145a = EnumC1145a.f10026h;
        int i2 = this.f9286l;
        if (i2 == 0) {
            C1.y.J(obj);
            C0945f c0945f = (C0945f) ((List) this.f9288n.getValue()).get(((List) r4.getValue()).size() - 2);
            float g3 = this.f9289o.g();
            this.f9286l = 1;
            if (this.f9287m.t(g3, c0945f, this) == enumC1145a) {
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
