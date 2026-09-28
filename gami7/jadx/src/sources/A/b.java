package A;

import C1.y;
import m2.C0880v;
import n0.C0921D;
import n2.AbstractC0946A;
import q2.InterfaceC1073d;
import r2.EnumC1145a;
import s2.AbstractC1204i;

/* loaded from: classes.dex */
public final class b extends AbstractC1204i implements y2.e {

    /* renamed from: l, reason: collision with root package name */
    public int f5l;

    /* renamed from: m, reason: collision with root package name */
    public /* synthetic */ Object f6m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ d f7n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(d dVar, InterfaceC1073d interfaceC1073d) {
        super(2, interfaceC1073d);
        this.f7n = dVar;
    }

    @Override // y2.e
    public final Object j(Object obj, Object obj2) {
        return ((b) m((C0921D) obj, (InterfaceC1073d) obj2)).p(C0880v.f8657a);
    }

    @Override // s2.AbstractC1196a
    public final InterfaceC1073d m(Object obj, InterfaceC1073d interfaceC1073d) {
        b bVar = new b(this.f7n, interfaceC1073d);
        bVar.f6m = obj;
        return bVar;
    }

    @Override // s2.AbstractC1196a
    public final Object p(Object obj) {
        EnumC1145a enumC1145a = EnumC1145a.f10026h;
        int i2 = this.f5l;
        if (i2 == 0) {
            y.J(obj);
            C0921D c0921d = (C0921D) this.f6m;
            a aVar = new a(this.f7n, null);
            this.f5l = 1;
            if (AbstractC0946A.e(c0921d, aVar, this) == enumC1145a) {
                return enumC1145a;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            y.J(obj);
        }
        return C0880v.f8657a;
    }
}
