package z;

import J.C0274k0;
import a.AbstractC0423a;
import m2.C0880v;
import n0.C0919B;
import r0.InterfaceC1129r;
import u0.b1;
import u0.c1;

/* renamed from: z.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1428t extends z2.i implements y2.c {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ S f11818i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ boolean f11819j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ b1 f11820k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ D.X f11821l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ I0.z f11822m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ I0.s f11823n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1428t(S s3, boolean z3, b1 b1Var, D.X x2, I0.z zVar, I0.s sVar) {
        super(1);
        this.f11818i = s3;
        this.f11819j = z3;
        this.f11820k = b1Var;
        this.f11821l = x2;
        this.f11822m = zVar;
        this.f11823n = sVar;
    }

    @Override // y2.c
    public final Object l(Object obj) {
        I0.F f3;
        InterfaceC1129r interfaceC1129r;
        InterfaceC1129r interfaceC1129r2;
        InterfaceC1129r interfaceC1129r3 = (InterfaceC1129r) obj;
        S s3 = this.f11818i;
        s3.f11550h = interfaceC1129r3;
        p0 d3 = s3.d();
        if (d3 != null) {
            d3.f11789b = interfaceC1129r3;
        }
        if (this.f11819j) {
            EnumC1407G a3 = s3.a();
            EnumC1407G enumC1407G = EnumC1407G.f11512i;
            C0274k0 c0274k0 = s3.f11557o;
            I0.z zVar = this.f11822m;
            D.X x2 = this.f11821l;
            if (a3 == enumC1407G) {
                if (((Boolean) s3.f11554l.getValue()).booleanValue() && ((c1) this.f11820k).a()) {
                    x2.s();
                } else {
                    x2.m();
                }
                s3.f11555m.setValue(Boolean.valueOf(AbstractC0423a.P(x2, true)));
                s3.f11556n.setValue(Boolean.valueOf(AbstractC0423a.P(x2, false)));
                c0274k0.setValue(Boolean.valueOf(C0.J.b(zVar.f3933b)));
            } else if (s3.a() == EnumC1407G.f11513j) {
                c0274k0.setValue(Boolean.valueOf(AbstractC0423a.P(x2, true)));
            }
            N.r(s3, zVar, this.f11823n);
            p0 d4 = s3.d();
            if (d4 != null && (f3 = s3.f11547e) != null && s3.b() && (interfaceC1129r = d4.f11789b) != null && interfaceC1129r.n() && (interfaceC1129r2 = d4.f11790c) != null) {
                C0919B c0919b = new C0919B(21, interfaceC1129r);
                b0.d M3 = C1.y.M(interfaceC1129r);
                b0.d D3 = interfaceC1129r.D(interfaceC1129r2, false);
                if (z2.h.a((I0.F) f3.f3862a.f3839b.get(), f3)) {
                    f3.f3863b.e(this.f11822m, this.f11823n, d4.f11788a, c0919b, M3, D3);
                }
            }
        }
        return C0880v.f8657a;
    }
}
