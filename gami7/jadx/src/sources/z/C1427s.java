package z;

import J2.InterfaceC0328z;
import a0.EnumC0441r;
import m2.C0880v;
import w.C1373c;

/* renamed from: z.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1427s extends z2.i implements y2.c {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ S f11805i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ boolean f11806j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ boolean f11807k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ I0.A f11808l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ I0.z f11809m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ I0.m f11810n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ I0.s f11811o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ D.X f11812p;
    public final /* synthetic */ InterfaceC0328z q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ C1373c f11813r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1427s(S s3, boolean z3, boolean z4, I0.A a3, I0.z zVar, I0.m mVar, I0.s sVar, D.X x2, InterfaceC0328z interfaceC0328z, C1373c c1373c) {
        super(1);
        this.f11805i = s3;
        this.f11806j = z3;
        this.f11807k = z4;
        this.f11808l = a3;
        this.f11809m = zVar;
        this.f11810n = mVar;
        this.f11811o = sVar;
        this.f11812p = x2;
        this.q = interfaceC0328z;
        this.f11813r = c1373c;
    }

    @Override // y2.c
    public final Object l(Object obj) {
        p0 d3;
        EnumC0441r enumC0441r = (EnumC0441r) obj;
        S s3 = this.f11805i;
        if (s3.b() != enumC0441r.a()) {
            s3.f11548f.setValue(Boolean.valueOf(enumC0441r.a()));
            if (s3.b() && this.f11806j && !this.f11807k) {
                N.j(this.f11808l, s3, this.f11809m, this.f11810n, this.f11811o);
            } else {
                N.g(s3);
            }
            if (enumC0441r.a() && (d3 = s3.d()) != null) {
                J2.B.r(this.q, null, 0, new r(this.f11813r, this.f11809m, this.f11805i, d3, this.f11811o, null), 3);
            }
            if (!enumC0441r.a()) {
                this.f11812p.g(null);
            }
        }
        return C0880v.f8657a;
    }
}
