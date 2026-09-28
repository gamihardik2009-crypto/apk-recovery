package H;

import J2.InterfaceC0328z;
import m2.C0880v;
import t.C1228w;

/* loaded from: classes.dex */
public final class R0 extends z2.i implements y2.a {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f1942i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0328z f1943j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ C1228w f1944k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ R0(InterfaceC0328z interfaceC0328z, C1228w c1228w, int i2) {
        super(0);
        this.f1942i = i2;
        this.f1943j = interfaceC0328z;
        this.f1944k = c1228w;
    }

    @Override // y2.a
    public final Object c() {
        switch (this.f1942i) {
            case 0:
                J2.B.r(this.f1943j, null, 0, new Q0(this.f1944k, null), 3);
                break;
            default:
                J2.B.r(this.f1943j, null, 0, new S0(this.f1944k, null), 3);
                break;
        }
        return C0880v.f8657a;
    }
}
