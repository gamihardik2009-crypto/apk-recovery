package G;

import B.F;
import J.A0;
import J.InterfaceC0258c0;
import J.W0;
import J2.C0317n;
import J2.InterfaceC0328z;
import c0.C0603v;
import e0.C0652b;
import java.util.Iterator;
import java.util.Map;
import m.C0829d;
import m2.C0880v;
import t0.C1238G;

/* loaded from: classes.dex */
public final class c extends s implements A0 {

    /* renamed from: i, reason: collision with root package name */
    public final boolean f1142i;

    /* renamed from: j, reason: collision with root package name */
    public final float f1143j;

    /* renamed from: k, reason: collision with root package name */
    public final W0 f1144k;

    /* renamed from: l, reason: collision with root package name */
    public final W0 f1145l;

    /* renamed from: m, reason: collision with root package name */
    public final T.u f1146m;

    public c(boolean z3, float f3, InterfaceC0258c0 interfaceC0258c0, InterfaceC0258c0 interfaceC0258c02) {
        super(z3, interfaceC0258c02);
        this.f1142i = z3;
        this.f1143j = f3;
        this.f1144k = interfaceC0258c0;
        this.f1145l = interfaceC0258c02;
        this.f1146m = new T.u();
    }

    @Override // J.A0
    public final void a() {
        this.f1146m.clear();
    }

    @Override // J.A0
    public final void b() {
    }

    @Override // J.A0
    public final void c() {
        this.f1146m.clear();
    }

    @Override // n.U
    public final void d(C1238G c1238g) {
        long j3;
        C1238G c1238g2 = c1238g;
        long j4 = ((C0603v) this.f1144k.getValue()).f7279a;
        c1238g.a();
        f(c1238g2, this.f1143j, j4);
        Iterator it = this.f1146m.f5731i.iterator();
        while (((T.z) it).hasNext()) {
            o oVar = (o) ((Map.Entry) ((T.z) it).next()).getValue();
            float f3 = ((g) this.f1145l.getValue()).f1158d;
            if (f3 == 0.0f) {
                j3 = j4;
            } else {
                long b3 = C0603v.b(f3, j4);
                Float f4 = oVar.f1178d;
                C0652b c0652b = c1238g2.f10415h;
                if (f4 == null) {
                    long e3 = c0652b.e();
                    float f5 = p.f1187a;
                    oVar.f1178d = Float.valueOf(Math.max(b0.f.d(e3), b0.f.b(e3)) * 0.3f);
                }
                Float f6 = oVar.f1179e;
                boolean z3 = oVar.f1177c;
                if (f6 == null) {
                    float f7 = oVar.f1176b;
                    oVar.f1179e = Float.isNaN(f7) ? Float.valueOf(p.a(c1238g2, z3, c0652b.e())) : Float.valueOf(c1238g2.P(f7));
                }
                if (oVar.f1175a == null) {
                    oVar.f1175a = new b0.c(c0652b.x());
                }
                if (oVar.f1180f == null) {
                    oVar.f1180f = new b0.c(K1.f.e(b0.f.d(c0652b.e()) / 2.0f, b0.f.b(c0652b.e()) / 2.0f));
                }
                float floatValue = (!((Boolean) oVar.f1186l.getValue()).booleanValue() || ((Boolean) oVar.f1185k.getValue()).booleanValue()) ? ((Number) oVar.f1181g.d()).floatValue() : 1.0f;
                Float f8 = oVar.f1178d;
                z2.h.c(f8);
                float floatValue2 = f8.floatValue();
                Float f9 = oVar.f1179e;
                z2.h.c(f9);
                float y3 = B2.a.y(floatValue2, f9.floatValue(), ((Number) oVar.f1182h.d()).floatValue());
                b0.c cVar = oVar.f1175a;
                z2.h.c(cVar);
                float d3 = b0.c.d(cVar.f7058a);
                b0.c cVar2 = oVar.f1180f;
                z2.h.c(cVar2);
                float d4 = b0.c.d(cVar2.f7058a);
                C0829d c0829d = oVar.f1183i;
                float y4 = B2.a.y(d3, d4, ((Number) c0829d.d()).floatValue());
                b0.c cVar3 = oVar.f1175a;
                z2.h.c(cVar3);
                j3 = j4;
                float e4 = b0.c.e(cVar3.f7058a);
                b0.c cVar4 = oVar.f1180f;
                z2.h.c(cVar4);
                long e5 = K1.f.e(y4, B2.a.y(e4, b0.c.e(cVar4.f7058a), ((Number) c0829d.d()).floatValue()));
                long b4 = C0603v.b(C0603v.d(b3) * floatValue, b3);
                if (z3) {
                    float d5 = b0.f.d(c0652b.e());
                    float b5 = b0.f.b(c0652b.e());
                    K1.m mVar = c0652b.f7552i;
                    long j5 = mVar.j();
                    mVar.e().f();
                    ((K1.m) ((F) mVar.f4558a).f165i).e().p(0.0f, 0.0f, d5, b5, 1);
                    c1238g.k0(b4, y3, (r19 & 4) != 0 ? c1238g.x() : e5, 1.0f, (r19 & 16) != 0 ? e0.g.f7556a : null, null, 3);
                    mVar.e().b();
                    mVar.r(j5);
                } else {
                    c1238g.k0(b4, y3, (r19 & 4) != 0 ? c1238g.x() : e5, 1.0f, (r19 & 16) != 0 ? e0.g.f7556a : null, null, 3);
                }
            }
            c1238g2 = c1238g;
            j4 = j3;
        }
    }

    @Override // G.s
    public final void e(r.n nVar, InterfaceC0328z interfaceC0328z) {
        Object j02;
        T.u uVar = this.f1146m;
        Iterator it = uVar.f5731i.iterator();
        while (it.hasNext()) {
            o oVar = (o) ((Map.Entry) it.next()).getValue();
            oVar.f1186l.setValue(Boolean.TRUE);
            C0880v c0880v = C0880v.f8657a;
            do {
                C0317n c0317n = oVar.f1184j;
                j02 = c0317n.j0(c0317n.V(), c0880v);
                if (j02 != J2.B.f4345d && j02 != J2.B.f4346e) {
                }
            } while (j02 == J2.B.f4347f);
        }
        boolean z3 = this.f1142i;
        o oVar2 = new o(z3 ? new b0.c(nVar.f9799a) : null, this.f1143j, z3);
        uVar.put(nVar, oVar2);
        J2.B.r(interfaceC0328z, null, 0, new C0063b(oVar2, this, nVar, null), 3);
    }

    @Override // G.s
    public final void i(r.n nVar) {
        Object j02;
        o oVar = (o) this.f1146m.get(nVar);
        if (oVar != null) {
            oVar.f1186l.setValue(Boolean.TRUE);
            C0880v c0880v = C0880v.f8657a;
            do {
                C0317n c0317n = oVar.f1184j;
                j02 = c0317n.j0(c0317n.V(), c0880v);
                if (j02 == J2.B.f4345d || j02 == J2.B.f4346e) {
                    return;
                }
            } while (j02 == J2.B.f4347f);
        }
    }
}
