package p;

import m2.C0880v;
import q2.InterfaceC1073d;
import r2.EnumC1145a;
import s2.AbstractC1204i;

/* loaded from: classes.dex */
public final class B0 extends AbstractC1204i implements y2.e {

    /* renamed from: l, reason: collision with root package name */
    public int f9376l;

    /* renamed from: m, reason: collision with root package name */
    public /* synthetic */ Object f9377m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ C0 f9378n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ y2.e f9379o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B0(C0 c02, InterfaceC1073d interfaceC1073d, y2.e eVar) {
        super(2, interfaceC1073d);
        this.f9378n = c02;
        this.f9379o = eVar;
    }

    @Override // y2.e
    public final Object j(Object obj, Object obj2) {
        return ((B0) m((InterfaceC1012d0) obj, (InterfaceC1073d) obj2)).p(C0880v.f8657a);
    }

    @Override // s2.AbstractC1196a
    public final InterfaceC1073d m(Object obj, InterfaceC1073d interfaceC1073d) {
        B0 b02 = new B0(this.f9378n, interfaceC1073d, this.f9379o);
        b02.f9377m = obj;
        return b02;
    }

    @Override // s2.AbstractC1196a
    public final Object p(Object obj) {
        EnumC1145a enumC1145a = EnumC1145a.f10026h;
        int i2 = this.f9376l;
        if (i2 == 0) {
            C1.y.J(obj);
            InterfaceC1012d0 interfaceC1012d0 = (InterfaceC1012d0) this.f9377m;
            C0 c02 = this.f9378n;
            c02.f9391h = interfaceC1012d0;
            C1055z0 c1055z0 = c02.f9392i;
            this.f9376l = 1;
            if (this.f9379o.j(c1055z0, this) == enumC1145a) {
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
