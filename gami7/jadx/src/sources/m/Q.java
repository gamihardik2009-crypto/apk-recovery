package m;

import J2.InterfaceC0328z;
import m2.C0880v;
import q2.InterfaceC1073d;
import r2.EnumC1145a;
import s2.AbstractC1204i;

/* loaded from: classes.dex */
public final class Q extends AbstractC1204i implements y2.e {

    /* renamed from: l, reason: collision with root package name */
    public int f8345l;

    /* renamed from: m, reason: collision with root package name */
    public /* synthetic */ Object f8346m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Object f8347n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Object f8348o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ W f8349p;
    public final /* synthetic */ p0 q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ float f8350r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Q(Object obj, Object obj2, W w2, p0 p0Var, float f3, InterfaceC1073d interfaceC1073d) {
        super(2, interfaceC1073d);
        this.f8347n = obj;
        this.f8348o = obj2;
        this.f8349p = w2;
        this.q = p0Var;
        this.f8350r = f3;
    }

    @Override // y2.e
    public final Object j(Object obj, Object obj2) {
        return ((Q) m((InterfaceC0328z) obj, (InterfaceC1073d) obj2)).p(C0880v.f8657a);
    }

    @Override // s2.AbstractC1196a
    public final InterfaceC1073d m(Object obj, InterfaceC1073d interfaceC1073d) {
        Q q = new Q(this.f8347n, this.f8348o, this.f8349p, this.q, this.f8350r, interfaceC1073d);
        q.f8346m = obj;
        return q;
    }

    @Override // s2.AbstractC1196a
    public final Object p(Object obj) {
        EnumC1145a enumC1145a = EnumC1145a.f10026h;
        int i2 = this.f8345l;
        C0880v c0880v = C0880v.f8657a;
        W w2 = this.f8349p;
        if (i2 == 0) {
            C1.y.J(obj);
            InterfaceC0328z interfaceC0328z = (InterfaceC0328z) this.f8346m;
            Object obj2 = this.f8347n;
            Object obj3 = this.f8348o;
            if (z2.h.a(obj2, obj3)) {
                w2.f8383u = null;
                if (z2.h.a(w2.f8373j.getValue(), obj2)) {
                    return c0880v;
                }
            } else {
                W.m(w2);
            }
            boolean a3 = z2.h.a(obj2, obj3);
            float f3 = this.f8350r;
            if (!a3) {
                p0 p0Var = this.q;
                p0Var.q(obj2);
                p0Var.o(0L);
                w2.f8372i.setValue(obj2);
                p0Var.j(f3);
            }
            w2.v(f3);
            if (w2.f8382t.f8058b != 0) {
                J2.B.r(interfaceC0328z, null, 0, new P(w2, null), 3);
            } else {
                w2.f8381s = Long.MIN_VALUE;
            }
            this.f8345l = 1;
            if (W.q(w2, this) == enumC1145a) {
                return enumC1145a;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C1.y.J(obj);
        }
        w2.u();
        return c0880v;
    }
}
