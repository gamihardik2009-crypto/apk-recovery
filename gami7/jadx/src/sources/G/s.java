package G;

import B.F;
import J.C0257c;
import J.InterfaceC0258c0;
import J.W;
import J2.InterfaceC0328z;
import c0.C0603v;
import e0.InterfaceC0654d;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import m.AbstractC0831e;
import m.C0829d;
import m.p0;
import n.U;

/* loaded from: classes.dex */
public abstract class s implements U {

    /* renamed from: h, reason: collision with root package name */
    public final Object f1200h;

    public s(int i2) {
        switch (i2) {
            case 2:
                this.f1200h = C0257c.N(Boolean.FALSE, W.f4109m);
                break;
            default:
                this.f1200h = new LinkedHashMap();
                break;
        }
    }

    public abstract void e(r.n nVar, InterfaceC0328z interfaceC0328z);

    public void f(InterfaceC0654d interfaceC0654d, float f3, long j3) {
        z zVar = (z) this.f1200h;
        zVar.getClass();
        boolean isNaN = Float.isNaN(f3);
        boolean z3 = zVar.f1213a;
        float a3 = isNaN ? p.a(interfaceC0654d, z3, interfaceC0654d.e()) : interfaceC0654d.P(f3);
        float floatValue = ((Number) ((C0829d) zVar.f1215c).d()).floatValue();
        if (floatValue > 0.0f) {
            long b3 = C0603v.b(floatValue, j3);
            if (!z3) {
                interfaceC0654d.k0(b3, a3, (r19 & 4) != 0 ? interfaceC0654d.x() : 0L, 1.0f, (r19 & 16) != 0 ? e0.g.f7556a : null, null, 3);
                return;
            }
            float d3 = b0.f.d(interfaceC0654d.e());
            float b4 = b0.f.b(interfaceC0654d.e());
            K1.m e02 = interfaceC0654d.e0();
            long j4 = e02.j();
            e02.e().f();
            ((K1.m) ((F) e02.f4558a).f165i).e().p(0.0f, 0.0f, d3, b4, 1);
            interfaceC0654d.k0(b3, a3, (r19 & 4) != 0 ? interfaceC0654d.x() : 0L, 1.0f, (r19 & 16) != 0 ? e0.g.f7556a : null, null, 3);
            e02.e().b();
            e02.r(j4);
        }
    }

    public abstract Object g();

    public abstract Object h();

    public abstract void i(r.n nVar);

    public abstract void j(Object obj);

    public abstract void k(p0 p0Var);

    public abstract void l();

    public s(boolean z3, InterfaceC0258c0 interfaceC0258c0) {
        z zVar = new z();
        zVar.f1213a = z3;
        zVar.f1214b = interfaceC0258c0;
        zVar.f1215c = AbstractC0831e.a(0.0f);
        zVar.f1216d = new ArrayList();
        this.f1200h = zVar;
    }
}
