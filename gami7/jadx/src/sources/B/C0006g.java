package B;

import m2.C0880v;
import q2.InterfaceC1073d;
import r2.EnumC1145a;
import s2.AbstractC1204i;
import u0.U;

/* renamed from: B.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0006g extends AbstractC1204i implements y2.e {

    /* renamed from: l, reason: collision with root package name */
    public int f212l;

    /* renamed from: m, reason: collision with root package name */
    public /* synthetic */ Object f213m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ y2.c f214n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ C0007h f215o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ B f216p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0006g(y2.c cVar, C0007h c0007h, B b3, InterfaceC1073d interfaceC1073d) {
        super(2, interfaceC1073d);
        this.f214n = cVar;
        this.f215o = c0007h;
        this.f216p = b3;
    }

    @Override // y2.e
    public final Object j(Object obj, Object obj2) {
        ((C0006g) m((U) obj, (InterfaceC1073d) obj2)).p(C0880v.f8657a);
        return EnumC1145a.f10026h;
    }

    @Override // s2.AbstractC1196a
    public final InterfaceC1073d m(Object obj, InterfaceC1073d interfaceC1073d) {
        C0006g c0006g = new C0006g(this.f214n, this.f215o, this.f216p, interfaceC1073d);
        c0006g.f213m = obj;
        return c0006g;
    }

    @Override // s2.AbstractC1196a
    public final Object p(Object obj) {
        EnumC1145a enumC1145a = EnumC1145a.f10026h;
        int i2 = this.f212l;
        if (i2 == 0) {
            C1.y.J(obj);
            C0005f c0005f = new C0005f((U) this.f213m, this.f214n, this.f215o, this.f216p, null);
            this.f212l = 1;
            if (J2.B.e(c0005f, this) == enumC1145a) {
                return enumC1145a;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C1.y.J(obj);
        }
        throw new J2.r();
    }
}
