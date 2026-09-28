package r0;

/* renamed from: r0.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1123l implements InterfaceC1093G {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f9875h;

    /* renamed from: i, reason: collision with root package name */
    public final InterfaceC1093G f9876i;

    /* renamed from: j, reason: collision with root package name */
    public final int f9877j;

    /* renamed from: k, reason: collision with root package name */
    public final int f9878k;

    public /* synthetic */ C1123l(InterfaceC1093G interfaceC1093G, int i2, int i3, int i4) {
        this.f9875h = i4;
        this.f9876i = interfaceC1093G;
        this.f9877j = i2;
        this.f9878k = i3;
    }

    @Override // r0.InterfaceC1093G
    public final int L(int i2) {
        switch (this.f9875h) {
        }
        return this.f9876i.L(i2);
    }

    @Override // r0.InterfaceC1093G
    public final AbstractC1103Q a(long j3) {
        switch (this.f9875h) {
            case 0:
                int i2 = this.f9878k;
                int i3 = this.f9877j;
                InterfaceC1093G interfaceC1093G = this.f9876i;
                if (i2 == 1) {
                    return new C1124m(i3 == 2 ? interfaceC1093G.a0(O0.a.g(j3)) : interfaceC1093G.L(O0.a.g(j3)), O0.a.c(j3) ? O0.a.g(j3) : 32767, 0);
                }
                return new C1124m(O0.a.d(j3) ? O0.a.h(j3) : 32767, i3 == 2 ? interfaceC1093G.b(O0.a.h(j3)) : interfaceC1093G.b0(O0.a.h(j3)), 0);
            case 1:
                int i4 = this.f9878k;
                int i5 = this.f9877j;
                InterfaceC1093G interfaceC1093G2 = this.f9876i;
                if (i4 == 1) {
                    return new C1124m(i5 == 2 ? interfaceC1093G2.a0(O0.a.g(j3)) : interfaceC1093G2.L(O0.a.g(j3)), O0.a.c(j3) ? O0.a.g(j3) : 32767, 1);
                }
                return new C1124m(O0.a.d(j3) ? O0.a.h(j3) : 32767, i5 == 2 ? interfaceC1093G2.b(O0.a.h(j3)) : interfaceC1093G2.b0(O0.a.h(j3)), 1);
            default:
                int i6 = this.f9878k;
                int i7 = this.f9877j;
                InterfaceC1093G interfaceC1093G3 = this.f9876i;
                if (i6 == 1) {
                    return new C1124m(i7 == 2 ? interfaceC1093G3.a0(O0.a.g(j3)) : interfaceC1093G3.L(O0.a.g(j3)), O0.a.c(j3) ? O0.a.g(j3) : 32767, 2);
                }
                return new C1124m(O0.a.d(j3) ? O0.a.h(j3) : 32767, i7 == 2 ? interfaceC1093G3.b(O0.a.h(j3)) : interfaceC1093G3.b0(O0.a.h(j3)), 2);
        }
    }

    @Override // r0.InterfaceC1093G
    public final int a0(int i2) {
        switch (this.f9875h) {
        }
        return this.f9876i.a0(i2);
    }

    @Override // r0.InterfaceC1093G
    public final int b(int i2) {
        switch (this.f9875h) {
        }
        return this.f9876i.b(i2);
    }

    @Override // r0.InterfaceC1093G
    public final int b0(int i2) {
        switch (this.f9875h) {
        }
        return this.f9876i.b0(i2);
    }

    @Override // r0.InterfaceC1093G
    public final Object p() {
        switch (this.f9875h) {
        }
        return this.f9876i.p();
    }
}
