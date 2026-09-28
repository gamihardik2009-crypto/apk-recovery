package m;

import J.W0;
import J2.InterfaceC0328z;
import m2.C0880v;
import q2.InterfaceC1073d;
import r2.EnumC1145a;
import s2.AbstractC1204i;

/* renamed from: m.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0833f extends AbstractC1204i implements y2.e {

    /* renamed from: l, reason: collision with root package name */
    public int f8451l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Object f8452m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ C0829d f8453n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ W0 f8454o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ W0 f8455p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0833f(Object obj, C0829d c0829d, W0 w02, W0 w03, InterfaceC1073d interfaceC1073d) {
        super(2, interfaceC1073d);
        this.f8452m = obj;
        this.f8453n = c0829d;
        this.f8454o = w02;
        this.f8455p = w03;
    }

    @Override // y2.e
    public final Object j(Object obj, Object obj2) {
        return ((C0833f) m((InterfaceC0328z) obj, (InterfaceC1073d) obj2)).p(C0880v.f8657a);
    }

    @Override // s2.AbstractC1196a
    public final InterfaceC1073d m(Object obj, InterfaceC1073d interfaceC1073d) {
        return new C0833f(this.f8452m, this.f8453n, this.f8454o, this.f8455p, interfaceC1073d);
    }

    @Override // s2.AbstractC1196a
    public final Object p(Object obj) {
        EnumC1145a enumC1145a = EnumC1145a.f10026h;
        int i2 = this.f8451l;
        C0829d c0829d = this.f8453n;
        if (i2 == 0) {
            C1.y.J(obj);
            if (!z2.h.a(this.f8452m, c0829d.f8426e.getValue())) {
                Z z3 = AbstractC0835h.f8488a;
                InterfaceC0840m interfaceC0840m = (InterfaceC0840m) this.f8454o.getValue();
                this.f8451l = 1;
                if (C0829d.b(this.f8453n, this.f8452m, interfaceC0840m, null, this, 12) == enumC1145a) {
                    return enumC1145a;
                }
            }
            return C0880v.f8657a;
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        C1.y.J(obj);
        Z z4 = AbstractC0835h.f8488a;
        y2.c cVar = (y2.c) this.f8455p.getValue();
        if (cVar != null) {
            cVar.l(c0829d.d());
        }
        return C0880v.f8657a;
    }
}
