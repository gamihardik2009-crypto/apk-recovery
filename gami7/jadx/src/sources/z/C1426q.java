package z;

import C0.C0024g;
import I0.C0244a;
import I0.C0249f;
import J.C0291t0;
import J.C0294v;
import a0.InterfaceC0431h;
import java.util.List;
import m2.C0880v;
import n2.AbstractC0963o;
import r0.InterfaceC1129r;
import u0.C1300n0;
import u0.R0;

/* renamed from: z.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1426q extends z2.i implements y2.c {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f11791i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ S f11792j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1426q(S s3, int i2) {
        super(1);
        this.f11791i = i2;
        this.f11792j = s3;
    }

    @Override // y2.c
    public final Object l(Object obj) {
        y2.c cVar;
        C0880v c0880v;
        R0 r02;
        boolean z3 = false;
        C0880v c0880v2 = null;
        C0880v c0880v3 = C0880v.f8657a;
        S s3 = this.f11792j;
        switch (this.f11791i) {
            case 0:
                InterfaceC1129r interfaceC1129r = (InterfaceC1129r) obj;
                p0 d3 = s3.d();
                if (d3 != null) {
                    d3.f11790c = interfaceC1129r;
                }
                return c0880v3;
            case 1:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                s3.q.setValue(bool);
                return c0880v3;
            case 2:
                List list = (List) obj;
                if (s3.d() != null) {
                    p0 d4 = s3.d();
                    z2.h.c(d4);
                    list.add(d4.f11788a);
                    z3 = true;
                }
                return Boolean.valueOf(z3);
            case 3:
                C0024g c0024g = (C0024g) obj;
                I0.F f3 = s3.f11547e;
                C1426q c1426q = s3.f11561t;
                if (f3 != null) {
                    I0.z b3 = s3.f11546d.b(AbstractC0963o.v(new C0249f(), new C0244a(c0024g, 1)));
                    f3.a(null, b3);
                    c1426q.l(b3);
                    c0880v2 = c0880v3;
                }
                if (c0880v2 == null) {
                    String str = c0024g.f500a;
                    int length = str.length();
                    c1426q.l(new I0.z(str, B1.C.j(length, length), 4));
                }
                return Boolean.TRUE;
            case 4:
                int i2 = ((I0.l) obj).f3903a;
                O o3 = s3.f11559r;
                o3.getClass();
                if (I0.l.a(i2, 7)) {
                    cVar = o3.a().f11530a;
                } else if (I0.l.a(i2, 2)) {
                    cVar = o3.a().f11531b;
                } else if (I0.l.a(i2, 6)) {
                    cVar = o3.a().f11532c;
                } else if (I0.l.a(i2, 5)) {
                    cVar = o3.a().f11533d;
                } else if (I0.l.a(i2, 3)) {
                    cVar = o3.a().f11534e;
                } else if (I0.l.a(i2, 4)) {
                    cVar = o3.a().f11535f;
                } else {
                    if (!I0.l.a(i2, 1) && !I0.l.a(i2, 0)) {
                        throw new IllegalStateException("invalid ImeAction".toString());
                    }
                    cVar = null;
                }
                if (cVar != null) {
                    cVar.l(o3);
                    c0880v = c0880v3;
                } else {
                    c0880v = null;
                }
                if (c0880v == null) {
                    if (I0.l.a(i2, 6)) {
                        InterfaceC0431h interfaceC0431h = o3.f11528c;
                        if (interfaceC0431h == null) {
                            z2.h.j("focusManager");
                            throw null;
                        }
                        ((androidx.compose.ui.focus.b) interfaceC0431h).d(1);
                    } else if (I0.l.a(i2, 5)) {
                        InterfaceC0431h interfaceC0431h2 = o3.f11528c;
                        if (interfaceC0431h2 == null) {
                            z2.h.j("focusManager");
                            throw null;
                        }
                        ((androidx.compose.ui.focus.b) interfaceC0431h2).d(2);
                    } else if (I0.l.a(i2, 7) && (r02 = o3.f11526a) != null) {
                        ((C1300n0) r02).a();
                    }
                }
                return c0880v3;
            default:
                I0.z zVar = (I0.z) obj;
                String str2 = zVar.f3932a.f500a;
                C0024g c0024g2 = s3.f11552j;
                if (!z2.h.a(str2, c0024g2 != null ? c0024g2.f500a : null)) {
                    s3.f11553k.setValue(EnumC1407G.f11511h);
                }
                long j3 = C0.J.f471b;
                s3.g(j3);
                s3.f(j3);
                s3.f11560s.l(zVar);
                C0291t0 c0291t0 = s3.f11544b;
                C0294v c0294v = c0291t0.f4233b;
                if (c0294v != null) {
                    c0294v.q(c0291t0, null);
                }
                return c0880v3;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1426q(S s3, A0.k kVar) {
        super(1);
        this.f11791i = 3;
        this.f11792j = s3;
    }
}
