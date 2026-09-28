package Y1;

import m2.C0880v;

/* renamed from: Y1.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0421g implements y2.a {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f6303h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ n1.y f6304i;

    public /* synthetic */ C0421g(n1.y yVar, int i2) {
        this.f6303h = i2;
        this.f6304i = yVar;
    }

    @Override // y2.a
    public final Object c() {
        switch (this.f6303h) {
            case 0:
                n1.y yVar = this.f6304i;
                z2.h.f(yVar, "$navController");
                n1.y.l(yVar, S1.k.f5616d.f5618a, null, 6);
                break;
            default:
                n1.y yVar2 = this.f6304i;
                z2.h.f(yVar2, "$navController");
                yVar2.m();
                break;
        }
        return C0880v.f8657a;
    }
}
