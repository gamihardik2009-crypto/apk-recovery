package W1;

import J2.InterfaceC0328z;
import m2.C0880v;
import n2.AbstractC0949a;
import q2.InterfaceC1073d;
import r2.EnumC1145a;
import s2.AbstractC1204i;

/* loaded from: classes.dex */
public final class O extends AbstractC1204i implements y2.e {

    /* renamed from: l, reason: collision with root package name */
    public int f5955l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ P f5956m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ R1.b f5957n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ String f5958o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public O(P p3, R1.b bVar, String str, InterfaceC1073d interfaceC1073d) {
        super(2, interfaceC1073d);
        this.f5956m = p3;
        this.f5957n = bVar;
        this.f5958o = str;
    }

    @Override // y2.e
    public final Object j(Object obj, Object obj2) {
        return ((O) m((InterfaceC0328z) obj, (InterfaceC1073d) obj2)).p(C0880v.f8657a);
    }

    @Override // s2.AbstractC1196a
    public final InterfaceC1073d m(Object obj, InterfaceC1073d interfaceC1073d) {
        return new O(this.f5956m, this.f5957n, this.f5958o, interfaceC1073d);
    }

    @Override // s2.AbstractC1196a
    public final Object p(Object obj) {
        EnumC1145a enumC1145a = EnumC1145a.f10026h;
        int i2 = this.f5955l;
        C0880v c0880v = C0880v.f8657a;
        P p3 = this.f5956m;
        if (i2 == 0) {
            C1.y.J(obj);
            Q1.p pVar = p3.f5959b;
            R1.b a3 = R1.b.a(this.f5957n, null, this.f5958o, false, 251);
            this.f5955l = 1;
            Q1.e q = pVar.f5312a.q();
            q.getClass();
            Object k3 = AbstractC0949a.k((r1.r) q.f5277a, new Q1.c(q, a3, 2), this);
            if (k3 != enumC1145a) {
                k3 = c0880v;
            }
            if (k3 == enumC1145a) {
                return enumC1145a;
            }
        } else {
            if (i2 != 1) {
                if (i2 == 2) {
                    C1.y.J(obj);
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C1.y.J(obj);
        }
        Q1.p pVar2 = p3.f5959b;
        this.f5955l = 2;
        return pVar2.f(this) == enumC1145a ? enumC1145a : c0880v;
    }
}
