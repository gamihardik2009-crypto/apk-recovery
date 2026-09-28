package B;

import J2.p0;
import M2.O;
import M2.P;
import a.AbstractC0423a;
import android.graphics.Rect;
import android.view.View;
import java.lang.ref.WeakReference;
import n0.C0919B;
import t0.AbstractC1248f;
import u0.AbstractC1296l0;
import u0.C1300n0;
import u0.R0;
import z.C1426q;

/* renamed from: B.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0007h implements I0.t {

    /* renamed from: a, reason: collision with root package name */
    public B f217a;

    /* renamed from: b, reason: collision with root package name */
    public p0 f218b;

    /* renamed from: c, reason: collision with root package name */
    public G f219c;

    /* renamed from: d, reason: collision with root package name */
    public O f220d;

    @Override // I0.t
    public final void a(b0.d dVar) {
        Rect rect;
        G g3 = this.f219c;
        if (g3 != null) {
            g3.f177l = new Rect(B2.a.D(dVar.f7060a), B2.a.D(dVar.f7061b), B2.a.D(dVar.f7062c), B2.a.D(dVar.f7063d));
            if (!g3.f175j.isEmpty() || (rect = g3.f177l) == null) {
                return;
            }
            g3.f166a.requestRectangleOnScreen(new Rect(rect));
        }
    }

    @Override // I0.t
    public final void b() {
        R0 r02;
        B b3 = this.f217a;
        if (b3 == null || (r02 = (R0) AbstractC1248f.i(b3, AbstractC1296l0.f11095n)) == null) {
            return;
        }
        ((C1300n0) r02).b();
    }

    @Override // I0.t
    public final void c() {
        R0 r02;
        B b3 = this.f217a;
        if (b3 == null || (r02 = (R0) AbstractC1248f.i(b3, AbstractC1296l0.f11095n)) == null) {
            return;
        }
        ((C1300n0) r02).a();
    }

    @Override // I0.t
    public final void d() {
        p0 p0Var = this.f218b;
        if (p0Var != null) {
            p0Var.a(null);
        }
        this.f218b = null;
        M2.H i2 = i();
        if (i2 != null) {
            ((O) i2).a();
        }
    }

    @Override // I0.t
    public final void e(I0.z zVar, I0.s sVar, C0.H h2, C0919B c0919b, b0.d dVar, b0.d dVar2) {
        G g3 = this.f219c;
        if (g3 != null) {
            C c3 = g3.f178m;
            synchronized (c3.f148c) {
                try {
                    c3.f155j = zVar;
                    c3.f157l = sVar;
                    c3.f156k = h2;
                    c3.f158m = dVar;
                    c3.f159n = dVar2;
                    if (!c3.f150e) {
                        if (c3.f149d) {
                        }
                    }
                    c3.a();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Override // I0.t
    public final void f(I0.z zVar, I0.z zVar2) {
        G g3 = this.f219c;
        if (g3 != null) {
            boolean z3 = (C0.J.a(g3.f173h.f3933b, zVar2.f3933b) && z2.h.a(g3.f173h.f3934c, zVar2.f3934c)) ? false : true;
            g3.f173h = zVar2;
            int size = g3.f175j.size();
            for (int i2 = 0; i2 < size; i2++) {
                I i3 = (I) ((WeakReference) g3.f175j.get(i2)).get();
                if (i3 != null) {
                    i3.f186g = zVar2;
                }
            }
            C c3 = g3.f178m;
            synchronized (c3.f148c) {
                c3.f155j = null;
                c3.f157l = null;
                c3.f156k = null;
                c3.f158m = null;
                c3.f159n = null;
            }
            if (z2.h.a(zVar, zVar2)) {
                if (z3) {
                    z zVar3 = g3.f167b;
                    int e3 = C0.J.e(zVar2.f3933b);
                    int d3 = C0.J.d(zVar2.f3933b);
                    C0.J j3 = g3.f173h.f3934c;
                    int e4 = j3 != null ? C0.J.e(j3.f473a) : -1;
                    C0.J j4 = g3.f173h.f3934c;
                    zVar3.d().updateSelection((View) zVar3.f239c, e3, d3, e4, j4 != null ? C0.J.d(j4.f473a) : -1);
                    return;
                }
                return;
            }
            if (zVar != null && (!z2.h.a(zVar.f3932a.f500a, zVar2.f3932a.f500a) || (C0.J.a(zVar.f3933b, zVar2.f3933b) && !z2.h.a(zVar.f3934c, zVar2.f3934c)))) {
                z zVar4 = g3.f167b;
                zVar4.d().restartInput((View) zVar4.f239c);
                return;
            }
            int size2 = g3.f175j.size();
            for (int i4 = 0; i4 < size2; i4++) {
                I i5 = (I) ((WeakReference) g3.f175j.get(i4)).get();
                if (i5 != null) {
                    I0.z zVar5 = g3.f173h;
                    z zVar6 = g3.f167b;
                    if (i5.f190k) {
                        i5.f186g = zVar5;
                        if (i5.f188i) {
                            zVar6.d().updateExtractedText((View) zVar6.f239c, i5.f187h, AbstractC0423a.z(zVar5));
                        }
                        C0.J j5 = zVar5.f3934c;
                        int e5 = j5 != null ? C0.J.e(j5.f473a) : -1;
                        C0.J j6 = zVar5.f3934c;
                        int d4 = j6 != null ? C0.J.d(j6.f473a) : -1;
                        long j7 = zVar5.f3933b;
                        zVar6.d().updateSelection((View) zVar6.f239c, C0.J.e(j7), C0.J.d(j7), e5, d4);
                    }
                }
            }
        }
    }

    @Override // I0.t
    public final void g() {
        j(null);
    }

    @Override // I0.t
    public final void h(I0.z zVar, I0.m mVar, L2.d dVar, C1426q c1426q) {
        j(new C0000a(zVar, this, mVar, dVar, c1426q, 0));
    }

    public final M2.H i() {
        O o3 = this.f220d;
        if (o3 != null) {
            return o3;
        }
        if (!A.e.f15a) {
            return null;
        }
        O a3 = P.a(1, 0, 3, 2);
        this.f220d = a3;
        return a3;
    }

    public final void j(C0000a c0000a) {
        B b3 = this.f217a;
        if (b3 == null) {
            return;
        }
        this.f218b = b3.f5869t ? J2.B.r(b3.y0(), null, 4, new A(b3, new C0006g(c0000a, this, b3, null), null), 1) : null;
    }

    public final void k(B b3) {
        if (this.f217a == b3) {
            this.f217a = null;
            return;
        }
        throw new IllegalStateException(("Expected textInputModifierNode to be " + b3 + " but was " + this.f217a).toString());
    }
}
