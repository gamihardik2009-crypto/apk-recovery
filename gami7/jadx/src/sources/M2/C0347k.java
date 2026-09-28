package M2;

import N2.AbstractC0364c;
import m2.C0880v;
import q2.InterfaceC1073d;
import r2.EnumC1145a;
import s2.AbstractC1204i;

/* renamed from: M2.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0347k extends AbstractC1204i implements y2.c {

    /* renamed from: l, reason: collision with root package name */
    public int f4892l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0344h f4893m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ z2.s f4894n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0347k(InterfaceC0344h interfaceC0344h, InterfaceC1073d interfaceC1073d, z2.s sVar) {
        super(1, interfaceC1073d);
        this.f4893m = interfaceC0344h;
        this.f4894n = sVar;
    }

    @Override // y2.c
    public final Object l(Object obj) {
        return new C0347k(this.f4893m, (InterfaceC1073d) obj, this.f4894n).p(C0880v.f8657a);
    }

    @Override // s2.AbstractC1196a
    public final Object p(Object obj) {
        EnumC1145a enumC1145a = EnumC1145a.f10026h;
        int i2 = this.f4892l;
        z2.s sVar = this.f4894n;
        if (i2 == 0) {
            C1.y.J(obj);
            O2.v vVar = AbstractC0364c.f5033b;
            Object obj2 = sVar.f11909h;
            if (obj2 == vVar) {
                obj2 = null;
            }
            this.f4892l = 1;
            if (this.f4893m.f(obj2, this) == enumC1145a) {
                return enumC1145a;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C1.y.J(obj);
        }
        sVar.f11909h = null;
        return C0880v.f8657a;
    }
}
