package m;

import J.C0274k0;
import R0.C0371a;
import android.os.Bundle;
import m2.C0880v;
import n1.C0945f;
import n2.C0970v;
import p.C1031n;
import p.InterfaceC1012d0;
import r0.C1111Z;
import v.C1337I;
import v.RunnableC1348b;
import z.C1421l;

/* renamed from: m.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0823a extends z2.i implements y2.c {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f8398i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f8399j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Object f8400k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Object f8401l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Object f8402m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0823a(Object obj, Object obj2, Object obj3, Object obj4, int i2) {
        super(1);
        this.f8398i = i2;
        this.f8400k = obj;
        this.f8401l = obj2;
        this.f8402m = obj3;
        this.f8399j = obj4;
    }

    @Override // y2.c
    public final Object l(Object obj) {
        switch (this.f8398i) {
            case 0:
                C0839l c0839l = (C0839l) obj;
                C0829d c0829d = (C0829d) this.f8400k;
                AbstractC0831e.o(c0839l, c0829d.f8424c);
                C0274k0 c0274k0 = c0839l.f8512e;
                Object c3 = c0829d.c(c0274k0.getValue());
                boolean a3 = z2.h.a(c3, c0274k0.getValue());
                y2.c cVar = (y2.c) this.f8402m;
                if (!a3) {
                    c0829d.f8424c.f8534i.setValue(c3);
                    ((C0841n) this.f8401l).f8534i.setValue(c3);
                    if (cVar != null) {
                        cVar.l(c0829d);
                    }
                    c0839l.a();
                    ((z2.o) this.f8399j).f11905h = true;
                } else if (cVar != null) {
                    cVar.l(c0829d);
                }
                return C0880v.f8657a;
            case 1:
                C0945f c0945f = (C0945f) obj;
                z2.h.f(c0945f, "it");
                ((z2.o) this.f8399j).f11905h = true;
                C0970v c0970v = C0970v.f9165h;
                ((n1.y) this.f8400k).a((n1.s) this.f8401l, (Bundle) this.f8402m, c0945f, c0970v);
                return C0880v.f8657a;
            case 2:
                C0839l c0839l2 = (C0839l) obj;
                float floatValue = ((Number) c0839l2.f8512e.getValue()).floatValue();
                z2.p pVar = (z2.p) this.f8400k;
                float f3 = floatValue - pVar.f11906h;
                float a4 = ((InterfaceC1012d0) this.f8401l).a(f3);
                pVar.f11906h = ((Number) c0839l2.f8512e.getValue()).floatValue();
                ((z2.p) this.f8402m).f11906h = ((Number) c0839l2.f8508a.f8601b.l(c0839l2.f8513f)).floatValue();
                if (Math.abs(f3 - a4) > 0.5f) {
                    c0839l2.a();
                }
                ((C1031n) this.f8399j).getClass();
                return C0880v.f8657a;
            case 3:
                Q1.r rVar = new Q1.r((v.w) this.f8401l, (C1111Z) this.f8402m, (RunnableC1348b) this.f8399j, 8);
                C1337I c1337i = (C1337I) this.f8400k;
                c1337i.f11290c = rVar;
                return new C0371a(6, c1337i);
            default:
                z.S s3 = (z.S) this.f8400k;
                if (s3.b()) {
                    z2.s sVar = new z2.s();
                    L2.d dVar = new L2.d(s3.f11546d, s3.f11561t, sVar, 18);
                    I0.A a5 = (I0.A) this.f8401l;
                    I0.t tVar = a5.f3838a;
                    tVar.h((I0.z) this.f8402m, (I0.m) this.f8399j, dVar, s3.f11562u);
                    I0.F f4 = new I0.F(a5, tVar);
                    a5.f3839b.set(f4);
                    sVar.f11909h = f4;
                    s3.f11547e = f4;
                }
                return new C1421l();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0823a(z2.o oVar, n1.y yVar, n1.s sVar, Bundle bundle) {
        super(1);
        this.f8398i = 1;
        this.f8399j = oVar;
        this.f8400k = yVar;
        this.f8401l = sVar;
        this.f8402m = bundle;
    }
}
