package H;

import J.C0257c;
import J.C0285q;
import l.C0790E;
import l.C0791F;
import m2.C0880v;
import o.AbstractC0990p;
import o.C0976b;
import o.C0988n;

/* loaded from: classes.dex */
public final class U extends z2.i implements y2.e {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f2021i = 0;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f2022j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ V.o f2023k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ boolean f2024l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Object f2025m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f2026n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f2027o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ Object f2028p;
    public final /* synthetic */ Object q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public U(B0.a aVar, y2.a aVar2, V.o oVar, boolean z3, O o3, r.l lVar, int i2, int i3) {
        super(2);
        this.f2028p = aVar;
        this.f2022j = aVar2;
        this.f2023k = oVar;
        this.f2024l = z3;
        this.q = o3;
        this.f2025m = lVar;
        this.f2026n = i2;
        this.f2027o = i3;
    }

    @Override // y2.e
    public final Object j(Object obj, Object obj2) {
        switch (this.f2021i) {
            case 0:
                ((Number) obj2).intValue();
                int Y2 = C0257c.Y(this.f2026n | 1);
                O o3 = (O) this.q;
                r.l lVar = (r.l) this.f2025m;
                V.c((B0.a) this.f2028p, (y2.a) this.f2022j, this.f2023k, this.f2024l, o3, lVar, (C0285q) obj, Y2, this.f2027o);
                break;
            case 1:
                ((Number) obj2).intValue();
                int Y3 = C0257c.Y(this.f2026n | 1);
                r.l lVar2 = (r.l) this.f2025m;
                y2.e eVar = (y2.e) this.q;
                D1.e((y2.a) this.f2022j, this.f2023k, this.f2024l, (C0074b2) this.f2028p, lVar2, eVar, (C0285q) obj, Y3, this.f2027o);
                break;
            case 2:
                ((Number) obj2).intValue();
                int Y4 = C0257c.Y(this.f2026n | 1);
                String str = (String) this.q;
                y2.f fVar = (y2.f) this.f2025m;
                androidx.compose.animation.a.c(this.f2024l, this.f2023k, (C0790E) this.f2028p, (C0791F) this.f2022j, str, fVar, (C0285q) obj, Y4, this.f2027o);
                break;
            case 3:
                ((Number) obj2).intValue();
                int Y5 = C0257c.Y(this.f2026n | 1);
                boolean z3 = this.f2024l;
                y2.e eVar2 = (y2.e) this.f2025m;
                n1.E.b((C0988n) this.f2028p, (y2.a) this.f2022j, (y2.c) this.q, this.f2023k, z3, eVar2, (C0285q) obj, Y5, this.f2027o);
                break;
            default:
                ((Number) obj2).intValue();
                int Y6 = C0257c.Y(this.f2026n | 1);
                y2.f fVar2 = (y2.f) this.f2025m;
                y2.a aVar = (y2.a) this.f2022j;
                AbstractC0990p.b((String) this.f2028p, this.f2024l, (C0976b) this.q, this.f2023k, fVar2, aVar, (C0285q) obj, Y6, this.f2027o);
                break;
        }
        return C0880v.f8657a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public U(String str, boolean z3, C0976b c0976b, V.o oVar, y2.f fVar, y2.a aVar, int i2, int i3) {
        super(2);
        this.f2028p = str;
        this.f2024l = z3;
        this.q = c0976b;
        this.f2023k = oVar;
        this.f2025m = fVar;
        this.f2022j = aVar;
        this.f2026n = i2;
        this.f2027o = i3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public U(C0988n c0988n, y2.a aVar, y2.c cVar, V.o oVar, boolean z3, y2.e eVar, int i2, int i3) {
        super(2);
        this.f2028p = c0988n;
        this.f2022j = aVar;
        this.q = cVar;
        this.f2023k = oVar;
        this.f2024l = z3;
        this.f2025m = eVar;
        this.f2026n = i2;
        this.f2027o = i3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public U(y2.a aVar, V.o oVar, boolean z3, C0074b2 c0074b2, r.l lVar, y2.e eVar, int i2, int i3) {
        super(2);
        this.f2022j = aVar;
        this.f2023k = oVar;
        this.f2024l = z3;
        this.f2028p = c0074b2;
        this.f2025m = lVar;
        this.q = eVar;
        this.f2026n = i2;
        this.f2027o = i3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public U(boolean z3, V.o oVar, C0790E c0790e, C0791F c0791f, String str, y2.f fVar, int i2, int i3) {
        super(2);
        this.f2024l = z3;
        this.f2023k = oVar;
        this.f2028p = c0790e;
        this.f2022j = c0791f;
        this.q = str;
        this.f2025m = fVar;
        this.f2026n = i2;
        this.f2027o = i3;
    }
}
