package o;

import C1.y;
import m2.C0880v;
import n0.C0919B;
import n0.C0921D;
import n2.AbstractC0946A;
import q2.InterfaceC1073d;
import r2.EnumC1145a;
import s2.AbstractC1204i;

/* renamed from: o.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0978d extends AbstractC1204i implements y2.e {

    /* renamed from: l, reason: collision with root package name */
    public int f9185l;

    /* renamed from: m, reason: collision with root package name */
    public /* synthetic */ Object f9186m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ C0988n f9187n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0978d(C0988n c0988n, InterfaceC1073d interfaceC1073d) {
        super(2, interfaceC1073d);
        this.f9187n = c0988n;
    }

    @Override // y2.e
    public final Object j(Object obj, Object obj2) {
        return ((C0978d) m((C0921D) obj, (InterfaceC1073d) obj2)).p(C0880v.f8657a);
    }

    @Override // s2.AbstractC1196a
    public final InterfaceC1073d m(Object obj, InterfaceC1073d interfaceC1073d) {
        C0978d c0978d = new C0978d(this.f9187n, interfaceC1073d);
        c0978d.f9186m = obj;
        return c0978d;
    }

    @Override // s2.AbstractC1196a
    public final Object p(Object obj) {
        EnumC1145a enumC1145a = EnumC1145a.f10026h;
        int i2 = this.f9185l;
        C0880v c0880v = C0880v.f8657a;
        if (i2 == 0) {
            y.J(obj);
            C0921D c0921d = (C0921D) this.f9186m;
            C0919B c0919b = new C0919B(5, this.f9187n);
            this.f9185l = 1;
            Object e3 = AbstractC0946A.e(c0921d, new C0979e(c0919b, null), this);
            if (e3 != enumC1145a) {
                e3 = c0880v;
            }
            if (e3 == enumC1145a) {
                return enumC1145a;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            y.J(obj);
        }
        return c0880v;
    }
}
