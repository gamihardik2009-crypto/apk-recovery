package z;

import J.C0257c;
import J.C0285q;
import m2.C0880v;

/* renamed from: z.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1416g extends z2.i implements y2.e {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ String f11682i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ V.o f11683j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ C0.K f11684k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ y2.c f11685l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f11686m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ boolean f11687n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f11688o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ int f11689p;
    public final /* synthetic */ int q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f11690r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1416g(String str, V.o oVar, C0.K k3, y2.c cVar, int i2, boolean z3, int i3, int i4, int i5, int i6) {
        super(2);
        this.f11682i = str;
        this.f11683j = oVar;
        this.f11684k = k3;
        this.f11685l = cVar;
        this.f11686m = i2;
        this.f11687n = z3;
        this.f11688o = i3;
        this.f11689p = i4;
        this.q = i5;
        this.f11690r = i6;
    }

    @Override // y2.e
    public final Object j(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int Y2 = C0257c.Y(this.q | 1);
        int i2 = this.f11688o;
        N.a(this.f11682i, this.f11683j, this.f11684k, this.f11685l, this.f11686m, this.f11687n, i2, this.f11689p, (C0285q) obj, Y2, this.f11690r);
        return C0880v.f8657a;
    }
}
