package p;

import J2.InterfaceC0328z;
import m2.C0880v;
import q2.InterfaceC1073d;
import r2.EnumC1145a;
import s2.AbstractC1204i;

/* loaded from: classes.dex */
public final class Q extends AbstractC1204i implements y2.e {

    /* renamed from: l, reason: collision with root package name */
    public int f9488l;

    /* renamed from: m, reason: collision with root package name */
    public /* synthetic */ Object f9489m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ T f9490n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ long f9491o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Q(T t3, long j3, InterfaceC1073d interfaceC1073d) {
        super(2, interfaceC1073d);
        this.f9490n = t3;
        this.f9491o = j3;
    }

    @Override // y2.e
    public final Object j(Object obj, Object obj2) {
        return ((Q) m((InterfaceC0328z) obj, (InterfaceC1073d) obj2)).p(C0880v.f8657a);
    }

    @Override // s2.AbstractC1196a
    public final InterfaceC1073d m(Object obj, InterfaceC1073d interfaceC1073d) {
        Q q = new Q(this.f9490n, this.f9491o, interfaceC1073d);
        q.f9489m = obj;
        return q;
    }

    @Override // s2.AbstractC1196a
    public final Object p(Object obj) {
        EnumC1145a enumC1145a = EnumC1145a.f10026h;
        int i2 = this.f9488l;
        if (i2 == 0) {
            C1.y.J(obj);
            InterfaceC0328z interfaceC0328z = (InterfaceC0328z) this.f9489m;
            y2.f fVar = this.f9490n.f9500H;
            b0.c cVar = new b0.c(this.f9491o);
            this.f9488l = 1;
            if (fVar.i(interfaceC0328z, cVar, this) == enumC1145a) {
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
