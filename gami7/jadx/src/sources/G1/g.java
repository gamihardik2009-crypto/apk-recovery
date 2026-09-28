package G1;

import C1.y;
import M2.InterfaceC0344h;
import m2.C0880v;
import q2.InterfaceC1073d;
import r2.EnumC1145a;
import s2.AbstractC1204i;

/* loaded from: classes.dex */
public final class g extends AbstractC1204i implements y2.f {

    /* renamed from: l, reason: collision with root package name */
    public int f1236l;

    /* renamed from: m, reason: collision with root package name */
    public /* synthetic */ InterfaceC0344h f1237m;

    /* renamed from: n, reason: collision with root package name */
    public /* synthetic */ Object[] f1238n;

    @Override // y2.f
    public final Object i(Object obj, Object obj2, Object obj3) {
        g gVar = new g(3, (InterfaceC1073d) obj3);
        gVar.f1237m = (InterfaceC0344h) obj;
        gVar.f1238n = (Object[]) obj2;
        return gVar.p(C0880v.f8657a);
    }

    @Override // s2.AbstractC1196a
    public final Object p(Object obj) {
        c cVar;
        c cVar2;
        EnumC1145a enumC1145a = EnumC1145a.f10026h;
        int i2 = this.f1236l;
        if (i2 == 0) {
            y.J(obj);
            InterfaceC0344h interfaceC0344h = this.f1237m;
            c[] cVarArr = (c[]) this.f1238n;
            int length = cVarArr.length;
            int i3 = 0;
            while (true) {
                cVar = a.f1229a;
                if (i3 >= length) {
                    cVar2 = null;
                    break;
                }
                cVar2 = cVarArr[i3];
                if (!z2.h.a(cVar2, cVar)) {
                    break;
                }
                i3++;
            }
            if (cVar2 != null) {
                cVar = cVar2;
            }
            this.f1236l = 1;
            if (interfaceC0344h.f(cVar, this) == enumC1145a) {
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
