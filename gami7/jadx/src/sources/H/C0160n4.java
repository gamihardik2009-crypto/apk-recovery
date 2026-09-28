package H;

import J2.InterfaceC0328z;
import m.AbstractC0831e;
import m2.C0880v;
import p.InterfaceC1012d0;
import q2.InterfaceC1073d;
import r2.EnumC1145a;
import s2.AbstractC1204i;

/* renamed from: H.n4, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0160n4 extends AbstractC1204i implements y2.e {

    /* renamed from: l, reason: collision with root package name */
    public int f2941l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ float f2942m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ C0193s4 f2943n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1012d0 f2944o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0160n4(float f3, C0193s4 c0193s4, InterfaceC1012d0 interfaceC1012d0, InterfaceC1073d interfaceC1073d) {
        super(2, interfaceC1073d);
        this.f2942m = f3;
        this.f2943n = c0193s4;
        this.f2944o = interfaceC1012d0;
    }

    @Override // y2.e
    public final Object j(Object obj, Object obj2) {
        return ((C0160n4) m((InterfaceC0328z) obj, (InterfaceC1073d) obj2)).p(C0880v.f8657a);
    }

    @Override // s2.AbstractC1196a
    public final InterfaceC1073d m(Object obj, InterfaceC1073d interfaceC1073d) {
        return new C0160n4(this.f2942m, this.f2943n, this.f2944o, interfaceC1073d);
    }

    @Override // s2.AbstractC1196a
    public final Object p(Object obj) {
        EnumC1145a enumC1145a = EnumC1145a.f10026h;
        int i2 = this.f2941l;
        if (i2 != 0) {
            if (i2 == 1) {
                C1.y.J(obj);
                return (C0169p) obj;
            }
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C1.y.J(obj);
            return (C0169p) obj;
        }
        C1.y.J(obj);
        float f3 = this.f2942m;
        float abs = Math.abs(f3);
        C0193s4 c0193s4 = this.f2943n;
        if (abs > Math.abs(c0193s4.f3093e)) {
            this.f2941l = 2;
            obj = C0193s4.b(f3, c0193s4, this.f2944o, this);
            if (obj == enumC1145a) {
                return enumC1145a;
            }
            return (C0169p) obj;
        }
        this.f2941l = 1;
        float f4 = C0193s4.f(0.0f, c0193s4.f3089a);
        obj = c0193s4.d(this.f2944o, f4, f4, AbstractC0831e.b(f3, 28), c0193s4.f3091c, this);
        if (obj == enumC1145a) {
            return enumC1145a;
        }
        return (C0169p) obj;
    }
}
