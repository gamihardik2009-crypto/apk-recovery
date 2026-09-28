package androidx.lifecycle;

import J2.InterfaceC0328z;
import m2.C0880v;
import q2.InterfaceC1073d;
import r2.EnumC1145a;
import s2.AbstractC1204i;

/* loaded from: classes.dex */
public final class F extends AbstractC1204i implements y2.e {

    /* renamed from: l, reason: collision with root package name */
    public S2.a f6820l;

    /* renamed from: m, reason: collision with root package name */
    public y2.e f6821m;

    /* renamed from: n, reason: collision with root package name */
    public int f6822n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ S2.a f6823o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ y2.e f6824p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public F(S2.a aVar, y2.e eVar, InterfaceC1073d interfaceC1073d) {
        super(2, interfaceC1073d);
        this.f6823o = aVar;
        this.f6824p = eVar;
    }

    @Override // y2.e
    public final Object j(Object obj, Object obj2) {
        return ((F) m((InterfaceC0328z) obj, (InterfaceC1073d) obj2)).p(C0880v.f8657a);
    }

    @Override // s2.AbstractC1196a
    public final InterfaceC1073d m(Object obj, InterfaceC1073d interfaceC1073d) {
        return new F(this.f6823o, this.f6824p, interfaceC1073d);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v3, types: [S2.a] */
    @Override // s2.AbstractC1196a
    public final Object p(Object obj) {
        y2.e eVar;
        S2.d dVar;
        S2.a aVar;
        Throwable th;
        EnumC1145a enumC1145a = EnumC1145a.f10026h;
        int i2 = this.f6822n;
        try {
            if (i2 == 0) {
                C1.y.J(obj);
                S2.a aVar2 = this.f6823o;
                this.f6820l = aVar2;
                eVar = this.f6824p;
                this.f6821m = eVar;
                this.f6822n = 1;
                dVar = (S2.d) aVar2;
                if (dVar.c(null, this) == enumC1145a) {
                    return enumC1145a;
                }
            } else {
                if (i2 != 1) {
                    if (i2 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    aVar = this.f6820l;
                    try {
                        C1.y.J(obj);
                        ((S2.d) aVar).d(null);
                        return C0880v.f8657a;
                    } catch (Throwable th2) {
                        th = th2;
                        ((S2.d) aVar).d(null);
                        throw th;
                    }
                }
                eVar = this.f6821m;
                ?? r3 = this.f6820l;
                C1.y.J(obj);
                dVar = r3;
            }
            E e3 = new E(eVar, null);
            this.f6820l = dVar;
            this.f6821m = null;
            this.f6822n = 2;
            if (J2.B.e(e3, this) == enumC1145a) {
                return enumC1145a;
            }
            aVar = dVar;
            ((S2.d) aVar).d(null);
            return C0880v.f8657a;
        } catch (Throwable th3) {
            aVar = dVar;
            th = th3;
            ((S2.d) aVar).d(null);
            throw th;
        }
    }
}
