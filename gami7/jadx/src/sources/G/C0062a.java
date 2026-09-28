package G;

import J.A0;
import J.C0257c;
import J.C0274k0;
import J.InterfaceC0258c0;
import J.W;
import J.W0;
import J2.InterfaceC0328z;
import android.view.View;
import android.view.ViewGroup;
import c0.AbstractC0585d;
import c0.C0603v;
import c0.InterfaceC0600s;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import n2.AbstractC0963o;
import t0.C1238G;

/* renamed from: G.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0062a extends s implements A0 {

    /* renamed from: i, reason: collision with root package name */
    public final boolean f1128i;

    /* renamed from: j, reason: collision with root package name */
    public final float f1129j;

    /* renamed from: k, reason: collision with root package name */
    public final W0 f1130k;

    /* renamed from: l, reason: collision with root package name */
    public final W0 f1131l;

    /* renamed from: m, reason: collision with root package name */
    public final ViewGroup f1132m;

    /* renamed from: n, reason: collision with root package name */
    public q f1133n;

    /* renamed from: o, reason: collision with root package name */
    public final C0274k0 f1134o;

    /* renamed from: p, reason: collision with root package name */
    public final C0274k0 f1135p;
    public long q;

    /* renamed from: r, reason: collision with root package name */
    public int f1136r;

    /* renamed from: s, reason: collision with root package name */
    public final B.y f1137s;

    public C0062a(boolean z3, float f3, InterfaceC0258c0 interfaceC0258c0, InterfaceC0258c0 interfaceC0258c02, ViewGroup viewGroup) {
        super(z3, interfaceC0258c02);
        this.f1128i = z3;
        this.f1129j = f3;
        this.f1130k = interfaceC0258c0;
        this.f1131l = interfaceC0258c02;
        this.f1132m = viewGroup;
        W w2 = W.f4109m;
        this.f1134o = C0257c.N(null, w2);
        this.f1135p = C0257c.N(Boolean.TRUE, w2);
        this.q = 0L;
        this.f1136r = -1;
        this.f1137s = new B.y(4, this);
    }

    @Override // J.A0
    public final void a() {
        m();
    }

    @Override // J.A0
    public final void b() {
    }

    @Override // J.A0
    public final void c() {
        m();
    }

    @Override // n.U
    public final void d(C1238G c1238g) {
        int l3;
        this.q = c1238g.f10415h.e();
        float f3 = this.f1129j;
        if (Float.isNaN(f3)) {
            l3 = B2.a.D(p.a(c1238g, this.f1128i, c1238g.f10415h.e()));
        } else {
            l3 = c1238g.f10415h.l(f3);
        }
        this.f1136r = l3;
        long j3 = ((C0603v) this.f1130k.getValue()).f7279a;
        float f4 = ((g) this.f1131l.getValue()).f1158d;
        c1238g.a();
        f(c1238g, f3, j3);
        InterfaceC0600s e3 = c1238g.f10415h.f7552i.e();
        ((Boolean) this.f1135p.getValue()).booleanValue();
        r rVar = (r) this.f1134o.getValue();
        if (rVar != null) {
            rVar.e(c1238g.f10415h.e(), this.f1136r, j3, f4);
            rVar.draw(AbstractC0585d.a(e3));
        }
    }

    @Override // G.s
    public final void e(r.n nVar, InterfaceC0328z interfaceC0328z) {
        q qVar = this.f1133n;
        if (qVar == null) {
            ViewGroup viewGroup = this.f1132m;
            int childCount = viewGroup.getChildCount();
            int i2 = 0;
            while (true) {
                if (i2 >= childCount) {
                    break;
                }
                View childAt = viewGroup.getChildAt(i2);
                if (childAt instanceof q) {
                    this.f1133n = (q) childAt;
                    break;
                }
                i2++;
            }
            if (this.f1133n == null) {
                q qVar2 = new q(viewGroup.getContext());
                viewGroup.addView(qVar2);
                this.f1133n = qVar2;
            }
            qVar = this.f1133n;
            z2.h.c(qVar);
        }
        K1.s sVar = qVar.f1191k;
        r rVar = (r) ((LinkedHashMap) sVar.f4603h).get(this);
        if (rVar == null) {
            ArrayList arrayList = qVar.f1190j;
            z2.h.f(arrayList, "<this>");
            rVar = (r) (arrayList.isEmpty() ? null : arrayList.remove(0));
            LinkedHashMap linkedHashMap = (LinkedHashMap) sVar.f4604i;
            LinkedHashMap linkedHashMap2 = (LinkedHashMap) sVar.f4603h;
            if (rVar == null) {
                int i3 = qVar.f1192l;
                ArrayList arrayList2 = qVar.f1189i;
                if (i3 > AbstractC0963o.u(arrayList2)) {
                    rVar = new r(qVar.getContext());
                    qVar.addView(rVar);
                    arrayList2.add(rVar);
                } else {
                    rVar = (r) arrayList2.get(qVar.f1192l);
                    C0062a c0062a = (C0062a) linkedHashMap.get(rVar);
                    if (c0062a != null) {
                        c0062a.f1134o.setValue(null);
                        r rVar2 = (r) linkedHashMap2.get(c0062a);
                        if (rVar2 != null) {
                        }
                        linkedHashMap2.remove(c0062a);
                        rVar.c();
                    }
                }
                int i4 = qVar.f1192l;
                if (i4 < qVar.f1188h - 1) {
                    qVar.f1192l = i4 + 1;
                } else {
                    qVar.f1192l = 0;
                }
            }
            linkedHashMap2.put(this, rVar);
            linkedHashMap.put(rVar, this);
        }
        rVar.b(nVar, this.f1128i, this.q, this.f1136r, ((C0603v) this.f1130k.getValue()).f7279a, ((g) this.f1131l.getValue()).f1158d, this.f1137s);
        this.f1134o.setValue(rVar);
    }

    @Override // G.s
    public final void i(r.n nVar) {
        r rVar = (r) this.f1134o.getValue();
        if (rVar != null) {
            rVar.d();
        }
    }

    public final void m() {
        q qVar = this.f1133n;
        if (qVar != null) {
            this.f1134o.setValue(null);
            K1.s sVar = qVar.f1191k;
            r rVar = (r) ((LinkedHashMap) sVar.f4603h).get(this);
            if (rVar != null) {
                rVar.c();
                LinkedHashMap linkedHashMap = (LinkedHashMap) sVar.f4603h;
                r rVar2 = (r) linkedHashMap.get(this);
                if (rVar2 != null) {
                }
                linkedHashMap.remove(this);
                qVar.f1190j.add(rVar);
            }
        }
    }
}
