package n;

import J.C0257c;
import J.C0274k0;
import android.content.Context;
import android.os.Build;
import android.widget.EdgeEffect;
import c0.AbstractC0571K;
import m2.C0880v;

/* renamed from: n.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0905m implements j0 {

    /* renamed from: h, reason: collision with root package name */
    public b0.c f8803h;

    /* renamed from: i, reason: collision with root package name */
    public final C0885D f8804i;

    /* renamed from: j, reason: collision with root package name */
    public final C0274k0 f8805j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f8806k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f8807l;

    /* renamed from: m, reason: collision with root package name */
    public long f8808m;

    /* renamed from: n, reason: collision with root package name */
    public n0.q f8809n;

    /* renamed from: o, reason: collision with root package name */
    public final V.o f8810o;

    public C0905m(Context context, h0 h0Var) {
        C0885D c0885d = new C0885D(context, AbstractC0571K.A(h0Var.f8786a));
        this.f8804i = c0885d;
        C0880v c0880v = C0880v.f8657a;
        this.f8805j = C0257c.N(c0880v, J.W.f4106j);
        this.f8806k = true;
        this.f8808m = 0L;
        this.f8810o = n0.w.a(V.l.f5857b, c0880v, new C0904l(this, null)).k(Build.VERSION.SDK_INT >= 31 ? new C0884C(this, c0885d) : new C0884C(this, c0885d, h0Var));
    }

    @Override // n.j0
    public final V.o a() {
        return this.f8810o;
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x024d, code lost:
    
        if (r4 != false) goto L132;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x024a, code lost:
    
        if (n.C0885D.f(r8.f8673e) != false) goto L131;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x024f, code lost:
    
        if (r3 == false) goto L133;
     */
    /* JADX WARN: Removed duplicated region for block: B:103:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0149 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0216  */
    @Override // n.j0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long b(long r18, int r20, n0.C0919B r21) {
        /*
            Method dump skipped, instructions count: 601
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: n.C0905m.b(long, int, n0.B):long");
    }

    public final void c() {
        boolean z3;
        C0885D c0885d = this.f8804i;
        EdgeEffect edgeEffect = c0885d.f8672d;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            z3 = edgeEffect.isFinished();
        } else {
            z3 = false;
        }
        EdgeEffect edgeEffect2 = c0885d.f8673e;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            z3 = edgeEffect2.isFinished() || z3;
        }
        EdgeEffect edgeEffect3 = c0885d.f8674f;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            z3 = edgeEffect3.isFinished() || z3;
        }
        EdgeEffect edgeEffect4 = c0885d.f8675g;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            if (!edgeEffect4.isFinished() && !z3) {
                return;
            }
        } else if (!z3) {
            return;
        }
        g();
    }

    public final long d() {
        b0.c cVar = this.f8803h;
        long R3 = cVar != null ? cVar.f7058a : B1.C.R(this.f8808m);
        return K1.f.e(b0.c.d(R3) / b0.f.d(this.f8808m), b0.c.e(R3) / b0.f.b(this.f8808m));
    }

    @Override // n.j0
    public final boolean e() {
        C0885D c0885d = this.f8804i;
        EdgeEffect edgeEffect = c0885d.f8672d;
        C0906n c0906n = C0906n.f8812a;
        if (edgeEffect != null) {
            if ((Build.VERSION.SDK_INT >= 31 ? c0906n.b(edgeEffect) : 0.0f) != 0.0f) {
                return true;
            }
        }
        EdgeEffect edgeEffect2 = c0885d.f8673e;
        if (edgeEffect2 != null) {
            if ((Build.VERSION.SDK_INT >= 31 ? c0906n.b(edgeEffect2) : 0.0f) != 0.0f) {
                return true;
            }
        }
        EdgeEffect edgeEffect3 = c0885d.f8674f;
        if (edgeEffect3 != null) {
            if ((Build.VERSION.SDK_INT >= 31 ? c0906n.b(edgeEffect3) : 0.0f) != 0.0f) {
                return true;
            }
        }
        EdgeEffect edgeEffect4 = c0885d.f8675g;
        if (edgeEffect4 != null) {
            return (Build.VERSION.SDK_INT >= 31 ? c0906n.b(edgeEffect4) : 0.0f) != 0.0f;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002f  */
    @Override // n.j0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(long r18, p.A0 r20, q2.InterfaceC1073d r21) {
        /*
            Method dump skipped, instructions count: 535
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: n.C0905m.f(long, p.A0, q2.d):java.lang.Object");
    }

    public final void g() {
        if (this.f8806k) {
            this.f8805j.setValue(C0880v.f8657a);
        }
    }

    public final float h(long j3) {
        float d3 = b0.c.d(d());
        float e3 = b0.c.e(j3) / b0.f.b(this.f8808m);
        EdgeEffect b3 = this.f8804i.b();
        float f3 = -e3;
        float f4 = 1 - d3;
        int i2 = Build.VERSION.SDK_INT;
        C0906n c0906n = C0906n.f8812a;
        if (i2 >= 31) {
            f3 = c0906n.c(b3, f3, f4);
        } else {
            b3.onPull(f3, f4);
        }
        return (Build.VERSION.SDK_INT >= 31 ? c0906n.b(b3) : 0.0f) == 0.0f ? b0.f.b(this.f8808m) * (-f3) : b0.c.e(j3);
    }

    public final float i(long j3) {
        float e3 = b0.c.e(d());
        float d3 = b0.c.d(j3) / b0.f.d(this.f8808m);
        EdgeEffect c3 = this.f8804i.c();
        float f3 = 1 - e3;
        int i2 = Build.VERSION.SDK_INT;
        C0906n c0906n = C0906n.f8812a;
        if (i2 >= 31) {
            d3 = c0906n.c(c3, d3, f3);
        } else {
            c3.onPull(d3, f3);
        }
        return (Build.VERSION.SDK_INT >= 31 ? c0906n.b(c3) : 0.0f) == 0.0f ? b0.f.d(this.f8808m) * d3 : b0.c.d(j3);
    }

    public final float j(long j3) {
        float e3 = b0.c.e(d());
        float d3 = b0.c.d(j3) / b0.f.d(this.f8808m);
        EdgeEffect d4 = this.f8804i.d();
        float f3 = -d3;
        int i2 = Build.VERSION.SDK_INT;
        C0906n c0906n = C0906n.f8812a;
        if (i2 >= 31) {
            f3 = c0906n.c(d4, f3, e3);
        } else {
            d4.onPull(f3, e3);
        }
        return (Build.VERSION.SDK_INT >= 31 ? c0906n.b(d4) : 0.0f) == 0.0f ? b0.f.d(this.f8808m) * (-f3) : b0.c.d(j3);
    }

    public final float k(long j3) {
        float d3 = b0.c.d(d());
        float e3 = b0.c.e(j3) / b0.f.b(this.f8808m);
        EdgeEffect e4 = this.f8804i.e();
        int i2 = Build.VERSION.SDK_INT;
        C0906n c0906n = C0906n.f8812a;
        if (i2 >= 31) {
            e3 = c0906n.c(e4, e3, d3);
        } else {
            e4.onPull(e3, d3);
        }
        return (Build.VERSION.SDK_INT >= 31 ? c0906n.b(e4) : 0.0f) == 0.0f ? b0.f.b(this.f8808m) * e3 : b0.c.e(j3);
    }

    public final void l(long j3) {
        boolean a3 = b0.f.a(this.f8808m, 0L);
        boolean z3 = !b0.f.a(j3, this.f8808m);
        this.f8808m = j3;
        if (z3) {
            long e3 = l0.c.e(B2.a.D(b0.f.d(j3)), B2.a.D(b0.f.b(j3)));
            C0885D c0885d = this.f8804i;
            c0885d.f8671c = e3;
            EdgeEffect edgeEffect = c0885d.f8672d;
            if (edgeEffect != null) {
                edgeEffect.setSize((int) (e3 >> 32), (int) (e3 & 4294967295L));
            }
            EdgeEffect edgeEffect2 = c0885d.f8673e;
            if (edgeEffect2 != null) {
                edgeEffect2.setSize((int) (e3 >> 32), (int) (e3 & 4294967295L));
            }
            EdgeEffect edgeEffect3 = c0885d.f8674f;
            if (edgeEffect3 != null) {
                edgeEffect3.setSize((int) (e3 & 4294967295L), (int) (e3 >> 32));
            }
            EdgeEffect edgeEffect4 = c0885d.f8675g;
            if (edgeEffect4 != null) {
                edgeEffect4.setSize((int) (e3 & 4294967295L), (int) (e3 >> 32));
            }
            EdgeEffect edgeEffect5 = c0885d.f8676h;
            if (edgeEffect5 != null) {
                edgeEffect5.setSize((int) (e3 >> 32), (int) (e3 & 4294967295L));
            }
            EdgeEffect edgeEffect6 = c0885d.f8677i;
            if (edgeEffect6 != null) {
                edgeEffect6.setSize((int) (e3 >> 32), (int) (e3 & 4294967295L));
            }
            EdgeEffect edgeEffect7 = c0885d.f8678j;
            if (edgeEffect7 != null) {
                edgeEffect7.setSize((int) (e3 & 4294967295L), (int) (e3 >> 32));
            }
            EdgeEffect edgeEffect8 = c0885d.f8679k;
            if (edgeEffect8 != null) {
                edgeEffect8.setSize((int) (e3 & 4294967295L), (int) (e3 >> 32));
            }
        }
        if (a3 || !z3) {
            return;
        }
        g();
        c();
    }
}
