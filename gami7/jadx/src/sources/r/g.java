package r;

import C1.y;
import J.InterfaceC0258c0;
import J2.InterfaceC0328z;
import M2.InterfaceC0343g;
import java.util.ArrayList;
import m2.C0880v;
import q2.InterfaceC1073d;
import r2.EnumC1145a;
import s2.AbstractC1204i;

/* loaded from: classes.dex */
public final class g extends AbstractC1204i implements y2.e {

    /* renamed from: l, reason: collision with root package name */
    public int f9793l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ k f9794m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0258c0 f9795n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(k kVar, InterfaceC0258c0 interfaceC0258c0, InterfaceC1073d interfaceC1073d) {
        super(2, interfaceC1073d);
        this.f9794m = kVar;
        this.f9795n = interfaceC0258c0;
    }

    @Override // y2.e
    public final Object j(Object obj, Object obj2) {
        return ((g) m((InterfaceC0328z) obj, (InterfaceC1073d) obj2)).p(C0880v.f8657a);
    }

    @Override // s2.AbstractC1196a
    public final InterfaceC1073d m(Object obj, InterfaceC1073d interfaceC1073d) {
        return new g(this.f9794m, this.f9795n, interfaceC1073d);
    }

    @Override // s2.AbstractC1196a
    public final Object p(Object obj) {
        EnumC1145a enumC1145a = EnumC1145a.f10026h;
        int i2 = this.f9793l;
        if (i2 == 0) {
            y.J(obj);
            ArrayList arrayList = new ArrayList();
            InterfaceC0343g a3 = this.f9794m.a();
            C1086f c1086f = new C1086f(arrayList, this.f9795n, 0);
            this.f9793l = 1;
            if (a3.b(c1086f, this) == enumC1145a) {
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
