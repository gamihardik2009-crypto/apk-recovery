package p;

import m.AbstractC0831e;
import m2.C0880v;
import q2.InterfaceC1073d;
import r2.EnumC1145a;
import s2.AbstractC1204i;

/* renamed from: p.j0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1024j0 extends AbstractC1204i implements y2.e {

    /* renamed from: l, reason: collision with root package name */
    public int f9612l;

    /* renamed from: m, reason: collision with root package name */
    public /* synthetic */ Object f9613m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ C0 f9614n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ long f9615o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ z2.p f9616p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1024j0(C0 c02, long j3, z2.p pVar, InterfaceC1073d interfaceC1073d) {
        super(2, interfaceC1073d);
        this.f9614n = c02;
        this.f9615o = j3;
        this.f9616p = pVar;
    }

    @Override // y2.e
    public final Object j(Object obj, Object obj2) {
        return ((C1024j0) m((C1055z0) obj, (InterfaceC1073d) obj2)).p(C0880v.f8657a);
    }

    @Override // s2.AbstractC1196a
    public final InterfaceC1073d m(Object obj, InterfaceC1073d interfaceC1073d) {
        C1024j0 c1024j0 = new C1024j0(this.f9614n, this.f9615o, this.f9616p, interfaceC1073d);
        c1024j0.f9613m = obj;
        return c1024j0;
    }

    @Override // s2.AbstractC1196a
    public final Object p(Object obj) {
        EnumC1145a enumC1145a = EnumC1145a.f10026h;
        int i2 = this.f9612l;
        if (i2 == 0) {
            C1.y.J(obj);
            C1055z0 c1055z0 = (C1055z0) this.f9613m;
            C0 c02 = this.f9614n;
            float f3 = c02.f(this.f9615o);
            H.F0 f02 = new H.F0(this.f9616p, c02, c1055z0, 4);
            this.f9612l = 1;
            if (AbstractC0831e.d(0.0f, f3, null, f02, this, 12) == enumC1145a) {
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
