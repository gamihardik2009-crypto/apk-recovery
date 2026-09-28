package M2;

import B.C0002c;
import m2.C0880v;
import q2.InterfaceC1073d;
import r2.EnumC1145a;
import s2.AbstractC1204i;

/* renamed from: M2.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0350n extends AbstractC1204i implements y2.e {

    /* renamed from: l, reason: collision with root package name */
    public int f4903l;

    /* renamed from: m, reason: collision with root package name */
    public /* synthetic */ Object f4904m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0343g f4905n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0350n(InterfaceC0343g interfaceC0343g, InterfaceC1073d interfaceC1073d) {
        super(2, interfaceC1073d);
        this.f4905n = interfaceC0343g;
    }

    @Override // y2.e
    public final Object j(Object obj, Object obj2) {
        return ((C0350n) m((L2.u) obj, (InterfaceC1073d) obj2)).p(C0880v.f8657a);
    }

    @Override // s2.AbstractC1196a
    public final InterfaceC1073d m(Object obj, InterfaceC1073d interfaceC1073d) {
        C0350n c0350n = new C0350n(this.f4905n, interfaceC1073d);
        c0350n.f4904m = obj;
        return c0350n;
    }

    @Override // s2.AbstractC1196a
    public final Object p(Object obj) {
        EnumC1145a enumC1145a = EnumC1145a.f10026h;
        int i2 = this.f4903l;
        if (i2 == 0) {
            C1.y.J(obj);
            C0002c c0002c = new C0002c(1, (L2.u) this.f4904m);
            this.f4903l = 1;
            if (this.f4905n.b(c0002c, this) == enumC1145a) {
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
