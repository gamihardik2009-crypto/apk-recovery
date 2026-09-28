package n;

import J2.InterfaceC0328z;
import m2.C0880v;
import q2.InterfaceC1073d;
import r2.EnumC1145a;
import s2.AbstractC1204i;

/* renamed from: n.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0893a extends AbstractC1204i implements y2.e {

    /* renamed from: l, reason: collision with root package name */
    public int f8725l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ r.l f8726m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ r.h f8727n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0893a(r.l lVar, r.h hVar, InterfaceC1073d interfaceC1073d) {
        super(2, interfaceC1073d);
        this.f8726m = lVar;
        this.f8727n = hVar;
    }

    @Override // y2.e
    public final Object j(Object obj, Object obj2) {
        return ((C0893a) m((InterfaceC0328z) obj, (InterfaceC1073d) obj2)).p(C0880v.f8657a);
    }

    @Override // s2.AbstractC1196a
    public final InterfaceC1073d m(Object obj, InterfaceC1073d interfaceC1073d) {
        return new C0893a(this.f8726m, this.f8727n, interfaceC1073d);
    }

    @Override // s2.AbstractC1196a
    public final Object p(Object obj) {
        EnumC1145a enumC1145a = EnumC1145a.f10026h;
        int i2 = this.f8725l;
        if (i2 == 0) {
            C1.y.J(obj);
            this.f8725l = 1;
            if (this.f8726m.b(this.f8727n, this) == enumC1145a) {
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
