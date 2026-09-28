package H;

import J.C0257c;
import J.C0285q;
import m2.C0880v;
import s.InterfaceC1159L;

/* loaded from: classes.dex */
public final class J2 extends z2.i implements y2.e {

    /* renamed from: A, reason: collision with root package name */
    public final /* synthetic */ int f1620A;

    /* renamed from: B, reason: collision with root package name */
    public final /* synthetic */ int f1621B;

    /* renamed from: C, reason: collision with root package name */
    public final /* synthetic */ int f1622C;

    /* renamed from: D, reason: collision with root package name */
    public final /* synthetic */ Object f1623D;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f1624i = 0;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ String f1625j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ y2.e f1626k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ I0.I f1627l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ y2.e f1628m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ y2.e f1629n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ y2.e f1630o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ y2.e f1631p;
    public final /* synthetic */ y2.e q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ y2.e f1632r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ y2.e f1633s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ boolean f1634t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ boolean f1635u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ boolean f1636v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ r.k f1637w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1159L f1638x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ Z4 f1639y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ y2.e f1640z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public J2(K2 k22, String str, y2.e eVar, boolean z3, boolean z4, I0.I i2, r.k kVar, boolean z5, y2.e eVar2, y2.e eVar3, y2.e eVar4, y2.e eVar5, y2.e eVar6, y2.e eVar7, y2.e eVar8, Z4 z42, InterfaceC1159L interfaceC1159L, y2.e eVar9, int i3, int i4, int i5) {
        super(2);
        this.f1623D = k22;
        this.f1625j = str;
        this.f1626k = eVar;
        this.f1634t = z3;
        this.f1635u = z4;
        this.f1627l = i2;
        this.f1637w = kVar;
        this.f1636v = z5;
        this.f1628m = eVar2;
        this.f1629n = eVar3;
        this.f1630o = eVar4;
        this.f1631p = eVar5;
        this.q = eVar6;
        this.f1632r = eVar7;
        this.f1633s = eVar8;
        this.f1639y = z42;
        this.f1638x = interfaceC1159L;
        this.f1640z = eVar9;
        this.f1620A = i3;
        this.f1621B = i4;
        this.f1622C = i5;
    }

    @Override // y2.e
    public final Object j(Object obj, Object obj2) {
        C0285q c0285q = (C0285q) obj;
        switch (this.f1624i) {
            case 0:
                ((Number) obj2).intValue();
                int Y2 = C0257c.Y(this.f1620A | 1);
                int Y3 = C0257c.Y(this.f1621B);
                ((K2) this.f1623D).b(this.f1625j, this.f1626k, this.f1634t, this.f1635u, this.f1627l, this.f1637w, this.f1636v, this.f1628m, this.f1629n, this.f1630o, this.f1631p, this.q, this.f1632r, this.f1633s, this.f1639y, this.f1638x, this.f1640z, c0285q, Y2, Y3, this.f1622C);
                break;
            default:
                ((Number) obj2).intValue();
                int Y4 = C0257c.Y(this.f1620A | 1);
                int Y5 = C0257c.Y(this.f1621B);
                AbstractC0140k5.a((r5) this.f1623D, this.f1625j, this.f1626k, this.f1627l, this.f1628m, this.f1629n, this.f1630o, this.f1631p, this.q, this.f1632r, this.f1633s, this.f1634t, this.f1635u, this.f1636v, this.f1637w, this.f1638x, this.f1639y, this.f1640z, c0285q, Y4, Y5, this.f1622C);
                break;
        }
        return C0880v.f8657a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public J2(r5 r5Var, String str, y2.e eVar, I0.I i2, y2.e eVar2, y2.e eVar3, y2.e eVar4, y2.e eVar5, y2.e eVar6, y2.e eVar7, y2.e eVar8, boolean z3, boolean z4, boolean z5, r.k kVar, InterfaceC1159L interfaceC1159L, Z4 z42, y2.e eVar9, int i3, int i4, int i5) {
        super(2);
        this.f1623D = r5Var;
        this.f1625j = str;
        this.f1626k = eVar;
        this.f1627l = i2;
        this.f1628m = eVar2;
        this.f1629n = eVar3;
        this.f1630o = eVar4;
        this.f1631p = eVar5;
        this.q = eVar6;
        this.f1632r = eVar7;
        this.f1633s = eVar8;
        this.f1634t = z3;
        this.f1635u = z4;
        this.f1636v = z5;
        this.f1637w = kVar;
        this.f1638x = interfaceC1159L;
        this.f1639y = z42;
        this.f1640z = eVar9;
        this.f1620A = i3;
        this.f1621B = i4;
        this.f1622C = i5;
    }
}
