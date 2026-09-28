package n;

import H.C0232z1;
import J2.InterfaceC0328z;
import M2.InterfaceC0343g;
import m2.C0880v;
import q2.InterfaceC1073d;
import r2.EnumC1145a;
import s2.AbstractC1204i;

/* renamed from: n.z, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0917z extends AbstractC1204i implements y2.e {

    /* renamed from: l, reason: collision with root package name */
    public int f8899l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C0882A f8900m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0917z(C0882A c0882a, InterfaceC1073d interfaceC1073d) {
        super(2, interfaceC1073d);
        this.f8900m = c0882a;
    }

    @Override // y2.e
    public final Object j(Object obj, Object obj2) {
        return ((C0917z) m((InterfaceC0328z) obj, (InterfaceC1073d) obj2)).p(C0880v.f8657a);
    }

    @Override // s2.AbstractC1196a
    public final InterfaceC1073d m(Object obj, InterfaceC1073d interfaceC1073d) {
        return new C0917z(this.f8900m, interfaceC1073d);
    }

    @Override // s2.AbstractC1196a
    public final Object p(Object obj) {
        EnumC1145a enumC1145a = EnumC1145a.f10026h;
        int i2 = this.f8899l;
        if (i2 == 0) {
            C1.y.J(obj);
            z2.q qVar = new z2.q();
            z2.q qVar2 = new z2.q();
            z2.q qVar3 = new z2.q();
            C0882A c0882a = this.f8900m;
            InterfaceC0343g a3 = c0882a.f8660u.a();
            C0232z1 c0232z1 = new C0232z1(qVar, qVar2, qVar3, c0882a, 2);
            this.f8899l = 1;
            if (a3.b(c0232z1, this) == enumC1145a) {
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
