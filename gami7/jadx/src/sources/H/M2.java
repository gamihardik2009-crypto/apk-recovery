package H;

import J.C0285q;
import c0.InterfaceC0576P;
import m2.C0880v;

/* loaded from: classes.dex */
public final class M2 extends z2.i implements y2.f {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f1730i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f1731j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ boolean f1732k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ boolean f1733l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ I0.I f1734m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ r.l f1735n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ boolean f1736o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ y2.e f1737p;
    public final /* synthetic */ y2.e q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ y2.e f1738r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ y2.e f1739s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ y2.e f1740t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ y2.e f1741u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ y2.e f1742v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0576P f1743w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Z4 f1744x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ M2(Object obj, boolean z3, boolean z4, I0.I i2, r.l lVar, boolean z5, y2.e eVar, y2.e eVar2, y2.e eVar3, y2.e eVar4, y2.e eVar5, y2.e eVar6, y2.e eVar7, Z4 z42, InterfaceC0576P interfaceC0576P, int i3) {
        super(3);
        this.f1730i = i3;
        this.f1731j = obj;
        this.f1732k = z3;
        this.f1733l = z4;
        this.f1734m = i2;
        this.f1735n = lVar;
        this.f1736o = z5;
        this.f1737p = eVar;
        this.q = eVar2;
        this.f1738r = eVar3;
        this.f1739s = eVar4;
        this.f1740t = eVar5;
        this.f1741u = eVar6;
        this.f1742v = eVar7;
        this.f1744x = z42;
        this.f1743w = interfaceC0576P;
    }

    @Override // y2.f
    public final Object i(Object obj, Object obj2, Object obj3) {
        switch (this.f1730i) {
            case 0:
                y2.e eVar = (y2.e) obj;
                C0285q c0285q = (C0285q) obj2;
                int intValue = ((Number) obj3).intValue();
                if ((intValue & 6) == 0) {
                    intValue |= c0285q.i(eVar) ? 4 : 2;
                }
                int i2 = intValue;
                if ((i2 & 19) == 18 && c0285q.A()) {
                    c0285q.P();
                } else {
                    K2 k22 = K2.f1666a;
                    InterfaceC0576P interfaceC0576P = this.f1743w;
                    boolean z3 = this.f1732k;
                    boolean z4 = this.f1736o;
                    r.l lVar = this.f1735n;
                    Z4 z42 = this.f1744x;
                    k22.b((String) this.f1731j, eVar, z3, this.f1733l, this.f1734m, lVar, z4, this.f1737p, this.q, this.f1738r, this.f1739s, this.f1740t, this.f1741u, this.f1742v, z42, null, R.b.b(c0285q, 2108828640, new L2(z3, z4, lVar, z42, interfaceC0576P, 0)), c0285q, (i2 << 3) & 112, 14155776, 32768);
                }
                break;
            case 1:
                y2.e eVar2 = (y2.e) obj;
                C0285q c0285q2 = (C0285q) obj2;
                int intValue2 = ((Number) obj3).intValue();
                if ((intValue2 & 6) == 0) {
                    intValue2 |= c0285q2.i(eVar2) ? 4 : 2;
                }
                int i3 = intValue2;
                if ((i3 & 19) == 18 && c0285q2.A()) {
                    c0285q2.P();
                } else {
                    C0084c5.f2418a.b((String) this.f1731j, eVar2, this.f1732k, this.f1733l, this.f1734m, this.f1735n, this.f1736o, this.f1737p, this.q, this.f1738r, this.f1739s, this.f1740t, this.f1741u, this.f1742v, this.f1743w, this.f1744x, null, null, c0285q2, (i3 << 3) & 112, 100663296, 196608);
                }
                break;
            default:
                y2.e eVar3 = (y2.e) obj;
                C0285q c0285q3 = (C0285q) obj2;
                int intValue3 = ((Number) obj3).intValue();
                if ((intValue3 & 6) == 0) {
                    intValue3 |= c0285q3.i(eVar3) ? 4 : 2;
                }
                if ((intValue3 & 19) == 18 && c0285q3.A()) {
                    c0285q3.P();
                } else {
                    K2 k23 = K2.f1666a;
                    String str = ((I0.z) this.f1731j).f3932a.f500a;
                    InterfaceC0576P interfaceC0576P2 = this.f1743w;
                    boolean z5 = this.f1732k;
                    boolean z6 = this.f1736o;
                    r.l lVar2 = this.f1735n;
                    Z4 z43 = this.f1744x;
                    k23.b(str, eVar3, z5, this.f1733l, this.f1734m, lVar2, z6, this.f1737p, this.q, this.f1738r, this.f1739s, this.f1740t, this.f1741u, this.f1742v, z43, null, R.b.b(c0285q3, 255570733, new L2(z5, z6, lVar2, z43, interfaceC0576P2, 1)), c0285q3, (intValue3 << 3) & 112, 14155776, 32768);
                }
                break;
        }
        return C0880v.f8657a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public M2(String str, boolean z3, boolean z4, I0.I i2, r.l lVar, boolean z5, y2.e eVar, y2.e eVar2, y2.e eVar3, y2.e eVar4, y2.e eVar5, y2.e eVar6, y2.e eVar7, InterfaceC0576P interfaceC0576P, Z4 z42) {
        super(3);
        this.f1730i = 1;
        this.f1731j = str;
        this.f1732k = z3;
        this.f1733l = z4;
        this.f1734m = i2;
        this.f1735n = lVar;
        this.f1736o = z5;
        this.f1737p = eVar;
        this.q = eVar2;
        this.f1738r = eVar3;
        this.f1739s = eVar4;
        this.f1740t = eVar5;
        this.f1741u = eVar6;
        this.f1742v = eVar7;
        this.f1743w = interfaceC0576P;
        this.f1744x = z42;
    }
}
