package H;

import J.C0257c;
import J.C0285q;
import c0.InterfaceC0576P;
import m2.C0880v;

/* loaded from: classes.dex */
public final class G4 extends z2.i implements y2.e {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.foundation.layout.b f1526i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ boolean f1527j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ boolean f1528k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C0229y4 f1529l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ J.W0 f1530m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ y2.e f1531n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ r.k f1532o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0576P f1533p;
    public final /* synthetic */ float q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ float f1534r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ float f1535s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ int f1536t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f1537u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public G4(androidx.compose.foundation.layout.b bVar, boolean z3, boolean z4, C0229y4 c0229y4, J.W0 w02, y2.e eVar, r.k kVar, InterfaceC0576P interfaceC0576P, float f3, float f4, float f5, int i2, int i3) {
        super(2);
        this.f1526i = bVar;
        this.f1527j = z3;
        this.f1528k = z4;
        this.f1529l = c0229y4;
        this.f1530m = w02;
        this.f1531n = eVar;
        this.f1532o = kVar;
        this.f1533p = interfaceC0576P;
        this.q = f3;
        this.f1534r = f4;
        this.f1535s = f5;
        this.f1536t = i2;
        this.f1537u = i3;
    }

    @Override // y2.e
    public final Object j(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int Y2 = C0257c.Y(this.f1536t | 1);
        int Y3 = C0257c.Y(this.f1537u);
        float f3 = this.f1534r;
        float f4 = this.f1535s;
        H4.b(this.f1526i, this.f1527j, this.f1528k, this.f1529l, this.f1530m, this.f1531n, this.f1532o, this.f1533p, this.q, f3, f4, (C0285q) obj, Y2, Y3);
        return C0880v.f8657a;
    }
}
