package H;

import J2.InterfaceC0328z;
import m2.C0880v;
import q2.InterfaceC1073d;
import r2.EnumC1145a;
import s2.AbstractC1204i;
import t.C1228w;

/* loaded from: classes.dex */
public final class T0 extends AbstractC1204i implements y2.e {

    /* renamed from: l, reason: collision with root package name */
    public int f1995l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C1228w f1996m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f1997n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ E2.d f1998o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ K f1999p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public T0(C1228w c1228w, int i2, E2.d dVar, K k3, InterfaceC1073d interfaceC1073d) {
        super(2, interfaceC1073d);
        this.f1996m = c1228w;
        this.f1997n = i2;
        this.f1998o = dVar;
        this.f1999p = k3;
    }

    @Override // y2.e
    public final Object j(Object obj, Object obj2) {
        return ((T0) m((InterfaceC0328z) obj, (InterfaceC1073d) obj2)).p(C0880v.f8657a);
    }

    @Override // s2.AbstractC1196a
    public final InterfaceC1073d m(Object obj, InterfaceC1073d interfaceC1073d) {
        return new T0(this.f1996m, this.f1997n, this.f1998o, this.f1999p, interfaceC1073d);
    }

    @Override // s2.AbstractC1196a
    public final Object p(Object obj) {
        EnumC1145a enumC1145a = EnumC1145a.f10026h;
        int i2 = this.f1995l;
        if (i2 == 0) {
            C1.y.J(obj);
            int i3 = (((this.f1997n - this.f1998o.f1076h) * 12) + this.f1999p.f1654b) - 1;
            this.f1995l = 1;
            if (C1228w.j(this.f1996m, i3, this) == enumC1145a) {
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
