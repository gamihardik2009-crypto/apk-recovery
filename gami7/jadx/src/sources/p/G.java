package p;

import C0.C0018a;
import H.C0148m;
import m2.C0880v;
import n0.C0921D;
import o0.C0992b;
import q2.InterfaceC1073d;
import r2.EnumC1145a;
import s2.AbstractC1204i;

/* loaded from: classes.dex */
public final class G extends AbstractC1204i implements y2.e {

    /* renamed from: l, reason: collision with root package name */
    public int f9417l;

    /* renamed from: m, reason: collision with root package name */
    public /* synthetic */ Object f9418m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ M f9419n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public G(M m3, InterfaceC1073d interfaceC1073d) {
        super(2, interfaceC1073d);
        this.f9419n = m3;
    }

    @Override // y2.e
    public final Object j(Object obj, Object obj2) {
        return ((G) m((C0921D) obj, (InterfaceC1073d) obj2)).p(C0880v.f8657a);
    }

    @Override // s2.AbstractC1196a
    public final InterfaceC1073d m(Object obj, InterfaceC1073d interfaceC1073d) {
        G g3 = new G(this.f9419n, interfaceC1073d);
        g3.f9418m = obj;
        return g3;
    }

    @Override // s2.AbstractC1196a
    public final Object p(Object obj) {
        EnumC1145a enumC1145a = EnumC1145a.f10026h;
        int i2 = this.f9417l;
        if (i2 == 0) {
            C1.y.J(obj);
            C0921D c0921d = (C0921D) this.f9418m;
            C0992b c0992b = new C0992b();
            M m3 = this.f9419n;
            E e3 = new E(m3, c0921d, new C0018a(12, m3), new C1007b(c0992b, 1, m3), new F(m3, 0), new F(m3, 1), new C0148m(c0992b, 15, m3), null);
            this.f9417l = 1;
            if (J2.B.e(e3, this) == enumC1145a) {
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
