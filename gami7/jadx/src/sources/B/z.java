package B;

import C0.C0024g;
import D.C0053w;
import I0.InterfaceC0252i;
import android.os.Build;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import androidx.lifecycle.C0475y;
import b1.C0532i;
import h.C0694b;
import java.util.List;
import m2.EnumC0863e;
import m2.InterfaceC0862d;
import n2.AbstractC0961m;
import t0.AbstractC1248f;
import t0.AbstractC1256n;
import t0.C1236E;
import t0.InterfaceC1258p;
import t0.L;

/* loaded from: classes.dex */
public final class z implements B1.A {

    /* renamed from: c, reason: collision with root package name */
    public Object f239c;

    /* renamed from: d, reason: collision with root package name */
    public Object f240d;

    public z(int i2) {
        switch (i2) {
            case 4:
                this.f239c = new L.d(new C1236E[16]);
                break;
            default:
                this.f239c = new C0475y();
                this.f240d = new M1.k();
                e(B1.A.f245b);
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1, types: [V.n] */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4, types: [V.n] */
    /* JADX WARN: Type inference failed for: r5v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3, types: [L.d] */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6, types: [L.d] */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r6v9 */
    public static void c(C1236E c1236e) {
        L l3 = c1236e.f10379D;
        int i2 = 0;
        if (l3.f10466c == 5 && !l3.f10468e && !l3.f10467d && !c1236e.f10384K && c1236e.E()) {
            V.n nVar = (V.n) c1236e.f10378C.f4244f;
            if ((nVar.f5861k & 256) != 0) {
                while (nVar != null) {
                    if ((nVar.f5860j & 256) != 0) {
                        AbstractC1256n abstractC1256n = nVar;
                        ?? r6 = 0;
                        while (abstractC1256n != 0) {
                            if (abstractC1256n instanceof InterfaceC1258p) {
                                InterfaceC1258p interfaceC1258p = (InterfaceC1258p) abstractC1256n;
                                interfaceC1258p.q0(AbstractC1248f.t(interfaceC1258p, 256));
                            } else if ((abstractC1256n.f5860j & 256) != 0 && (abstractC1256n instanceof AbstractC1256n)) {
                                V.n nVar2 = abstractC1256n.f10608v;
                                int i3 = 0;
                                abstractC1256n = abstractC1256n;
                                r6 = r6;
                                while (nVar2 != null) {
                                    if ((nVar2.f5860j & 256) != 0) {
                                        i3++;
                                        r6 = r6;
                                        if (i3 == 1) {
                                            abstractC1256n = nVar2;
                                        } else {
                                            if (r6 == 0) {
                                                r6 = new L.d(new V.n[16]);
                                            }
                                            if (abstractC1256n != 0) {
                                                r6.b(abstractC1256n);
                                                abstractC1256n = 0;
                                            }
                                            r6.b(nVar2);
                                        }
                                    }
                                    nVar2 = nVar2.f5863m;
                                    abstractC1256n = abstractC1256n;
                                    r6 = r6;
                                }
                                if (i3 == 1) {
                                }
                            }
                            abstractC1256n = AbstractC1248f.f(r6);
                        }
                    }
                    if ((nVar.f5861k & 256) == 0) {
                        break;
                    } else {
                        nVar = nVar.f5863m;
                    }
                }
            }
        }
        c1236e.f10383J = false;
        L.d v3 = c1236e.v();
        int i4 = v3.f4620j;
        if (i4 > 0) {
            Object[] objArr = v3.f4618h;
            do {
                c((C1236E) objArr[i2]);
                i2++;
            } while (i2 < i4);
        }
    }

    public boolean a(long j3) {
        Object obj;
        List list = (List) ((K1.c) this.f240d).f4532a;
        int size = list.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                obj = null;
                break;
            }
            obj = list.get(i2);
            if (n0.q.a(((n0.t) obj).f8973a, j3)) {
                break;
            }
            i2++;
        }
        n0.t tVar = (n0.t) obj;
        if (tVar != null) {
            return tVar.f8980h;
        }
        return false;
    }

    public I0.z b(List list) {
        InterfaceC0252i interfaceC0252i;
        Exception e3;
        InterfaceC0252i interfaceC0252i2;
        try {
            int size = list.size();
            int i2 = 0;
            interfaceC0252i = null;
            while (i2 < size) {
                try {
                    interfaceC0252i2 = (InterfaceC0252i) list.get(i2);
                } catch (Exception e4) {
                    e3 = e4;
                }
                try {
                    interfaceC0252i2.a((I0.j) this.f240d);
                    i2++;
                    interfaceC0252i = interfaceC0252i2;
                } catch (Exception e5) {
                    e3 = e5;
                    interfaceC0252i = interfaceC0252i2;
                    StringBuilder sb = new StringBuilder();
                    StringBuilder sb2 = new StringBuilder("Error while applying EditCommand batch to buffer (length=");
                    sb2.append(((I0.j) this.f240d).f3898a.b());
                    sb2.append(", composition=");
                    sb2.append(((I0.j) this.f240d).c());
                    sb2.append(", selection=");
                    I0.j jVar = (I0.j) this.f240d;
                    sb2.append((Object) C0.J.g(B1.C.j(jVar.f3899b, jVar.f3900c)));
                    sb2.append("):");
                    sb.append(sb2.toString());
                    sb.append('\n');
                    AbstractC0961m.K(list, sb, new C0053w(interfaceC0252i, 7, this), 60);
                    String sb3 = sb.toString();
                    z2.h.e(sb3, "StringBuilder().apply(builderAction).toString()");
                    throw new RuntimeException(sb3, e3);
                }
            }
            I0.j jVar2 = (I0.j) this.f240d;
            jVar2.getClass();
            C0024g c0024g = new C0024g(jVar2.f3898a.toString(), null, 6);
            I0.j jVar3 = (I0.j) this.f240d;
            long j3 = B1.C.j(jVar3.f3899b, jVar3.f3900c);
            C0.J j4 = C0.J.f(((I0.z) this.f239c).f3933b) ? null : new C0.J(j3);
            I0.z zVar = new I0.z(c0024g, j4 != null ? j4.f473a : B1.C.j(C0.J.d(j3), C0.J.e(j3)), ((I0.j) this.f240d).c());
            this.f239c = zVar;
            return zVar;
        } catch (Exception e6) {
            interfaceC0252i = null;
            e3 = e6;
        }
    }

    public InputMethodManager d() {
        return (InputMethodManager) ((InterfaceC0862d) this.f240d).getValue();
    }

    public void e(B1.C c3) {
        boolean z3;
        C0475y c0475y = (C0475y) this.f239c;
        synchronized (c0475y.f6920a) {
            z3 = c0475y.f6923d == C0475y.f6919h;
            c0475y.f6923d = c3;
        }
        if (z3) {
            C0694b.N().O(c0475y.f6926g);
        }
        if (c3 instanceof B1.z) {
            ((M1.k) this.f240d).j((B1.z) c3);
        } else if (c3 instanceof B1.x) {
            ((M1.k) this.f240d).k(((B1.x) c3).f314f);
        }
    }

    public void f(I0.z zVar, I0.F f3) {
        boolean z3 = true;
        boolean z4 = !z2.h.a(zVar.f3934c, ((I0.j) this.f240d).c());
        C0024g c0024g = ((I0.z) this.f239c).f3932a;
        C0024g c0024g2 = zVar.f3932a;
        boolean a3 = z2.h.a(c0024g, c0024g2);
        boolean z5 = false;
        long j3 = zVar.f3933b;
        if (!a3) {
            this.f240d = new I0.j(c0024g2, j3);
        } else if (C0.J.a(((I0.z) this.f239c).f3933b, j3)) {
            z3 = false;
        } else {
            ((I0.j) this.f240d).f(C0.J.e(j3), C0.J.d(j3));
            z5 = true;
            z3 = false;
        }
        C0.J j4 = zVar.f3934c;
        if (j4 == null) {
            I0.j jVar = (I0.j) this.f240d;
            jVar.f3901d = -1;
            jVar.f3902e = -1;
        } else {
            long j5 = j4.f473a;
            if (!C0.J.b(j5)) {
                ((I0.j) this.f240d).e(C0.J.e(j5), C0.J.d(j5));
            }
        }
        if (z3 || (!z5 && z4)) {
            I0.j jVar2 = (I0.j) this.f240d;
            jVar2.f3901d = -1;
            jVar2.f3902e = -1;
            zVar = I0.z.a(zVar, null, 0L, 3);
        }
        I0.z zVar2 = (I0.z) this.f239c;
        this.f239c = zVar;
        if (f3 != null) {
            f3.a(zVar2, zVar);
        }
    }

    public z(View view) {
        this.f239c = view;
        this.f240d = B2.a.x(EnumC0863e.f8644i, new y(0, this));
        if (Build.VERSION.SDK_INT >= 30) {
            new C0532i(15, view).f7124j = view;
        }
    }
}
