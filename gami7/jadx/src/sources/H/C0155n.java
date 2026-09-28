package H;

import J.C0257c;
import J.C0285q;
import m2.C0880v;
import m2.InterfaceC0861c;
import n2.AbstractC0948C;
import o.AbstractC0990p;
import v.C1337I;

/* renamed from: H.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0155n extends z2.i implements y2.e {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f2916i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0861c f2917j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f2918k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f2919l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Object f2920m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Object f2921n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Object f2922o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0155n(R0.A a3, y2.a aVar, R0.B b3, y2.e eVar, int i2, int i3) {
        super(2);
        this.f2916i = 2;
        this.f2921n = a3;
        this.f2920m = aVar;
        this.f2922o = b3;
        this.f2917j = eVar;
        this.f2918k = i2;
        this.f2919l = i3;
    }

    @Override // y2.e
    public final Object j(Object obj, Object obj2) {
        switch (this.f2916i) {
            case 0:
                ((Number) obj2).intValue();
                int Y2 = C0257c.Y(this.f2918k | 1);
                R0.s sVar = (R0.s) this.f2922o;
                y2.e eVar = (y2.e) this.f2917j;
                AbstractC0162o.b((y2.a) this.f2920m, (V.o) this.f2921n, sVar, eVar, (C0285q) obj, Y2, this.f2919l);
                break;
            case 1:
                ((Number) obj2).intValue();
                int Y3 = C0257c.Y(this.f2918k | 1);
                O5 o5 = (O5) this.f2922o;
                y2.e eVar2 = (y2.e) this.f2917j;
                D1.f((C0093e0) this.f2920m, (C0198t3) this.f2921n, o5, eVar2, (C0285q) obj, Y3, this.f2919l);
                break;
            case 2:
                ((Number) obj2).intValue();
                int Y4 = C0257c.Y(this.f2918k | 1);
                R0.B b3 = (R0.B) this.f2922o;
                y2.e eVar3 = (y2.e) this.f2917j;
                R0.k.a((R0.A) this.f2921n, (y2.a) this.f2920m, b3, eVar3, (C0285q) obj, Y4, this.f2919l);
                break;
            case 3:
                ((Number) obj2).intValue();
                int Y5 = C0257c.Y(this.f2918k | 1);
                V.o oVar = (V.o) this.f2921n;
                y2.c cVar = (y2.c) this.f2917j;
                AbstractC0990p.d((R0.A) this.f2922o, (y2.a) this.f2920m, oVar, cVar, (C0285q) obj, Y5, this.f2919l);
                break;
            default:
                ((Number) obj2).intValue();
                int Y6 = C0257c.Y(this.f2918k | 1);
                C1337I c1337i = (C1337I) this.f2922o;
                y2.e eVar4 = (y2.e) this.f2917j;
                AbstractC0948C.a((y2.a) this.f2920m, (V.o) this.f2921n, c1337i, eVar4, (C0285q) obj, Y6, this.f2919l);
                break;
        }
        return C0880v.f8657a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0155n(R0.A a3, y2.a aVar, V.o oVar, y2.c cVar, int i2, int i3) {
        super(2);
        this.f2916i = 3;
        this.f2922o = a3;
        this.f2920m = aVar;
        this.f2921n = oVar;
        this.f2917j = cVar;
        this.f2918k = i2;
        this.f2919l = i3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0155n(Object obj, Object obj2, Object obj3, y2.e eVar, int i2, int i3, int i4) {
        super(2);
        this.f2916i = i4;
        this.f2920m = obj;
        this.f2921n = obj2;
        this.f2922o = obj3;
        this.f2917j = eVar;
        this.f2918k = i2;
        this.f2919l = i3;
    }
}
