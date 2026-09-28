package H;

import J.C0285q;
import m2.C0880v;
import s.C1160M;

/* loaded from: classes.dex */
public final class A5 extends z2.i implements y2.f {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ I0.z f1310i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ r.l f1311j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Z4 f1312k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public A5(I0.z zVar, r.l lVar, Z4 z4) {
        super(3);
        this.f1310i = zVar;
        this.f1311j = lVar;
        this.f1312k = z4;
    }

    @Override // y2.f
    public final Object i(Object obj, Object obj2, Object obj3) {
        y2.e eVar = (y2.e) obj;
        C0285q c0285q = (C0285q) obj2;
        int intValue = ((Number) obj3).intValue();
        if ((intValue & 6) == 0) {
            intValue |= c0285q.i(eVar) ? 4 : 2;
        }
        if ((intValue & 19) == 18 && c0285q.A()) {
            c0285q.P();
        } else {
            K2 k22 = K2.f1666a;
            String str = this.f1310i.f3932a.f500a;
            C0.E e3 = I0.H.f3866h;
            float f3 = 0;
            C1160M c1160m = new C1160M(f3, f3, f3, f3);
            r.l lVar = this.f1311j;
            Z4 z4 = this.f1312k;
            k22.b(str, eVar, true, true, e3, lVar, false, null, null, null, null, null, null, null, z4, c1160m, R.b.b(c0285q, -968963953, new C0148m(lVar, 9, z4)), c0285q, ((intValue << 3) & 112) | 224640, 14352384, 16320);
        }
        return C0880v.f8657a;
    }
}
