package r1;

import J2.B;
import M2.InterfaceC0344h;
import java.util.concurrent.Callable;
import m2.C0880v;
import q2.InterfaceC1073d;
import r2.EnumC1145a;
import s2.AbstractC1204i;

/* renamed from: r1.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1141d extends AbstractC1204i implements y2.e {

    /* renamed from: l, reason: collision with root package name */
    public int f9925l;

    /* renamed from: m, reason: collision with root package name */
    public /* synthetic */ Object f9926m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ boolean f9927n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ r f9928o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ String[] f9929p;
    public final /* synthetic */ Callable q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1141d(boolean z3, r rVar, String[] strArr, Callable callable, InterfaceC1073d interfaceC1073d) {
        super(2, interfaceC1073d);
        this.f9927n = z3;
        this.f9928o = rVar;
        this.f9929p = strArr;
        this.q = callable;
    }

    @Override // y2.e
    public final Object j(Object obj, Object obj2) {
        return ((C1141d) m((InterfaceC0344h) obj, (InterfaceC1073d) obj2)).p(C0880v.f8657a);
    }

    @Override // s2.AbstractC1196a
    public final InterfaceC1073d m(Object obj, InterfaceC1073d interfaceC1073d) {
        C1141d c1141d = new C1141d(this.f9927n, this.f9928o, this.f9929p, this.q, interfaceC1073d);
        c1141d.f9926m = obj;
        return c1141d;
    }

    @Override // s2.AbstractC1196a
    public final Object p(Object obj) {
        EnumC1145a enumC1145a = EnumC1145a.f10026h;
        int i2 = this.f9925l;
        if (i2 == 0) {
            C1.y.J(obj);
            C1140c c1140c = new C1140c(this.f9927n, this.f9928o, (InterfaceC0344h) this.f9926m, this.f9929p, this.q, null);
            this.f9925l = 1;
            if (B.e(c1140c, this) == enumC1145a) {
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
