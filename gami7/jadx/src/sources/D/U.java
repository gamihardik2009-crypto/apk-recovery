package D;

import J.C0274k0;
import a.AbstractC0423a;
import j0.C0772b;
import j0.InterfaceC0771a;
import z.EnumC1406F;
import z.EnumC1407G;
import z.p0;

/* loaded from: classes.dex */
public final class U implements z.a0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f774a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ X f775b;

    public /* synthetic */ U(X x2, int i2) {
        this.f774a = i2;
        this.f775b = x2;
    }

    private final void f() {
    }

    private final void g() {
    }

    private final void h() {
    }

    private final void j() {
    }

    @Override // z.a0
    public final void a() {
        switch (this.f774a) {
            case 0:
                X x2 = this.f775b;
                X.b(x2, null);
                X.a(x2, null);
                break;
            default:
                i();
                break;
        }
    }

    @Override // z.a0
    public final void b() {
        switch (this.f774a) {
            case 0:
                X x2 = this.f775b;
                X.b(x2, null);
                X.a(x2, null);
                break;
        }
    }

    @Override // z.a0
    public final void c(long j3) {
        p0 d3;
        p0 d4;
        p0 d5;
        switch (this.f774a) {
            case 0:
                X x2 = this.f775b;
                long k3 = x2.k(true);
                float f3 = E.f723a;
                long e3 = K1.f.e(b0.c.d(k3), b0.c.e(k3) - 1.0f);
                z.S s3 = x2.f783d;
                if (s3 != null && (d3 = s3.d()) != null) {
                    long e4 = d3.e(e3);
                    x2.f792m = e4;
                    x2.q.setValue(new b0.c(e4));
                    x2.f794o = 0L;
                    x2.f795p.setValue(EnumC1406F.f11507h);
                    x2.t(false);
                    break;
                }
                break;
            default:
                X x3 = this.f775b;
                if (x3.j()) {
                    C0274k0 c0274k0 = x3.f795p;
                    if (((EnumC1406F) c0274k0.getValue()) == null) {
                        c0274k0.setValue(EnumC1406F.f11509j);
                        x3.f796r = -1;
                        x3.m();
                        z.S s4 = x3.f783d;
                        if (s4 == null || (d5 = s4.d()) == null || !d5.c(j3)) {
                            z.S s5 = x3.f783d;
                            if (s5 != null && (d4 = s5.d()) != null) {
                                int i2 = x3.f781b.i(d4.b(j3, true));
                                I0.z e5 = X.e(x3.l().f3932a, B1.C.j(i2, i2));
                                x3.h(false);
                                InterfaceC0771a interfaceC0771a = x3.f788i;
                                if (interfaceC0771a != null) {
                                    ((C0772b) interfaceC0771a).a();
                                }
                                x3.f782c.l(e5);
                            }
                        } else if (x3.l().f3932a.f500a.length() != 0) {
                            x3.h(false);
                            x3.f793n = Integer.valueOf((int) (X.c(x3, I0.z.a(x3.l(), null, C0.J.f471b, 5), j3, true, false, r.f885e, true) >> 32));
                        }
                        x3.r(EnumC1407G.f11511h);
                        x3.f792m = j3;
                        x3.q.setValue(new b0.c(j3));
                        x3.f794o = 0L;
                        break;
                    }
                }
                break;
        }
    }

    @Override // z.a0
    public final void d(long j3) {
        p0 d3;
        InterfaceC0771a interfaceC0771a;
        p0 d4;
        switch (this.f774a) {
            case 0:
                X x2 = this.f775b;
                x2.f794o = b0.c.h(x2.f794o, j3);
                z.S s3 = x2.f783d;
                if (s3 != null && (d3 = s3.d()) != null) {
                    x2.q.setValue(new b0.c(b0.c.h(x2.f792m, x2.f794o)));
                    I0.s sVar = x2.f781b;
                    b0.c i2 = x2.i();
                    z2.h.c(i2);
                    int i3 = sVar.i(d3.b(i2.f7058a, true));
                    long j4 = B1.C.j(i3, i3);
                    if (!C0.J.a(j4, x2.l().f3933b)) {
                        z.S s4 = x2.f783d;
                        if ((s4 == null || ((Boolean) s4.q.getValue()).booleanValue()) && (interfaceC0771a = x2.f788i) != null) {
                            ((C0772b) interfaceC0771a).a();
                        }
                        x2.f782c.l(X.e(x2.l().f3932a, j4));
                        break;
                    }
                }
                break;
            default:
                X x3 = this.f775b;
                if (x3.j() && x3.l().f3932a.f500a.length() != 0) {
                    x3.f794o = b0.c.h(x3.f794o, j3);
                    z.S s5 = x3.f783d;
                    if (s5 != null && (d4 = s5.d()) != null) {
                        x3.q.setValue(new b0.c(b0.c.h(x3.f792m, x3.f794o)));
                        Integer num = x3.f793n;
                        C0.E e3 = r.f885e;
                        if (num == null) {
                            b0.c i4 = x3.i();
                            z2.h.c(i4);
                            if (!d4.c(i4.f7058a)) {
                                int i5 = x3.f781b.i(d4.b(x3.f792m, true));
                                I0.s sVar2 = x3.f781b;
                                b0.c i6 = x3.i();
                                z2.h.c(i6);
                                if (i5 == sVar2.i(d4.b(i6.f7058a, true))) {
                                    e3 = r.f884d;
                                }
                                I0.z l3 = x3.l();
                                b0.c i7 = x3.i();
                                z2.h.c(i7);
                                X.c(x3, l3, i7.f7058a, false, false, e3, true);
                                int i8 = C0.J.f472c;
                            }
                        }
                        Integer num2 = x3.f793n;
                        int intValue = num2 != null ? num2.intValue() : d4.b(x3.f792m, false);
                        b0.c i9 = x3.i();
                        z2.h.c(i9);
                        int b3 = d4.b(i9.f7058a, false);
                        if (x3.f793n != null || intValue != b3) {
                            I0.z l4 = x3.l();
                            b0.c i10 = x3.i();
                            z2.h.c(i10);
                            X.c(x3, l4, i10.f7058a, false, false, e3, true);
                            int i82 = C0.J.f472c;
                        }
                    }
                    x3.t(false);
                    break;
                }
                break;
        }
    }

    @Override // z.a0
    public final void e() {
        int i2 = this.f774a;
    }

    public void i() {
        X x2 = this.f775b;
        X.b(x2, null);
        x2.q.setValue(null);
        x2.t(true);
        x2.f793n = null;
        boolean b3 = C0.J.b(x2.l().f3933b);
        x2.r(b3 ? EnumC1407G.f11513j : EnumC1407G.f11512i);
        z.S s3 = x2.f783d;
        if (s3 != null) {
            s3.f11555m.setValue(Boolean.valueOf(!b3 && AbstractC0423a.P(x2, true)));
        }
        z.S s4 = x2.f783d;
        if (s4 != null) {
            s4.f11556n.setValue(Boolean.valueOf(!b3 && AbstractC0423a.P(x2, false)));
        }
        z.S s5 = x2.f783d;
        if (s5 == null) {
            return;
        }
        s5.f11557o.setValue(Boolean.valueOf(b3 && AbstractC0423a.P(x2, true)));
    }

    @Override // z.a0
    public final void onCancel() {
        switch (this.f774a) {
            case 0:
                break;
            default:
                i();
                break;
        }
    }
}
