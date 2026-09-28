package H;

import D.InterfaceC0045n;
import J.C0257c;
import J.C0285q;
import m2.C0880v;
import z.AbstractC1412c;

/* renamed from: H.j5, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0133j5 extends z2.i implements y2.e {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f2779i = 0;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ long f2780j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f2781k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f2782l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Object f2783m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Object f2784n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0133j5(long j3, C0.K k3, y2.e eVar, int i2, int i3) {
        super(2);
        this.f2780j = j3;
        this.f2783m = k3;
        this.f2784n = eVar;
        this.f2781k = i2;
        this.f2782l = i3;
    }

    @Override // y2.e
    public final Object j(Object obj, Object obj2) {
        switch (this.f2779i) {
            case 0:
                ((Number) obj2).intValue();
                int Y2 = C0257c.Y(this.f2781k | 1);
                C0.K k3 = (C0.K) this.f2783m;
                y2.e eVar = (y2.e) this.f2784n;
                AbstractC0140k5.b(this.f2780j, k3, eVar, (C0285q) obj, Y2, this.f2782l);
                break;
            default:
                ((Number) obj2).intValue();
                int Y3 = C0257c.Y(this.f2781k | 1);
                V.o oVar = (V.o) this.f2784n;
                long j3 = this.f2780j;
                AbstractC1412c.a((InterfaceC0045n) this.f2783m, oVar, j3, (C0285q) obj, Y3, this.f2782l);
                break;
        }
        return C0880v.f8657a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0133j5(InterfaceC0045n interfaceC0045n, V.o oVar, long j3, int i2, int i3) {
        super(2);
        this.f2783m = interfaceC0045n;
        this.f2784n = oVar;
        this.f2780j = j3;
        this.f2781k = i2;
        this.f2782l = i3;
    }
}
