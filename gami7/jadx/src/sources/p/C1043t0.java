package p;

import m2.C0880v;
import q2.InterfaceC1073d;
import r2.EnumC1145a;
import s2.AbstractC1204i;

/* renamed from: p.t0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1043t0 extends AbstractC1204i implements y2.e {

    /* renamed from: l, reason: collision with root package name */
    public int f9683l;

    /* renamed from: m, reason: collision with root package name */
    public /* synthetic */ long f9684m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ C1045u0 f9685n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1043t0(C1045u0 c1045u0, InterfaceC1073d interfaceC1073d) {
        super(2, interfaceC1073d);
        this.f9685n = c1045u0;
    }

    @Override // y2.e
    public final Object j(Object obj, Object obj2) {
        long j3 = ((b0.c) obj).f7058a;
        C1043t0 c1043t0 = new C1043t0(this.f9685n, (InterfaceC1073d) obj2);
        c1043t0.f9684m = j3;
        return c1043t0.p(C0880v.f8657a);
    }

    @Override // s2.AbstractC1196a
    public final InterfaceC1073d m(Object obj, InterfaceC1073d interfaceC1073d) {
        C1043t0 c1043t0 = new C1043t0(this.f9685n, interfaceC1073d);
        c1043t0.f9684m = ((b0.c) obj).f7058a;
        return c1043t0;
    }

    @Override // s2.AbstractC1196a
    public final Object p(Object obj) {
        EnumC1145a enumC1145a = EnumC1145a.f10026h;
        int i2 = this.f9683l;
        if (i2 == 0) {
            C1.y.J(obj);
            long j3 = this.f9684m;
            C0 c02 = this.f9685n.f9690J;
            this.f9683l = 1;
            obj = androidx.compose.foundation.gestures.a.a(c02, j3, this);
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
