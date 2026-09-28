package p;

import J2.InterfaceC0328z;
import m2.C0880v;
import q2.InterfaceC1073d;
import r2.EnumC1145a;
import s2.AbstractC1204i;

/* loaded from: classes.dex */
public final class S extends AbstractC1204i implements y2.e {

    /* renamed from: l, reason: collision with root package name */
    public int f9494l;

    /* renamed from: m, reason: collision with root package name */
    public /* synthetic */ Object f9495m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ T f9496n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ long f9497o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public S(T t3, long j3, InterfaceC1073d interfaceC1073d) {
        super(2, interfaceC1073d);
        this.f9496n = t3;
        this.f9497o = j3;
    }

    @Override // y2.e
    public final Object j(Object obj, Object obj2) {
        return ((S) m((InterfaceC0328z) obj, (InterfaceC1073d) obj2)).p(C0880v.f8657a);
    }

    @Override // s2.AbstractC1196a
    public final InterfaceC1073d m(Object obj, InterfaceC1073d interfaceC1073d) {
        S s3 = new S(this.f9496n, this.f9497o, interfaceC1073d);
        s3.f9495m = obj;
        return s3;
    }

    @Override // s2.AbstractC1196a
    public final Object p(Object obj) {
        EnumC1145a enumC1145a = EnumC1145a.f10026h;
        int i2 = this.f9494l;
        if (i2 == 0) {
            C1.y.J(obj);
            InterfaceC0328z interfaceC0328z = (InterfaceC0328z) this.f9495m;
            T t3 = this.f9496n;
            y2.f fVar = t3.f9501I;
            boolean z3 = t3.f9502J;
            long f3 = O0.o.f(z3 ? -1.0f : 1.0f, this.f9497o);
            X x2 = t3.F;
            N n3 = O.f9476a;
            Float f4 = new Float(x2 == X.f9518h ? O0.o.c(f3) : O0.o.b(f3));
            this.f9494l = 1;
            if (fVar.i(interfaceC0328z, f4, this) == enumC1145a) {
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
