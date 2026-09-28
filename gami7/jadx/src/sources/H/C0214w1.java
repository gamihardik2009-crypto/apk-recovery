package H;

import J2.InterfaceC0328z;

/* renamed from: H.w1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0214w1 extends z2.i implements y2.a {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f3245i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ u.x f3246j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0328z f3247k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0214w1(u.x xVar, InterfaceC0328z interfaceC0328z, int i2) {
        super(0);
        this.f3245i = i2;
        this.f3246j = xVar;
        this.f3247k = interfaceC0328z;
    }

    @Override // y2.a
    public final Object c() {
        switch (this.f3245i) {
            case 0:
                u.x xVar = this.f3246j;
                boolean z3 = false;
                if (xVar.a()) {
                    J2.B.r(this.f3247k, null, 0, new C0208v1(xVar, null), 3);
                    z3 = true;
                }
                return Boolean.valueOf(z3);
            default:
                u.x xVar2 = this.f3246j;
                boolean z4 = false;
                if (xVar2.c()) {
                    J2.B.r(this.f3247k, null, 0, new C0220x1(xVar2, null), 3);
                    z4 = true;
                }
                return Boolean.valueOf(z4);
        }
    }
}
