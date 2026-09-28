package D;

import m2.InterfaceC0862d;

/* renamed from: D.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0049s extends z2.i implements y2.a {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ C0046o f889i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f890j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f891k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ S f892l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0862d f893m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0049s(C0046o c0046o, int i2, int i3, S s3, InterfaceC0862d interfaceC0862d) {
        super(0);
        this.f889i = c0046o;
        this.f890j = i2;
        this.f891k = i3;
        this.f892l = s3;
        this.f893m = interfaceC0862d;
    }

    @Override // y2.a
    public final Object c() {
        int intValue = ((Number) this.f893m.getValue()).intValue();
        S s3 = this.f892l;
        boolean z3 = s3.f762b;
        boolean z4 = s3.f() == 1;
        C0046o c0046o = this.f889i;
        C0.H h2 = (C0.H) c0046o.f875e;
        int i2 = this.f890j;
        long k3 = h2.k(i2);
        int i3 = C0.J.f472c;
        int i4 = (int) (k3 >> 32);
        C0.H h3 = (C0.H) c0046o.f875e;
        int e3 = h3.e(i4);
        C0.o oVar = h3.f462b;
        if (e3 != intValue) {
            int i5 = oVar.f528f;
            i4 = intValue >= i5 ? h3.h(i5 - 1) : h3.h(intValue);
        }
        int i6 = (int) (k3 & 4294967295L);
        if (h3.e(i6) != intValue) {
            int i7 = oVar.f528f;
            i6 = intValue >= i7 ? h3.d(i7 - 1, false) : h3.d(intValue, false);
        }
        int i8 = this.f891k;
        if (i4 == i8) {
            return c0046o.a(i6);
        }
        if (i6 == i8) {
            return c0046o.a(i4);
        }
        if (!(z3 ^ z4) ? i2 >= i4 : i2 > i6) {
            i4 = i6;
        }
        return c0046o.a(i4);
    }
}
