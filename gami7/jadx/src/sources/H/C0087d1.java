package H;

import J2.InterfaceC0328z;
import m2.C0880v;
import q2.InterfaceC1073d;
import r2.EnumC1145a;
import s2.AbstractC1204i;
import t.C1228w;

/* renamed from: H.d1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0087d1 extends AbstractC1204i implements y2.e {

    /* renamed from: l, reason: collision with root package name */
    public int f2428l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C1228w f2429m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ y2.c f2430n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ I f2431o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ E2.d f2432p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0087d1(C1228w c1228w, y2.c cVar, I i2, E2.d dVar, InterfaceC1073d interfaceC1073d) {
        super(2, interfaceC1073d);
        this.f2429m = c1228w;
        this.f2430n = cVar;
        this.f2431o = i2;
        this.f2432p = dVar;
    }

    @Override // y2.e
    public final Object j(Object obj, Object obj2) {
        return ((C0087d1) m((InterfaceC0328z) obj, (InterfaceC1073d) obj2)).p(C0880v.f8657a);
    }

    @Override // s2.AbstractC1196a
    public final InterfaceC1073d m(Object obj, InterfaceC1073d interfaceC1073d) {
        return new C0087d1(this.f2429m, this.f2430n, this.f2431o, this.f2432p, interfaceC1073d);
    }

    @Override // s2.AbstractC1196a
    public final Object p(Object obj) {
        EnumC1145a enumC1145a = EnumC1145a.f10026h;
        int i2 = this.f2428l;
        C0880v c0880v = C0880v.f8657a;
        if (i2 == 0) {
            C1.y.J(obj);
            this.f2428l = 1;
            float f3 = A1.f1287a;
            C1228w c1228w = this.f2429m;
            Object b3 = new G1.h(2, new J.T0(new B.y(8, c1228w), null)).b(new C0232z1(c1228w, this.f2430n, this.f2431o, this.f2432p, 0), this);
            if (b3 != enumC1145a) {
                b3 = c0880v;
            }
            if (b3 == enumC1145a) {
                return enumC1145a;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C1.y.J(obj);
        }
        return c0880v;
    }
}
