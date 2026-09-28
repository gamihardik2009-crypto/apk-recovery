package m;

import m2.C0880v;

/* renamed from: m.e0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0832e0 extends z2.i implements y2.c {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ z2.s f8444i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f8445j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0836i f8446k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ AbstractC0845s f8447l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C0841n f8448m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ float f8449n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ y2.c f8450o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0832e0(z2.s sVar, Object obj, InterfaceC0836i interfaceC0836i, AbstractC0845s abstractC0845s, C0841n c0841n, float f3, y2.c cVar) {
        super(1);
        this.f8444i = sVar;
        this.f8445j = obj;
        this.f8446k = interfaceC0836i;
        this.f8447l = abstractC0845s;
        this.f8448m = c0841n;
        this.f8449n = f3;
        this.f8450o = cVar;
    }

    @Override // y2.c
    public final Object l(Object obj) {
        long longValue = ((Number) obj).longValue();
        InterfaceC0836i interfaceC0836i = this.f8446k;
        x0 d3 = interfaceC0836i.d();
        Object e3 = interfaceC0836i.e();
        C0830d0 c0830d0 = new C0830d0(0, this.f8448m);
        C0839l c0839l = new C0839l(this.f8445j, d3, this.f8447l, longValue, e3, longValue, c0830d0);
        AbstractC0831e.k(c0839l, longValue, this.f8449n, this.f8446k, this.f8448m, this.f8450o);
        this.f8444i.f11909h = c0839l;
        return C0880v.f8657a;
    }
}
