package n;

import J2.InterfaceC0328z;
import m2.C0880v;
import n2.AbstractC0948C;
import q2.InterfaceC1073d;
import r2.EnumC1145a;
import s2.AbstractC1204i;

/* renamed from: n.H, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0889H extends AbstractC1204i implements y2.e {

    /* renamed from: l, reason: collision with root package name */
    public int f8686l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C0890I f8687m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0889H(C0890I c0890i, InterfaceC1073d interfaceC1073d) {
        super(2, interfaceC1073d);
        this.f8687m = c0890i;
    }

    @Override // y2.e
    public final Object j(Object obj, Object obj2) {
        return ((C0889H) m((InterfaceC0328z) obj, (InterfaceC1073d) obj2)).p(C0880v.f8657a);
    }

    @Override // s2.AbstractC1196a
    public final InterfaceC1073d m(Object obj, InterfaceC1073d interfaceC1073d) {
        return new C0889H(this.f8687m, interfaceC1073d);
    }

    @Override // s2.AbstractC1196a
    public final Object p(Object obj) {
        EnumC1145a enumC1145a = EnumC1145a.f10026h;
        int i2 = this.f8686l;
        if (i2 == 0) {
            C1.y.J(obj);
            this.f8686l = 1;
            if (AbstractC0948C.o(this.f8687m, null, this) == enumC1145a) {
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
