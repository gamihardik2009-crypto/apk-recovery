package l;

import H.Q1;
import J.C0284p0;
import J.T0;
import J.W0;
import m.p0;
import m2.C0880v;
import q2.InterfaceC1073d;
import r2.EnumC1145a;
import s2.AbstractC1204i;

/* renamed from: l.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0808q extends AbstractC1204i implements y2.e {

    /* renamed from: l, reason: collision with root package name */
    public int f8233l;

    /* renamed from: m, reason: collision with root package name */
    public /* synthetic */ Object f8234m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ p0 f8235n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ W0 f8236o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0808q(p0 p0Var, W0 w02, InterfaceC1073d interfaceC1073d) {
        super(2, interfaceC1073d);
        this.f8235n = p0Var;
        this.f8236o = w02;
    }

    @Override // y2.e
    public final Object j(Object obj, Object obj2) {
        return ((C0808q) m((C0284p0) obj, (InterfaceC1073d) obj2)).p(C0880v.f8657a);
    }

    @Override // s2.AbstractC1196a
    public final InterfaceC1073d m(Object obj, InterfaceC1073d interfaceC1073d) {
        C0808q c0808q = new C0808q(this.f8235n, this.f8236o, interfaceC1073d);
        c0808q.f8234m = obj;
        return c0808q;
    }

    @Override // s2.AbstractC1196a
    public final Object p(Object obj) {
        EnumC1145a enumC1145a = EnumC1145a.f10026h;
        int i2 = this.f8233l;
        if (i2 == 0) {
            C1.y.J(obj);
            C0284p0 c0284p0 = (C0284p0) this.f8234m;
            p0 p0Var = this.f8235n;
            G1.h hVar = new G1.h(2, new T0(new C0807p(p0Var, 0), null));
            Q1 q12 = new Q1(c0284p0, p0Var, this.f8236o, 4);
            this.f8233l = 1;
            if (hVar.b(q12, this) == enumC1145a) {
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
