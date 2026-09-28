package n;

import J2.InterfaceC0328z;
import m2.C0880v;
import q2.InterfaceC1073d;
import r2.EnumC1145a;
import s2.AbstractC1204i;

/* renamed from: n.F, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0887F extends AbstractC1204i implements y2.e {

    /* renamed from: l, reason: collision with root package name */
    public int f8680l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ r.l f8681m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ r.j f8682n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ J2.J f8683o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0887F(r.l lVar, r.j jVar, J2.J j3, InterfaceC1073d interfaceC1073d) {
        super(2, interfaceC1073d);
        this.f8681m = lVar;
        this.f8682n = jVar;
        this.f8683o = j3;
    }

    @Override // y2.e
    public final Object j(Object obj, Object obj2) {
        return ((C0887F) m((InterfaceC0328z) obj, (InterfaceC1073d) obj2)).p(C0880v.f8657a);
    }

    @Override // s2.AbstractC1196a
    public final InterfaceC1073d m(Object obj, InterfaceC1073d interfaceC1073d) {
        return new C0887F(this.f8681m, this.f8682n, this.f8683o, interfaceC1073d);
    }

    @Override // s2.AbstractC1196a
    public final Object p(Object obj) {
        EnumC1145a enumC1145a = EnumC1145a.f10026h;
        int i2 = this.f8680l;
        if (i2 == 0) {
            C1.y.J(obj);
            this.f8680l = 1;
            if (this.f8681m.b(this.f8682n, this) == enumC1145a) {
                return enumC1145a;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C1.y.J(obj);
        }
        J2.J j3 = this.f8683o;
        if (j3 != null) {
            j3.a();
        }
        return C0880v.f8657a;
    }
}
