package G;

import D.J;
import J2.InterfaceC0328z;
import M2.InterfaceC0343g;
import m2.C0880v;
import q2.InterfaceC1073d;
import r2.EnumC1145a;
import s2.AbstractC1204i;

/* loaded from: classes.dex */
public final class f extends AbstractC1204i implements y2.e {

    /* renamed from: l, reason: collision with root package name */
    public int f1151l;

    /* renamed from: m, reason: collision with root package name */
    public /* synthetic */ Object f1152m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ r.k f1153n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ s f1154o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(r.k kVar, s sVar, InterfaceC1073d interfaceC1073d) {
        super(2, interfaceC1073d);
        this.f1153n = kVar;
        this.f1154o = sVar;
    }

    @Override // y2.e
    public final Object j(Object obj, Object obj2) {
        return ((f) m((InterfaceC0328z) obj, (InterfaceC1073d) obj2)).p(C0880v.f8657a);
    }

    @Override // s2.AbstractC1196a
    public final InterfaceC1073d m(Object obj, InterfaceC1073d interfaceC1073d) {
        f fVar = new f(this.f1153n, this.f1154o, interfaceC1073d);
        fVar.f1152m = obj;
        return fVar;
    }

    @Override // s2.AbstractC1196a
    public final Object p(Object obj) {
        EnumC1145a enumC1145a = EnumC1145a.f10026h;
        int i2 = this.f1151l;
        if (i2 == 0) {
            C1.y.J(obj);
            InterfaceC0328z interfaceC0328z = (InterfaceC0328z) this.f1152m;
            InterfaceC0343g a3 = this.f1153n.a();
            J j3 = new J(this.f1154o, 1, interfaceC0328z);
            this.f1151l = 1;
            if (a3.b(j3, this) == enumC1145a) {
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
