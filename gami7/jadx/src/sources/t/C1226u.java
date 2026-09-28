package t;

import J2.InterfaceC0328z;
import m.AbstractC0831e;
import m.C0841n;
import m.Z;
import m2.C0880v;
import q2.InterfaceC1073d;
import r2.EnumC1145a;
import s2.AbstractC1204i;

/* renamed from: t.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1226u extends AbstractC1204i implements y2.e {

    /* renamed from: l, reason: collision with root package name */
    public int f10338l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C1228w f10339m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1226u(C1228w c1228w, InterfaceC1073d interfaceC1073d) {
        super(2, interfaceC1073d);
        this.f10339m = c1228w;
    }

    @Override // y2.e
    public final Object j(Object obj, Object obj2) {
        return ((C1226u) m((InterfaceC0328z) obj, (InterfaceC1073d) obj2)).p(C0880v.f8657a);
    }

    @Override // s2.AbstractC1196a
    public final InterfaceC1073d m(Object obj, InterfaceC1073d interfaceC1073d) {
        return new C1226u(this.f10339m, interfaceC1073d);
    }

    @Override // s2.AbstractC1196a
    public final Object p(Object obj) {
        EnumC1145a enumC1145a = EnumC1145a.f10026h;
        int i2 = this.f10338l;
        if (i2 == 0) {
            C1.y.J(obj);
            C0841n c0841n = this.f10339m.f10364w;
            Float f3 = new Float(0.0f);
            Z m3 = AbstractC0831e.m(400.0f, new Float(0.5f), 1);
            this.f10338l = 1;
            if (AbstractC0831e.g(c0841n, f3, m3, true, null, this, 8) == enumC1145a) {
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
