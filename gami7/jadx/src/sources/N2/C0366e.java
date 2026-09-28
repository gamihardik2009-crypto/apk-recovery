package N2;

import J2.InterfaceC0328z;
import M2.InterfaceC0344h;
import M2.P;
import m2.C0880v;
import q2.InterfaceC1073d;
import r2.EnumC1145a;
import s2.AbstractC1204i;

/* renamed from: N2.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0366e extends AbstractC1204i implements y2.e {

    /* renamed from: l, reason: collision with root package name */
    public int f5036l;

    /* renamed from: m, reason: collision with root package name */
    public /* synthetic */ Object f5037m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0344h f5038n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ AbstractC0368g f5039o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0366e(InterfaceC0344h interfaceC0344h, AbstractC0368g abstractC0368g, InterfaceC1073d interfaceC1073d) {
        super(2, interfaceC1073d);
        this.f5038n = interfaceC0344h;
        this.f5039o = abstractC0368g;
    }

    @Override // y2.e
    public final Object j(Object obj, Object obj2) {
        return ((C0366e) m((InterfaceC0328z) obj, (InterfaceC1073d) obj2)).p(C0880v.f8657a);
    }

    @Override // s2.AbstractC1196a
    public final InterfaceC1073d m(Object obj, InterfaceC1073d interfaceC1073d) {
        C0366e c0366e = new C0366e(this.f5038n, this.f5039o, interfaceC1073d);
        c0366e.f5037m = obj;
        return c0366e;
    }

    @Override // s2.AbstractC1196a
    public final Object p(Object obj) {
        EnumC1145a enumC1145a = EnumC1145a.f10026h;
        int i2 = this.f5036l;
        C0880v c0880v = C0880v.f8657a;
        if (i2 == 0) {
            C1.y.J(obj);
            L2.w i3 = this.f5039o.i((InterfaceC0328z) this.f5037m);
            this.f5036l = 1;
            Object h2 = P.h(this.f5038n, i3, true, this);
            if (h2 != enumC1145a) {
                h2 = c0880v;
            }
            if (h2 == enumC1145a) {
                return enumC1145a;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C1.y.J(obj);
        }
        return c0880v;
    }
}
