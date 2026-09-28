package n;

import m2.C0880v;
import r0.InterfaceC1129r;

/* loaded from: classes.dex */
public final class Y extends z2.i implements y2.a {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f8721i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ a0 f8722j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Y(a0 a0Var, int i2) {
        super(0);
        this.f8721i = i2;
        this.f8722j = a0Var;
    }

    @Override // y2.a
    public final Object c() {
        switch (this.f8721i) {
            case 0:
                InterfaceC1129r interfaceC1129r = (InterfaceC1129r) this.f8722j.f8733H.getValue();
                return new b0.c(interfaceC1129r != null ? interfaceC1129r.K(0L) : 9205357640488583168L);
            case 1:
                return new b0.c(this.f8722j.f8735J);
            default:
                this.f8722j.M0();
                return C0880v.f8657a;
        }
    }
}
