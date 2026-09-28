package z;

import J.C0275l;
import J.C0285q;
import M2.C0346j;
import m2.C0880v;

/* renamed from: z.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1411b extends z2.i implements y2.f {

    /* renamed from: j, reason: collision with root package name */
    public static final C1411b f11619j = new C1411b(3, 0);

    /* renamed from: k, reason: collision with root package name */
    public static final C1411b f11620k = new C1411b(3, 1);

    /* renamed from: l, reason: collision with root package name */
    public static final C1411b f11621l = new C1411b(3, 2);

    /* renamed from: m, reason: collision with root package name */
    public static final C1411b f11622m = new C1411b(3, 3);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f11623i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1411b(int i2, int i3) {
        super(i2);
        this.f11623i = i3;
    }

    @Override // y2.f
    public final Object i(Object obj, Object obj2, Object obj3) {
        switch (this.f11623i) {
            case 0:
                V.o oVar = (V.o) obj;
                C0285q c0285q = (C0285q) obj2;
                ((Number) obj3).intValue();
                c0285q.U(-2126899193);
                long j3 = ((D.g0) c0285q.l(D.h0.f857a)).f851a;
                V.l lVar = V.l.f5857b;
                boolean f3 = c0285q.f(j3);
                Object K3 = c0285q.K();
                if (f3 || K3 == C0275l.f4150a) {
                    K3 = new C0346j(j3, 1);
                    c0285q.e0(K3);
                }
                V.o k3 = oVar.k(androidx.compose.ui.draw.a.b(lVar, (y2.c) K3));
                c0285q.r(false);
                break;
            case 1:
                y2.e eVar = (y2.e) obj;
                C0285q c0285q2 = (C0285q) obj2;
                int intValue = ((Number) obj3).intValue();
                if ((intValue & 6) == 0) {
                    intValue |= c0285q2.i(eVar) ? 4 : 2;
                }
                if ((intValue & 19) == 18 && c0285q2.A()) {
                    c0285q2.P();
                } else {
                    eVar.j(c0285q2, Integer.valueOf(intValue & 14));
                }
                break;
            case 2:
                y2.e eVar2 = (y2.e) obj;
                C0285q c0285q3 = (C0285q) obj2;
                int intValue2 = ((Number) obj3).intValue();
                if ((intValue2 & 6) == 0) {
                    intValue2 |= c0285q3.i(eVar2) ? 4 : 2;
                }
                if ((intValue2 & 19) == 18 && c0285q3.A()) {
                    c0285q3.P();
                } else {
                    eVar2.j(c0285q3, Integer.valueOf(intValue2 & 14));
                }
                break;
            default:
                y2.e eVar3 = (y2.e) obj;
                C0285q c0285q4 = (C0285q) obj2;
                int intValue3 = ((Number) obj3).intValue();
                if ((intValue3 & 6) == 0) {
                    intValue3 |= c0285q4.i(eVar3) ? 4 : 2;
                }
                if ((intValue3 & 19) == 18 && c0285q4.A()) {
                    c0285q4.P();
                } else {
                    eVar3.j(c0285q4, Integer.valueOf(intValue3 & 14));
                }
                break;
        }
        return C0880v.f8657a;
    }
}
