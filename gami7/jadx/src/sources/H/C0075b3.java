package H;

import J.C0257c;
import J.C0285q;
import m2.C0880v;

/* renamed from: H.b3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0075b3 extends z2.i implements y2.e {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f2349i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ J1 f2350j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ y2.e f2351k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0075b3(J1 j12, y2.e eVar, int i2) {
        super(2);
        this.f2349i = i2;
        this.f2350j = j12;
        this.f2351k = eVar;
    }

    @Override // y2.e
    public final Object j(Object obj, Object obj2) {
        switch (this.f2349i) {
            case 0:
                C0285q c0285q = (C0285q) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0285q.A()) {
                    c0285q.P();
                } else {
                    C0257c.a(AbstractC0124i3.f2738b.a(this.f2350j), this.f2351k, c0285q, 8);
                }
                break;
            default:
                C0285q c0285q2 = (C0285q) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0285q2.A()) {
                    c0285q2.P();
                } else {
                    C0257c.a(AbstractC0124i3.f2738b.a(this.f2350j), this.f2351k, c0285q2, 8);
                }
                break;
        }
        return C0880v.f8657a;
    }
}
