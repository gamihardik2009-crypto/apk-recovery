package H;

import J.C0257c;
import J.C0285q;
import m2.C0880v;

/* renamed from: H.l2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0144l2 extends z2.i implements y2.e {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ y2.e f2847i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ y2.e f2848j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ y2.e f2849k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ y2.e f2850l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ y2.e f2851m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f2852n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0144l2(y2.e eVar, y2.e eVar2, y2.e eVar3, y2.e eVar4, y2.e eVar5, int i2) {
        super(2);
        this.f2847i = eVar;
        this.f2848j = eVar2;
        this.f2849k = eVar3;
        this.f2850l = eVar4;
        this.f2851m = eVar5;
        this.f2852n = i2;
    }

    @Override // y2.e
    public final Object j(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int Y2 = C0257c.Y(this.f2852n | 1);
        y2.e eVar = this.f2850l;
        y2.e eVar2 = this.f2851m;
        AbstractC0165o2.b(this.f2847i, this.f2848j, this.f2849k, eVar, eVar2, (C0285q) obj, Y2);
        return C0880v.f8657a;
    }
}
