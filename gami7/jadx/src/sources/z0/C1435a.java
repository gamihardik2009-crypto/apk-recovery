package z0;

import C1.y;
import D0.n;
import J2.InterfaceC0328z;
import m2.C0880v;
import q2.InterfaceC1073d;
import r2.EnumC1145a;
import s2.AbstractC1204i;

/* renamed from: z0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1435a extends AbstractC1204i implements y2.e {

    /* renamed from: l, reason: collision with root package name */
    public int f11849l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ f f11850m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Runnable f11851n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1435a(f fVar, Runnable runnable, InterfaceC1073d interfaceC1073d) {
        super(2, interfaceC1073d);
        this.f11850m = fVar;
        this.f11851n = runnable;
    }

    @Override // y2.e
    public final Object j(Object obj, Object obj2) {
        return ((C1435a) m((InterfaceC0328z) obj, (InterfaceC1073d) obj2)).p(C0880v.f8657a);
    }

    @Override // s2.AbstractC1196a
    public final InterfaceC1073d m(Object obj, InterfaceC1073d interfaceC1073d) {
        return new C1435a(this.f11850m, this.f11851n, interfaceC1073d);
    }

    @Override // s2.AbstractC1196a
    public final Object p(Object obj) {
        EnumC1145a enumC1145a = EnumC1145a.f10026h;
        int i2 = this.f11849l;
        C0880v c0880v = C0880v.f8657a;
        f fVar = this.f11850m;
        if (i2 == 0) {
            y.J(obj);
            n nVar = fVar.f11876e;
            this.f11849l = 1;
            Object b3 = nVar.b(0.0f - nVar.f974b, this);
            if (b3 != enumC1145a) {
                b3 = c0880v;
            }
            if (b3 == enumC1145a) {
                return enumC1145a;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            y.J(obj);
        }
        j jVar = fVar.f11874c;
        jVar.f11883a.setValue(Boolean.FALSE);
        this.f11851n.run();
        return c0880v;
    }
}
