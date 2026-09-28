package H;

import J.C0257c;
import J.C0285q;
import l.C0790E;
import l.C0791F;
import m2.C0880v;

/* loaded from: classes.dex */
public final class P0 extends z2.i implements y2.e {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f1872i = 0;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ V.o f1873j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ boolean f1874k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f1875l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f1876m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Object f1877n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Object f1878o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ Object f1879p;
    public final /* synthetic */ Object q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Object f1880r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public P0(B1 b12, V.o oVar, J0 j02, y2.e eVar, y2.e eVar2, boolean z3, B0 b02, int i2, int i3) {
        super(2);
        this.f1877n = b12;
        this.f1873j = oVar;
        this.f1878o = j02;
        this.f1879p = eVar;
        this.q = eVar2;
        this.f1874k = z3;
        this.f1880r = b02;
        this.f1875l = i2;
        this.f1876m = i3;
    }

    @Override // y2.e
    public final Object j(Object obj, Object obj2) {
        switch (this.f1872i) {
            case 0:
                ((Number) obj2).intValue();
                int Y2 = C0257c.Y(this.f1875l | 1);
                boolean z3 = this.f1874k;
                B0 b02 = (B0) this.f1880r;
                A1.b((B1) this.f1877n, this.f1873j, (J0) this.f1878o, (y2.e) this.f1879p, (y2.e) this.q, z3, b02, (C0285q) obj, Y2, this.f1876m);
                break;
            case 1:
                ((Number) obj2).intValue();
                int Y3 = C0257c.Y(this.f1875l | 1);
                y2.f fVar = (y2.f) this.q;
                y2.f fVar2 = (y2.f) this.f1880r;
                M3.c((P3) this.f1877n, this.f1873j, this.f1874k, (C0210v3) this.f1878o, (r.l) this.f1879p, fVar, fVar2, (C0285q) obj, Y3, this.f1876m);
                break;
            default:
                ((Number) obj2).intValue();
                int Y4 = C0257c.Y(this.f1875l | 1);
                String str = (String) this.q;
                y2.f fVar3 = (y2.f) this.f1880r;
                androidx.compose.animation.a.b((s.T) this.f1877n, this.f1874k, this.f1873j, (C0790E) this.f1878o, (C0791F) this.f1879p, str, fVar3, (C0285q) obj, Y4, this.f1876m);
                break;
        }
        return C0880v.f8657a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public P0(P3 p3, V.o oVar, boolean z3, C0210v3 c0210v3, r.l lVar, y2.f fVar, y2.f fVar2, int i2, int i3) {
        super(2);
        this.f1877n = p3;
        this.f1873j = oVar;
        this.f1874k = z3;
        this.f1878o = c0210v3;
        this.f1879p = lVar;
        this.q = fVar;
        this.f1880r = fVar2;
        this.f1875l = i2;
        this.f1876m = i3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public P0(s.T t3, boolean z3, V.o oVar, C0790E c0790e, C0791F c0791f, String str, y2.f fVar, int i2, int i3) {
        super(2);
        this.f1877n = t3;
        this.f1874k = z3;
        this.f1873j = oVar;
        this.f1878o = c0790e;
        this.f1879p = c0791f;
        this.q = str;
        this.f1880r = fVar;
        this.f1875l = i2;
        this.f1876m = i3;
    }
}
