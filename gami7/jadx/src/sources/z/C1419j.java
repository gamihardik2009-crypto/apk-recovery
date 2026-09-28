package z;

import H.C0232z1;
import J.T0;
import J.W0;
import J2.InterfaceC0328z;
import m2.C0880v;
import q2.InterfaceC1073d;
import r2.EnumC1145a;
import s2.AbstractC1204i;

/* renamed from: z.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1419j extends AbstractC1204i implements y2.e {

    /* renamed from: l, reason: collision with root package name */
    public int f11709l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ S f11710m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ W0 f11711n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ I0.A f11712o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ D.X f11713p;
    public final /* synthetic */ I0.m q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1419j(S s3, W0 w02, I0.A a3, D.X x2, I0.m mVar, InterfaceC1073d interfaceC1073d) {
        super(2, interfaceC1073d);
        this.f11710m = s3;
        this.f11711n = w02;
        this.f11712o = a3;
        this.f11713p = x2;
        this.q = mVar;
    }

    @Override // y2.e
    public final Object j(Object obj, Object obj2) {
        return ((C1419j) m((InterfaceC0328z) obj, (InterfaceC1073d) obj2)).p(C0880v.f8657a);
    }

    @Override // s2.AbstractC1196a
    public final InterfaceC1073d m(Object obj, InterfaceC1073d interfaceC1073d) {
        return new C1419j(this.f11710m, this.f11711n, this.f11712o, this.f11713p, this.q, interfaceC1073d);
    }

    @Override // s2.AbstractC1196a
    public final Object p(Object obj) {
        EnumC1145a enumC1145a = EnumC1145a.f10026h;
        int i2 = this.f11709l;
        S s3 = this.f11710m;
        try {
            if (i2 == 0) {
                C1.y.J(obj);
                G1.h hVar = new G1.h(2, new T0(new D.G(this.f11711n, 8), null));
                C0232z1 c0232z1 = new C0232z1(s3, this.f11712o, this.f11713p, this.q, 3);
                this.f11709l = 1;
                if (hVar.b(c0232z1, this) == enumC1145a) {
                    return enumC1145a;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C1.y.J(obj);
            }
            N.g(s3);
            return C0880v.f8657a;
        } catch (Throwable th) {
            N.g(s3);
            throw th;
        }
    }
}
