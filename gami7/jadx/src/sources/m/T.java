package m;

import J.C0274k0;
import m2.C0880v;
import q2.InterfaceC1073d;
import r2.EnumC1145a;
import s2.AbstractC1204i;

/* loaded from: classes.dex */
public final class T extends AbstractC1204i implements y2.c {

    /* renamed from: l, reason: collision with root package name */
    public int f8356l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ W f8357m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Object f8358n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ p0 f8359o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public T(W w2, Object obj, p0 p0Var, InterfaceC1073d interfaceC1073d) {
        super(1, interfaceC1073d);
        this.f8357m = w2;
        this.f8358n = obj;
        this.f8359o = p0Var;
    }

    @Override // y2.c
    public final Object l(Object obj) {
        return new T(this.f8357m, this.f8358n, this.f8359o, (InterfaceC1073d) obj).p(C0880v.f8657a);
    }

    @Override // s2.AbstractC1196a
    public final Object p(Object obj) {
        EnumC1145a enumC1145a = EnumC1145a.f10026h;
        int i2 = this.f8356l;
        p0 p0Var = this.f8359o;
        if (i2 == 0) {
            C1.y.J(obj);
            W w2 = this.f8357m;
            w2.s();
            w2.f8381s = Long.MIN_VALUE;
            w2.v(0.0f);
            Object value = w2.f8373j.getValue();
            Object obj2 = this.f8358n;
            boolean a3 = z2.h.a(obj2, value);
            C0274k0 c0274k0 = w2.f8372i;
            float f3 = a3 ? -4.0f : z2.h.a(obj2, c0274k0.getValue()) ? -5.0f : -3.0f;
            p0Var.q(obj2);
            p0Var.o(0L);
            c0274k0.setValue(obj2);
            w2.v(0.0f);
            w2.j(obj2);
            p0Var.j(f3);
            if (f3 == -3.0f) {
                this.f8356l = 1;
                if (W.q(w2, this) == enumC1145a) {
                    return enumC1145a;
                }
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C1.y.J(obj);
        }
        p0Var.i();
        return C0880v.f8657a;
    }
}
