package t0;

import J.C0257c;
import J.InterfaceC0298x;
import J.X0;
import m2.C0880v;
import r0.InterfaceC1094H;
import u0.AbstractC1296l0;
import u0.V0;

/* renamed from: t0.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1250h extends z2.i implements y2.e {

    /* renamed from: j, reason: collision with root package name */
    public static final C1250h f10580j = new C1250h(2, 0);

    /* renamed from: k, reason: collision with root package name */
    public static final C1250h f10581k = new C1250h(2, 1);

    /* renamed from: l, reason: collision with root package name */
    public static final C1250h f10582l = new C1250h(2, 2);

    /* renamed from: m, reason: collision with root package name */
    public static final C1250h f10583m = new C1250h(2, 3);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f10584i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1250h(int i2, int i3) {
        super(i2);
        this.f10584i = i3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [V.n] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6, types: [V.n] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3, types: [L.d] */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6, types: [L.d] */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9 */
    @Override // y2.e
    public final Object j(Object obj, Object obj2) {
        switch (this.f10584i) {
            case 0:
                ((Number) obj2).intValue();
                ((InterfaceC1253k) obj).getClass();
                break;
            case 1:
                ((C1236E) ((InterfaceC1253k) obj)).a0((InterfaceC1094H) obj2);
                break;
            case 2:
                ((C1236E) ((InterfaceC1253k) obj)).b0((V.o) obj2);
                break;
            default:
                InterfaceC0298x interfaceC0298x = (InterfaceC0298x) obj2;
                C1236E c1236e = (C1236E) ((InterfaceC1253k) obj);
                c1236e.f10376A = interfaceC0298x;
                X0 x02 = AbstractC1296l0.f11087f;
                R.e eVar = (R.e) interfaceC0298x;
                eVar.getClass();
                c1236e.X((O0.b) C0257c.P(eVar, x02));
                c1236e.Y((O0.k) C0257c.P(eVar, AbstractC1296l0.f11093l));
                c1236e.c0((V0) C0257c.P(eVar, AbstractC1296l0.q));
                V.n nVar = (V.n) c1236e.f10378C.f4244f;
                if ((nVar.f5861k & 32768) != 0) {
                    while (nVar != null) {
                        if ((nVar.f5860j & 32768) != 0) {
                            AbstractC1256n abstractC1256n = nVar;
                            ?? r22 = 0;
                            while (abstractC1256n != 0) {
                                if (abstractC1256n instanceof InterfaceC1254l) {
                                    V.n nVar2 = ((V.n) ((InterfaceC1254l) abstractC1256n)).f5858h;
                                    if (nVar2.f5869t) {
                                        a0.d(nVar2);
                                    } else {
                                        nVar2.q = true;
                                    }
                                } else if ((abstractC1256n.f5860j & 32768) != 0 && (abstractC1256n instanceof AbstractC1256n)) {
                                    V.n nVar3 = abstractC1256n.f10608v;
                                    int i2 = 0;
                                    abstractC1256n = abstractC1256n;
                                    r22 = r22;
                                    while (nVar3 != null) {
                                        if ((nVar3.f5860j & 32768) != 0) {
                                            i2++;
                                            r22 = r22;
                                            if (i2 == 1) {
                                                abstractC1256n = nVar3;
                                            } else {
                                                if (r22 == 0) {
                                                    r22 = new L.d(new V.n[16]);
                                                }
                                                if (abstractC1256n != 0) {
                                                    r22.b(abstractC1256n);
                                                    abstractC1256n = 0;
                                                }
                                                r22.b(nVar3);
                                            }
                                        }
                                        nVar3 = nVar3.f5863m;
                                        abstractC1256n = abstractC1256n;
                                        r22 = r22;
                                    }
                                    if (i2 == 1) {
                                    }
                                }
                                abstractC1256n = AbstractC1248f.f(r22);
                            }
                        }
                        if ((nVar.f5861k & 32768) != 0) {
                            nVar = nVar.f5863m;
                        }
                    }
                }
                break;
        }
        return C0880v.f8657a;
    }
}
