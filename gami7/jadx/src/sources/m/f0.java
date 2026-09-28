package m;

import m2.C0880v;

/* loaded from: classes.dex */
public final class f0 extends z2.i implements y2.c {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ z2.s f8456i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ float f8457j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0836i f8458k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C0841n f8459l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ y2.c f8460m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(z2.s sVar, float f3, InterfaceC0836i interfaceC0836i, C0841n c0841n, y2.c cVar) {
        super(1);
        this.f8456i = sVar;
        this.f8457j = f3;
        this.f8458k = interfaceC0836i;
        this.f8459l = c0841n;
        this.f8460m = cVar;
    }

    @Override // y2.c
    public final Object l(Object obj) {
        long longValue = ((Number) obj).longValue();
        Object obj2 = this.f8456i.f11909h;
        z2.h.c(obj2);
        AbstractC0831e.k((C0839l) obj2, longValue, this.f8457j, this.f8458k, this.f8459l, this.f8460m);
        return C0880v.f8657a;
    }
}
