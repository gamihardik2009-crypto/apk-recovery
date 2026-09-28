package d0;

import B1.C;

/* renamed from: d0.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0642m implements InterfaceC0638i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7437a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0646q f7438b;

    public /* synthetic */ C0642m(C0646q c0646q, int i2) {
        this.f7437a = i2;
        this.f7438b = c0646q;
    }

    @Override // d0.InterfaceC0638i
    public final double c(double d3) {
        switch (this.f7437a) {
            case 0:
                return C.A(this.f7438b.f7453k.c(d3), r0.f7447e, r0.f7448f);
            default:
                return this.f7438b.f7456n.c(C.A(d3, r0.f7447e, r0.f7448f));
        }
    }
}
