package p;

import m2.C0880v;
import q2.InterfaceC1073d;
import r2.EnumC1145a;
import s2.AbstractC1204i;

/* renamed from: p.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1033o extends AbstractC1204i implements y2.e {

    /* renamed from: l, reason: collision with root package name */
    public int f9652l;

    /* renamed from: m, reason: collision with root package name */
    public /* synthetic */ Object f9653m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ r f9654n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ y2.e f9655o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1033o(r rVar, y2.e eVar, InterfaceC1073d interfaceC1073d) {
        super(2, interfaceC1073d);
        this.f9654n = rVar;
        this.f9655o = eVar;
    }

    @Override // y2.e
    public final Object j(Object obj, Object obj2) {
        return ((C1033o) m((InterfaceC1012d0) obj, (InterfaceC1073d) obj2)).p(C0880v.f8657a);
    }

    @Override // s2.AbstractC1196a
    public final InterfaceC1073d m(Object obj, InterfaceC1073d interfaceC1073d) {
        C1033o c1033o = new C1033o(this.f9654n, this.f9655o, interfaceC1073d);
        c1033o.f9653m = obj;
        return c1033o;
    }

    @Override // s2.AbstractC1196a
    public final Object p(Object obj) {
        EnumC1145a enumC1145a = EnumC1145a.f10026h;
        int i2 = this.f9652l;
        r rVar = this.f9654n;
        try {
            if (i2 == 0) {
                C1.y.J(obj);
                InterfaceC1012d0 interfaceC1012d0 = (InterfaceC1012d0) this.f9653m;
                rVar.f9671d.setValue(Boolean.TRUE);
                y2.e eVar = this.f9655o;
                this.f9652l = 1;
                if (eVar.j(interfaceC1012d0, this) == enumC1145a) {
                    return enumC1145a;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C1.y.J(obj);
            }
            rVar.f9671d.setValue(Boolean.FALSE);
            return C0880v.f8657a;
        } catch (Throwable th) {
            rVar.f9671d.setValue(Boolean.FALSE);
            throw th;
        }
    }
}
