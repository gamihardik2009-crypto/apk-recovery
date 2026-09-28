package H;

import java.util.Locale;

/* renamed from: H.y1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0226y1 extends z2.i implements y2.a {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Long f3321i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Long f3322j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ E2.d f3323k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f3324l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0180q3 f3325m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Locale f3326n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0226y1(Long l3, Long l4, E2.d dVar, int i2, InterfaceC0180q3 interfaceC0180q3, Locale locale) {
        super(0);
        this.f3321i = l3;
        this.f3322j = l4;
        this.f3323k = dVar;
        this.f3324l = i2;
        this.f3325m = interfaceC0180q3;
        this.f3326n = locale;
    }

    @Override // y2.a
    public final Object c() {
        return new B1(this.f3321i, this.f3322j, this.f3323k, this.f3324l, this.f3325m, this.f3326n);
    }
}
