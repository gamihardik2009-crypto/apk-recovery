package p;

import J2.InterfaceC0328z;
import java.util.concurrent.CancellationException;
import m2.C0880v;
import q2.InterfaceC1073d;
import r2.EnumC1145a;
import s2.AbstractC1204i;

/* renamed from: p.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1025k extends AbstractC1204i implements y2.e {

    /* renamed from: l, reason: collision with root package name */
    public int f9617l;

    /* renamed from: m, reason: collision with root package name */
    public /* synthetic */ Object f9618m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ C1027l f9619n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ e1 f9620o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1013e f9621p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1025k(C1027l c1027l, e1 e1Var, InterfaceC1013e interfaceC1013e, InterfaceC1073d interfaceC1073d) {
        super(2, interfaceC1073d);
        this.f9619n = c1027l;
        this.f9620o = e1Var;
        this.f9621p = interfaceC1013e;
    }

    @Override // y2.e
    public final Object j(Object obj, Object obj2) {
        return ((C1025k) m((InterfaceC0328z) obj, (InterfaceC1073d) obj2)).p(C0880v.f8657a);
    }

    @Override // s2.AbstractC1196a
    public final InterfaceC1073d m(Object obj, InterfaceC1073d interfaceC1073d) {
        C1025k c1025k = new C1025k(this.f9619n, this.f9620o, this.f9621p, interfaceC1073d);
        c1025k.f9618m = obj;
        return c1025k;
    }

    @Override // s2.AbstractC1196a
    public final Object p(Object obj) {
        EnumC1145a enumC1145a = EnumC1145a.f10026h;
        int i2 = this.f9617l;
        C1027l c1027l = this.f9619n;
        try {
            try {
                if (i2 == 0) {
                    C1.y.J(obj);
                    J2.Z k3 = J2.B.k(((InterfaceC0328z) this.f9618m).r());
                    c1027l.f9629D = true;
                    C0 c02 = c1027l.f9631v;
                    n.c0 c0Var = n.c0.f8753h;
                    C1023j c1023j = new C1023j(this.f9620o, c1027l, this.f9621p, k3, null);
                    this.f9617l = 1;
                    if (c02.e(c0Var, c1023j, this) == enumC1145a) {
                        return enumC1145a;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C1.y.J(obj);
                }
                c1027l.f9634y.e();
                c1027l.f9629D = false;
                c1027l.f9634y.b(null);
                c1027l.f9627B = false;
                return C0880v.f8657a;
            } catch (CancellationException e3) {
                throw e3;
            }
        } catch (Throwable th) {
            c1027l.f9629D = false;
            c1027l.f9634y.b(null);
            c1027l.f9627B = false;
            throw th;
        }
    }
}
