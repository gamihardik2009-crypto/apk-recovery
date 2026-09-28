package n;

import m2.C0880v;
import n0.C0921D;
import p.C1006a0;
import p.L0;
import p.b1;
import q2.InterfaceC1073d;
import r2.EnumC1145a;
import s2.AbstractC1204i;

/* renamed from: n.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0901i extends AbstractC1204i implements y2.e {

    /* renamed from: l, reason: collision with root package name */
    public int f8788l;

    /* renamed from: m, reason: collision with root package name */
    public /* synthetic */ Object f8789m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ C0914w f8790n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0901i(C0914w c0914w, InterfaceC1073d interfaceC1073d) {
        super(2, interfaceC1073d);
        this.f8790n = c0914w;
    }

    @Override // y2.e
    public final Object j(Object obj, Object obj2) {
        return ((C0901i) m((C0921D) obj, (InterfaceC1073d) obj2)).p(C0880v.f8657a);
    }

    @Override // s2.AbstractC1196a
    public final InterfaceC1073d m(Object obj, InterfaceC1073d interfaceC1073d) {
        C0901i c0901i = new C0901i(this.f8790n, interfaceC1073d);
        c0901i.f8789m = obj;
        return c0901i;
    }

    @Override // s2.AbstractC1196a
    public final Object p(Object obj) {
        EnumC1145a enumC1145a = EnumC1145a.f10026h;
        int i2 = this.f8788l;
        C0880v c0880v = C0880v.f8657a;
        if (i2 == 0) {
            C1.y.J(obj);
            C0921D c0921d = (C0921D) this.f8789m;
            this.f8788l = 1;
            C0914w c0914w = this.f8790n;
            c0914w.getClass();
            C0913v c0913v = new C0913v(c0914w, null);
            A0.n nVar = new A0.n(28, c0914w);
            p.N n3 = b1.f9568a;
            Object e3 = J2.B.e(new L0(c0921d, c0913v, nVar, new C1006a0(c0921d), null), this);
            if (e3 != enumC1145a) {
                e3 = c0880v;
            }
            if (e3 != enumC1145a) {
                e3 = c0880v;
            }
            if (e3 == enumC1145a) {
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
