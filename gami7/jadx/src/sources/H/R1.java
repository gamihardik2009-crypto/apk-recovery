package H;

import J2.InterfaceC0328z;
import M2.InterfaceC0343g;
import java.util.ArrayList;
import m2.C0880v;
import q2.InterfaceC1073d;
import r2.EnumC1145a;
import s2.AbstractC1204i;

/* loaded from: classes.dex */
public final class R1 extends AbstractC1204i implements y2.e {

    /* renamed from: l, reason: collision with root package name */
    public int f1945l;

    /* renamed from: m, reason: collision with root package name */
    public /* synthetic */ Object f1946m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ r.k f1947n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ V1 f1948o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public R1(r.k kVar, V1 v12, InterfaceC1073d interfaceC1073d) {
        super(2, interfaceC1073d);
        this.f1947n = kVar;
        this.f1948o = v12;
    }

    @Override // y2.e
    public final Object j(Object obj, Object obj2) {
        return ((R1) m((InterfaceC0328z) obj, (InterfaceC1073d) obj2)).p(C0880v.f8657a);
    }

    @Override // s2.AbstractC1196a
    public final InterfaceC1073d m(Object obj, InterfaceC1073d interfaceC1073d) {
        R1 r12 = new R1(this.f1947n, this.f1948o, interfaceC1073d);
        r12.f1946m = obj;
        return r12;
    }

    @Override // s2.AbstractC1196a
    public final Object p(Object obj) {
        EnumC1145a enumC1145a = EnumC1145a.f10026h;
        int i2 = this.f1945l;
        if (i2 == 0) {
            C1.y.J(obj);
            InterfaceC0328z interfaceC0328z = (InterfaceC0328z) this.f1946m;
            ArrayList arrayList = new ArrayList();
            InterfaceC0343g a3 = this.f1947n.a();
            Q1 q12 = new Q1(arrayList, interfaceC0328z, this.f1948o, 0);
            this.f1945l = 1;
            if (a3.b(q12, this) == enumC1145a) {
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
