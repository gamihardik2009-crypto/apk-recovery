package p;

import J2.InterfaceC0328z;
import m2.C0880v;
import q2.InterfaceC1073d;
import r2.EnumC1145a;
import s2.AbstractC1204i;

/* renamed from: p.s0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1041s0 extends AbstractC1204i implements y2.e {

    /* renamed from: l, reason: collision with root package name */
    public int f9678l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C1045u0 f9679m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ float f9680n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ float f9681o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1041s0(C1045u0 c1045u0, float f3, float f4, InterfaceC1073d interfaceC1073d) {
        super(2, interfaceC1073d);
        this.f9679m = c1045u0;
        this.f9680n = f3;
        this.f9681o = f4;
    }

    @Override // y2.e
    public final Object j(Object obj, Object obj2) {
        return ((C1041s0) m((InterfaceC0328z) obj, (InterfaceC1073d) obj2)).p(C0880v.f8657a);
    }

    @Override // s2.AbstractC1196a
    public final InterfaceC1073d m(Object obj, InterfaceC1073d interfaceC1073d) {
        return new C1041s0(this.f9679m, this.f9680n, this.f9681o, interfaceC1073d);
    }

    @Override // s2.AbstractC1196a
    public final Object p(Object obj) {
        EnumC1145a enumC1145a = EnumC1145a.f10026h;
        int i2 = this.f9678l;
        if (i2 == 0) {
            C1.y.J(obj);
            C0 c02 = this.f9679m.f9690J;
            long e3 = K1.f.e(this.f9680n, this.f9681o);
            this.f9678l = 1;
            if (androidx.compose.foundation.gestures.a.a(c02, e3, this) == enumC1145a) {
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
