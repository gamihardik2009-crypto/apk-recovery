package M2;

import N2.AbstractC0364c;
import m2.C0880v;
import q2.InterfaceC1073d;
import r2.EnumC1145a;
import s2.AbstractC1204i;

/* renamed from: M2.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0348l extends AbstractC1204i implements y2.e {

    /* renamed from: l, reason: collision with root package name */
    public z2.s f4895l;

    /* renamed from: m, reason: collision with root package name */
    public int f4896m;

    /* renamed from: n, reason: collision with root package name */
    public /* synthetic */ Object f4897n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ z2.s f4898o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0344h f4899p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0348l(InterfaceC0344h interfaceC0344h, InterfaceC1073d interfaceC1073d, z2.s sVar) {
        super(2, interfaceC1073d);
        this.f4898o = sVar;
        this.f4899p = interfaceC0344h;
    }

    @Override // y2.e
    public final Object j(Object obj, Object obj2) {
        return ((C0348l) m(new L2.n(((L2.n) obj).f4739a), (InterfaceC1073d) obj2)).p(C0880v.f8657a);
    }

    @Override // s2.AbstractC1196a
    public final InterfaceC1073d m(Object obj, InterfaceC1073d interfaceC1073d) {
        C0348l c0348l = new C0348l(this.f4899p, interfaceC1073d, this.f4898o);
        c0348l.f4897n = obj;
        return c0348l;
    }

    @Override // s2.AbstractC1196a
    public final Object p(Object obj) {
        z2.s sVar;
        z2.s sVar2;
        EnumC1145a enumC1145a = EnumC1145a.f10026h;
        int i2 = this.f4896m;
        if (i2 == 0) {
            C1.y.J(obj);
            Object obj2 = ((L2.n) this.f4897n).f4739a;
            boolean z3 = obj2 instanceof L2.m;
            sVar = this.f4898o;
            if (!z3) {
                sVar.f11909h = obj2;
            }
            if (z3) {
                L2.l lVar = obj2 instanceof L2.l ? (L2.l) obj2 : null;
                Throwable th = lVar != null ? lVar.f4737a : null;
                if (th != null) {
                    throw th;
                }
                Object obj3 = sVar.f11909h;
                if (obj3 != null) {
                    Object obj4 = obj3 != AbstractC0364c.f5033b ? obj3 : null;
                    this.f4897n = obj2;
                    this.f4895l = sVar;
                    this.f4896m = 1;
                    if (this.f4899p.f(obj4, this) == enumC1145a) {
                        return enumC1145a;
                    }
                    sVar2 = sVar;
                }
                sVar.f11909h = AbstractC0364c.f5035d;
            }
            return C0880v.f8657a;
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        sVar2 = this.f4895l;
        C1.y.J(obj);
        sVar = sVar2;
        sVar.f11909h = AbstractC0364c.f5035d;
        return C0880v.f8657a;
    }
}
