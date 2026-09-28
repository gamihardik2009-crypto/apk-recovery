package H;

import J2.InterfaceC0328z;
import m.C0829d;
import m2.C0880v;
import q2.InterfaceC1073d;
import r.C1084d;
import r2.EnumC1145a;
import s2.AbstractC1204i;

/* loaded from: classes.dex */
public final class D extends AbstractC1204i implements y2.e {

    /* renamed from: l, reason: collision with root package name */
    public int f1390l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C0829d f1391m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ float f1392n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ boolean f1393o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ E f1394p;
    public final /* synthetic */ r.j q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D(C0829d c0829d, float f3, boolean z3, E e3, r.j jVar, InterfaceC1073d interfaceC1073d) {
        super(2, interfaceC1073d);
        this.f1391m = c0829d;
        this.f1392n = f3;
        this.f1393o = z3;
        this.f1394p = e3;
        this.q = jVar;
    }

    @Override // y2.e
    public final Object j(Object obj, Object obj2) {
        return ((D) m((InterfaceC0328z) obj, (InterfaceC1073d) obj2)).p(C0880v.f8657a);
    }

    @Override // s2.AbstractC1196a
    public final InterfaceC1073d m(Object obj, InterfaceC1073d interfaceC1073d) {
        return new D(this.f1391m, this.f1392n, this.f1393o, this.f1394p, this.q, interfaceC1073d);
    }

    @Override // s2.AbstractC1196a
    public final Object p(Object obj) {
        EnumC1145a enumC1145a = EnumC1145a.f10026h;
        int i2 = this.f1390l;
        if (i2 == 0) {
            C1.y.J(obj);
            C0829d c0829d = this.f1391m;
            float f3 = ((O0.e) c0829d.f8426e.getValue()).f5138h;
            float f4 = this.f1392n;
            if (!O0.e.a(f3, f4)) {
                if (this.f1393o) {
                    float f5 = ((O0.e) c0829d.f8426e.getValue()).f5138h;
                    E e3 = this.f1394p;
                    r.j nVar = O0.e.a(f5, e3.f1419b) ? new r.n(0L) : O0.e.a(f5, e3.f1421d) ? new r.h() : O0.e.a(f5, e3.f1420c) ? new C1084d() : null;
                    this.f1390l = 2;
                    if (I1.a(c0829d, f4, nVar, this.q, this) == enumC1145a) {
                        return enumC1145a;
                    }
                } else {
                    O0.e eVar = new O0.e(f4);
                    this.f1390l = 1;
                    if (c0829d.e(eVar, this) == enumC1145a) {
                        return enumC1145a;
                    }
                }
            }
        } else {
            if (i2 != 1 && i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C1.y.J(obj);
        }
        return C0880v.f8657a;
    }
}
