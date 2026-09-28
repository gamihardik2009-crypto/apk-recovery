package n;

import m2.C0880v;
import n0.C0921D;
import n2.AbstractC0946A;
import q2.InterfaceC1073d;
import r2.EnumC1145a;
import s2.AbstractC1204i;

/* renamed from: n.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0904l extends AbstractC1204i implements y2.e {

    /* renamed from: l, reason: collision with root package name */
    public int f8800l;

    /* renamed from: m, reason: collision with root package name */
    public /* synthetic */ Object f8801m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ C0905m f8802n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0904l(C0905m c0905m, InterfaceC1073d interfaceC1073d) {
        super(2, interfaceC1073d);
        this.f8802n = c0905m;
    }

    @Override // y2.e
    public final Object j(Object obj, Object obj2) {
        return ((C0904l) m((C0921D) obj, (InterfaceC1073d) obj2)).p(C0880v.f8657a);
    }

    @Override // s2.AbstractC1196a
    public final InterfaceC1073d m(Object obj, InterfaceC1073d interfaceC1073d) {
        C0904l c0904l = new C0904l(this.f8802n, interfaceC1073d);
        c0904l.f8801m = obj;
        return c0904l;
    }

    @Override // s2.AbstractC1196a
    public final Object p(Object obj) {
        EnumC1145a enumC1145a = EnumC1145a.f10026h;
        int i2 = this.f8800l;
        if (i2 == 0) {
            C1.y.J(obj);
            C0921D c0921d = (C0921D) this.f8801m;
            C0903k c0903k = new C0903k(this.f8802n, null);
            this.f8800l = 1;
            if (AbstractC0946A.e(c0921d, c0903k, this) == enumC1145a) {
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
