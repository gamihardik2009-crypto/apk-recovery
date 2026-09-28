package H;

import J.C0257c;
import J.C0285q;
import m2.C0880v;

/* renamed from: H.y3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0228y3 extends z2.i implements y2.e {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ B3 f3329i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ r.l f3330j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ V.o f3331k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C0210v3 f3332l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ boolean f3333m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ long f3334n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f3335o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ int f3336p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0228y3(B3 b3, r.l lVar, V.o oVar, C0210v3 c0210v3, boolean z3, long j3, int i2, int i3) {
        super(2);
        this.f3329i = b3;
        this.f3330j = lVar;
        this.f3331k = oVar;
        this.f3332l = c0210v3;
        this.f3333m = z3;
        this.f3334n = j3;
        this.f3335o = i2;
        this.f3336p = i3;
    }

    @Override // y2.e
    public final Object j(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int Y2 = C0257c.Y(this.f3335o | 1);
        boolean z3 = this.f3333m;
        long j3 = this.f3334n;
        this.f3329i.b(this.f3330j, this.f3331k, this.f3332l, z3, j3, (C0285q) obj, Y2, this.f3336p);
        return C0880v.f8657a;
    }
}
