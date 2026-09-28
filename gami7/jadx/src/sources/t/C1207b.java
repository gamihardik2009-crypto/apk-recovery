package t;

import J.C0257c;
import J.C0285q;
import m2.C0880v;
import n2.AbstractC0949a;
import p.U;
import s.InterfaceC1159L;
import s.InterfaceC1169h;
import s.InterfaceC1171j;

/* renamed from: t.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1207b extends z2.i implements y2.e {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f10218i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ V.o f10219j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ C1228w f10220k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1159L f10221l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ boolean f10222m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ U f10223n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ boolean f10224o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ y2.c f10225p;
    public final /* synthetic */ int q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f10226r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Object f10227s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f10228t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1207b(V.o oVar, C1228w c1228w, InterfaceC1159L interfaceC1159L, boolean z3, Object obj, Object obj2, U u3, boolean z4, y2.c cVar, int i2, int i3, int i4) {
        super(2);
        this.f10218i = i4;
        this.f10219j = oVar;
        this.f10220k = c1228w;
        this.f10221l = interfaceC1159L;
        this.f10222m = z3;
        this.f10227s = obj;
        this.f10228t = obj2;
        this.f10223n = u3;
        this.f10224o = z4;
        this.f10225p = cVar;
        this.q = i2;
        this.f10226r = i3;
    }

    @Override // y2.e
    public final Object j(Object obj, Object obj2) {
        switch (this.f10218i) {
            case 0:
                ((Number) obj2).intValue();
                int Y2 = C0257c.Y(this.q | 1);
                boolean z3 = this.f10224o;
                y2.c cVar = this.f10225p;
                AbstractC0949a.a(this.f10219j, this.f10220k, this.f10221l, this.f10222m, (InterfaceC1171j) this.f10227s, (V.e) this.f10228t, this.f10223n, z3, cVar, (C0285q) obj, Y2, this.f10226r);
                break;
            default:
                ((Number) obj2).intValue();
                int Y3 = C0257c.Y(this.q | 1);
                boolean z4 = this.f10224o;
                y2.c cVar2 = this.f10225p;
                AbstractC0949a.b(this.f10219j, this.f10220k, this.f10221l, this.f10222m, (InterfaceC1169h) this.f10227s, (V.f) this.f10228t, this.f10223n, z4, cVar2, (C0285q) obj, Y3, this.f10226r);
                break;
        }
        return C0880v.f8657a;
    }
}
