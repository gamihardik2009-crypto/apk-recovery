package v;

import D.C0032a;
import J.C0257c;
import J.C0274k0;
import J.C0275l;
import J.C0285q;
import J.C0291t0;
import J.W;
import J.X0;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import p.C1007b;

/* renamed from: v.S, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1346S implements S.j, S.c {

    /* renamed from: a, reason: collision with root package name */
    public final S.j f11311a;

    /* renamed from: b, reason: collision with root package name */
    public final C0274k0 f11312b;

    /* renamed from: c, reason: collision with root package name */
    public final LinkedHashSet f11313c;

    public C1346S(S.j jVar, Map map) {
        C1344P c1344p = new C1344P(jVar, 0);
        X0 x02 = S.l.f5571a;
        this.f11311a = new S.k(map, c1344p);
        this.f11312b = C0257c.N(null, W.f4109m);
        this.f11313c = new LinkedHashSet();
    }

    @Override // S.c
    public final void a(Object obj, y2.e eVar, C0285q c0285q, int i2) {
        int i3;
        c0285q.W(-697180401);
        if ((i2 & 6) == 0) {
            i3 = (c0285q.i(obj) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= c0285q.i(eVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= c0285q.i(this) ? 256 : 128;
        }
        if ((i3 & 147) == 146 && c0285q.A()) {
            c0285q.P();
        } else {
            S.c cVar = (S.c) this.f11312b.getValue();
            if (cVar == null) {
                throw new IllegalArgumentException("null wrappedHolder".toString());
            }
            cVar.a(obj, eVar, c0285q, (i3 & 112) | (i3 & 14));
            boolean i4 = c0285q.i(this) | c0285q.i(obj);
            Object K3 = c0285q.K();
            if (i4 || K3 == C0275l.f4150a) {
                K3 = new C1007b(this, 16, obj);
                c0285q.e0(K3);
            }
            C0257c.d(obj, (y2.c) K3, c0285q);
        }
        C0291t0 t3 = c0285q.t();
        if (t3 != null) {
            t3.f4235d = new C0032a(this, obj, eVar, i2, 5);
        }
    }

    @Override // S.c
    public final void b(Object obj) {
        S.c cVar = (S.c) this.f11312b.getValue();
        if (cVar == null) {
            throw new IllegalArgumentException("null wrappedHolder".toString());
        }
        cVar.b(obj);
    }

    @Override // S.j
    public final boolean c(Object obj) {
        return this.f11311a.c(obj);
    }

    @Override // S.j
    public final Map d() {
        S.c cVar = (S.c) this.f11312b.getValue();
        if (cVar != null) {
            Iterator it = this.f11313c.iterator();
            while (it.hasNext()) {
                cVar.b(it.next());
            }
        }
        return this.f11311a.d();
    }

    @Override // S.j
    public final Object e(String str) {
        return this.f11311a.e(str);
    }

    @Override // S.j
    public final K1.m f(String str, B.y yVar) {
        return this.f11311a.f(str, yVar);
    }
}
