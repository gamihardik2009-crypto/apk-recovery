package androidx.lifecycle;

import J2.C0311h;
import J2.InterfaceC0310g;
import J2.InterfaceC0328z;
import m2.C0880v;

/* loaded from: classes.dex */
public final class G implements r {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ EnumC0465n f6825h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ z2.s f6826i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0328z f6827j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ EnumC0465n f6828k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0310g f6829l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ S2.a f6830m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ y2.e f6831n;

    public G(EnumC0465n enumC0465n, z2.s sVar, InterfaceC0328z interfaceC0328z, EnumC0465n enumC0465n2, C0311h c0311h, S2.d dVar, y2.e eVar) {
        this.f6825h = enumC0465n;
        this.f6826i = sVar;
        this.f6827j = interfaceC0328z;
        this.f6828k = enumC0465n2;
        this.f6829l = c0311h;
        this.f6830m = dVar;
        this.f6831n = eVar;
    }

    @Override // androidx.lifecycle.r
    public final void d(InterfaceC0470t interfaceC0470t, EnumC0465n enumC0465n) {
        EnumC0465n enumC0465n2 = this.f6825h;
        z2.s sVar = this.f6826i;
        if (enumC0465n == enumC0465n2) {
            sVar.f11909h = J2.B.r(this.f6827j, null, 0, new F(this.f6830m, this.f6831n, null), 3);
            return;
        }
        if (enumC0465n == this.f6828k) {
            J2.Z z3 = (J2.Z) sVar.f11909h;
            if (z3 != null) {
                z3.a(null);
            }
            sVar.f11909h = null;
        }
        if (enumC0465n == EnumC0465n.ON_DESTROY) {
            this.f6829l.t(C0880v.f8657a);
        }
    }
}
