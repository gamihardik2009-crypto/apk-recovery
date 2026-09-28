package p;

import J2.InterfaceC0328z;
import m2.C0880v;
import q2.InterfaceC1073d;
import r2.EnumC1145a;
import s2.AbstractC1204i;

/* renamed from: p.p0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1036p0 extends AbstractC1204i implements y2.e {

    /* renamed from: l, reason: collision with root package name */
    public int f9662l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C1045u0 f9663m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ long f9664n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1036p0(C1045u0 c1045u0, long j3, InterfaceC1073d interfaceC1073d) {
        super(2, interfaceC1073d);
        this.f9663m = c1045u0;
        this.f9664n = j3;
    }

    @Override // y2.e
    public final Object j(Object obj, Object obj2) {
        return ((C1036p0) m((InterfaceC0328z) obj, (InterfaceC1073d) obj2)).p(C0880v.f8657a);
    }

    @Override // s2.AbstractC1196a
    public final InterfaceC1073d m(Object obj, InterfaceC1073d interfaceC1073d) {
        return new C1036p0(this.f9663m, this.f9664n, interfaceC1073d);
    }

    @Override // s2.AbstractC1196a
    public final Object p(Object obj) {
        EnumC1145a enumC1145a = EnumC1145a.f10026h;
        int i2 = this.f9662l;
        if (i2 == 0) {
            C1.y.J(obj);
            C0 c02 = this.f9663m.f9690J;
            n.c0 c0Var = n.c0.f8754i;
            C1034o0 c1034o0 = new C1034o0(this.f9664n, null);
            this.f9662l = 1;
            if (c02.e(c0Var, c1034o0, this) == enumC1145a) {
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
